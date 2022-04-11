package fifthHW;

    public class Main {

        public static void main(String[] args) {
            Person[] persons = {
                    new Person("Олегов Олег Олегович", "Генеральный директор", "olegov@olegiko.com", "+7-800-200-06-00", 150000, 42),
                    new Person("Александрова Александра Александровна", "Заместитель генерального директора", "alexandrova@olegiko.com", "+1(234)567891", 130000, 38),
                    new Person("Борисов Борис Борисович", "Финансовый директор", "borisov@olegiko.com", "+7-688-002-00-60", 130000, 41),
                    new Person("Петров Петр Петрович", "Главный специалист", "petrov@olegiko.com", "+7-600-300-02-00", 80000, 26),
                    new Person("Жанова Жанна Жановна", "Младший специалист", "janova@olegiko.com", "+7-900-280-05-00", 50000, 28),
            };

            for (int x = 0; x < persons.length; x++) {
                if (persons[x].age > 40) {
                    persons[x].info();
                }
            }
        }
    }

