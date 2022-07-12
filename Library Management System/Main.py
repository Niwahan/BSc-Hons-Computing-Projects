# Importing modules for the program
import Return
import BooksList
import Date_Time
import Borrow

# Defining a function
def Library():
    # Assigning boolean value to menu
    menu=True
    # Using while loop
    while(menu==True):
        # Printing the given data
        print("\n\t\t xxxxxxxxxxxxxxxxxxxxxxxxx")
        print("\t\t   Thali Katuwal Library")
        print("\t\t      Thali, Kathmandu")
        print("\t\t xxxxxxxxxxxxxxxxxxxxxxxxx\n")
        print("Welcome to the Library, please follow the instructions to borrow, return or display the books available in stock.\n")
        print("Input 1 - To Show the books available")
        print("Input 2 - To Borrow a book from the book list")
        print("Input 3 - To Return a book you had borrowed")
        print("Input 4 - To Exit the program")

        # Try block to check for exceptions
        try:
            # Asking the user for input
            a=int(input("\nInput a number from 1 to 4: "))
            print()
            if(a==1):
            # Checks if the value is equal and executes the code
                BooksList.booklist()
                print("The books we have available right now are : \n")
                print("Book Name \t\t Author Name \t\t Quantity \t Price \n")
                # Opening file in read mode
                f=open("Books.txt","r")
                
                for i in range(5):
                # Using for loop
                    print(BooksList.BookName[i]+"\t\t"+BooksList.AuthorName[i]+"\t\t"+BooksList.Quantity[i]+"\t\t"+"$"+BooksList.Price[i])
                print()
                f.close()
                
            elif(a==2):
            # Checks if the value is equal and executes the code
                BooksList.booklist()
                Borrow.BorrowBook()
                
            elif(a==3):
            # Checks if the value is equal and executes the code
                BooksList.booklist()
                Return.ReturnBook()
                
            elif(a==4):
            # Checks if the value is equal and executes the code
                print("Thank you for using our library system")
                menu=False
            
            else:
            # Executing the else block if the if block does not execute
                print("Please enter a number from 1 to 4")
                
        except ValueError:
        # Using except block to handle exceptions
            print("\nPlease input the number.")
Library()
