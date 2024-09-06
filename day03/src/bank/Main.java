package bank;

import bank.exception.InException;
import bank.exception.ZeroException;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("111",1000);
        System.out.println(account1);
        account1.deposit(500);
        System.out.println(account1);

        try {
            account1.withdraw(-5000);
        } catch (ZeroException | InException e) {
            throw new RuntimeException(e);
        }

//        account1.withdraw(5000);  //빨간 줄의 의미는 정상일 수도 있고 비정상일 수도 있다고 알려주는거임
        System.out.println(account1);

    }
}
