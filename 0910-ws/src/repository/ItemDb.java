package repository;

import dto.Item;
import frame.Db;

import java.util.ArrayList;
import java.util.List;

public class ItemDb implements Db<Integer, Item> {
    @Override
    public void insert(Item item) throws Exception{
        System.out.println("Inserted: " + item.getName());
    }

    @Override
    public void update(Item item) throws Exception{
        System.out.println("Updated: " + item.getName());
    }

    @Override
    public void delete(Integer integer) throws Exception{
        System.out.println("Deleted: " + integer);
    }

    @Override
    public Item select(Integer integer) throws Exception{
        Item item = null;
        item = new Item(integer, "pants",30000);
        return item;
    }

    @Override
    public List<Item> select() throws Exception{
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(100,"pants",10000));
        items.add(new Item(200,"shirts",20000));
        items.add(new Item(300,"hat",30000));
        return items;
    }
}
