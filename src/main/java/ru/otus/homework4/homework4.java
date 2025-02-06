package ru.otus.homework4;

public class homework4 {
    public static void main(String[] args) {
        User[] users = {
                new User("Иванов", "Иван", "Иванович", 1930, "ivanov@mail.ru"),
                new User("Петров", "Петр", "Петрович", 1945, "petrov@mail.ru"),
                new User("Семенов", "Семен", "Семенович", 1952, "semenov@mail.ru"),
                new User("Андреев", "Андрей", "Андреевич", 1960, "andreev@mail.ru"),
                new User("Павлов", "Павел", "Павлович", 1933, "pavlov@mail.ru"),
                new User("Александров", "Александр", "Александрович", 1937, "aleksandrov@mail.ru"),
                new User("Евгеньев", "Евгений", "Евгеньевич", 1941, "evgeniev@mail.ru"),
                new User("Валерьев", "Валериий", "Валериевич", 1986, "valeriev@mail.ru"),
                new User("Сергеев", "Сергей", "Сергеевич", 1993, "sergeev@mail.ru"),
                new User("Алексеев", "Алексей", "Алексеевич", 1965, "alekseev@mail.ru")
        };
    }

    public static void underForty(User[] users) {
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users[i][4]; j++) {
                if (users[i][4] < 1985){
            }

        }
    }

}
}
