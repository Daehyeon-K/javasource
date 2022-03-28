package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Stack
// 마지막에 저장한 데이터를 가장 먼저 꺼내는 LIFO
// push()==삽입, pop()==인출 // 스택에 넣고 빼고하는 용어. 별도로 메소드가 구현되어 있음.
// empty()

// Queue
// 처음에 저장한 데이터를 가장 먼저 꺼내는 FIFO
// offer()==삽입, poll()==인출 // 큐에 넣고 빼고하는 메소드. 별도로 메소드가 구현되어 있음.


public class StackEx1 {
	public static void main(String[] args) {
		// 스택 생성
		Stack<String> stack = new Stack<String>();
		
		// 스택에 삽입
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		
		// 스택에서 인출
		while(!stack.empty()) { // Stack 자체 메소드
			System.out.println(stack.pop()); }
		
		// 큐 생성
		// Queue<String> queue = new Queue(); // Queue는 인터페이스라 new 못함. LinkedList로 구현해야 함
		Queue<String> queue = new LinkedList<String>();
		
		// 큐에 삽입
		queue.offer("10");
		queue.offer("9");
		queue.offer("8");
		queue.offer("7");
		queue.offer("6");
		
		// 큐에서 인출
		while(!queue.isEmpty()) { // Queue 자체 메소드 없음
			System.out.println(queue.poll());
		}
		
		
	}
}
