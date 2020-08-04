package com.leetcode.topInterviewQuestions;
/*
 * Leetcode-146
 */
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCacheImpl {

	public static void main(String[] args) {
		/*
		 * ["LRUCache","put","put","put","put","get","get"]
[[2],[2,1],[1,1],[2,3],[4,1],[1],[2]]
		 */
		LRUCache cache = new LRUCache(2);
		cache.put(2, 1);
		cache.put(1, 1);
		cache.put(2, 3);
		cache.put(4, 1);
		cache.get(1);       // returns 1
		cache.get(2);       // returns -1 (not found)
		/*cache.put(3, 3);    // evicts key 2
		cache.put(4, 4);    // evicts key 1
		cache.get(1);       // returns -1 (not found)
		cache.get(3);       // returns 3
		cache.get(4);       // returns 4
*/	}
}

class LRUCache {
	private int capacity;
	private Map<Integer,Node> map;
	private Deque<Node> list ;

	LRUCache(int capacity) {
		this.capacity = capacity;
		this.map = new HashMap<Integer, Node>(capacity+1);
		this.list = new LinkedList<Node>();
	}

	public void get(int key) {
		if(map.get(key) != null){
			Node node = map.get(key);
			System.out.println(node.getValue());
			list.remove(node);
			list.addLast(node);
		}else{
			System.out.println("-1");
		}
	}

	public void put(int key, int value) {
		if(!map.containsKey(key)){
			if(map.size() == capacity){
				Node node = list.removeFirst();
				map.remove(node.getKey());
			}
			Node node = new Node(key, value);
			list.addLast(node);
			map.put(key, node);
		}else{
			Node node = map.get(key);
			list.remove(node);
			node.setValue(value);
			list.addLast(node);
		}
	}
}

class Node {
	private int key;
	private int value;

	Node(int key, int value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}