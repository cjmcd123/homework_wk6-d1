import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {
    Printer printer;


    @Before
    public void before() {printer = new Printer();}

    @Test
    public void printerHasPaper(){
        assertEquals(100, printer.pagesLeft());
    }

    @Test
    public void printerCanPrint(){
        printer.print(2,3);
        assertEquals(94, printer.pagesLeft());
    }

    @Test
    public void printerCanNotPrint(){
        assertEquals(100, printer.pagesLeft());
    }

    @Test
    public void printerReFill(){
        printer.fill();
        assertEquals(100, printer.pagesLeft());
    }

    @Test
    public void printerHasToner(){
        assertEquals(50, printer.getToner());
    }

    @Test
    public void printerUsesToner(){
        printer.print(2,3);
        assertEquals(44, printer.getToner());
    }
}
