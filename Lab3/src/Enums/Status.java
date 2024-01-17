package Enums;

public enum Status {
    GHOST("ghost"), THINKING("thinking"), NORMAL("normal"), WAITING("waiting"), SAD("sad"), ANGRY("angry"), EXHAUSTED("exhausted"), TIRED("tired"), OPEN("open"), INSPIRED("inspired"), WORRIED("worried"), STUBBORN("stubborn"), FUNNY("funny"), ILL("ill");
    private String stat;
    private Status(String stat){
        this.stat=stat;
    }

    public String getStat() {
        return stat;
    }
}