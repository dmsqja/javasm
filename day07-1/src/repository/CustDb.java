package repository;


import dto.Cust;
import frame.Db;

import java.util.ArrayList;
import java.util.List;

public class CustDb implements Db<String, Cust> {
    @Override
    public void insert(Cust cust) throws Exception{
        System.out.println("Inserted: " + cust.getName());

    }

    @Override
    public void update(Cust cust) throws Exception{
        System.out.println("Updated: " + cust.getName());
    }

    @Override
    public void delete(String s) throws Exception{
        System.out.println("Deleted: " + s);
    }

    @Override
    public Cust select(String s) throws Exception{
        Cust cust = null;
        cust = new Cust(s,"ppp","이은범");
        return cust;
    }

    @Override
    public List<Cust> select() throws Exception{
        List<Cust> custs = new ArrayList<Cust>();
        custs.add(new Cust("id01","pwd01","이은범1"));
        custs.add(new Cust("id02","pwd02","이은범2"));
        custs.add(new Cust("id03","pwd03","이은범3"));
        custs.add(new Cust("id04","pwd04","이은범4"));
        custs.add(new Cust("id05","pwd05","이은범5"));
        return custs;
    }

    @Override
    public List<Cust> serchByName(String name) throws Exception {
        List<Cust> custs = new ArrayList<Cust>();
        custs.add(new Cust("id01","pwd01","김은범1"));
        custs.add(new Cust("id02","pwd02","김은범2"));
        custs.add(new Cust("id03","pwd03","김은범3"));
        custs.add(new Cust("id04","pwd04","김은범4"));
        custs.add(new Cust("id05","pwd05","김은범5"));
        return custs;
    }
}
