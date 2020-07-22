@TaskFeature
Feature:
  Agile Story: 2
  "2. As a user, I should be able to assign
  tasks by clicking on Task tab under Active Stream."

    Scenario Outline: User login
    When user enters "<UserName>" and "<Password>"
    Then user should be able to see "<expectedTitle>"



    Examples:
      | UserName                      | Password | expectedTitle |
      | helpdesk1@cybertekschool.com  | UserUser | Portal        |
  #    | helpdesk2@cybertekschool.com  | UserUser | (3) Portal    |
  #    | marketing1@cybertekschool.com | UserUser | (1) Portal    |
  #    | marketing2@cybertekschool.com | UserUser | Portal        |
  #    | hr1@cybertekschool.com        | UserUser | (4) Portal    |
  #    | hr2@cybertekschool.com        | UserUser | (1) Portal    |

  Scenario:1-User should be able to click on High Priority checkbox to set the current task to a top priority task current task should  be set to High Periority
  Scenario:2-User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
  Scenario:3-User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
  Scenario:4-User should be able to create a quote by clicking on the Comma icon.
  Scenario:5-User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
  Scenario:6-User should be able to attach link by clicking on the link icon.
  Scenario:7-User should be able to click on ""Checklist"" to create checklists items(Things to do). User can add a checklist item by clicking on add button or check mark. User can add separator lines between checklist items. User can delete a checklist item by clicking on x mark.
  Scenario:8-User can assign the tasks to employees by clicking on Add More and selecting contact from E-mail user, Employees and Departments and Recent contact lists. Employees can be added in different assignment categories: Created By, Participants and Observer.
  Scenario:9-User can add Deadline, Time Planningby using date pickers.
  Scenario:10-User can click on More to specify the task details."