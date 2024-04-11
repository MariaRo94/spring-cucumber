Feature: the message can be retrieved
  Scenario: client makes call to POST /fruits/add
    When the client calls /fruits/add
    Then the client receives list of fruits
    And the client receives server version helloFeature: the message can be retrieved
  Scenario: client makes call to POST /fruits/delete
    When the client calls /fruits/delete
    Then the client receives status code of 200
    And the client receives server version hello