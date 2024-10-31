package app.Impl;

import app.Interface.Printer;

public class Device implements Printer {
    public static class Message {
        private static String tex;
        private static String sender;

        public Message(String tex, String sender) {
            Message.tex = tex;
            Message.sender = sender;
        }

        public static String getTex() {
            return tex;
        }

        public void setTex(String tex) {
            Message.tex = tex;
        }

        public static String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            Message.sender = sender;
        }
    }

    @Override
    public void print(String tex, String sender) {
        if (Message.getSender() == null && Message.getTex() != null) {
            System.out.printf("Анонімний користувач відправив повідомлення:<%s>\n", tex);
        } else if (Message.sender != null && Message.getTex() != null) {
            System.out.printf("Користувач <%s> відправив повідомлення: <%s>\n",
                    sender, tex);
        }
    }
}

