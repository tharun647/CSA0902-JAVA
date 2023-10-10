import java.util.Scanner;
public class LengthOfLastWord
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a string: ");
String str = scanner.nextLine();
int lengthOfLastWord = 0;
for (int i = str.length() - 1; i >= 0; i--)
{
if (str.charAt(i) != ' ')
{
lengthOfLastWord++;
}
else
{
break;
}
}
System.out.println("The length of the last word is: " + lengthOfLastWord);
}
}