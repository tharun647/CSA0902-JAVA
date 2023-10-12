import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
public class SortList {

    public static void main(String[] args)
    {
LinkedList<Integer> L1 = new LinkedList<>();
        L1.add(1);
        L1.add(3);
        L1.add(5);
LinkedList<Integer> L2 = new LinkedList<>();
        L2.add(2);
        L2.add(4);
        L2.add(6);
LinkedList<Integer> merged = new LinkedList<>();
        merged.addAll(L1);
        merged.addAll(L2);

System.out.println("L1 : "+L1);
System.out.println("L2 : "+L2);
System.out.println("Merged : "+merged);
Scanner src=new Scanner(System.in);
System.out.println("Enter option 1 for ascending and 2 for descending");
int order=src.nextInt();
switch(order){
case 1:
{
Collections.sort(merged);
System.out.println(merged);
break;
}
case 2:
{
Collections.sort(merged);
Collections.reverse(merged);
System.out.println(merged);
break;
}
default:{
System.out.println("Enter valid Input");
break;
}
}

}
}