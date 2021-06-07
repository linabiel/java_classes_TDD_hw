import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

   private Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 100);
    }

    @Test
    public void canPrint() {
        printer.print(2, 5);
        assertEquals(90, printer.getPaper());
    }

    @Test
    public void checkIfCantPrintIfNotEnoughPaperLeft() {
        printer.print(50, 50);
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void checkIfReducesToner() {
        printer.print(5,5);
        assertEquals(75, printer.getToner());
    }
}
