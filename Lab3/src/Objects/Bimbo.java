package Objects;

import Enums.Status;
import Place.*;

import java.util.Objects;

public class Bimbo {
    private String name;
    private Status stat;
    private Place place;
    private int attention;
    public Bimbo(String name, Status stat, Place place, int attention){
        this.name = name;
        this.stat = stat;
        this.attention = attention;
        this.place = place;
    }
    public String getLocation(){
        return "The location of Bimbo is " + place.GetPlace();
    }
    public String support(Person p) {
        if (attention * Math.random() > 8) {
            p.setStat(Status.WAITING);
            return name + " licked the boy's nose ";
        } else{
            p.setStat(Status.SAD);
            return name + " didn' t notice that boy is sad";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bimbo bimbo = (Bimbo) o;
        return attention == bimbo.attention && Objects.equals(name, bimbo.name) && stat == bimbo.stat && Objects.equals(place, bimbo.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stat, place, attention);
    }
}
