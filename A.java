class A
{

void m()
{
System.out.println("M is invoked");
}
void n()
{
m(); // This.m();
}


public static void main (String args[])
{
A obj1 = new A();
obj1.n();
A obj2 = new A();
obj2.n();

}
}