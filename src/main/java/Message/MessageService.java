package Message;

public class MessageService {
    private Message[] messageArray = new Message[4];

    public void create4Message(User user1, User user2, User user3, User user4) {
        messageArray[0] = new Message(user1, user2, "Ты хочешь спать?", "4:30");
        messageArray[1] = new Message(user2, user1, "Да не, на самом деле я хочу еще послушать, как ты смеешься", "4:31");
        messageArray[2] = new Message(user3, user4, "Я не знаю, как тебе еще объяснить, ты ведешь себя как псих, ты просто псих, тебе вечно что-то мерещится ", "19:46");
        messageArray[3] = new Message(user4, user3, "Да это ты делаешь из меня психа, даешь мне поводы каждый раз, если бы ты вела себя нормально", "19:47");

    }

    public Message[] getMessages() {
        return messageArray;
    }

    public void printMessages() {
        for (Message message: messageArray) {
            System.out.println(message);
        }
    }

}
