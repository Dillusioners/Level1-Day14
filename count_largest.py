#Defining a function that takes a list of integers as input and returns the number of times the largest number appears in the list
def count_largest(lst):
    # Find the largest number in the list
    largest = max(lst)
    # Count the number of times the largest number appears in the list
    count = lst.count(largest)
    # Returning the count
    return count

# Creating an empty list to store user input
numbers = []

try:
    #Prompting the user to enter the total number of integers they want to add to the list
    total = int(input("How many numbers do you want to add:- "))

    # Loop through the range of total and prompt the user to enter a number for each index
    for i in range(1, total):
        n = int(input(f'Enter your number for index {i}:-'))
        # Append the user input to the numbers list
        numbers.append(i)
except:
    # If the user input is not a number, print an error message
    print("Try entering numbers next time.")


#Calling the count_largest function with the numbers list as input and store the result in count
count = count_largest(numbers)

#Printing the number of times the largest number appears in the list
print("The largest number appears", count, "times in the list.")
