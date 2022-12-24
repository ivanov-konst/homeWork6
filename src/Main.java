public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//Задание 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName + ' ';
        System.out.println("ФИО сотрудника - " + fullName + "");

//Задание 2

        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUp + "");

//Задание 3

        String fullNameForAdm = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullNameForAdm + "");

//Задание 4

        String firstName1 = "Семён";
        String middleName1 = "Семёнович";
        String lastName1 = "Иванов";
        String fullName1 = lastName1 + ' ' + firstName1 + ' ' + middleName1 + ' ';
        String fullNameNew = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " +fullNameNew+ "");
        

    }
}