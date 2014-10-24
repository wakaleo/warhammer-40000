Feature: Calculating hits from range weapons
  In order to know how many opponents I eliminate
  As a Warhammer 40000 player
  I need to know how many I hit with a given dice roll

  Scenario Outline: Ballistic skill is used to determine the roll needed to hit for ranged weapons
    Given I have a ballistic skill of <bs>
    When I roll to hit
    Then I will need a minimum roll of <required_roll> to hit
  Examples:
    | bs | required_roll |
    | 1  | 6             |
    | 2  | 5             |
    | 3  | 4             |
    | 4  | 3             |
    | 5  | 2             |
    | 6  | 1             |

  Scenario Outline: Counting the hits scored based on ballistic skill and dice rolls
    Players get one dice roll per shot
    Given I have a ballistic skill of <bs>
    And I have 5 shots
    When I roll <dice_rolls>
    Then I should hit <hits> times
  Examples:
    | bs | dice_rolls | hits |
    | 5  | 1,1,1,2,2  | 2    |
    | 4  | 1,1,1,2,2  | 0    |
    | 4  | 1,3,4,5,6  | 4    |
    | 3  | 1,3,4,5,6  | 3    |
    | 2  | 1,3,4,5,6  | 2    |
