package Module6.Task2_3;


import java.util.Arrays;

public class UsersMain {

        public static void main(String[] args) {

                User user1 = new User(1, "Anna", "Ololo", 4000, 87000);
                User user2 = new User(2, "Alina", "Tlusta", 1000, 7000);
                User user3 = new User(3, "Kate", "Milova", 2000, 1000);
                User user4 = new User(3, "Kate", "Milova", 2000, 1000);

                User[] users = new User[4];
                users[0] = user1;
                users[1] = user2;
                users[2] = user3;
                users[3] = user3;

                System.out.println(Arrays.toString(UserUtils.usersWithConditionalBalance(users, 7000)));
                System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));
                System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(users)));
                System.out.println(Arrays.toString(UserUtils.getUsersid(users)));
                System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(users)));

    }
    // Создайте класс UsersMain с методом main, где создайте несколько тестовых пользователей  и продемонстрируйте,
    // как работает каждый метод из UserUtils.

}
