# MAD Practical 2 - Activity
You will be creating your first Android app! Your app will have a profile page on its main Activity.<br/>
Follow the instructions below to complete your app.

1. Create a new project with the following configuration,
    * Empty Activity
    * Language: Java
    * Minimum API level: API 21: Android 5.0 (Lollipop)
2. Create a User class based on the class diagram below.

![User Class Diagram](/images/user_cd.png)

3. Create the layout of your main activity according to the figure shown below.

![Screen Mockup](/images/screen_mock.png)

4. In your onCreate method, the name and description are loaded from the User object. The button on the left will show “Follow” if the variable followed is false, and vice versa.

5.	When the left button is clicked, it will toggle the text between Follow and Unfollow. The variable followed is also updated to reflect this.

# CHALLENGE
6.	When the app is rotated, some of the UI components disappeared as shown in the figure below. Resolve this UI bug such that all components are visible regardless of the screen orientation.<br/><br/>Hint: ScrollView

![Horizontal Rotation](/images/Screenshot_1617792845.png)

To submit your practical, remember to commit the changes and push to remote repository.
