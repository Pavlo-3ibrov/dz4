package app;

public class Main {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();


        ConsolePrinter.Message msg1 = new ConsolePrinter.Message("Привіт!", null);
        printer.print(msg1);

        ConsolePrinter.Message msg2 = new ConsolePrinter.Message("Як справи?", "Олексій");
        printer.print(msg2);

        ConsolePrinter.Message msg3 = new ConsolePrinter.Message(null, "");
        printer.print(msg3);
    }
}