package stack;

public class Runner {
	public static void main(String[] args) {
		Dstack s = new Dstack();//for dynamic if you need static then go for fixed
		s.push(15);
		s.push(8);
		s.push(10);
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.push(23);
		s.push(24);
		s.push(12);
		s.push(54);
		s.pop();
		s.show();
		System.out.println(s.peek());
		System.out.println("size is "+s.size());
		System.out.println("Empty="+s.isEmpty());
		s.show();
	}
}
