package repository;

import dto.Item;
import frame.Db;

import java.util.List;

public class ItemDb implements Db<Integer, Item> {
    @Override
    public void insert(Item item) {
        System.out.println("Inserted: " + item.getName());
    }

    @Override
    public void update(Item item) {
        System.out.println("Updated: " + item.getName());
    }

    @Override
    public void delete(Integer integer) {
        System.out.println("Deleted: " + integer);
    }

    @Override
    public Item select(Integer integer) {
        return null;
    }

    @Override
    public List<Item> select() {
        return List.of();
    }
}
