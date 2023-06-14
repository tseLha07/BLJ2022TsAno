package ch.noseryoung.test;

import ch.noseryoung.main.Triangle;
import ch.noseryoung.main.TriangleValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleValidatorTests {
    private TriangleValidator tests;

    @BeforeEach
    public void setUp(){
        tests = new TriangleValidator();
    }

    @Test
    public void isEquilateral_TriangleIsEquilateral_isTrue(){
        double side = 3;
        Triangle t1 = new Triangle(side, side, side);

        boolean expectedResult = true;
        boolean result = tests.isEquilateral(t1);

        assertEquals(expectedResult, result);
    }

    @Test
    public void isEquilateral_TriangleIsInvalid_isFalse(){
        double side = 0;

        Triangle t2 = new Triangle(side, side, side);

        boolean expectedResult = false;
        boolean result = tests.isEquilateral(t2);

        assertEquals(expectedResult, result);
    }

    @Test
    public void isEquilateral_TriangleIsIsosceles_isFalse(){
        double sideAB = 5;
        double sideC = 4;

        Triangle t3 = new Triangle(sideAB, sideAB, sideC);

        boolean expectedResult = false;
        boolean result = tests.isEquilateral(t3);

        assertEquals(expectedResult, result);
    }

    @Test
    public void isIsosceles_TriangleIsIsosceles_isTrue(){
        double sideAB = 5;
        double sideC = 4;

        Triangle t4 = new Triangle(sideAB, sideAB, sideC);

        boolean expectedResult = true;
        boolean result = tests.isIsosceles(t4);

        assertEquals(expectedResult, result);
    }

    @Test
    public void isIsosceles_TriangleIsInvalid_isFalse(){
        double side = 0;
        double sideAB = 5;

        Triangle t5 = new Triangle(sideAB, sideAB, side);

        boolean expectedResult = false;
        boolean result = tests.isEquilateral(t5);

        assertEquals(expectedResult, result);
    }

    @Test
    public void isIsosceles_TriangleIsEquilateral_isFalse(){
        double side = 5;

        Triangle t5 = new Triangle(side, side, side);

        boolean expectedResult = false;
        boolean result = tests.isIsosceles(t5);

        assertEquals(expectedResult, result);
    }

    @Test
    public void isIsosceles_TriangleIsScalene_isFalse(){
        double sideA = 5;
        double sideB = 3;
        double sideC = 4;

        Triangle t6 = new Triangle(sideA, sideB, sideC);

        boolean expectedResult = false;
        boolean result = tests.isIsosceles(t6);

        assertEquals(expectedResult, result);
    }

    @Test
    public void isScalene_TriangleIsScalene_isTrue(){
        double sideA = 5;
        double sideB = 3;
        double sideC = 4;

        Triangle t7 = new Triangle(sideA, sideB, sideC);

        boolean expectedResult = true;
        boolean result = tests.isScalene(t7);

        assertEquals(expectedResult, result);
    }

    @Test
    public void isScalene_TriangleIsNotScalene_isFalse(){
        double side = 0;

        Triangle t8 = new Triangle(side, side, side);

        boolean expectedResult = false;
        boolean result = tests.isScalene(t8);

        assertEquals(expectedResult, result);
    }

    @Test
    public void isScalene_TriangleIsNotValid_isFalse(){
        double sideA = 5;
        double sideB = 10;
        double sideC = 4;

        Triangle t9 = new Triangle(sideA, sideB, sideC);

        boolean expectedResult = false;
        boolean result = tests.isScalene(t9);

        assertEquals(expectedResult, result);
    }
}
