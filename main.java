import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    list.add(new Student(id, name));
                    break;

                case 2:
                    for (Student s : list) {
                        System.out.println(s.id + " " + s.name);
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    list.removeIf(s -> s.id == delId);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}