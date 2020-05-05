$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/USER/eclipse-workspace/CucumberPOM/src/main/java/com/qa/feature/FreeCrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM Home page Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is on Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User enters the Email and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User Click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User validates home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Validate logged in username",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_open_the_browser()"
});
formatter.result({
  "duration": 10658551693,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 62433550,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_the_Email_and_Password()"
});
formatter.result({
  "duration": 470243389,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_Click_on_Login_Button()"
});
formatter.result({
  "duration": 51071622,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_validates_home_page_title()"
});
formatter.result({
  "duration": 7103696,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_username()"
});
formatter.result({
  "duration": 1118541031,
  "status": "passed"
});
});