
import java.io.*;
class student{
int roll;
String name;
int m1,m2,m3,m4,total;
float avg;

void setdet(int r,String n)//getting details
{
roll=r;
name=n;
}
void setmarks()throws IOException //setting marks by user
{
System.out.println("ENTER THE MARKS OF THE STUDENT...");
DataInputStream in=new DataInputStream(System.in);
m1=Integer.parseInt(in.readLine());
m2=Integer.parseInt(in.readLine());
m3=Integer.parseInt(in.readLine());
m4=Integer.parseInt(in.readLine());
total=m1+m2+m3+m4;
avg=total/4;
}
void display()//displaying details of students
{
System.out.println("\n\nROLL:"+roll);
System.out.println("NAME:"+name+"\n\n");
System.out.println("SUB1:"+m1);
System.out.println("SUB2:"+m2);
System.out.println("SUB3:"+m3);
System.out.println("SUB4:"+m4);
System.out.println("-------");
System.out.println("TOTAL:"+total);
System.out.println("-------");
System.out.println("AVERAGE:"+avg);

}
String retg()//returns grade as per the average
{
if(avg<=100 && avg>=90)
{
return "A";
}
else if(avg<90 && avg>=80)
{
return "B";
}
else if(avg<80 && avg>=70)
{
return "C";
}
else if(avg<70 && avg>50)
{
return "D";
}
else
{
return "E";
}
}
}
class main{
public static void main(String args[])throws IOException
{
String grade;
student S1=new student();
S1.roll=01;
S1.name="HARINI";
S1.setmarks();
S1.display();
grade=S1.retg();
System.out.println("THE GRADE OF THE STUDENT:"+grade+"\n\n");
student S2=new student();

}
}



