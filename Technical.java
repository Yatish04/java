import java.util.ArrayList;

public class Technical extends staff {
    ArrayList<String> skills=new ArrayList<>();
    Technical(){
        super();
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        String base= "Name: "+this.name+"staffid: "+this.staffid+"salary: "+this.salary+"skills: ";
        for ( String publication:
                this.skills ) {
            base+=publication;
        }
        return base;
    }
}
