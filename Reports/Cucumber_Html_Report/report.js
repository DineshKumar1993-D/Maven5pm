$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactintesthotel.feature");
formatter.feature({
  "line": 1,
  "name": "To Test The Adactin Application",
  "description": "",
  "id": "to-test-the-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Checks The Login Functionality",
  "description": "",
  "id": "to-test-the-adactin-application;checks-the-login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "launch The Adactin Url Of The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters The Following Credentials In The Respective Field",
  "rows": [
    {
      "comments": [
        {
          "line": 8,
          "value": "#DataTable"
        }
      ],
      "cells": [
        "Username",
        "Password"
      ],
      "line": 9
    },
    {
      "cells": [
        "Java24",
        "367Dinesh"
      ],
      "line": 10
    },
    {
      "cells": [
        "Selenium",
        "12734687"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#When user Enters The Username \"\u003cUsername\u003e\" In The Respective Field"
    },
    {
      "line": 13,
      "value": "#And user Enters The Password \"\u003cPassword\u003e\" In The Respective Field"
    }
  ],
  "line": 14,
  "name": "user Clicks The Loginbutton and Its Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefTest.launch_The_Adactin_Url_Of_The_Application()"
});
formatter.result({
  "duration": 1744027600,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Enters_The_Following_Credentials_In_The_Respective_Field(DataTable)"
});
formatter.result({
  "duration": 212367500,
  "status": "passed"
});
formatter.match({
  "location": "StepdefTest.user_Clicks_The_Loginbutton_and_Its_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 390735000,
  "status": "passed"
});
});