
Feature: I as  new intregrante for the Utest i want to create a new register to access as user junior in this community


  Scenario: creation complete of users congratulation
    Given user open home page
    When user create account filling all fields
      | strNombre | strApellido | strEmail                     |strMesNacmiento | strDiaNacmiento | strAnioNacmiento |
      | Estefania | Batista     | EstefaniaBatista646@gmail.com |June            | 1               | 2000             |


    Then user sees its username