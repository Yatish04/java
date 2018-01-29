public class Football extends Player {
    String type;
    Football(String name,int age,String type){
        super(name,age);
        this.type=type;
    }
    void Show(){
        super.display();
        System.out.println("Type is "+(this.type));
    }
}
