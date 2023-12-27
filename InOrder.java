/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
                int max = 0;
                int last_num = 0;

                while(max <= last_num){
                 int random = (int)(Math.random() * 10 );
                 last_num = random;

                 if(max <= random){
                     max = random;
                     last_num = random;
                     System.out.print(random + " ");
                     }

                 else{
                     last_num = random;
                     }


                 }
	}
}
