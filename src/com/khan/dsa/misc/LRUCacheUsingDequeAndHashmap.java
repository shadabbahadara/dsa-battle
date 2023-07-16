package com.khan.dsa.misc;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class LRUCacheUsingDequeAndHashmap {
	private final static int CACHE_CAPACITY = 3;
	HashMap<Integer, CacheEntry> map = new HashMap<>();
	Deque<CacheEntry> q = new LinkedList<>();

	public String getFromCache(int key) {
		if (map.containsKey(key)) {
			CacheEntry cacheEntry = map.get(key);

			q.remove(cacheEntry);
			q.addFirst(cacheEntry);

			return cacheEntry.value;

		}
		return null;
	}

	public void putIntoCache(int key, String value) {
		if (map.containsKey(key)) {
			CacheEntry cacheEntry = map.get(key);
			q.remove(cacheEntry);
			CacheEntry newEntry = new CacheEntry(key, value);
			q.addFirst(newEntry);
		} else {
			if (map.size() == CACHE_CAPACITY) {
				CacheEntry lastEntry = q.removeLast();
				map.remove(lastEntry.key);
			}
		}
		CacheEntry newEntry = new CacheEntry(key, value);
		q.addFirst(newEntry);
		map.put(key, newEntry);

	}

	public void show() {
		for (CacheEntry cacheEntry : q) {
			System.out.println(cacheEntry.key + ":" + cacheEntry.value);
		}
	}

	public static void main(String[] args) {
		LRUCacheUsingDequeAndHashmap cache = new LRUCacheUsingDequeAndHashmap();
		cache.putIntoCache(1, "value1");
		cache.putIntoCache(2, "value2");
		cache.putIntoCache(1, "value1updated");
		cache.putIntoCache(3, "value3");
		cache.putIntoCache(4, "value4");
		cache.putIntoCache(5, "value5");
		cache.putIntoCache(2, "value2updated");

		cache.show();
	}

}

class CacheEntry {
	int key;
	String value;

	public CacheEntry(int key, String value) {
		this.key = key;
		this.value = value;
	}
}