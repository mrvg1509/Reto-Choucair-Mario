
Feature: I as  new intregrante for the Utest i want to create a new register to access as user junior in this community


  Scenario: creation complete of users congratulation
    Given user open home page
    When user create account filling all fields
      | strNombre | strApellido | strEmail                     |strMesNacmiento | strDiaNacmiento | strAnioNacmiento | strcode  | strpassword | strconfirmpassword|
      | Estefania | Batista     | EstefaniaBatista1500@gmail.com |June            | 1               | 2000            |    507   | Estefania1234*| Estefania1234*|


    Then user sees its username