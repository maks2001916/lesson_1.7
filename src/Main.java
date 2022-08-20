public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //первое задание
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String lfm = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника - " + lfm);
        //второе задание
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameCapitalLetters = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //третье задание
        String fullNameOne = "Иванов Семён Семёнович";
        String fullNameE = fullNameOne.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullNameE);
    }
}