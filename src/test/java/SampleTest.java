// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// import com.example.EmailValidator;
// import com.example.FirstNameValidator;
// import com.example.LastNameValidator;
// import com.example.MobileNumberValidator;
// import com.example.PasswordValidator;

// public class SampleTest {
//     private boolean getValidation() {
//         FirstNameValidator firstNameValidator = new FirstNameValidator();
//         boolean firstNameValidatorResult = firstNameValidator.validate("John");

//         LastNameValidator lastNameValidator = new LastNameValidator();
//         boolean lastNameValidatorResult = lastNameValidator.validate("Doe");

//         EmailValidator emailValidator = new EmailValidator();
//         boolean emailValidatorResult = emailValidator.validate("abc@example.com");

//         MobileNumberValidator mobileNumberValidator = new MobileNumberValidator();
//         boolean mobileNumberValidatorResult = mobileNumberValidator.validate("91 1234567890");

//         PasswordValidator passwordValidator = new PasswordValidator();
//         boolean passwordValidatorResult = passwordValidator.validate("Password123@");

//         return firstNameValidatorResult && lastNameValidatorResult && emailValidatorResult
//                 && mobileNumberValidatorResult;
//     }

//     @Test
//     public void happyTest() {
//         boolean finalValidation = getValidation();
//         assertEquals(true, finalValidation);
//     }

//     @Test
//     public void sadTest() {
//         boolean finalValidation = getValidation();
//         assertEquals(false, !finalValidation);
//     }
// }
