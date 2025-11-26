package ÖğrenciKayıtPlatformu;

public class FakeStudentCheckService  implements StudentCheckService {
    @Override
    public boolean checkStudent(Student student) {
        return student.getAge() >= 18; //yaş 18 den büyükse kabul et
    }
}
