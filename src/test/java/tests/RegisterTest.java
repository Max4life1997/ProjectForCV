package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class RegisterTest extends BaseRemoteTest {

    @Test
    @Tag("reg_test")
    void RegistrationPositiveTest() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.openPage()
                .setFirstName("Alex")
                .setLastName("Egorov")
                .setEmail("alex@gorov.com")
                .setGender("Male")
                .setPhone("7034324234")
//                .setBirthDate("22","November","2008")
                ;
    }

}
