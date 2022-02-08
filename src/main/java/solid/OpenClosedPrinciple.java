package solid;

import java.util.List;
import java.util.Random;

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        Printer arialPrinter = new ArialPrinter();
        Printer ubuntPrinter = new UbuntPrinter();

        new PrinterMachine(ubuntPrinter).printText("hi");
    }


    // A
    static class PrinterMachine{
        private Printer printer;

        PrinterMachine(Printer printer){
            this.printer = printer;
        }

        void printText(String text){
            printer.print(text);
        }
    }

    // C
    static interface Printer {
        void print(String text);

        default void f(){

        }
    }

    // B
    static class ArialPrinter implements OpenClosedPrinciple.Printer {
        @Override
        public void print(String text) {
            System.out.println("print " + text + " as arial");
        }
    }


    // B
    static class UbuntPrinter implements OpenClosedPrinciple.Printer {
        @Override
        public void print(String text) {
            System.out.println("print " + text + " as Ubunt");
        }
    }
}
