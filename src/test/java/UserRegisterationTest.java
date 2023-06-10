import org.bridgelabz.UserRegistration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegisterationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = UserRegistration.validateFirstName("Yogesh");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = UserRegistration.validateLastName("More");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("iyogeshmore1998@gmail.com");
        Assertions.assertTrue(result);
    }
}