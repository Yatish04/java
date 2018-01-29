import  java.util.Scanner;
public class StudentData {
    int id,age;
    String name;
    StudentData(){

    }

    StudentData(int id,int age,String name){
        this.age=age;
        this.name=name;
        this.id=id;

    }
    void set(int id,int age,String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }

    int getId(){
        return  this.id;
    }
    int getId(int id){
        this.id=id;
        System.out.println("New id is "+(this.id));
        return id;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of students");
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        StudentData[] arr=new StudentData[n];
        int i;

        for(i=0;i<n;i++){
            StudentData ob=new StudentData();
            arr[i]=ob;
        }

        StudentData[] newarr= new StudentData[n];
        int temp,temp1;
        String name;
        for(i=0;i<n;i++){
            System.out.println("Enter the age id and name");
            Scanner s1= new Scanner(System.in);
            StudentData ob=arr[i];
            temp=s1.nextInt();
            temp1=s1.nextInt();
            name=s1.next();
            ob.set(temp,temp1,name);
            StudentData ob1=new StudentData(temp,temp1,name);
            newarr[i]=ob1;
        }

        for (StudentData ob:newarr ) {
            System.out.println("Do you want to change id");
            Scanner s2=new Scanner(System.in);
            if(s2.next().contains("yes")){
                System.out.println("Enter the new id");
                Scanner s4= new Scanner(System.in);
                ob.getId(s4.nextInt());
            }
            else
                System.out.println(ob.getId());
        }



    }

}
