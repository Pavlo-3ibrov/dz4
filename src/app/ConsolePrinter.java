package app;

public class ConsolePrinter implements Printer {


    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }


    private interface EmptyMessageProcessor {
        void process();
    }

    @Override
    public void print(Object messageObj) {
        if (!(messageObj instanceof Message)) {
            System.out.println("Невідомий формат повідомлення");
            return;
        }

        Message message = (Message) messageObj;
        String text = message.getText();
        String sender = message.getSender();

        boolean isTextEmpty = (text == null || text.trim().isEmpty());
        boolean isSenderEmpty = (sender == null || sender.trim().isEmpty());

        if (isTextEmpty && isSenderEmpty) {

            EmptyMessageProcessor processor = new EmptyMessageProcessor() {
                @Override
                public void process() {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            processor.process();
        } else if (isSenderEmpty) {
            System.out.println("Анонімний користувач відправив повідомлення: " + text);
        } else {
            System.out.println("Користувач " + sender + " відправив повідомлення: " + text);
        }
    }
}
