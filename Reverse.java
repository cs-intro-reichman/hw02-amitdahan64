/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
                String str = args[0];
                int length = str.length();
                int middle;
                if(length % 2 == 0){
                    middle = (length/2-1);
                    }
                else {
                    middle = (length/2);
                    }

                for(int i = length ; i > 0 ; i--){
                        System.out.print(str.charAt(i-1));

                    }
                System.out.println("");
                System.out.println("The middle character is " + str.charAt(middle));


	}
}
