import java.util.ArrayList;

public class Teaching extends staff {
    String domain;
    ArrayList<String> publications = new ArrayList<>();
    public Teaching(){
        super();
    }
    public String getDomain() {
        return domain;
    }

    public ArrayList<String> getPublications() {
        return publications;
    }

    public void setPublications(ArrayList<String> publications) {
        this.publications = publications;
    }


    @Override
    public String toString() {
        String base= "Name: "+this.name+"domain: "+this.domain+"staffid: "+this.staffid+"salary: "+this.salary+"publications: ";
        for ( String publication:
            this.publications ) {
            base+=publication;
        }
        return base;
    }




}
