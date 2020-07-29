''' Question no:2
- Accept a String input
- Print the number of opening braces and closing braces in the input String
- Verify if every opening brace has an equivalent closing brace. Print well formed if every opening brace has an equivalent closing brace.
Print invalid if every opening brace does not have an equivalent closing brace
Eg. If the String input is
{ test {} }
then the output should be as below
Opening braces - 2, Closing braces - 2'''
#Reading string from user
print("Enter String")
input_string=str(input())

#Finding count of opening braces
number_of_opening_braces=input_string.count('{')

#finding number of closing braces
number_of_closing_braces=input_string.count('}')

#checking the number of  both braces are same or not
if(number_of_opening_braces==number_of_closing_braces):
 
  print("Well formed\nOpening braces -",number_of_opening_braces," Closing braces-",number_of_opening_braces)
  
else:
  print("Invalid")