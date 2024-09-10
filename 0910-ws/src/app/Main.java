package app;

import dto.Cust;
import dto.Item;
import frame.Db;
import repository.CustDb;
import repository.ItemDb;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Db<String, Cust> db = new CustDb();
        Cust cust = new Cust("id01","pwd01","james");
        try {
            db.insert(cust);
        } catch (Exception e) {
            System.out.println("대충 오류");
        }

        String id = "id11";
        Cust dbCust = null;
        try {
            dbCust = db.select(id);
        } catch (Exception e) {
            System.out.println("대충 오류 2트");
        }
        System.out.println(dbCust);

        List<Cust> custs = null;
        try {
            custs = db.select();
        } catch (Exception e) {
            System.out.println("대충 오류 3트");
        }
        for(Cust c:custs){
            System.out.println(c);
        }


        List<Cust> scust = null;
        try {
            scust = db.serchByName("김");
            for (Cust c:scust){
                System.out.println(c);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("------------------------------------------------");

        Db<Integer, Item> db2 = new ItemDb();
        Item item = new Item(100,"pants",20000);
        try {
            db2.insert(item);
        } catch (Exception e) {
            System.out.println("대충 오류 4트");
        }

        int itemId = 100;
        Item dbItem = null;
        try {
            dbItem = db2.select(itemId);
        } catch (Exception e) {
            System.out.println("대충 오류 5트");
        }
        System.out.println(dbItem);

        List<Item> items = null;
        try {
            items = db2.select();
        } catch (Exception e) {
            System.out.println("대충 오류 6트");
        }
        for(Item i:items){
            System.out.println(i);
        }


        System.out.println("------------------------------------------------");

    }
}
