package jenkins;

import java.util.Scanner;

public class Jenkinmain {

	public static void main(String[] args) {
	
		Scanner getinput = new Scanner(System.in);
		//System.out.println("TESTING ");
		int num1 = getinput.nextInt();
		int num2 = getinput.nextInt();
		addnumbers change1 = new addnumbers();
		int sum = change1.add(num1, num2);
		System.out.println("sum is "+sum);
		multi change2 = new multi();
		int product = change2.prod(num1,num2);
		System.out.println("Doubting bat "+ product);
		getinput.close();
	}

}
