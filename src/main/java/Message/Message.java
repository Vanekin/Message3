package Message;

/*
    - Отправитель (пользователь)
    - Получатель  (пользователь)
    - Текст
    - Дата-время
*/



public class Message {
    private User recipient;
    private User sender;
    private String textOfMessage;
    private String dateAndTime;

    public Message(){};

    public Message(User sender, User recipient, String textOfMessage, String dateAndTime){
        this.recipient = recipient;
        this.sender = sender;
        this.textOfMessage = textOfMessage;
        this.dateAndTime = dateAndTime;
    }

    public User getRecipient() {

        return recipient;
    }

    public User getSender() {

        return sender;
    }

    public String getTextOfMessage() {

        return textOfMessage;
    }

    public String getDateAndTime() {

        return dateAndTime;
    }

    public void setRecipient(User recipient) {

        this.recipient = recipient;
    }

    public void setSender(User sender) {

        this.sender = sender;
    }

    public void setTextOfMessage(String textOfMessage) {

        this.textOfMessage = textOfMessage;
    }

    public void setDateAndTime(String dateAndTime) {

        this.dateAndTime = dateAndTime;
    }
    public String toString() {
        return "Отправитель:\n" + sender + "\nПолучатель:\n" + recipient + "\nТекст сообщения: " + textOfMessage + "\nВремя: " + dateAndTime + "\n";
    }
}
