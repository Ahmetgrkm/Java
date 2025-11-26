package İnterfaceRealLife;

public class Main {
    public static void main(String[] args) {
        SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckServices());
        signUpManager.signUp(new User(23,1,"Ahmed"));
    }
}
