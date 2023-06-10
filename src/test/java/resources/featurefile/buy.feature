Feature: Search functionality
  As a User I want to test search functionality

  @smoke @regression
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    Then I navigate to "New & Used Car Search" page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
  Examples:
  |make|  model |    location    |  price |
  |BMW |2 Series|NSW - Hunter    |$200,000|
  |Ford|Escape  |NT - All        |$70,000 |
  |Audi|A7      |NT - South      |$150,000|
  |Jeep|Patriot |QLD - South West|$80,000 |
  |Kia |Niro    |QLD - Brisbane  |$70,000 |
  |MG  |GS      |NSW - All       |$45,000 |

  @regression
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Used’ link
    Then I navigate to "Used Cars For Sale" page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
  Examples:
  |make      |model  |location           |price   |
  |Volvo     |850    |NSW - Hunter       |$200,000|
  |Toyota    |Corolla|ACT - All          |$100,000|
  |Renault   |Kangoo |NSW - Newcastle    |$90,000 |
  |Volkswagen|Golf   |NSW - Riverina     |$50,000 |
  |Nissan    |Qashqai|NSW - Central Coast|$80,000 |
  |Mitsubishi|Colt   | NSW - Hunter      |$80,000 |