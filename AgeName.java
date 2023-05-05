import java.util.Scanner;
class AgeName
{
static String name;
static int age;
public static void main(String args[])
{
AgeName.create();
AgeName.display();
}

public static void create()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name");
name = sc.nextLine(); // Removed datatype string and was able to get correct answer - Need clarity
System.out.println("Enter the age");
age = sc.nextInt();// Removed datatype int and was able to get correct answer - Need clarity
}

public static void display()
{
System.out.println("Name is " + name);
System.out.println("Age is " + age);
}

}
