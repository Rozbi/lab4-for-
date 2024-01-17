package Objects;

import Enums.Status;
import Interfaces.Entertainable;
import Interfaces.Playable;
import Place.*;

public class Karlson extends Person implements Playable, Entertainable {
    private Place place;
    private String name;
    private Status stat;
    private Bell b;
    private int pleasure;

    public Karlson(String name, Status type, int force, int height, int health, Place place) {
        super(name, type, force, height, health, place);
        this.stat = type;
        this.name = name;
        this.place = place;
    }

    public static String describe(Status stat) {
        switch (stat.getStat()) {
            case "normal":
                return "Karlson has created the ring with a bell";
            case "ill":
                return "Karlson got sick by insomnia";
            case "inspired":
                return "Insomnia bothered Karlson and he looked around the room";
        }
        return null;
    }


    public Object create(String name, Status type, Place place) {
        Bell bell = new Bell(name, type, place);
        this.b = bell;
        this.describe(Status.NORMAL);
        return type.getStat() + " " + name + " was created " + "under the " + place.GetPlace();
    }

    public void play(int point, Status stat, Game g) {
        pleasure = (int) (Math.random() * point);
        if (pleasure > 15) {
            System.out.println(name + " " + "flew away, but promised to come back");
        } else {
        }
        System.out.println(name + " " + "came back quickly");
    }
    @Override
    public String talk(){
        if (stat.getStat() == "angry"){
            return name + ": Mb u think that it is alarm clock? ";
        }
        if (stat.getStat() == "ill"){
            return name + ": U should asked me before! I'm sure that u have sweet dreams";
        }
        if (stat.getStat() == "sad"){
            return name + ": Yes. It couldn't be worse." + "\nI sleep sweety at night and at noon, not during daily times.";
        } if (stat.getStat() == "inspired"){
            return name + ": but if I had a little gift, I would be more happy.";
        } if (stat.getStat() == "funny"){
            return name + ": Thank u for your gift! I've always dreamed about it! ";
        }
        else{
            return name + ": LOX";
        }
    }

    public void setPlace(Place p) {
          this.place = p;
     }
      public String getLocation(){
          return name + "'s location is " + place.GetPlace();
     }
    public void setStat(Status stat) {
          this.stat = stat;
     }

    @Override
    public String joke(int funnyness, Person p) {
        if (funnyness > 15) {
            p.setStat(Status.ANGRY);
            return "Boy was laughing";
        }
        else{
            stat = Status.GHOST;
            p.setStat(Status.WORRIED);
            return "The Ghost song sounded and spirit has appeared";
        }
    }

}
