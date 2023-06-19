package tests;

import pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class NewTest extends BaseTest {

    @Test
    void newTest() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.openPage();
    }

}
