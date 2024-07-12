Feature: To validate the Account creation of fb Application
Scenario: To create New Account
Given To launch the browser and maximize the window
When To launch the url of facebook application
And To click the create new button
#One dimensional map data
And To pass the first name in the firstname text box
|firstname1|dharsini|
|firstname2|malini|
|firstname3|mahesh|

And To pass surname in the surname text box
#Two dimensional map data
And To pass mobile number or email in the text box
|password1|password2|password3|
|@fwydwuge|kavitha|kiruthik|
|43763679|praba|priya|
|82896428346|vanitha|siva|
|gueyuyfe|huiwyuifh|ywry389ru3|

And To create new password using new password text box
Then To close the web Browser
