import java.util.Random;;
public class test {
	public static void main(String[] args) {
		int num; 
		int num2;
		Random randGen = new Random();
		
		
	    num = randGen.nextInt(15) + 1;
	    num2 =14;
		System.out.println("The number of today is...");
		System.out.println(num);
		
		if (num==num2)
		{
			System.out.println("Its a match");
		}else {
			System.out.println("It is not a Match");
		}
	}

}
