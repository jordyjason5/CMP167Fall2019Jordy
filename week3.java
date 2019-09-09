import java.util.Scanner;

public class week3 {
	private static Scanner input;

	public static void main(String[] args) {
input = new Scanner(System.in);

System.out.print ("Enter four int values");

int num1 = input.nextInt();
int num2 = input.nextInt();
int num3 = input.nextInt();
int num4 = input.nextInt();

int Result = (num1 * num2 * num3 * num4);

System.out.print(Result);


}

}


