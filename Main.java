import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teaching>  Teachers= new ArrayList<>();
        ArrayList<Technical> technical=new ArrayList<>();
        ArrayList<Contract> contract = new ArrayList<>();
        ArrayList<String> skills= new ArrayList<>();
        System.out.println("Enter n");
        ArrayList<String> publication = new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i;
        for(i=0;i<n;i++){
            Teaching ob= new Teaching();
            System.out.println("Enter the teacher name: ");
            Scanner s1= new Scanner(System.in);
            String name=s1.next();
            ob.setName(name);
            System.out.println("Staff ID");
            Scanner s2=new Scanner(System.in);
            int id=s2.nextInt();
            ob.setStaffid(id);
            System.out.println("Enter phone ");
            Scanner s7 = new Scanner(System.in);
            int phone = s7.nextInt();
            ob.setPhone(phone);
            System.out.println("Enter Salary ");
            Scanner s9= new Scanner(System.in);
            int n3=s9.nextInt();
            ob.setSalary(n3);
            System.out.println("Enter number of publications ");
            Scanner s3=new Scanner(System.in);
            int n1=s3.nextInt();
            for(int j=0;j<n1;j++){
                System.out.println("Enter "+(j+1)+"publication");
                Scanner s4=new Scanner(System.in);
                String pub=s4.next();
                publication.add(pub);
            }
            ob.setPublications(publication);
            Teachers.add(ob);
        }
        for (i=0;i<n;i++){
            Technical ob= new Technical();
            System.out.println("Enter the teacher name: ");
            Scanner s1= new Scanner(System.in);
            String name=s1.next();
            ob.setName(name);
            System.out.println("Staff ID");
            Scanner s2=new Scanner(System.in);
            int id=s2.nextInt();
            ob.setStaffid(id);


            System.out.println("Enter phone ");
            Scanner s7 = new Scanner(System.in);
            int phone = s7.nextInt();
            ob.setPhone(phone);
            System.out.println("Enter Salary ");
            Scanner s9= new Scanner(System.in);
            int n3=s9.nextInt();
            ob.setSalary(n3);

            System.out.println("Enter number of skills ");
            Scanner s3=new Scanner(System.in);
            int n1=s3.nextInt();
            for(int j=0;j<n1;j++){
                System.out.println("Enter "+(j+1)+" skills");
                Scanner s4=new Scanner(System.in);
                String pub=s4.next();
                skills.add(pub);
            }
            ob.setSkills(skills);
            technical.add(ob);
        }

        for (i=0;i<n;i++){
            Contract ob= new Contract();
            System.out.println("Enter the teacher name: ");
            Scanner s1= new Scanner(System.in);
            String name=s1.next();
            ob.setName(name);
            System.out.println("Staff ID");
            Scanner s2=new Scanner(System.in);
            int id=s2.nextInt();
            ob.setStaffid(id);


            System.out.println("Enter phone ");
            Scanner s7 = new Scanner(System.in);
            int phone = s7.nextInt();
            ob.setPhone(phone);
            System.out.println("Enter Salary ");
            Scanner s9= new Scanner(System.in);
            int n3=s9.nextInt();
            ob.setSalary(n3);

            System.out.println("Contract Period ");
            Scanner s3=new Scanner(System.in);
            int n1=s3.nextInt();
            ob.setPeriod(n1);
            contract.add(ob);
        }

        for (Technical obs: technical) {
            System.out.println(obs.toString());

        }
        for (Teaching obs:
             Teachers) {
            System.out.println(obs.toString());
        }
        for (Contract con:
             contract) {
            System.out.println(con);
        }

    }
}
