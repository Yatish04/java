import  java.util.Scanner;

public class Rectangle {
    double length,width,area;
    String colour;
    public  void  setLength(double length){
        this.length=length;
    }
    public void setWidth(double width){

        this.width=width;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public void find_Area(){
        this.area=this.length*this.width;

    }
    boolean isSame(Rectangle ob2){
        System.out.println(this.area);
        System.out.println(ob2.area);
        System.out.println(this.colour);
        System.out.println(ob2.colour);
        return (this.area==ob2.area)&&(this.colour.contains(ob2.colour));

    }

    public static void main(String[] args) {
        Rectangle ob1=new Rectangle();
        Rectangle ob2=new Rectangle();

        System.out.println("Enter the first Rectangle parameters length width and colour");
        Scanner s= new Scanner((System.in));
        ob1.setLength(s.nextDouble());
        ob1.setWidth(s.nextDouble());
        ob1.setColour(s.next());
        ob1.find_Area();

        System.out.println("Enter the second Rectangle parameters length width and colour");
        Scanner s1= new Scanner((System.in));
        ob2.setLength(s1.nextDouble());
        ob2.setWidth(s1.nextDouble());
        ob2.setColour(s1.next());
        ob2.find_Area();

        System.out.println(ob2.area);
        System.out.println(ob1.area);
        if(ob1.isSame(ob2)){

            System.out.println("Same");
        }
        else{
            System.out.println("Not Same ");
        }

    }
}
