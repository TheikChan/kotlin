private class CacheEntry<V>(val value: V) {
    var lastAccessTime: Long = epochTimeMillis()

    fun updateAccessTime() {
        lastAccessTime = epochTimeMillis()
    }
}

class SimpleLruCache<K, V>(private val limit: Int) {

    private val map = mutableMapOf<K, CacheEntry<V>>()

    fun get(key: K): V? = map[key]?.also { it.updateAccessTime() }?.value

    fun set(key: K, value: V) {
        map[key] = CacheEntry(value)

        while(map.size > limit) {
            map.minByOrNull { it.value.lastAccessTime }?.also { map.remove(it.key) }
        }
    }

    fun clear() {
        map.clear()
    }
}

