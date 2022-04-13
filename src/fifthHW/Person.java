package fifthHW;

public class Person {
    String name;
    String position;
    String email;
    String phone;
    float salary;
    public int age;

    public Person(String name, String position, String email, String phone, int salary, int age) {
       this.name = name;
       this.position = position;
       this.email = email;
       this.phone = phone;
       this.salary = salary;
       this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Номер телефона: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}
