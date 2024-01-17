package Place;
import Objects.*;
import java.util.Objects;

public class Home extends Place {
    public Home(int coordinateХ, int coordinateY, String name) {
        super(coordinateХ, coordinateY, name);
    }
    public static class Cornice extends Place{
    public Cornice(int coordinateХ, int coordinateY, String name){
        super(coordinateХ, coordinateY, name);
    }
    }
    public static class Room extends Place{
        public Room(int coordinateХ, int coordinateY, String name) {
            super(coordinateХ, coordinateY, name);
        }
    }
    public static class Bed extends Place{
        String name2;
        public Bed(int coordinateХ, int coordinateY, String name, String name2){
            super(coordinateХ, coordinateY, name);
            this.name2=name2;
        }
        public String getLocation(Person p){
            return p.getName() + "Location is " + name2;
        }
    }
    public static class Parket extends Place {

        public Parket(int coordinateХ, int CoordinateY, String name) {
            super(coordinateХ, CoordinateY, name);
        }
    }
    public static class Window extends Place {
            public Window(int coordinateХ, int coordinateY, String name) {
                super(coordinateХ, coordinateY, name);
            }
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Home home = (Home) o;
            return Objects.equals(this.GetCoordinate(), this.GetCoordinate());
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.GetCoordinate());
        }

}



