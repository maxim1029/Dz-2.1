public class Main {
    public static void main(String[]args) {
        Student student = new Student("Uhlov", "Maxim","PKS-419",4);
        Aspirant aspirant = new Aspirant("Kravcov","Dima","PKS-419",4,"Rabota_1");
        Student sweet = new Aspirant("Krotov","Kirill","PKS-419",5,"Rabota_2");

        System.out.println("Имя: " + student.firstName + " " + student.lastName + ", группа: " + student.group + ", средняя оценка: " + student.averageMark + ", стипендия: " + student.getscolarship());
        System.out.println("Имя: " + aspirant.firstName + " " + aspirant.lastName + ", группа: " + aspirant.group + ", средняя оценка: " + aspirant.averageMark + ", научная работа: " + aspirant.nauchnayaRabota + ", стипендия: " + aspirant.getscolarship());
        System.out.println("Имя: " + sweet.firstName + " " + sweet.lastName + ", группа: " + sweet.group + ", средняя оценка: " + sweet.averageMark + ", стипендия: " + sweet.getscolarship());

    }
}
