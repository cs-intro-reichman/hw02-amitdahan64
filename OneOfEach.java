
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
                Boolean boy = false;
                Boolean girl = false;
                int boy_count = 0;
                int girl_count = 0;

                while(!boy || !girl){

                    int random = (int)(Math.random() * 2);

                    if(random == 0){
                        System.out.print("b ");
                        boy_count ++;
                        boy = true;
                        }

                    if(random == 1){
                        System.out.print("g ");
                        girl_count ++;
                        girl = true;
                        }
                    }

                System.out.println("");
                System.out.println("You made it... and you now have "+ (boy_count + girl_count) +" children.");

	}
}
