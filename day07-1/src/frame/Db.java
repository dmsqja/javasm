package frame;

import java.util.List;

public interface Db<K,V> {   //기능을 정할 뼈대기 때문에 interface로
    void insert(V v);
    void update(V v);
    void delete(K k);
    V select(K k);
    List<V> select();
}
