import java.util.*;
public class AnalogDigitalDriver {
    public static void main(String[] args) {
        ArrayList<TV> tvs = new ArrayList<TV>();
        BWTV tv1 = new BWTV();
        BWTV tv2 = new BWTV();
        HDTV tv3 = new HDTV();
        HDTV tv4 = new HDTV();
        tvs.add(tv1);
        tvs.add(tv2);
        tvs.add(tv3);
        tvs.add(tv4);
        for(int i = 0; i < tvs.size(); i++) {
            tvs.get(i).settvON(true);
        }
        for(TV tv : tvs) {
            System.out.println(tv.tyType());
            System.out.println("Is the tv on? " + tv.gettvON());
        }
        System.out.println();
        System.out.println(tv1.rotateRabbitEars());
        System.out.println(tv3.connectHDMI());
    }
}