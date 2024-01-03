import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.EmailValidator;
import com.example.FirstNameValidator;
import com.example.LastNameValidator;
import com.example.MobileNumberValidator;
import com.example.PasswordValidator;
import com.example.ValidationException;
import com.example.ValidationExceptionType;

public class ValidationExceptionTest {

    @ParameterizedTest
    @ValueSource(strings = { "Suj", "Sujal" })
    public void happyFirstNameTest(String firstName) {
        try {
            FirstNameValidator firstNameValidator = new FirstNameValidator();
            boolean isValid = firstNameValidator.validate(firstName);

            assertEquals(true, isValid);
        } catch (ValidationException e) {
            fail(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "suJal", "Su", "sUJAL", "sujal" })
    public void sadFirstNameTest(String firstName) {
        try {
            FirstNameValidator firstNameValidator = new FirstNameValidator();
            firstNameValidator.validate(firstName);

            fail("Expected invalid firstname");
        } catch (ValidationException e) {
            if (e.type == ValidationExceptionType.FirstNameException)
                assertEquals("Firstname is invalid", e.getMessage());
            else
                fail("Different error");
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "Gupta", "Gup" })
    public void happyLastNameTest(String lastName) {
        try {
            LastNameValidator lastNameValidator = new LastNameValidator();
            boolean isValid = lastNameValidator.validate(lastName);

            assertEquals(true, isValid);
        } catch (ValidationException e) {
            fail(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "guPta", "Gu", "gupta", "gUPTA" })
    public void sadLastNameTest(String lastName) {
        try {
            LastNameValidator lastNameValidator = new LastNameValidator();
            lastNameValidator.validate(lastName);

            fail("Expected invalid lastname");
        } catch (ValidationException e) {
            if (e.type == ValidationExceptionType.LastNameException)
                assertEquals("Lastname is invalid", e.getMessage());
            else
                fail("Different error");
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
            "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" })
    public void happyEmailTest(String email) {
        try {
            EmailValidator emailValidator = new EmailValidator();
            boolean isValid = emailValidator.validate(email);

            assertEquals(true, isValid);
        } catch (ValidationException e) {
            fail(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
            "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au" })
    public void invalidEmailTest(String email) {
        try {
            EmailValidator emailValidator = new EmailValidator();
            emailValidator.validate(email);

            fail("Expected invalid email");
        } catch (ValidationException e) {
            if (e.type == ValidationExceptionType.EmailException)
                assertEquals("Email is invalid", e.getMessage());
            else
                fail("Different error");
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "91 7263829191", "123 7766556677" })
    public void happyMobileNumberTest(String mobileNumber) {
        try {
            MobileNumberValidator mobileNumberValidator = new MobileNumberValidator();
            boolean isValid = mobileNumberValidator.validate(mobileNumber);

            assertEquals(true, isValid);
        } catch (ValidationException e) {
            fail(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "1789382002", "72 998827", "1726 8826810293", "82  7263527282" })
    public void sadMobileNumberTest(String mobileNumber) {
        try {
            MobileNumberValidator mobileNumberValidator = new MobileNumberValidator();
            mobileNumberValidator.validate(mobileNumber);

            fail("Expected invalid mobile number");
        } catch (ValidationException e) {
            if (e.type == ValidationExceptionType.MobileNumberException)
                assertEquals("Mobile number is invalid", e.getMessage());
            else
                fail("Different error");
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "Ajsnc@67898", "88776!Abc", "@abc123A" })
    public void happyPasswordTest(String password) {
        try {
            PasswordValidator passwordValidator = new PasswordValidator();
            boolean isValid = passwordValidator.validate(password);

            assertEquals(true, isValid);
        } catch (ValidationException e) {
            fail(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "@Ab898", "88776!A!bc", "@abc12309", "ABCabcc&" })
    public void sadPasswordTest(String password) {
        try {
            PasswordValidator passwordValidator = new PasswordValidator();
            passwordValidator.validate(password);

            fail("Expected invalid password");
        } catch (ValidationException e) {
            if (e.type == ValidationExceptionType.PasswordException)
                assertEquals("Password is invalid", e.getMessage());
            else
                fail("Different error");
        }
    }
}