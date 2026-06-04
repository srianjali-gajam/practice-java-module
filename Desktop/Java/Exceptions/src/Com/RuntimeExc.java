package Com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeExc {

	public static void main(String[] args) {
		
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first values");
		int num1=sc.nextInt();
		System.out.println("Enter the second input");
		int num2=sc.nextInt();
		
		int div = num1/num2;
		System.out.println(div);
		
	} catch(ArithmeticException ai){
		System.out.println(ai);
		
	}
	catch(InputMismatchException ie){
		System.out.println(ie);
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}

	}

}
