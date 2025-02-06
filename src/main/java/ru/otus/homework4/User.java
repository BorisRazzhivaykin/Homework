package ru.otus.homework4;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int yaerofbirth;
    private String email;

    public User(String surname, String name, String patronymic, int yaerofbirth, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.yaerofbirth = yaerofbirth;
        this.email = email;
    }

    public void info() {
        System.out.println("Фамилия Имя Отчество: " + " " + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + " " + yaerofbirth);
        System.out.println("e-mail: " + " " + email);
    }
}
