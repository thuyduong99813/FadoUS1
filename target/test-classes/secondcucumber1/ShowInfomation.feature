Feature: Update information

  Background:The user already login on fado
    Given The user already login on website with username is "Thuyduong9813@gmail.com" and password is "thuyduong998"

  Scenario: Show the current information of user
    Given The homepage is showed
    When When the user open Account information function to change some info
    Then The default info will be fill out to update form

  Scenario: The Email information can’t be updated
    Given The account information page is showed
    When  The user tried to change the email address
    Then  Email field is disabled

  Scenario: Write full information
    Given The change information page is displayed
    When The user leaves full name field are blank
    Then in-line error message "Họ và tên là bắt buộc" should be display



