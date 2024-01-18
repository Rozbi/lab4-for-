package Objects;
import Enums.Status;
import Interfaces.Playable;

public class Game {
    private static Status type;
    private static String name;

    public Game(String name, Status type) {
        this.type = type;
        this.name = name;
    }

    public Status getType() {
        return type;
    }

    public String getName() {
        return name;
    }
    public class Harmonika implements Playable {
        private String name;
        private Status stat;
        private int volume;

        public Harmonika(String name, Status stat, int volume) {
            this.name = name;
            this.stat = stat;
            this.volume = volume;
        }

        @Override
        public void play(int point, Status stat, Game g) {
            if (volume * point > 20) {
                System.out.println(name + " began to make sounds of the " + stat + " song");
            } else {
                System.out.println("Boy gave Karlson the " + name);
            }
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(name, game.name) && stat == game.stat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stat);
    }
}
