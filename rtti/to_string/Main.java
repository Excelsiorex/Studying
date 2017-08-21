package rtti.to_string;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Rectangle(), new Circle(), new Triangle()
        );

        for (Shape s : shapes) {
            s.draw();
        }
    }
}

