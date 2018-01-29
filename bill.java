import java.util.Scanner;
public class bill extends TrunkCall{
    float amount;
    bill(){

    }
    void  read(){

        System.out.println("Enter the duration and type");
        Scanner s=new Scanner(System.in);
        this.dur=s.nextFloat();

        this.type=s.next();
    }
    void amount() {

        if (this.dur < 1.5) {
            this.amount = (float)(super.rate() * this.dur) + 1.5f;

        } else if (this.dur < 3) {
            this.amount = ((float)(super.rate() * this.dur)) + 2.5f;

        } else if (this.dur < 5) {
            this.amount = (float)(super.rate() * this.dur) + 4.5f;

        } else {
            this.amount = (float)(super.rate() * this.dur) + 5f;

        }

    }
    void print(){

        System.out.println(this.type+" "+(this.dur)+" "+this.amount);

        }



    }


