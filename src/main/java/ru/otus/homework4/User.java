package ru.otus.homework4;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int yaerofbirth;
    private String email;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYaerofbirth() {
        return yaerofbirth;
    }

    public void setYaerofbirth(int yaerofbirth) {
        this.yaerofbirth = yaerofbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
