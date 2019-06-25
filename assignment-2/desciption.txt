In the Java part of Lecture 2 you have learned about some graphics capabilities of Java. Main target of this assignment is to practice writing simple applets in Java while focusing of Java graphics.

You have to design an applet ShowShape (use this name for your Java file) that shows a brief message framed by one of the Java standard shapes (rectangle, rounded rectangle, oval - only non-filled shapes are considered). The message to display in the shape, the kind of shape, the colors of the background and foreground, the horizontal and vertical sizes of the shape, and the style and size of the message font should be provided by applet parameters with the following restricted names: Message, Shape, Color, BGColor, X, Y, FTStyle, FTSize. For other parameters of the shape and the message use any meaningful settings (i.e., the curvature of the rounded rectangle, the font face, etc.). Allowed values for Shape are OVAL, RECT and ROUNDRECT. Allowed values for FTStyle are REGULAR, BOLD, ITALIC, and BOLD ITALIC (with a space between the words). Allowed values for both color parameters (one for background, another for font and shape) are all standard Java colors (black, blue, cyan, darkGray, gray, green, lightGray, magenta, orange, pink, red, white, yellow). The names and case of all parameters and values are strictly enforced (you can loose points even if using a different font case). Your applet should display an error message (inside your applet) if one of the parameter values is not recognized (i.e, brown for the color). Provide and use default value for any parameter if the parameter is absent. We have not covered passing parameters to applets, but this topic is very easy and is covered in any textbooks and many web tutorials. Check this tutorial for an overview.

The shape has to be horizontally and vertically centered inside the applet space. For simplicity you can assume that the applet is always 150x300 pixels. If you want a challenge, try to deal with arbitrary sizes and keep the shape centered - but it will not influence your grade.

You should also center the message inside the shape of your applet and display an error when the message is too large (inside your applet). For a simple solution, ignore the vertically dimension and use the font size to center the message horizontal and to display errors when font is too large for the available horizontal space. For example, if you work with 50X200 shape, you have only 200 pixels horizontally for the font. Large fonts will not fit, so if the font was set for 64pts, you should display an error. Naturally, to be able to do it using just the font size, you need to know what is the rate between a point and a pixel. You probably know that in modern typography a point is 1/72 of an inch. For electronic fonts the situation depend on the platform. On a Macintosh, a point is conveniently 1 pixel, but on a PC, a point is about 1.3 pixels. Consequently, 10-point type is 10 pixels on a Macintosh, but 13 pixels on a PC! Java, being a cross-platform language, has its own mind that also depends from platform and version of Java. Chances are that in your version one of these proportions will work. Just do a simple test. We will not be looking for an exact fit, for the simple solution, a you just need to achieve a reasonable horizontal error diagnosis and centering.

For another challenge and one extra point produce the correct solution for the centering and size error diagnosis problems that relies on Java ability to query font properties (provided by FontMetrics class). In that case, you should center the message inside the applet and framing shape both horizontally and vertically and diagnose cases when the message do not fit the framing shape either horizontally or vertically.

Your submission has to include .java file with the applet class, and an HTML file that calls the developed applet five times with different sets of parameters. Develop these five parameter sets to show the capabilities of the applet. When ready, archive all three files together and submit using the CourseWeb dropbox. Also, bring the printous of the html file, java file, and the result it produce in your browser to the class.

In addition to your submitted HTML file your Applet will be tested by our own HTML file to verify that you named all parameters and their values as specified above in blue font. Our HTML file will use applet size of 150x300 (height, width). Output of both HTML files will be considered for the grade.

You are welcome to use any textbook or tutorial (though, most useful source is Java API , see External Links). You can discuss the ways to achieve necessary effects with your peers privately and in discussion forums, but after this discussion everyone has to write his or her own code.

Deliverables
Please zip your submitted files together and name the file as follows: LastnameName_Assign2.zip. Submission should contain

HTML file index.html that launches all applets.
Java files as a set .class files or packaged into .jar file
Source code (if possible in a separate "src" folder)
Do not submit files not relevant to the assignment. If extra work is necessary to make your assignment work you might loose points. Please print your name in HTML file and possibly in the code.

Examples
Here is a possible example of an HTML file that calls the applet once:

Example1: Page

Example2: Page

To make sure you are able to run applets on a web browser, you can use Firefox version 52 (link download)
