Feature: Translating words

  Scenario: Translate to Russian
    Given I'm on Google translate page
    When I type words
    Then I should see translated words
    
    @ScenarioOutline
   Scenario Outline: Translate sets of words
    Given I'm on Google translate page
    When I type words :
    |english||rushian  |
    |<english>||<rushian>|
    Then I see transted words"<english><russian>"
		 Examples: 
		 |words||rushain|
		 |car||Автомобиль|
		 |house||дом|
		 |mouse||мышь|