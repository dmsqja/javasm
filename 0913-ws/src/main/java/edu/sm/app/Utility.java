package edu.sm.app;

import edu.sm.dto.Cart;
import edu.sm.dto.Cust;
import edu.sm.dto.Order;
import edu.sm.dto.Product;
import edu.sm.exception.DuplicatedIdException;
import edu.sm.exception.NotFoundException;
import edu.sm.service.CartService;
import edu.sm.service.CustService;
import edu.sm.service.OrderService;
import edu.sm.service.ProductService;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Utility {
    static final CustService custService = new CustService();
    static final ProductService productService = new ProductService();
    static final CartService cartService = new CartService();
    static final OrderService orderService = new OrderService();
    static Scanner scanner = new Scanner(System.in);
    static String loggedInUserId = null;


    public static int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("올바른 숫자를 입력해주세요: ");
            }
        }
    }

    public static void showLoggedInMenu() {
        while(true){
            System.out.println("\n===== 사용자 메뉴 =====");
            System.out.println("1. 상품 등록");
            System.out.println("2. 상품 조회");
            System.out.println("3. 장바구니 담기");
            System.out.println("4. 장바구니 조회");
            System.out.println("5. 상품 주문하기");
            System.out.println("6. 주문 내역 조회");
            System.out.println("7. 로그아웃");
            System.out.println("=======================");
            System.out.print("선택해주세요: ");

            int choice = getIntInput();
            switch (choice) {
                case 1 -> registerProduct();
                case 2 -> viewProducts();
                case 3 -> addToCart();
                case 4 -> viewCart();
                case 5 -> orderProduct();
                case 6 -> viewOrderHistory();
                case 7 -> {
                    loggedInUserId = null;
                    System.out.println("로그아웃 되었습니다. 메인 메뉴로 돌아갑니다.");
                    return;
                }
                default -> System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }

    public static void showMainMenu() {
        System.out.println("\n===== 쇼핑몰 메인 메뉴 =====");
        System.out.println("1. 회원가입");
        System.out.println("2. 로그인");
        System.out.println("3. 종료");
        System.out.println("===========================");
        System.out.print("선택해주세요: ");
    }

    public static void signUp() {
        System.out.println("\n=== 회원가입 ===");
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String pwd = scanner.nextLine();
        System.out.print("이름: ");
        String name = scanner.nextLine();

        if (id.isEmpty() || pwd.isEmpty() || name.isEmpty()) {
            System.out.println("모든 필드를 입력해주세요.");
            return;
        }

        Cust newCust = Cust.builder()
                .id(id)
                .pwd(pwd)
                .name(name)
                .build();

        try {
            custService.add(newCust);
            System.out.println("회원가입이 완료되었습니다.");
        } catch (DuplicatedIdException e) {
            System.out.println("아이디가 중복되었습니다. 다른 아이디를 입력해주세요.");
        } catch (Exception e) {
            System.out.println("회원가입 중 오류가 발생했습니다: " + e.getMessage());
        }
    }


    public static boolean login() {
        System.out.println("\n=== 로그인 ===");
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String pwd = scanner.nextLine();

        try {
            Cust cust = custService.get(id);
            if (cust != null && cust.getPwd().equals(pwd)) {
                System.out.println("로그인 성공! 환영합니다, " + cust.getName() + "님.");
                loggedInUserId = id;
                return true;
            } else {
                System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
                return false;
            }
        } catch (NotFoundException e) {
            System.out.println("존재하지 않는 아이디입니다.");
        } catch (Exception e) {
            System.out.println("로그인 중 오류가 발생했습니다: " + e.getMessage());
        }
        return false;
    }

    public static void registerProduct() {
        System.out.println("\n=== 상품 등록 ===");
        System.out.print("상품명: ");
        String name = scanner.nextLine();
        System.out.print("가격: ");
        int price = scanner.nextInt();
        scanner.nextLine();

        Product newProduct = Product.builder()
                .name(name)
                .price(price)
                .regDate(new Date())
                .build();

        try {
            productService.add(newProduct);
            System.out.println("상품이 등록되었습니다.");
        } catch (Exception e) {
            System.out.println("상품 등록 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    public static void viewProducts() {
        System.out.println("\n======= 상품 목록 =======");
        try {
            List<Product> products = productService.get();
            if (products.isEmpty()) {
                System.out.println("등록된 상품이 없습니다.");
                return;
            }

            System.out.println("--------------------------------------------------------");
            System.out.printf("| %-5s | %-20s | %-10s | %-12s |\n", "ID", "상품명", "가격", "등록일");
            System.out.println("--------------------------------------------------------");

            for (Product product : products) {
                System.out.printf("| %-5d | %-20s | %-10d | %-12s \n",
                        product.getId(),
                        product.getName(),
                        product.getPrice(),
                        product.getRegDate().toString().split(" ")[0]);
            }
            System.out.println("--------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("상품 조회 중 오류가 발생했습니다: " + e.getMessage());
        }
    }


    public static void addToCart() {
        System.out.println("\n=== 장바구니 담기 ===");
        System.out.print("상품 ID: ");
        int productId = getIntInput();
        System.out.print("수량: ");
        int quantity = getIntInput();

        try {
            // 상품 존재 여부 확인
            Product product = productService.get(productId);
            if (product == null) {
                throw new NotFoundException("해당 ID의 상품이 존재하지 않습니다: " + productId);
            }

            Cart newCartItem = Cart.builder()
                    .custId(loggedInUserId)
                    .productId(productId)
                    .quantity(quantity)
                    .build();

            cartService.add(newCartItem);
            System.out.println("상품이 장바구니에 담겼습니다.");
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("장바구니 담기 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    public static void viewCart() {
        System.out.println("\n=== 장바구니 조회 ===");
        try {
            List<Cart> cartProducts = cartService.get();
            List<Cart> userCartProducts = cartProducts.stream()
                    .filter(item -> item.getCustId().equals(loggedInUserId))
                    .toList();

            if (userCartProducts.isEmpty()) {
                System.out.println("장바구니가 비어있습니다.");
                return;
            }

            System.out.println("-------------------------------------------------------");
            System.out.printf("| %-5s | %-20s | %-10s | %-10s |\n", "번호", "상품명", "수량", "가격");
            System.out.println("-------------------------------------------------------");

            int totalAmount = 0;
            int productNumber = 1;

            for (Cart p : userCartProducts) {
                try {
                    Product product = productService.get(p.getProductId());
                    int productTotal = product.getPrice() * p.getQuantity();
                    totalAmount += productTotal;

                    System.out.printf("| %-5d | %-20s | %-10d | %-10d \n",
                            productNumber++,
                            product.getName(),
                            p.getQuantity(),
                            productTotal);
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            System.out.println("-------------------------------------------------------");
            System.out.printf("| %-38s | %-10d |\n", "총 금액", totalAmount);
            System.out.println("-------------------------------------------------------");

        } catch (Exception e) {
            System.out.println("장바구니 조회 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    public static void orderProduct() {
        System.out.println("\n=== 상품 주문하기 ===");
        System.out.print("주문할 상품 ID: ");
        int productId = getIntInput();
        System.out.print("수량: ");
        int quantity = getIntInput();

        try {
            Product product = productService.get(productId);
            if (product == null) {
                throw new NotFoundException("해당 ID의 상품이 존재하지 않습니다: " + productId);
            }

            int totalAmount = product.getPrice() * quantity;

            Order newOrder = Order.builder()
                    .custId(loggedInUserId)
                    .productId(productId)
                    .totalPrice(totalAmount)
                    .orderDate(new Date())
                    .build();

            orderService.add(newOrder);
            System.out.println("주문이 완료되었습니다.");
            System.out.println("주문 내역:");
            System.out.println("상품명: " + product.getName());
            System.out.println("수량: " + quantity);
            System.out.println("단가: " + product.getPrice());
            System.out.println("총 금액: " + totalAmount);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("주문 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    public static void viewOrderHistory() {
        System.out.println("\n=== 주문 내역 조회 ===");
        try {
            List<Order> orders = orderService.getByCustomerId(loggedInUserId);
            if (orders.isEmpty()) {
                System.out.println("주문 내역이 없습니다.");
                return;
            }

            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.printf("| %-5s | %-20s | %-20s |\n", "주문ID", "총액", "주문일");
            System.out.println("---------------------------------------------------------------------------------------------");

            for (Order order : orders) {
                System.out.printf("| %-5d | %-20s | %-20s |\n",
                        order.getId(),
                        order.getTotalPrice(),
                        order.getOrderDate().toString());
            }
            System.out.println("---------------------------------------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("주문 내역 조회 중 오류가 발생했습니다: " + e.getMessage());
            e.printStackTrace();
        }
    }
}