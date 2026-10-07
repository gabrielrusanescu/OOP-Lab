/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/

public class Prob4
{
    public static void main(String[] args) {
        if(args.length == 0) System.out.print("Nu s-au primit argumente");
        for(int i = 0; i < args.length; i++){
            System.out.print(i + " " + args[i] + '\n');
        }
    }
}