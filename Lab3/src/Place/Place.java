package Place;

public abstract class Place {
    private int coordinate1;
    private int coordinate2;
    String name;
    public Place(int coordinateХ, int coordinateY, String name){
        this.coordinate1 = coordinateХ;
        this.coordinate2 = coordinateY;
        this.name = name;

    }
    public String GetPlace(){return this.name;}
    public int GetCoordinate(){
        return this.coordinate1;
    }
    public int getCoordinate2() {
        return this.coordinate2;
    }
}
