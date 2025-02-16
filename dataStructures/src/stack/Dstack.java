package stack;

public class Dstack {
	int Capacity = 2;
	int [] stack = new int[Capacity];
	int top = 0;
	public void push(int data) {
		if(size() == Capacity) {
			expand();
		}
		stack[top++] = data;
	}
	private void expand() {
		int length = size();
		int newStack[] = new int[Capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		Capacity *= 2;
	}
	public void show() {
		for(int n:stack) {
			System.out.print(n + " ");
		}
	}
	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("stack is empty");
		}else {
			top--;
			data = stack[top];
			stack[top] = 0;
			shrink();
		}
		return data;
	}
	private void shrink() {
		int length = size();
		if(length<=(Capacity/2)) {
			Capacity = Capacity/2;
			int newStack[] = new int[Capacity];
			System.arraycopy(stack, 0, newStack, 0, length);
			stack = newStack;
		}
	}
	public int peek() {
		int data;
		data = stack[top-1];
		return data;
	}
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		return top<=0;
	}
}

