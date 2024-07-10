	Feature: Issue Management 

 Scenario: Verify whether any alerts are there
  Given Navigate to Issue management -> Alerts page
  When Select Location, Department, From , To and click Search button
  Then Records should be displayed based on the search  filters
 
 