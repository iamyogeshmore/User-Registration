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
}