@Traveloka
Feature: create order


  @guestBookCar
  Scenario: User Guest want to book car
    Given user click car rental
    And user select location car rental "Jakarta"
    And user select date two days from today
    And user input end time
    And user click search button
    And user choose car
    And user choose provider
    And user pick up location in Rental office
    And user drop off location other location
    And user click button book now
#    And user Fill name "Bima Baruna"
#    And user Fill phone number "82234234234"
#    And user fill email "bima_baruna@yahoo.com"
