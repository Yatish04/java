import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the cricket player age name and type");
        Scanner s= new Scanner(System.in);
        int age;
        String name,type;
        age=s.nextInt();
        s.nextLine();
        name=s.nextLine();
        type=s.nextLine();

        Cricket_Player ob=new Cricket_Player(name,age,type);


        System.out.println("Enter the football player age name and type");
        Scanner s1= new Scanner(System.in);
        age=s1.nextInt();
        s1.nextLine();
        name=s1.nextLine();
        type=s1.nextLine();
        Football ob1=new Football(name,age,type);

        System.out.println("Enter the hockey player age name and type");
        Scanner s2= new Scanner(System.in);

        age=s2.nextInt();
        s2.nextLine();
        name=s2.nextLine();
        type=s2.nextLine();
        Hockey ob2=new Hockey(name,age,type);

        ob.Show();
        ob1.Show();
        ob2.Show();
    }
}
