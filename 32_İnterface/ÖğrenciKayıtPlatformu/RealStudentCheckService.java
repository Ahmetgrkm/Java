package ÖğrenciKayıtPlatformu;

public class RealStudentCheckService implements StudentCheckService {
    @Override
    public boolean checkStudent(Student student) {
        if (student.getName().startsWith("A") && student.getAge() >= 15) {
            return true;
        }
        return false;
    }
}
