package com.khan.dsa.misc;

/* https://medium.com/@krishankantsinghal/my-first-blog-on-medium-583159139237! */

import java.util.HashMap;

/**
 * Doubly linked list
 * 
 * @author shadabkhan
 *
 */
class Node {
	int value;
	int key;
	Node previous;
	Node next;
}

public class LRUCache {

	HashMap<Integer, Node> hashmap;
	Node head, tail;
	int LRU_SIZE = 4; // Here i am setting 4 to test the LRU cache
						// implementation, it can make be dynamic

	public LRUCache() {
		hashmap = new HashMap<>();
	}

	public int getEntry(int key) {
		if (hashmap.containsKey(key)) // Key Already Exist, just update the list to have it on the top.
		{
			Node entry = hashmap.get(key);
			removeNode(entry);
			addAtTop(entry);
			return entry.value;
		}
		return -1;
	}

	public void putEntry(int key, int value) {
		if (hashmap.containsKey(key)) // Key Already Exist, just update the value and move it to top
		{
			Node entry = hashmap.get(key);
			entry.value = value;
			removeNode(entry);
			addAtTop(entry);
		} else {
			Node newnode = new Node();
			newnode.previous = null;
			newnode.next = null;
			newnode.key = key;
			newnode.value = value;
			if (hashmap.size() == LRU_SIZE) // We have reached maxium size so need to make room for new element.
			{
				hashmap.remove(tail.key);
				removeNode(tail);
				addAtTop(newnode);

			} else {
				addAtTop(newnode);
			}

			hashmap.put(key, newnode);
		}
	}

	public void addAtTop(Node node) {
		node.next = head;
		node.previous = null;
		if (head != null)
			head.previous = node;
		head = node;
		if (tail == null)
			tail = head;
	}

	public void removeNode(Node node) {

		if (node.previous != null) {
			node.previous.next = node.next;
		} else {
			head = node.next;
		}

		if (node.next != null) {
			node.next.previous = node.previous;
		} else {
			tail = node.previous;
		}
	}

	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		LRUCache lrucache = new LRUCache();
		lrucache.putEntry(1, 1);
		lrucache.putEntry(10, 15);
		lrucache.putEntry(15, 10);
		lrucache.putEntry(10, 16);
		lrucache.putEntry(12, 15);
		lrucache.putEntry(18, 10);
		lrucache.putEntry(13, 16);

		System.out.println(lrucache.getEntry(1));
		System.out.println(lrucache.getEntry(10));
		System.out.println(lrucache.getEntry(15));

	}
}