class Pen{
String color;
String shape;

public void printColor(){
System.out.println("THe color of thid pen is" +this.color);
System.out.println("THe shape of thid pen is" +this.shape);


}

}
public class Oop{
public static void main(String [] args){
Pen p1=new Pen();
p1.color="black";
p1.shape="rectangle";

p1.printColor();
Pen p2=new Pen();
p2.color="white";
p2.shape="circle";

p2.printColor();
Pen p3=new Pen();
p3.color="blue";
p3.shape="triangle";

p3.printColor();
}

}