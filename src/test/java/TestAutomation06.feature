Feature: Contact Us Submission Verification

  Scenario: Submitting Contact Us Form Successfully
    Given go to that page "http://automationexercise.com"
    When click on the  contact us button
    When verify get in touch visible
    And fill all fields
    And I submit the contact form
    Then I should see a success message
    Then close the browser3