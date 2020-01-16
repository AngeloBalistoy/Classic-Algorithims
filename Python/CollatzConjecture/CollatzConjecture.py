# Collatz Conjecture: Start with a number n > 1. Find the number of steps it takes to reach one using the following
# process: If n is even, divide it by 2. If n is odd, multiply it by 3 and add 1.
opening_message = ("Hello! This script is related to all things Collatz Conjecture I am bothered to think about. Please"
                   " select an option below.\n1: What is the Collatz Conjecture?\n2: Calculate the number of steps "
                   "for a certain number.\n3: What is the worst number for Collatz Conjecture in a given range?")
information = ("Collatz Conjecture: Start with a number n > 1. Find the number of steps it takes to reach one using "
               "the following process: If n is even, divide it by 2.\nIf n is odd, multiply it by 3 and add 1.")


def collatz_conjecture(number):
    first_number = number
    counter = 0
    while number > 1:
        if number % 2 == 0:
            number = int(number / 2)
            counter += 1
        else:
            number = number * 3 + 1
            counter += 1
    return first_number, counter


def worst_number_for_collatz_conjecture():
    print("Input a max range for this calculation: ")
    num_input = input()
    while not input_is_an_integer(num_input):
        print("Not an integer input.")
        num_input = input()
    input_range = int(num_input)
    worst_number = 0
    worst_number_counter = 0
    for i in range(1, input_range):
        collatz_tuple = collatz_conjecture(i)
        current_number = collatz_tuple[0]
        current_number_counter = collatz_tuple[1]
        if current_number_counter > worst_number_counter:
            worst_number_counter = current_number_counter
            worst_number = current_number
    print("The worst number for the Collatz Conjecture from 0 to " + str(input_range) + " is " + str(worst_number) +
          " taking " + str(worst_number_counter) + " steps.")


def calculate_number():
    print("Input a number to calculate the steps for Collatz Conjecture for that number: ")
    numInput = input()
    if input_is_an_integer(numInput):
        numInput = int(numInput)
        while numInput < 1:
            print("The inputted number is less than 1.")
            numInput = int(input())
        calculation = collatz_conjecture(numInput)
        print("The number " + str(numInput) + " takes " + str(calculation[1]) + " steps" + " to complete.")
    else:
        print("Not a valid input.")


def input_is_in_range(input_num, input_range):
    if input_range[0] <= input_num <= input_range[1]:
        return True
    return False


def input_is_an_integer(input_num):
    try:
        int(input_num)
    except:
        return False
    return True
def key_to_continue():
    print("Press any key to continue.")
    input()
def start():
    print("\n" + opening_message)
    user_input = input()
    if user_input == "exit":
        print("Exiting...")
    elif input_is_an_integer(user_input):
        user_input = int(user_input)
        if input_is_in_range(user_input, (1, 3)):
            if user_input == 1:
                print(information)
                key_to_continue()
                start()
            elif user_input == 2:
                calculate_number()
                key_to_continue()
                start()
            elif user_input == 3:
                worst_number_for_collatz_conjecture()
                key_to_continue()
                start()

start()