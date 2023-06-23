package core.basesyntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        WorkWithFile workWithFile = new WorkWithFile();
        workWithFile.getStatistic("banana.csv", "temp.csv");
    }
}
