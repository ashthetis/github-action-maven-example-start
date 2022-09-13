public class LicensingService {
    public void eligibilityChecker(int age) {
        System.out.println("User Provided Age: " + age);
        if (age >= 18) {
            System.out.println("You are eligible to apply for license");
        } else {
            System.out.println("Sorry, you are not eligible to apply for license");
        }
    }
}
