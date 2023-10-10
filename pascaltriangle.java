import java.io.*;
import java.util.Scanner;
class pascaltriangle {
	public static void printPascal(int n)
	{
		for (int line = 1; line <= n; line++) {
			for (int j = 0; j <= n - line; j++) {
				System.out.print(" ");
			}
			int C = 1;
			for (int i = 1; i <= line; i++) {
				System.out.print(C + " ");
				C = C * (line - i) / i;
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = src.nextInt();
		printPascal(n);
	}
}