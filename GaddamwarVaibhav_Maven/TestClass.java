import java.util.*;
interface Asha{  
void print();  
}  
interface dairyMilk{  
void print1();  
} 
interface kalakandh{  
void print2();  
}
interface gilebi{  
void print3();  
}
class TestClass implements Asha,dairyMilk,kalakandh,gilebi{
public void print(){System.out.println("Asha");}  
 public void print1(){System.out.println("dairyMilk");}  
 public void print2(){System.out.println("kalakandh");}  
public void print3(){System.out.println("gilebi");}  
 public static void main(String args[]){
Scanner v=new Scanner(System.in) ;
int c=0;
System.out.println("CHOOSE:\n1.Asha\n2.dairyMilk\n3.kalakandh\n4.gilebi");
while(true)
{
TestClass obj = new TestClass();  
int b=v.nextInt();
if (b==5)
break;
switch(b)
{
case 1:
obj.print();
c++;
break;
case 2:
obj.print1();
c++;
break;
case 3:
obj.print2();
c++;
break;
case 4:
obj.print3();
c++;
break;
}
}  
System.out.println("\nTotal Gifts Count :"+c);
 }  
}  