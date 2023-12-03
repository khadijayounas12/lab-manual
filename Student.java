class Student{
int age;
String name;
public  void getInfo(){
System.out.println("Name of the student is =" +this.name);
System.out.println("Age of the student is =" +this.age);


}

}
public class test{
public static void main(String [] args){
Student s1=new Student();
s1.name="khadija";
s1.age=19;
s1.getInfo();
Student s2=new Student();
s2.name="tania";
s2.age=14;
s2.getInfo();





}

}