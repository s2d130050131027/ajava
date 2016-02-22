Java Server Pages (JSP)
=======================
5.5 Implement JavaScript with JSP (Complete DB Example)
-------------------------------------------------------
Step 1: Create employee form (EmployeeInformation.jsp).
In this step first of all create Employee information form and retrieved employee id from database using with JDBC database.

Step 2 : Create "ProcessAction.jsp"  for Process the Data and forward  according to user requirement. 
In this step first of all we will create ProcessAction.jsp for getting all string value using with getParameter() method and forward on different page like JSPInsertAction.jsp, ClearAction.jsp, and update.jsp.

Step 3: Create data insert action page ("JSPInsertAction.jsp"). 
This code using for insert data into database by using JDBC database. When you will select same employee id and employee name then massage will display employee id already exit in database.

Step 4: Create data deletion code from database ("ClearAction.jsp").
In this step you will create code to delete data from database. When,  you will select employee id and employee name then select delete radio button after selecting delete radio button when you will click on submit button then data will successfully delete from database.

Step 5: Create update data code ("update.jsp"). 
In this step you will create, modify data in database by using JDBC database.

Here is the output of this program:
When you will enter new employee id and employee name and select insert button after selecting insert button click on submit button then data will insert successfully in database.

![sample output3](http://www.roseindia.net/jsp/empform1.gif)

![samput output4](http://www.roseindia.net/jsp/empform2.gif)

If  you will select same employee id then massage will display like this.

![sample output5](http://www.roseindia.net/jsp/empform3.gif)

![sample output6](http://www.roseindia.net/jsp/empform4.gif)

![sample output7](http://www.roseindia.net/jsp/empform5.gif)

![sample output8](http://www.roseindia.net/jsp/empform6.gif)

![sample output9](http://www.roseindia.net/tutorialfiles/21690.empform7.gif)

![sample output10](http://www.roseindia.net/tutorialfiles/21690.empform7.gif)

If you want to modify record then select employee id and enter new employee name. When you will select modify radio button then click on submit button then massage will display like this.

![sample output11](http://www.roseindia.net/jsp/empform8.gif)


