package questions;


import theory.Test;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import static java.util.Arrays.*;

public class Questions extends Test {

    public int num = 0;

    void mu(){
        Consumer<String> printer = (var message) -> {
            System.out.println(message);
        };
    }


}
