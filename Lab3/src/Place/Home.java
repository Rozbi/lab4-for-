package Place;
import Objects.*;
import java.util.Objects;

public class Home extends Place {
    public Home(int coordinateХ, int coordinateY, String name) {
        super(coordinateХ, coordinateY, name);
    }
    public static class Cornice extends Place{
        int fragility;
    public Cornice(int coordinateХ, int coordinateY, String name, int fragility){
        super(coordinateХ, coordinateY, name);
        this. fragility = fragility;
    }
    }
    public static class Room extends Place{
        int size;
        public Room(int coordinateХ, int coordinateY, String name, int size) {
            super(coordinateХ, coordinateY, name);
            this.size = size;
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
        int purity;
        public Parket(int coordinateХ, int CoordinateY, String name, int purity) {
            super(coordinateХ, CoordinateY, name);
            this.size = size;
        }
    }
    public static class Window extends Place {
            Status stat;
            public Window(int coordinateХ, int coordinateY, String name, Status stat;) {
                super(coordinateХ, coordinateY, name);
                this.stat = stat;
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



