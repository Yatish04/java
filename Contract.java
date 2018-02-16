public class Contract extends staff {
    int period;
    Contract(){
        super();
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        String base= "Name: "+this.name+"staffid: "+this.staffid+"salary: "+this.salary+"period: "+this.period;

        return base;
    }
}
