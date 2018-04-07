package collections.map;

import collections.list.ArrayListClass;
import collections.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    private final static Logger logger = LoggerFactory.getLogger(ArrayListClass.class);

    public static void main(String[] args){
        Map<String, User> userMap = new HashMap<>();

        User user1 = new User("Petya", 28);
        User user2 = new User("Sasha", 32);
        User user3 = new User("Vasya", 25);
        User user4 = new User("Petya", 28);

        userMap.put("1", user1);
        userMap.put("2", user2);
        userMap.put("3", user3);
        userMap.put("4", user4);
        userMap.put("1", user2);

        for (Map.Entry<String, User> user : userMap.entrySet()){
            logger.info(user.getKey() + " - " + user.getValue());
        }


    }
}
