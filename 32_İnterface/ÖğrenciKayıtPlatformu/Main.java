package ÖğrenciKayıtPlatformu;

import ÖğrenciKayıtPlatformu.RealStudentCheckService;
import ÖğrenciKayıtPlatformu.Student;
import ÖğrenciKayıtPlatformu.StudentSignUpManager;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Ahmet", 23, 12345);

        // KONTROL TÜRÜNÜ BURADA SEÇİYORSUN
        StudentSignUpManager manager =
                new StudentSignUpManager(new RealStudentCheckService());

        manager.signUp(student1);
    }
}
