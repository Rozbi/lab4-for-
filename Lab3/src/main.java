import Enums.Status;
import Interfaces.Infective;
import Objects.*;
import Place.*;
import java.util.Queue;
/*вложенные статические-Parket, Window, Cornice, Bed, Room
внутренние - Harmonica
анонимные - Bosse, Betan
локальные - Pen, Paper, FloorBrush
*/
public class main {

    public static void main(String args[]) throws IllegalArgumentException{
        Home.Window window = new Home.Window(0, 10, "window", Status.OPEN);
        Home.Cornice corn = new Home.Cornice(20, 5, "cornice", 3);
        Home.Bed bed = new Home.Bed(3, 0, "bed", "under bed");
        Home.Room room = new Home.Room(0, 10, "room", 20);
        Game game = new Game("game", Status.GHOST);
        Game.Harmonika harmonika= game.new Harmonika("lip accordion", Status.NORMAL, 13);
        Home home = new Home(0, 0, "home");
        Home.Parket parket = new Home.Parket(5, 0, "parket", 15);
        Build build = new Build();
        Karlson karlson = new Karlson("Karlson", Status.NORMAL, 100, 65, 60, window);
        Boy boy = new Boy("Boy", Status.NORMAL, 5, 36, 10, home);
        Cord cord = new Cord("cord", home, 6);
        Bell b = new Bell("Bell", Status.NORMAL, corn);
        FrekenBok frbok = new FrekenBok("Freken Bok", Status.NORMAL, 60, 70, 100, home);
        Bimbo bimbo = new Bimbo("Bimbo", Status.FUNNY, room, 50);


        frbok.setStat(Status.ILL);
        System.out.println(frbok.appreciate(frbok, boy));
        Infective Bosse = new Infective() {
            @Override
            public void infect(Person p, int infectability) {
                if (p.getHealth()<infectability) {
                    p.setStat(Status.ILL);
                    p.setHealth(10);
                    System.out.println("The boy was infected");
                }if (p.getHealth()==infectability){
                    p.setHealth(50);
                    p.setStat(Status.NORMAL);
                    System.out.println("Bosse: Boy! quarantine is a permission not to go to school!");
                } else{
                    System.out.println("Bosse: Hi, boy!");
                }
            }
        };
        Infective Betan = new Infective() {
            @Override
            public void infect(Person p, int infectability) {
                if (p.getHealth()<infectability+1) {
                    p.setStat(Status.ILL);
                    p.setHealth(10);
                    System.out.println(p.getName() + " was infected");
                } if (p.getHealth() == infectability){
                    p.setHealth(50);
                    p.setStat(Status.NORMAL);
                    System.out.println("Betan: Ohh, poor boy! U ll be so lonely!");
                }else{
                    p.setStat(Status.SAD);
                    System.out.println("Betan: Goodbye, dear brother! We will come again soon");
                }
            }
        };
        Bosse.infect(boy, 36);
        Betan.infect(boy, 36);
        build.run(boy.tryToTalk(frbok));
        Bosse.infect(boy, 3);
        Betan.infect(boy, 15);
        boy.setPlace(room);
        frbok.setStat(Status.NORMAL);
        build.run(boy.talk(), frbok.appreciate(frbok, boy),
                boy.open(),
                boy.getLocation(),
                bimbo.getLocation());
        boy.setStat(Status.TIRED);
        build.run(boy.talk(),
                bimbo.support(boy),
                boy.talk(),
                boy.getFullStat(),
                boy.write(),
                cord.moveTheObject(boy, cord, parket),
                karlson.create("Bell", Status.NORMAL, corn),
                karlson.describe(Status.NORMAL),
                b.moveTheObject(karlson, cord, corn),
                cord.moveTheCord(-10, 6, karlson, window));
        boy.setStat(Status.THINKING);
        build.run(boy.getFullStat());
        boy.play(20, Status.GHOST, game);
        build.run(cord.moveTheObject(boy, cord, parket));
        karlson.play(15, Status.NORMAL, game);
        build.run(boy.tryToTalk(karlson),
                cord.moveTheObject(boy, cord, parket));
        karlson.setPlace(room);
        karlson.setStat(Status.ANGRY);
        frbok.setPlace(room);
        boy.setStat(Status.THINKING);
        build.run(karlson.getLocation(),
                karlson.getFullStat(),
                karlson.talk(),
                boy.talk());
        karlson.setStat(Status.ILL);
        boy.setStat(Status.GHOST);
        frbok.setPlace(room);
        build.run(karlson.describe(Status.ILL),
                karlson.talk(),
                boy.talk());
        karlson.setStat(Status.SAD);
        build.run(karlson.talk());
        karlson.setStat(Status.INSPIRED);
        build.run(karlson.describe(Status.INSPIRED),
                karlson.talk());
        harmonika.play(1, Status.GHOST, game);
        build.run(karlson.talk());
        harmonika.play(30, Status.GHOST, game);
        build.run(boy.tryToTalk(karlson));
        karlson.setPlace(bed);
        boy.setPlace(bed);
        build.run(bed.getLocation(karlson),
                boy.getLocation(),
                frbok.open(), frbok.getLocation(),
                frbok.sweepUp(home, boy, 15),
                boy.talk(),
                frbok.sweepUp(home, boy, 10),
                boy.getFullStat(),
                boy.talk(),
                frbok.sweepUp(home, boy, 5),
                boy.getFullStat(),
                boy.talk(),
                karlson.joke(30, boy),
                frbok.appreciate(frbok, boy),
                boy.joke(30, frbok),
                frbok.appreciate(frbok,boy),
                frbok.sweepUp(home, boy, 3),
                karlson.joke(3, frbok),
                frbok.appreciate(frbok, boy),
                frbok.sweepUp(home, boy, 0),
                frbok.write());
        frbok.setStat(Status.INSPIRED);
        build.run(frbok.appreciate(frbok, boy));
        }

    }
