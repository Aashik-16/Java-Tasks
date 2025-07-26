
public class Task8 {
	public static void main(String[] args)
	{
		char key = '*';
		int a=8;
		int b=4;
		switch(key) {
		case '+':
			System.out.println("Sum = " + (a+b));
			break;
		case '*':
			System.out.println("MUl = "+ (a*b));
			break;
		case '/':
			System.out.println("Div = "+ (a/b));
			break;
		case '-':
			System.out.println("Sub = "+(a-b));
			break;
		default:
			System.out.println("Error");
		}
		
	}

}
