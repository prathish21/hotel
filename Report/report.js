$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Checking The Hotel Booking Functionality Of The Adactin Hotel Application",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-the-adactin-hotel-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-the-adactin-hotel-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Should Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enters \"\u003cusername\u003e\" In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enters \"\u003cpassword\u003e\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Clicks The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-the-adactin-hotel-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "checking-the-hotel-booking-functionality-of-the-adactin-hotel-application;login-functionality;;1"
    },
    {
      "cells": [
        "prathish",
        "546"
      ],
      "line": 11,
      "id": "checking-the-hotel-booking-functionality-of-the-adactin-hotel-application;login-functionality;;2"
    },
    {
      "cells": [
        "jackson2022",
        "jamjim"
      ],
      "line": 12,
      "id": "checking-the-hotel-booking-functionality-of-the-adactin-hotel-application;login-functionality;;3"
    },
    {
      "cells": [
        "jackson2022",
        "jimjam"
      ],
      "line": 13,
      "id": "checking-the-hotel-booking-functionality-of-the-adactin-hotel-application;login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-the-adactin-hotel-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Should Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enters \"prathish\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enters \"546\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Clicks The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Should_Launch_The_Url()"
});
formatter.result({
  "duration": 4175843000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prathish",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Enters_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 517697200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "546",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Enters_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 161226200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 633044800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-the-adactin-hotel-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Should Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enters \"jackson2022\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enters \"jamjim\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Clicks The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Should_Launch_The_Url()"
});
formatter.result({
  "duration": 887066400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jackson2022",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Enters_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 233223900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jamjim",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Enters_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 304306600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1047486100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-the-adactin-hotel-application;login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Should Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enters \"jackson2022\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enters \"jimjam\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Clicks The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Should_Launch_The_Url()"
});
formatter.result({
  "duration": 644569700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jackson2022",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Enters_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 339989300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jimjam",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Enters_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 189049800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1482054300,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Search Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-the-adactin-hotel-application;search-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user Selects \"Los Angeles\" From Select Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Selects \"Hotel Hervey\" From Select Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Selects \"Super Deluxe\" From Select Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Selects \"1\" From Select Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Selects \"2\" From Select Adults Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Selects \"0\" From Children Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Clicks Search Button And It Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Los Angeles",
      "offset": 14
    }
  ],
  "location": "Step_Definition.user_Selects_From_Select_Location_Field(String)"
});
formatter.result({
  "duration": 331703200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Hervey",
      "offset": 14
    }
  ],
  "location": "Step_Definition.user_Selects_From_Select_Hotel_Field(String)"
});
formatter.result({
  "duration": 262554100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Super Deluxe",
      "offset": 14
    }
  ],
  "location": "Step_Definition.user_Selects_From_Select_Room_Type_Field(String)"
});
formatter.result({
  "duration": 215258000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 14
    }
  ],
  "location": "Step_Definition.user_Selects_From_Select_Number_Of_Rooms_Field(String)"
});
formatter.result({
  "duration": 156472900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 14
    }
  ],
  "location": "Step_Definition.user_Selects_From_Select_Adults_Per_Room_Field(String)"
});
formatter.result({
  "duration": 351164200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 14
    }
  ],
  "location": "Step_Definition.user_Selects_From_Children_Per_Room_Field(String)"
});
formatter.result({
  "duration": 194940700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 965889500,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Select Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-the-adactin-hotel-application;select-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "user Clicks The Select Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user Clicks The Continue Button And It Navigates To The Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Clicks_The_Select_Radio_Button()"
});
formatter.result({
  "duration": 164565500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 1861376800,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Book A Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-the-adactin-hotel-application;book-a-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "user Enters \"Prathish\" In The Firstname Field",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Enters \"Kumar\" In The Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Enters \"No-3, Vadhiyar Theru, LA\" In The Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Enters \"7896547896541235\" In The Credit Card No Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Selects \"VISA\" From Select Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Selects \"6\" From Date And \"2022\" From Select Year Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enters \"563\" In The CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Clicks Book Now Button And It Navigates To Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Prathish",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Enters_In_The_Firstname_Field(String)"
});
formatter.result({
  "duration": 545485200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kumar",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Enters_In_The_Lastname_Field(String)"
});
formatter.result({
  "duration": 269713900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No-3, Vadhiyar Theru, LA",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Enters_In_The_Billing_Address_Field(String)"
});
formatter.result({
  "duration": 472268900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7896547896541235",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Enters_In_The_Credit_Card_No_Field(String)"
});
formatter.result({
  "duration": 258272200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 14
    }
  ],
  "location": "Step_Definition.user_Selects_From_Select_Credit_Card_Type_Field(String)"
});
formatter.result({
  "duration": 234122400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 14
    },
    {
      "val": "2022",
      "offset": 32
    }
  ],
  "location": "Step_Definition.user_Selects_From_Date_And_From_Select_Year_Field(String,String)"
});
formatter.result({
  "duration": 441159200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "563",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Enters_In_The_CVV_Number_Field(String)"
});
formatter.result({
  "duration": 168299200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 10938428900,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Logout Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-the-adactin-hotel-application;logout-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@logout"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "user Clicks Logout Button And It Navigates To The Successfully Logged Out Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Clicks_Logout_Button_And_It_Navigates_To_The_Successfully_Logged_Out_Page()"
});
formatter.result({
  "duration": 862533300,
  "status": "passed"
});
});