/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
                int T = Integer.parseInt(args[0]);
                int kids =0;
                int two_kids_counter = 0;
                int three_kids_counter = 0;
                int four_or_more_counter = 0;

                for(int i = 0; i < T; i++){

                    Boolean boy = false;
                    Boolean girl = false;
                    int boy_count = 0;
                    int girl_count = 0;

                    while(!boy || !girl){

                        int random = (int)(Math.random() * 2);

                        if(random == 0){
                            boy_count ++;
                            boy = true;
                            }

                        if(random == 1){
                            girl_count ++;
                            girl = true;
                            }
                        }

                    int sum = boy_count + girl_count;
                    kids = kids + sum;

                    if(sum == 2){
                        two_kids_counter ++;
                        }

                    else{

                        if(sum == 3){
                        three_kids_counter ++;
                        }

                        else{
                            four_or_more_counter ++;
                            }
                    }





                }

            Double avarage = kids/(double)T;
            System.out.println("Average: "+ avarage + " children to get at least one of each gender.");
            System.out.println("Number of families with 2 children: " + two_kids_counter);
            System.out.println("Number of families with 3 children: " + three_kids_counter);
            System.out.println("Number of families with 4 or more children: " + four_or_more_counter);

	}
}
