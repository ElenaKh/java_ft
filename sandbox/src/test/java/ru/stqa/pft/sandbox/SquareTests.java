package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

/**
 * Created by Elena on 2/9/2017.
 */
public class SquareTests {

    @Test
    public void testArea(){
        Square s = new Square(5);
        assert s.area() == 25;
    }
}
