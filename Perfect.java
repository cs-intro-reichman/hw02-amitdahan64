/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
                int number = Integer.parseInt(args[0]);
                int sum = 0;
                String perfect = number +" is a perfect number since " + number + " = ";
                String not_perfect = number + " is not a perfect number";

                for(int i = 1; i < number; i++){

                    if(number % i == 0){
                        sum = sum + i;
                        perfect = perfect + i + " + ";
                        }
                    }

                if(sum == number) {
                    System.out.println(perfect.substring(0, perfect.length() -2));
                    }

                else {
                    System.out.println(not_perfect);

                    }



	}
}
