Feature:
  Agile Story: 8
  "8. As a user, I should be able to create
  and send workflows by selecting different workflows
  from ""More"" tab under Activity Stream."

  Scenario:User should be able to request a Leave Approval by
 Given
  assigning approvers and processors; selecting start and ending date from date picker; select Absence type from dropdown; and entering reason for leave information.

  Scenario: User should be able to request a Business Trip by:
  Given assigning approvers, processors and entering user instructions; entering trip Title, Destination, Purpose, Planned Expenses and Currency information; selecting start and ending date from date picker; and attach documents.

  Scenario:
  Given User should be able to send a General Request by entering request Title, Description, priority level and Send Request To field.

  Scenario: User should be able to send a Purchase Request by:
  Given
  assigning approvers and processors; entering Request Title, Amount and Currency; and attach documents.

  Scenario: User should be able to send a Expense Report by:
  Given assigning approvers and accountants; entering Report Title, Amount and Currency; and attach files.

  Scenario:
  Given User should be able to create new workflows.

    Scenario:
      Given
      User should be able to access Workflows Directory page."