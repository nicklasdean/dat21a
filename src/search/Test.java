package search;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();

        User myFirstUser = new User("Nicklas","123");
        User mySeconduser = new User("Victor","125");
        User myThirdUser = new User("Mikkel","jashd");
        User myFourthUser = new User("Laura","safh7");

        users.add(myFirstUser);
        users.add(mySeconduser);
        users.add(myThirdUser);
        users.add(myFourthUser);

        System.out.println(findUser(users, "Mikkel"));
    }

    public static boolean findUser(ArrayList<User> allUsers,String username){
        //implement search logic
        for (User currentUser : allUsers) {
            if(currentUser.getUsername().equalsIgnoreCase(username)){
                return true;
            }
        }
        return false;
    }

    public static void createNewUser(){
        //Implement logic
    }
}
