import org.example.TypeConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.TypeConverter.StringToCharArray;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MethodTests {

    private TypeConverter tests;

    @BeforeEach
    public void setUp() {
        tests = new TypeConverter();
    }

    @Test
    public void Method_Tsering_ConvertsStringToShort_isShort(){
        String string = "100";

        short expectedResult = 100;
        short actualResult = tests.convertStringToShort(string);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Method_Tsering_ConvertsStringToShort_isShort2(){
        String string = "10_000";

        short expectedResult = 10000;
        short actualResult = tests.convertStringToShort(string);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Method_Tsering_ConvertsStringToShort_isShort3(){
        String string = "10'000";

        short expectedResult = 10000;
        short actualResult = tests.convertStringToShort(string);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Method_Tsering_ConvertsStringToShort_isShort4(){
        String string = "01";

        short expectedResult = 1;
        short actualResult = tests.convertStringToShort(string);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Method_Tsering_ConvertsStringToShort_isShort5(){
        String string = "900_0";
        short expectedResult = 9000;
        short actualResult = tests.convertStringToShort(string);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Method_Tsering_ConvertsStringToShort_isShort6(){
        String string = "ABC";
        assertThrows(IllegalArgumentException.class, () -> tests.convertStringToShort(string), "Alphabets should throw  ");
    }

    @Test
    public void Method_Tsering_ConvertsStringToShort_isShort7(){
        String string = "7_";
        assertThrows(IllegalArgumentException.class, () -> tests.convertStringToShort(string), "Alphabets should throw  ");
    }

    @Test
    public void Method_Tsering_ConvertsStringToShort_isShort8(){
        String string = "_90";
        assertThrows(IllegalArgumentException.class, () -> tests.convertStringToShort(string), "Alphabets should throw  ");
    }

    @Test //see if it works overall
    public void stringToCharArray_Aabish_convertStringIntoChar_CharArray() {
        String t = "TEST ONE";
        char[] expected = {'t', 'e', 's', 't', 'o', 'n', 'e'};

        char[] result = StringToCharArray(t);

        assertEquals(expected, result);
    }

    @Test //see if it works overall
    public void stringToCharArray_Aabish_WithSpecialCharacter_CharArray() {
        String t = "TEST-two";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StringToCharArray(t);
        });
    }

    @Test // "-" is only allowed after and before second place
    public void stringToCharArray_Aabish_BeforeSecondLine_ThrowsException() {
        String t = "-TEST TWO";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StringToCharArray(t);
        });
    }

    @Test // "-" is only allowed after and before second place
    public void stringToCharArray_Aabish_AfterSecondLine_ThrowsException() {
        String t = "TEST THREE-";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StringToCharArray(t);
        });
    }

    @Test // only a-z, A-Z
    public void stringToCharArray_Aabish_NumbersWIthinString_ThrowsException() {
        String t = "TEST-4";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StringToCharArray(t);
        });
    }

    @Test
    public void StringToCharArray_Dina_GetInvalidCharacters_IsFalse() {

        String strg = "ge-laufen";
        char[] expectedResult = {'g', 'e', 'l', 'a', 'u', 'f', 'e', 'n'};
        char[] result = StringToCharArray(strg);

        assertEquals(expectedResult, result);
    }
}

