import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ChenWei
 * @create 2021-05-07-23:01
 */
class LRUCache<K,V> extends LinkedHashMap{
    private final int CACHE_SIZE;


    /**
     * 传递进来最多能缓存的数据量
     * @param cache_size
     */
    LRUCache(int cache_size) {
        // true 表示LinkedHashMap 按照访问顺序进行排序，最近访问的放在头部，最老访问的放在尾部
        super((int) Math.ceil(cache_size/0.75)+1,0.75f,true);
        CACHE_SIZE = cache_size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest){
        //当map中的数量大于指定的缓存个数的时候，就自动删除最老的数据
        return size() > CACHE_SIZE;
    }
}
