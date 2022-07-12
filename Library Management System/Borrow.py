# Importing modules for the program
import Date_Time
import BooksList

# Defining a fuction
def BorrowBook():
    # Assigning a boolean value to Borrowed
    Borrowed=False
    # Using while loop
    while(True):
        # Asking the user for input
        firstname=input("Input the first name of the borrower: ")
        if firstname.isalpha():
            break
        print("Please input alphabet from A-Z")
    # Using while loop
    while(True):
        # Asking the user for input
        lastname=input("Input the last name of the borrower: ")
        if lastname.isalpha():
            break
        print("Please input alphabet from A-Z")

    # Creating a .txt file and assigning value
    Borrow="Borrowed by-"+firstname+".txt"
    # Opening file in read and write mode
    f=open(Borrow,"w+")
    f.write("\t\t\t Thali Katuwal Library \n")
    f.write("\t\t\t Thali, Kathmandu")
    f.write("\n-------------------------------------------------------------------------------------------------------------------------")
    f.write("\n\t\t Details of the borrower and books borrowed\n")
    f.write("\t\t Borrowed By: "+ firstname+" "+lastname+"\n")
    f.write("\t\t Date and Time: " + Date_Time.getDateTime()+"\n\n")
    f.write("S.N. \t\t Book Name \t\t\t Author Name \t\t Price\n" )
    f.close()

    total=0.0
    # Using while loop
    while Borrowed==False:
        print("\nPlease select an option below:\n")
        for i in range(5):
        # Using for loop
            print("Input",i, "to borrow book", BooksList.BookName[i])        
        try:
        # Try block to check for exceptions
            # Asking the user for input
            a=int(input())
            if a<0:
            # Checks if the value is less than 0 and executes the code
                print("Plese enter a valid number given above.")
            else:
            # Executing the else block if the if block does not execute
                try:
                # Try block to check for exceptions
                    if(int(BooksList.Quantity[a])>0):
                    # Checks if the value is more than 0 and executes the code
                        print("\nThe book you've selected is in stock.\n")
                        # Opening file in append mode
                        f=open(Borrow,"a")
                        f.write("1. \t\t"+ BooksList.BookName[a]+" \t\t\t "+BooksList.AuthorName[a]+" \t\t "+"$"+BooksList.Price[a]+"\n")
                        f.close()
                        BooksList.Quantity[a]=int(BooksList.Quantity[a])-1
                        total=total+int(BooksList.Price[a])
                        # Opening file in read and write mode
                        f=open("Books.txt","w+")
                        for i in range(5):
                        # Using for loop
                            f.write(BooksList.BookName[i]+","+BooksList.AuthorName[i]+","+str(BooksList.Quantity[i])+","+"$"+BooksList.Price[i]+"\n")
                        f.close()
                    # Code for borrowing multiple book
                        Borrowed2=True
                        count=1
                        # Using while loop
                        while Borrowed2==True:
                            # Asking the user for input
                            choice=str(input("If you want to borrow another book then press Y for Yes if not then press N for No: \n").upper())
                            if(choice=="Y"):
                            # Checks if the value is equal and executes the code
                                print("\nPlease select an option below:\n")
                                
                                for i in range(5):
                                # Using for loop
                                    print("Input", i, "to borrow book", BooksList.BookName[i])
                                try:
                                # Try block to check for exceptions
                                    # Asking the user for input
                                    b=int(input())
                                    
                                    if b==a:
                                    # Checks if the value is equal and executes the code    
                                        print("I am sorry. You can't borrow the same book twice.")
                                    else:
                                        try:
                                        # Try block to check for exceptions
                                            if(int(BooksList.Quantity[b])>0):
                                            # Checks if the value is more than 0 and executes the code
                                                print("\nThe book you've selected is in stock.\n")
                                                count=count+1
                                                # Opening file in append mode
                                                f=open(Borrow,"a")
                                                f.write(str(count)+". \t\t"+ BooksList.BookName[b]+"\t\t\t  "+BooksList.AuthorName[b]+" \t\t  "+"$"+BooksList.Price[b]+"\n")
                                                f.close()
                                                BooksList.Quantity[b]=int(BooksList.Quantity[b])-1
                                                total=total+int(BooksList.Price[b])
                                                f=open("Books.txt","w+")
                                                # Opening file in read and write mode
                                                
                                                for i in range(5):
                                                # Using for loop
                                                    f.write(BooksList.BookName[i]+","+BooksList.AuthorName[i]+","+str(BooksList.Quantity[i])+","+"$"+BooksList.Price[i]+"\n")
                                                f.close()
                                            else:
                                            # Executing the else block if the if block does not execute
                                                print("Book is not available right now. Please visit us after some time.")
                                        except IndexError:
                                        # Using except block to handle exceptions
                                            print("\nPlease choose book acording to their number.")
                                except ValueError:
                                # Using except block to handle exceptions
                                    print("\nPlease input as suggested.")
                            elif(choice=="N"):
                            # Checks if the value is equal and executes the code
                                print("\nThank you for using our service to borrow books from us. Here's your bill.\n")
                                print("")
                                Borrowed2=False
                                Borrowed=True
                            else:
                            # Executing the else block if the if block does not execute
                                print("Please input as suggested")         
                    else:
                    # Executing the else block if the if block does not execute
                        print("Book is not available right now. Please visit us after some time.")
                except IndexError:
                # Using except block to handle exceptions
                    print("\nPlease choose book acording to their number.")
        except ValueError:
        # Using except block to handle exceptions
            print("\nPlease input as suggested.")
    # Opening file in append mode
    f=open(Borrow,"a")
    f.write("\n\t\t\t\t\t\t\t\t\tTotal: $"+ str(total))
    f.write("\n*************************************************************************************************************************")
    f.write("\nTHANK YOU FOR YOUR TIME HERE.\nWE HOPE TO SEE YOU AGAIN")
    f.write("\n*************************************************************************************************************************")
    f.close()

    # Opening file in read mode
    f=open(Borrow,"r")
    lines=f.read()
    print(lines)
    f.close()
    
