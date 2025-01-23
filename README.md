# Welcome to the Love Match Game!

In this simple program, the user is presented with a brief introduction of the program and is then tasked to enter one name after another for the program to begin analyzing.

In the code, there exists a method called countCommonChars taking two string parameters, the names provided by the user, where hashmaps and enhanced loops help to count and record common characters between the two strings. The integer amount of common characters is then returned by the method and taken back to the main method where arithmetic is done to calculate name compatibility.

This is done by taking the integer returned by the countCommonChars method into the numerator of a fraction where the denominator is the total characters of both name strings given by the user. This fraction is then subtracted from 1 resulting in a decimal that will be multiplied by 100 to convert it into a percent, coming in as the final step to my "formula for compatibility."

This percentage is printed to the reader and belongs to a certain range of compatibilities that trigger a value-specific message to print to the user related to their compatibility.

And that's the game!
