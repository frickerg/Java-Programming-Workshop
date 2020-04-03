package main;

public class Variables {	
	public static void main(String[] args) {
		int a = 1;
		int b = 5;
		
		int ab = a - b;
		System.out.println(ab);
		
		char c = 'X';
		char d = '$';
		
		String cd = Character.toString(c) + Character.toString(d);
		System.out.println(cd);
		
		String e = "Hello World";
		String f = "Programmiere chani";
		
		System.out.println(e + ", " + f);
		
		float g = 2.55555555555555555555555555555555555555555555555555555555555555555555555f;
		float h = 1.25f;
		
		double i = 2.55555555555555555555555555555555555555555555555555555555555555555555555d;
		double j = 1.25d;
		
		if(g + h == i + j) {
			System.out.println("is the same");
		} else {
			System.out.println(g);
			System.out.println(i);
		}
		
		System.out.println();
	}
}
