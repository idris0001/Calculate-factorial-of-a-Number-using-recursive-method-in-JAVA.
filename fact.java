import java.util.Scanner;
public class fact 
{ 
    public static void main(String args[])
    {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number to FInd Factorial: ");
        num=scanner.nextInt();
        scanner.close();
        long factorial=findFact(num);
        System.out.println("********************************************");
        System.out.println("Factorial of The Number "+num+" = "+factorial);
        System.out.println("********************************************");
    }
    public static long findFact(int num)
    {
       if(num>=1)
       {
        return num*findFact(num-1);
       }
        else
        {
         return 1;
        }   
    } 
}