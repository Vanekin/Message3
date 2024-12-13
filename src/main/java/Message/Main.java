package Message;

/*- Создать 4 пользователя (UserService - create4Users)
  - Создать 4 сообщения MessageService - create4Message(user1,user2)
  - Вывести сведения о пользователях
  - Вывести сведения о сообщениях
*/

public class Main {
    public static void main(String[] args) {

        UserService usserv = new UserService();
        MessageService messerv = new MessageService();

        usserv.create4Users();
        User[] users = usserv.getUsersArray();

        messerv.create4Message(users[0], users[1], users[2], users[3]);
        Message[] messages = messerv.getMessages();

        usserv.printUsers();
        System.out.println();
        messerv.printMessages();
    }
}
