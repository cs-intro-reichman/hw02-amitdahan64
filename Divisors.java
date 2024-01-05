/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		//// Put your code here
                int number = Integer.parseInt(args[0]);
                for(int i = 1; i < number + 1; i++){
                    if(number % i == 0){
                        System.out.println(i);
                        }
                    }

		/* when we want to iterate 'number' times we do
		for( int i = 0; i < number; i++)
		notice that this will run the same number of times, 
		in computer science, we count from zero. */

	}
}
