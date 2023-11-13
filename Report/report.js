$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/sample.feature");
formatter.feature({
  "name": "To validate the fb application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the edge browser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "HooksClass.to_launch_the_edge_browser_and_maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "The url is launch",
  "keyword": "When "
});
formatter.match({
  "location": "fbLogin.the_url_is_launch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass email in email field",
  "keyword": "And "
});
formatter.match({
  "location": "fbLogin.to_pass_email_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "fbLogin.to_pass_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "fbLogin.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});