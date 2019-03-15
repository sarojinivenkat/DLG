$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Feature",
  "description": "",
  "id": "feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@driver"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Login Check using Scenario Outline",
  "description": "",
  "id": "feature;login-check-using-scenario-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@drive-away-insurance-outline"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user open insurance portal website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user navigates to insuranc portal page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enter registration number as \"\u003cregistrationNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should see vehicle insurance cover start and end date and the status is \"\u003cstatus\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "feature;login-check-using-scenario-outline;",
  "rows": [
    {
      "cells": [
        "registrationNumber",
        "status"
      ],
      "line": 13,
      "id": "feature;login-check-using-scenario-outline;;1"
    },
    {
      "cells": [
        "OV12UYY",
        "Pass"
      ],
      "line": 14,
      "id": "feature;login-check-using-scenario-outline;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11576696264,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Check using Scenario Outline",
  "description": "",
  "id": "feature;login-check-using-scenario-outline;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@driver"
    },
    {
      "line": 5,
      "name": "@drive-away-insurance-outline"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user open insurance portal website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user navigates to insuranc portal page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enter registration number as \"OV12UYY\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should see vehicle insurance cover start and end date and the status is \"Pass\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintions.user_open_insurance_portal_website()"
});
formatter.result({
  "duration": 3551573179,
  "status": "passed"
});
formatter.match({
  "location": "StepDefintions.user_navigates_to_insuranc_portal_page()"
});
formatter.result({
  "duration": 1776326,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "OV12UYY",
      "offset": 30
    }
  ],
  "location": "StepDefintions.enter_registration_number_as(String)"
});
formatter.result({
  "duration": 1471212396,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pass",
      "offset": 78
    }
  ],
  "location": "StepDefintions.user_should_see_vehicle_insurance_cover_start_and_end_date_and_the_status_is(String)"
});
formatter.result({
  "duration": 211418,
  "status": "passed"
});
formatter.after({
  "duration": 53368,
  "status": "passed"
});
});