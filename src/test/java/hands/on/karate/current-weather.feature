Feature: Open Weather Map API

  Background:
    * url weatherBaseUrl
    * configure logPrettyRequest = true
    * configure logPrettyResponse = true

  Scenario: Get unauthenticated weather
    Given path 'data/2.5/weather'
    And param q = 'Rosenheim'
    When method GET
    Then status 401
    And match response contains { cod: 401 }
