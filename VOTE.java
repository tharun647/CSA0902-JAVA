import java.util.Scanner;
public class VOTE
{
public static void main(String[]args)
{
Scanner src=new Scanner(System.in);
int age=src.nextInt();
if(age>=18){
System.out.println("you are eligible to vote");
}
else{
int remain=18-age;
System.out.println("eligible after "+remain+"years");
}
}
}
