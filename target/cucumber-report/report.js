$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/app/features/cuke_runner.feature");
formatter.feature({
  "name": "Translating words",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Translate to Russian",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I\u0027m on Google translate page",
  "keyword": "Given "
});
formatter.match({
  "location": "TranslatingWordsStepDefenitions.i_m_on_Google_translate_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type words",
  "keyword": "When "
});
formatter.match({
  "location": "TranslatingWordsStepDefenitions.i_type_words()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see translated words",
  "keyword": "Then "
});
formatter.match({
  "location": "TranslatingWordsStepDefenitions.i_should_see_translated_words()"
});
formatter.result({
  "status": "passed"
});
});