package edu.sm.frame;

import java.util.List;

public interface MService<K, V> {
    V add(V v) throws Exception;
    V modify(V v) throws Exception;
    Boolean remove(V v) throws Exception;
    V get(V v) throws Exception;
    List<V> get() throws Exception;

}
