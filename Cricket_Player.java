public class Cricket_Player extends Player {
    String type;
    Cricket_Player(String name,int age,String type){
        super(name,age);
        this.type=type;
    }
    void Show(){
        super.display();
        System.out.println( "Type is "+(this.type));
    }
}
