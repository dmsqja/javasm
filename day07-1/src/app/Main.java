package app;

import dto.Cust;
import dto.Item;
import frame.Db;
import repository.CustDb;
import repository.ItemDb;

import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Db<String, Cust> db = new CustDb();
        Cust cust = new Cust("id01","pwd01","james");
        db.insert(cust);

        String id = "id11";
        Cust dbCust = db.select(id);
        System.out.println(dbCust);

        List<Cust> custs = db.select();
        for(Cust c:custs){
            System.out.println(c);
        }








        Db db2 = new ItemDb();
        Item item = new Item(100,"pants",20000);
        db2.insert(item);
    }
}
