package Module6.Task2_3;


public final class UserUtils {

    private UserUtils() {
    }

    public static User[] uniqueUsers(User[] users){
        int count = 0;
        for (int i = 0; i < users.length - 1; i++) {
            if (users[i].equals(users[i+1])) count++;
        }
        User[]uniqueUsers = new User[users.length-count];
        int j = 0;
        for (int i = 0; i < users.length - 1; i++) {
                if (users[i] != users[i+1])
                    uniqueUsers[j++] = users[i];
        }
        return uniqueUsers;
        }


    public static User[] usersWithConditionalBalance(User[] users, int balance) {
        int count = 0;
        for (User User : users) {
            if (balance == User.getBalance()) count++;}

        User[] usersWithConditionalBalance = new User[count];
        int j = 0;
        int i = 0;
        for (User User : users) {
            if (balance == User.getBalance())
                usersWithConditionalBalance[j++] = users[i];}

        return usersWithConditionalBalance;
}

    public static User[] paySalaryToUsers(User[] users) {
        for (User User : users)
            {User.setBalance(User.getBalance() + User.getSalary());
            }
        return users;
    }

    public static long[] getUsersid(User[] users) {
        long[] userIds = new long[users.length];
            for (User User : users) {
                for (int i = 0; i<userIds.length; i++){
                    userIds[i] = User.getId();
                }
            }
                return userIds;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        int count = 0;
        for (int i = 0; i < users.length; i++)
            if (users[i] != null) count++;

        User[] nonEmptyUsers = new User[count];
        int j = 0;
        for (int i = 0; i < users.length; i++)
            if (users[i] != null)
                nonEmptyUsers[j++] = users[i];

        return nonEmptyUsers;
    }

}




