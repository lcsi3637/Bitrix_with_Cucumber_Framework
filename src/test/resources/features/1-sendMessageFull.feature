@SendingMessage
Feature:
  Agile Story: 1
  1. As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Background: User login
  Given User is on the loginPage
  When user enters "<UserName>" and "<Password>"
  Then user should be able to see "<expectedTitle>"

      | UserName                      | Password | expectedTitle |
      | helpdesk1@cybertekschool.com  | UserUser | Portal        |
  #    | helpdesk2@cybertekschool.com  | UserUser | (3) Portal    |
  #    | marketing1@cybertekschool.com | UserUser | (1) Portal    |
  #    | marketing2@cybertekschool.com | UserUser | Portal        |
  #    | hr1@cybertekschool.com        | UserUser | (4) Portal    |
  #    | hr2@cybertekschool.com        | UserUser | (1) Portal    |


  @uploadFiles
  Scenario:1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
 Given user is on the portal page
 When user click on upload and adds file to "<path>"
    Then user should be able to upload file successfully
    |<path>|
    |      |
    |      |

    @addUserstoMessage
  Scenario:2. User should be able to add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
  Given user is on the portal page
    When user clicks on send message box
    Then user should be able to add users from "<list>"
      | <list>                    |
      | Recent                    |
      | Employees and Departments |
      | E-mail users              |

      @attachLinksToMessage
  Scenario:3. User should be able to attach link by clicking on the link icon.
  Given user is on the portal page
    When user clicks on message box and clicks on attach links and enters link
    Then user should be able to attach link successfully

        @addVideoToMessage
  Scenario:4. User should be able to insert videos by clicking on the video icon and entering the video URL.
 Given user is on the portal page
          When user clicks on video icon in message box
          Then user should be able to add video successfully

          @addingQuotes
  Scenario:5. User should be able to create a quote by clicking on the Comma icon.
  Given user is on the portal page
            When user clicks on comma icon
            Then user should be able to add quotes successfuly

            @mentionList
  Scenario:6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
  Given user is on the portal page
    When user clicks on add mention icon
    Then user should be able to add mention list from the "<list>"
      | <list>                    |
      | Recent                    |
      | Employees and Departments |

  @visialEditor
  Scenario:7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
  Given user is on the portal page
    When user clicks on visual editor icon
    Then user should see the visual editor menu on top of the message

    @addingTopic
  Scenario:8. User should be able to click on the Topic icon to see the Message Topic text box displays on top of the message box.
  Given user is on the portal page
      When user clicks on the topic icon
      Then user should see topic box above the message box

      @recordingVideo
  Scenario:9. User should be able to click on ""Record Video"" tab to record a video and attach it with the message."
Given user is on the portal page
        When user clicks on record video icon in message box
        Then user should be able to see record video popup
        Then user should be able to add recorded video successfully

