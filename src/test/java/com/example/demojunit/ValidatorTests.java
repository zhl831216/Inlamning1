package com.example.demojunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ValidatorTests {

   //Testfall 1
    @Test
    void PhoneNumberValidation_ReturnTrue_GivenStartWith0And7Numbers() {
        //given
        String phone = "0123456";
        //when
        boolean result = Validator.isPhoneNumberValid(phone);
        //then
        Assertions.assertTrue(result);
    }

    //Testfall 2
    @Test
    void PhoneNumberValidation_ReturnFalse_Given8NumbersAndNotStartWith0() {
        //given
        String phone = "123485678";
        //when
        boolean result = Validator.isPhoneNumberValid(phone);
        //then
        Assertions.assertFalse(result);
    }

    //Testfall 3
    @Test
    void PhoneNumberValidation_ReturnFalse_GivenMoreThan10Numbers() {
        //given
        String phone = "012345678910";
        //when
        boolean result = Validator.isPhoneNumberValid(phone);
        //then
        Assertions.assertFalse(result);
    }

    //Testfall 4
    @Test
    void PhoneNumberValidation_ReturnFalse_GivenLessThan6Numbers() {
        //given
        String phone = "0123";
        //when
        boolean result = Validator.isPhoneNumberValid(phone);
        //then
        Assertions.assertFalse(result);
    }


    //Testfall 5
    @Test
    void PhoneNumberValidation_ReturnFalse_GivenAlphabet() {
        //given
        String phone = "abcd";
        //when
        boolean result = Validator.isPhoneNumberValid(phone);
        //then
        Assertions.assertFalse(result);
    }

    //Testfall 6
    @Test
    void PhoneNumberValidation_ReturnFalse_GivenStartWithSpecialSign() {
        //given
        String phone = "+07355555";
        //when
        boolean result = Validator.isPhoneNumberValid(phone);
        //then
        Assertions.assertFalse(result);
    }
    //Testfall 7
    @Test
    void PhoneNumberValidation_ReturnFalse_GivenSpace() {
        //given
        String phone = "073 555 555";
        //when
        boolean result = Validator.isPhoneNumberValid(phone);
        //then
        Assertions.assertFalse(result);
    }
    //Testfall 8
    @Test
    void PhoneNumberValidation_ReturnFalse_GivenSpaceAndSpecialSign() {
        //given
        String phone = "073-555 555";
        //when
        boolean result = Validator.isPhoneNumberValid(phone);
        //then
        Assertions.assertFalse(result);
    }

    //Testfall 1 email validation
    @Test
    void MailValidation_ReturnTrue_GivenDomainStartSignAndTopDomainStartSign() {
        //given
        String email = "xxx@gmail.com";
        //when
        boolean result = Validator.isEmailValid(email);
        //then
        Assertions.assertTrue(result);
    }

    //Testfall 2 email validation
    @Test
    void MailValidation_ReturnFalse_GivenDomainStartSignAndNoTopDomainStartSign() {
        //given
        String email = "xxx@gmailcom";
        //when
        boolean result = Validator.isEmailValid(email);
        //then
        Assertions.assertFalse(result);
    }

    //Testfall 3 email validation
    @Test
    void MailValidation_ReturnFalse_GivenTopDomainStartSignAndNoDomainStartSign() {
        //given
        String email = "xxxgmail.com";
        //when
        boolean result = Validator.isEmailValid(email);
        //then
        Assertions.assertFalse(result);
    }

    //Testfall 4 email validation
    @Test
    void MailValidation_ReturnFalse_GivenNoDomain() {
        //given
        String email = "xxx@.com";
        //when
        boolean result = Validator.isEmailValid(email);
        //then
        Assertions.assertFalse(result);
    }

    //Testfall 5 email validation
    @Test
    void MailValidation_ReturnFalse_GivenNoTopDomain() {
        //given
        String email = "xxx@gmail.";
        //when
        boolean result = Validator.isEmailValid(email);
        //then
        Assertions.assertFalse(result);
    }

    //Testfall 6 email validation
    @Test
    void MailValidation_ReturnFalse_GivenNoEmailName() {
        //given
        String email = "@gmail.com";
        //when
        boolean result = Validator.isEmailValid(email);
        //then
        Assertions.assertFalse(result);
    }

    //Testfall 7 email validation
    @Test
    void MailValidation_ReturnFalse_GivenNoEmailNameAndNoDomainNameAndNoTopDomainName() {
        //given
        String email = "@.";
        //when
        boolean result = Validator.isEmailValid(email);
        //then
        Assertions.assertFalse(result);
    }
    //Testfall 8 email validation
    @Test
    void MailValidation_ReturnFalse_GivenNoEmailNameAndNoDomainName() {
        //given
        String email = "@.com";
        //when
        boolean result = Validator.isEmailValid(email);
        //then
        Assertions.assertFalse(result);
    }
    //Testfall 9 email validation
    @Test
    void MailValidation_ReturnFalse_GivenNoEmailNameAndNoTopDomainName() {
        //given
        String email = "@gmail.";
        //when
        boolean result = Validator.isEmailValid(email);
        //then
        Assertions.assertFalse(result);
    }
    //Testfall 10 email validation
    @Test
    void MailValidation_ReturnFalse_GivenNoDomainNameAndNoTopDomainName() {
        //given
        String email = "xxx@.";
        //when
        boolean result = Validator.isEmailValid(email);
        //then
        Assertions.assertFalse(result);
    }
}
