import java.util.Scanner;
class Greting{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Please Enter your name : ");
String name=sc.nextLine();
System.out.println("Hi "+name+" Good Night ");
sc.close();
System.gc();
}
}