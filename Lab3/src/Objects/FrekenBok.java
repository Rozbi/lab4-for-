package Objects;

import Enums.Status;
import Place.Place;

public class FrekenBok extends Person {
    Status type;
    int force;
    String name;
    Place place;

    public FrekenBok(String name, Status type, int force, int height, int health, Place place) {
        super(name, type, force, height, health, place);
        this.type = type;
        this.force = force;
        this.name = name;
        this.place = place;
    }
    public void setPlace(Place p) {
          this.place = p;
     }
      public String getLocation(){
          return name + "'s location is " + place.GetPlace();
     }
    public String appreciate(Person p, Boy b) {
        if (p.stat.getStat() == "angry") {
            return name + ": Stop doing it! It's rubbish!";
        }
        if (p.stat.getStat() == "worried") {
            return name + ": I want to tell about it on TV!";
        } if (p.stat.getStat() == "ill"){
            return name + ": Scarlet fewer! Bosse and Betan must be in the hospital! Boy, u must be isolated!\n" + b.getFullStat();
        } if (b.stat.getStat() == "sad"){
            return name + ": People couldn' t die from Scarlet fewer!";
        } if (p.stat.getStat() == "inspired"){
            return name + ": Look what I had written..";
        }
        else {
            return name + ": Why are u laughing?";
        }
    }
    @Override
    public String write() {
        type = Status.THINKING;
        class Pen {
            String name;

            public Pen(String name, int fragility) {
                this.name = name;
            }
        }
        class Paper {
            String name;
            String color;

            public Paper(String name, String color) {
                this.name = name;
                this.color = color;
            }
        }
        Paper paper = new Paper("paper", "white");
        Pen pen = new Pen("pen", 20);
        return name + " is writing with a " + paper.color + " " + paper.name + " and " + pen.name;
    }
    public String sweepUp(Place place, Person p, int fragility) {
        class FloorBrush {
            static String name;
            public FloorBrush(String name) {
                this.name = name;
            }
        }
        FloorBrush floorBrush = new FloorBrush("Floor brush");
        if (fragility == 15){
            this.type = Status.INSPIRED;
            p.setStat(Status.STUBBORN);
            return name + ": I want to clean your room by " + FloorBrush.name + ". Go to the kithen. " + p.getFullStat();
        }
        if ((fragility < 15) && (fragility >= 10)) {
            this.type = Status.ANGRY;
            this.force -=5;
            p.setStat(Status.WORRIED);
            return name + ": Look what does your bed look like! Go away!";
        }
        if ((fragility < 10) && (fragility >= 5)) {
            this.type = Status.TIRED;
            p.setStat(Status.STUBBORN);
            this.force -= 10;
            return name + ": Sit down as long as u want, but someday you ll have to go away, stubborn boy!";
        } if ((fragility < 5) && (fragility >1)) {
            this.type = Status.EXHAUSTED;
            this.force -= 20;
            p.setStat(Status.FUNNY);
            return name + ": Stop laughing! Everybody in your familly is ill, but u don't care!";
        } else{
            return "Freken Bok trew away the " + floorBrush.name;
        }
    }

}
