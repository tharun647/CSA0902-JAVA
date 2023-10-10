import java.util.Scanner;
public class Reverseanum
{
public static void main(String[] args)
{
Scanner src= new Scanner(System.in);
int a=src.nextInt();
int reverse=0;
while(a!=0){
int remainder=a%10;
reverse=reverse*10+remainder;
a=a/10;
}
System.out.println("The reverse of the given number is:"+reverse);
}
}