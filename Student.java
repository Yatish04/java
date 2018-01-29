import java.util.Scanner;

public class Student {
    String name,usn,phone,branch;
    public Student(String name,String usn,String branch,String phone){
        this.branch=branch;
        this.name=name;
        this.usn=usn;
        this.phone=phone;

    }

    void  display(){

        System.out.println("Name "+this.name+" Usn "+this.usn+" branch "+this.branch+" phone "+this.phone+"\n");
    }


    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of Students ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int i;
        Student [] arr=new Student[n];
        String name,usn,phone,branch;
        for(i=0;i<n;i++){
            System.out.println("Enter Name Usn branch phone in order\n");
            Scanner s1=new Scanner(System.in);
            name=s1.next();
            usn=s1.next();
            branch=s1.next();
            phone=s1.next();
            Student ob= new Student(name,usn,branch,phone);
            arr[i]=ob;
        }

        System.out.println("The list of Students created are\n");
        for (Student temp:arr) {

            temp.display();

        }
    }

}
