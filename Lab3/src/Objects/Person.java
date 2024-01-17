package Objects;

import Enums.Status;
import Place.Place;

import java.util.EmptyStackException;
import java.util.Objects;

public abstract class Person {
     protected Status stat;
     private String name;
     private int force;
     private int height;
     private int health;
     private Place place;
     public Person(String name, Status stat, int force, int health, int height, Place place){
          this.name = name;
          this.force = force;
          this.height = height;
          this.place = place;
          this.stat = stat;
          this.health = health;
          if ((health == 0) || (force == 0))  {
               System.out.println(name + " died");
               throw new EmptyStackException();
          }
     }
     public String open(){
          class Door{
               int compliance;
               Status stat;
               String name;
               public Door(String name, Status stat, int compliance){
                    this.compliance = compliance;
                    this.stat = stat;
                    this.name = name;
               }
               }
               Door door = new Door("door", Status.NORMAL, 30);
               this.force = this.force - 4;
               door.stat = Status.OPEN;
               return door.name + " " + door.stat;
          }
          public String write() {
          return null;
          }
      public int getForce() {
          return this.force;
     }
     public int getHeight() {
          return height;
     }

     public String getName() {
          return name;
     }

     public String getFullStat() {
          return name + " " + stat.getStat();
     }

     public void setStat(Status stat) {
          this.stat = stat;
     }

     public int getHealth() {
          return health;
     }

     public void setHealth(int health) {
          this.health = health;
     }
     public String talk(){
          return null;
     }
     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Person person = (Person) o;
          return force == person.force && height == person.height && Objects.equals(name, person.name) && Objects.equals(place, person.place) && stat == person.stat;
     }
     @Override
     public int hashCode() {
          return Objects.hash(name, force, height, place, stat);
     }
}
