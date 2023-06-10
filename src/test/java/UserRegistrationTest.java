import org.bridgelabz.UserRegistration;
import org.bridgelabz.UserRegistrationException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = UserRegistration.validateFirstName("Yogesh");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = UserRegistration.validateLastName("More");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("iyogeshmore1998@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("8850055197");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule1_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePasswordRule1("Programmingforlife");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePasswordRule2("Yogesh1998");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePasswordRule3("Uzumaki2002");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule4_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePasswordRule4("Yogesh@1998");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenemailSamples_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.emailSamples("Yogesh2021998@gmail.com");
        Assertions.assertTrue(result);
    }
}