package edu.sm.frame;

import java.sql.Connection;

public interface Dao<K,V> {
    V insert(V v, Connection con) throws Exception;
}
