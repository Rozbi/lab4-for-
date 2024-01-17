package Interfaces;

import Enums.Status;
import Objects.Game;
import Objects.Person;

public abstract interface Playable {
    public void play(int point, Status stat, Game g);
}
