package OBS;

import java.util.ArrayList;

public class StudentManagementSystem {
    ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Öğrenci başarıyla eklendi....");
    }

    public void listStudents(){
        if (students.isEmpty()) {
            System.out.println("Listede öğrenci yok ");
            return;
        }
        System.out.println("Öğrenci Listesi");
        for (Student s : students) {
            System.out.println(s);
        }
    }
    public void deleteStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Öğrenci silindi!");
                return;
            }
        }
        System.out.println("Bu ID ile öğrenci bulunamadı.");
    }


    public void updateStudent(int id, String new_name, int newAge) {
        for (Student s : students) {
            if (s.getId() == id){
                s.setName(new_name);
                s.setAge(newAge);
                s.setId(id);
                System.out.println("Öğrenci bilgileri güncelledi...");
                return;
            }
        }
        System.out.println("Bu id de öğrenci bulunamadı");
    }
}
















