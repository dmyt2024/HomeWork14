package app;

import app.Impl.Device;
import app.Interface.Printer;

public class MainClass {
    public static void main(String[] args) {
        Device dev = new Device();
        Device.Message mass = new Device.Message("Hello", null);
        dev.print(Device.Message.getTex(), Device.Message.getSender());

        Device.Message mass1 = new Device.Message("Good morning", "Tom");
        dev.print(Device.Message.getTex(), Device.Message.getSender());

        Device.Message mass2 = new Device.Message(null, null);
        Printer printer = new Printer() {
            @Override
            public void print(String tex, String sender) {
                if (Device.Message.getTex() == null &&
                        Device.Message.getSender() == null) {
                    System.out.println("Опрацьовується пусте " +
                            "повідомлення від анонімного користувача...");
                }
            }

        };
        printer.print(Device.Message.getTex(), Device.Message.getSender());
    }
}
