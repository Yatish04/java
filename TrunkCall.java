public class TrunkCall {
    double dur;
    String type;
    TrunkCall(){

    }
    float  rate(){
        if(this.type.contains("urgent")){
            return 4.5f;
        }
        if(this.type.contains("lightening")){
            return 3.5f;
        }
        return 3f;

    }
}
