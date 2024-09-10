package repository;


import dto.Cust;
import frame.Db;

import java.util.ArrayList;
import java.util.List;

public class CustDb implements Db<String, Cust> {
    @Override
    public void insert(Cust cust) {
        System.out.println("Inserted: " + cust.getName());
    }

    @Override
    public void update(Cust cust) {
        System.out.println("Updated: " + cust.getName());
    }

    @Override
    public void delete(String s) {
        System.out.println("Deleted: " + s);
    }

    @Override
    public Cust select(String s) {
        Cust cust = null;
        cust = new Cust(s,"ppp","이말숙");
        return cust;
    }

    @Override
    public List<Cust> select() {
        List<Cust> custs = new ArrayList<Cust>();
        custs.add(new Cust("id01","pwd01","이말숙"));
        custs.add(new Cust("id02","pwd02","김말숙"));
        custs.add(new Cust("id03","pwd03","홍말숙"));
        custs.add(new Cust("id04","pwd04","장말숙"));
        custs.add(new Cust("id05","pwd05","고말숙"));
        return custs;
    }
}
