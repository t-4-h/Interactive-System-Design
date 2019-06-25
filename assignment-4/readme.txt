After fighting with HTML and forms to control the ShowShape applet, you now have a chance to use the full power of GUI for the same job. The goal of the Homework 4 is to develop an interactive version of Banner applet - as a Java application (app). This is a pair homework and you are working in the same pair as for HW3.

The presentation capabilities of the the app should be the same as in the original Banner servlet with a few differences that originated in the GUI nature of the new applet.  One part of the app should be occupied by a set of widgets that let the user specify message parameters (same set of parameters and their values as in HW2-3). Another part of the app space should be devoted for presenting a banner with a message inside a shape. The frame and the shape should be centered inside this presentation area. 

Unlike the form submission model, with a real GUI any change of any parameter of the message/frame should be immediately visualized. Also, instead of diagnosing the errors, try to prevent most of the errors by preventing the user from specifying "wrong" parameters of the message/frame. Provide a diagnostic message if you can't prevent some of the errors or if you think that this message will be helpful even as an error prevention tool. For this homework it is essential to center the message inside the frame and presentation area and to avoid situation when message does not fit the shape (that was an extra credit work in HW2). This time you HAVE to use the FontMetrics class that will let you to check the size of any message in any font.

Try to follow as much as you can the MVC pattern. Your app should include

a presentation model - a set of internal parameters that define your shape
a controller - an applet area with a number of shape-controlling widgets
the view - the area where the shape is visualized.
Try to code these parts independently from each other as implied by MVC. A wise idea could be to use MVC separation to split the work in your pair.

Note that there is a separate deadline for the design stage. Prepare a copy of your design by this deadline, a week after the assignment is issued. Be prepared to show and defend your design in class. The design can be done as a sketch, a wireframe, PowerPoint mock-up, or a widget setup prepared with a visual editor. However, we recommend to practice one of the existing wireframing tool - you will need to master it for the Final project. No programming is necessary at that stage.

The following aspects of your solution will be specifically checked (and you may have points subtracted if the solution does not satisfy the requirements)

The shape should be centered inside the banner area
Any change of any parameters should be immediately visualized
Error prevention instead of error diagnosing (for each parameter where it is possible!)
Message should be centered inside the shape
Message should be fit to the shape (using FontMetrics class)
Interface should be easy to use
Overall design quality (colors, proportion between a set of widgets part and demo part). Note that without user studies, this is quite subjective issue. Yet, you can loose up to 0.2 points for really bad design.
Implementation errors
In addition, you can gain extra point for finishing your work in time for class and showing it in class.

Deliverable
Please zip your submitted files together and name the file as follows: LastnameName_YourPartnerLastnameName_Assign4.zip. Submission should contain:

HTML file index.html that launches the applet (unless you choose to make an application).
Applet code as .class file(s) file
Source code as .java file(s) (if possible in a separate "src" folder)
Please make an executable .jar file of your project if you choose to make an application
Any additional files (e.g. images) you used properly placed
The assignment should run by simply opening the index.html file (Applet) or launching the application (with .jar file). Any additional efforts required to run your assignment might result in loosing points.
Please print your name in HTML file and in the code.
