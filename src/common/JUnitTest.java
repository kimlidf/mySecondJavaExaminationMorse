package common;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class JUnitTest {

    @Test
    public void testConvertA(){
        Converter converter = new Converter();

        String testdata = "A";

        String expected = "*-";

        String actual = converter.getText(testdata);

        assertEquals(expected, actual);

    }
    @Test
    public void testConvertC(){

        Converter converter = new Converter();

        String testdata = "C";

        String expected = "-*-*";

        String actual = converter.getText(testdata);

        assertEquals(expected, actual);
    }
    @Test
    public void testCovertZ(){

        Converter converter = new Converter();

        String testdata = "Z";

        String expected = "--**";

        String actual = converter.getText(testdata);

        assertEquals(expected, actual);
    }
    @Test
    public void testConvertLowerCaseA(){

        Converter converter = new Converter();

        String testdata = "a";

        String expected = "*-";

        String actual = converter.getText(testdata);

        assertEquals(expected, actual);
    }

    @Test
    public void testConvert1(){

        Converter converter = new Converter();

        String testdata = "1";

        String expected = "*----";

        String actual = converter.getText(testdata);

        assertEquals(expected, actual);

    }
    @Test
    public void testConvert9() {

        Converter converter = new Converter();

        String testdata = "9";

        String expected = "----*";

        String actual = converter.getText(testdata);

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertQuestionMark(){

        Converter converter = new Converter();

        String testdata = "?";

        String expected = "**--**";

        String actual = converter.getText(testdata);

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertOppositeA(){

        Converter converter = new Converter();

        String testdata = "*-";

        String expected = "A";

        String actual = converter.getText(testdata);

        assertEquals(expected, actual);
    }
    @Test
    public void testConvertOppositeZ(){

        Converter converter = new Converter();

        String testdata = "--**";

        String expected = "Z";

        String actual = converter.getText(testdata);

        assertEquals(expected, actual);

    }
    @Test
    public void testEmptyInput(){

        Converter converter = new Converter();

        String testdata = " ";

        String expected = null;

        String actual = converter.getText(" ");

        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidInput(){

        Converter converter = new Converter();

        String testdata = "Å";

        String expected = null;

        String actual = converter.getText(testdata);

        assertEquals(expected, actual);

    }
}
