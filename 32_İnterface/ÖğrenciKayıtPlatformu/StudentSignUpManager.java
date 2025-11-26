package ÖğrenciKayıtPlatformu;

import ÖğrenciKayıtPlatformu.Student;
import ÖğrenciKayıtPlatformu.StudentCheckService;

public class StudentSignUpManager {

    private StudentCheckService checkService; //türü interface olan checkService değişkeni olulturduk.

    public StudentSignUpManager(StudentCheckService checkService) { //kaydeden kişi, kontrol işini dışarıdan verilecek bir hizmete bırakacak” anlamına geliyor.
        this.checkService = checkService;
    }

    public void signUp(Student student) {

        if (checkService.checkStudent(student)) {
            System.out.println(student.getName() + " başarıyla kayıt oldu!");
        } else {
            System.out.println(student.getName() + " kayıt olamadı.");
        }
    }
}
