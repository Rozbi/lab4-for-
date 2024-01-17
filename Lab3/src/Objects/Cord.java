package Objects;

import Enums.Status;
import Interfaces.Moving;
import Place.Place;

import java.util.Objects;

public class Cord implements Moving {
    private String name;
    private Place place;
    private int coordinate1;
    private int coordinate2;

    public Cord(String name, Place place, int coordinateY) {
        this.place = place;
        this.name = name;
        this.coordinate2 = coordinateY;
    }
    public String moveTheCord(int coordinate1, int coordinate2, Person k, Place p) {
        if (Math.abs(coordinate1 - coordinate2) < k.getForce() * Math.random()) {
            this.coordinate1 = p.GetCoordinate();
            this.setPlace(p);
            return "Karlson pulled the " + name + " to the " + p.GetPlace();
        } else {
            return "Karlson had not enough forse to get the destination";
        }
    }

    @Override
    public String moveTheObject(Person p, Object obj, Place park){
        if (p.getHeight() < Math.random()*6){
        return p.getName() + "Boy could not take the Cord";
        }
        else{
            this.coordinate2 = park.getCoordinate2();
            this.setPlace(park);
            return p.getName() + " " + "could take the Cord";
        }
    }
    public void setPlace(Place p) {
        this.place = p;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cord cord = (Cord) o;
        return coordinate1 == cord.coordinate1 && coordinate2 == cord.coordinate2 && Objects.equals(name, cord.name) && Objects.equals(place, cord.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, place, coordinate1, coordinate2);
    }
}
