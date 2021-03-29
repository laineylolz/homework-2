
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 5.
	//a.
			int i = 0;
			while (i <= 100) {	
			System.out.println(i);
			i += 2;
			}
			
	//b.
			int x = 103;
			while (x > 1) {
			x -= 3;
			System.out.println(x);
			}
			
	//c.
			for (int i1 = 1; i1 < 100; i1 +=2){
			System.out.println(i1);
			}
	//d. 
			for (int x1 = 0; x1 <= 100; x1++) {
			if (x1 % 15 == 0) {
			System.out.println("hello world");
}			else if (x1 % 5 == 0) {
			System.out.println("world");
}			else if (x1 % 3 == 0) {
			System.out.println("hello");
}			else {
			System.out.println(x1);
}
			}
	}

}
