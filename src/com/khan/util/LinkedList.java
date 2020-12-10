package com.khan.util;

/**
 * @author shadabkhan
 *
 * @param <E> type of elements to be kept in this collection
 */
public class LinkedList<E> {
	Node<E> head;

	/**
	 * appends the element to the last of the collection
	 * 
	 * @param data element to be added
	 */
	public void addLast(E data) {
		Node<E> newNode = new Node<>();
		newNode.data = data;
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			Node<E> node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = newNode;
		}
	}

	/**
	 * shows the elements contained in this collection
	 */
	public void show() {
		Node<E> node = head;
		System.out.print("[");
		while (node.next != null) {
			System.out.print(node.data + ",");
			node = node.next;
		}
		System.out.print(node.data);
		System.out.print("]");
	}
}

class Node<E> {
	E data;
	Node<E> next;
}
