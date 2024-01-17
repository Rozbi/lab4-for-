package Objects;
import Interfaces.Entertainable;
import Place.*;
import Enums.Status;
import Interfaces.Playable;

import java.util.Objects;

public class Boy extends Person implements Playable, Entertainable {
    Status stat;
    private String name;
    private Place place;
    public Boy(String name, Status type, int force, int height, int health, Place place) {
        super(name, type, force, height, health, place);
        this.stat = type;
        this.name = name;
    }

    @Override
    public String talk() {
        if (stat == Status.STUBBORN) {
            return name + ": I won't go! I was isolated, I will be here";
        }
        if (stat == Status.WORRIED) {
            return name + ": Did she find Karlson? There is nothing under my bed!";
        } if(stat== Status.SAD){
            return name + ": It's not true! What will I do if you die?";
        } if(stat == Status.TIRED){
            return name + ": Now only u and Karlson are next to me";
        } if (stat == Status.WAITING){
            return name + ": I miss my mom.";
        } if (stat == Status.THINKING){
            return name + ": Oh, I'm sorry, I didn't think u were sleeping";
        } if (stat == Status.GHOST)
            return name + ": Do u have problems with your dreams?";
        else {
            return name + ": What can I do?";
        }
    }
    public void setStat(Status stat) {
          this.stat = stat;
     }

    public String tryToTalk(Person p){
        if (p.getFullStat() == "normal"){
            stat = Status.INSPIRED;
            return "Boy tries to talk.... Boy could talk with sister and brother" + " \n" + name + " " + stat.getStat();
        } if (p.getFullStat() == "funny"){
            return "Boy tries to talk with " + p.getName() + " about Scarlet fewer" + "\n Karlson didn't want to talk";
        }
        else {
            stat = Status.SAD;
            return "Boy tries to talk.... Boy couldn't talk with sister and brother" + ", \n" + name + " " + stat.getStat();
        }
    }
    @Override
    public String write(){
        class Letter{
            String name;
            Status stat;
            int inspiration;
            public Letter(String name, Status stat, int inspiration){
                this.name = name;
                this.stat = stat;
                this.inspiration = inspiration;
            }
            }
            Letter letter = new Letter("letter", Status.NORMAL, 20);
            if (letter.inspiration>15){
                return name + " has written " + letter.stat + " " + letter.name + "\n---*letter*---" ;
            }
            else{
                return name + " didn't wanted to write the letter";
            }
    }
    public void setPlace(Place p) {
          this.place = p;
     }
      public String getLocation(){
          return name + "'s location is " + place.GetPlace();
     }
    @Override
    public String joke(int funnyness, Person p) {
        if (funnyness > 15) {
            p.setStat(Status.ANGRY);
            return "Boy is telling the joke";
        } else {
            p.setStat(Status.WORRIED);
            return name + ": I remembered the joke";
        }
    }
    @Override
    public void play(int point, Status stat, Game g) {
        if (point > 15) {
            this.stat = Status.THINKING;
            System.out.println("Thinking not only because of the " + g.getType().getStat() + " " + g.getName());
        } else {
            this.stat = Status.WORRIED;
            System.out.println(name + " " + stat + " because of the sounds of Freken Bok's steps");
        }
    }
}

