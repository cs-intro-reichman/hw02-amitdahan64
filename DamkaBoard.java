/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
                int numbers = Integer.parseInt(args[0]);

                for(int i = 0; i < numbers; i++){

                    for(int j = 0; j < numbers; j++){
                        System.out.print("* ");
                        }

                    if(i % 2 == 0){
                        System.out.println("");
                        System.out.print(" ");
                        }

                    else{
                        System.out.println("");
                        }

                    }

	}
}
