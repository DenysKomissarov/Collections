package collections.list;

import collections.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

    private final static Logger logger = LoggerFactory.getLogger(LinkedListClass.class);

    public static void main(String[] args) {
        List<User> userList = new LinkedList<>();

        User user1 = new User("Petya", 28);
        User user2 = new User("Sasha", 32);
        User user3 = new User("Vasya", 25);
        User user4 = new User("Petya", 28);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user1);


        for (User user : userList){
            logger.info(user.toString());
        }
    }
}
