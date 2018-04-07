package collections.set;

import collections.list.ArrayListClass;
import collections.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;


public class HashSetClass {
    private final static Logger logger = LoggerFactory.getLogger(ArrayListClass.class);

    public static void main(String[] args){
        Set<User> userList = new HashSet<User>();

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
            logger.info(user.toString()+"   hashcode : "+user.hashCode());
        }
    }
}
