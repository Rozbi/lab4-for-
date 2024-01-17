package Objects;
import Enums.Status;
import Interfaces.Infective;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IllegalFormatException;

public class Build {


    public void run(Object... act) throws IllegalArgumentException {
        for (int i = 0; i < act.length; i++) {
            System.out.println(act[i]);
            if (act[i] == null) {
                throw new IllegalArgumentException();
            }
        }
    }
}

