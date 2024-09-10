package frame;

import java.util.List;

public interface Db<K,V> {   //기능을 정할 뼈대기 때문에 interface로
    void insert(V v) throws Exception;
    void update(V v) throws Exception;
    void delete(K k) throws Exception;
    V select(K k) throws Exception;
    List<V> select() throws Exception;
    default List<V> serchByName(String name) throws Exception{
        return null;
    }
}
