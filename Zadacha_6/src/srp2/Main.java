package srp2;

import srp2.model.Order;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ConsoleViewer consoleViewer = new ConsoleViewer();
        Order order = consoleViewer.inputFromConsole();
        Saver jsonSaver = new JsonSaver(order);
        jsonSaver.save();
        Saver txtSaver = new TxtSaver();
        txtSaver.save();
    }
}
