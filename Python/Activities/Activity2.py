""""
Ask the user for a number.
Depending on what number they enter, tell them if the number is an even or odd number.
"""


number = int( input( "Enter the number: " ) )
mod = number % 2
if mod > 0:
    print ("You entered odd number.")
else:
     print ("You entered even number.")
