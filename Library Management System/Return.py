# Importing modules for the program
import BooksList
import Date_Time

# Defining a fuction
def ReturnBook():
    # Asking the user for input
    name=input("Enter the first name of borrower: ")
    a="Borrowed by-"+name+".txt"
    try:
    # Try block to check for exceptions
        # Opening file in read mode
        f=open(a,"r")      
        data=f.read()
        print(data)
    
    except:
    # Using except block to handle exceptions
        print("The borrower's name is incorrect or not registered.")
        ReturnBook()

    # Creating a .txt file and assigning value
    Return="Returned by-"+name+".txt"
    f=open(Return,"w+")
    # Opening file in read and write mode
    
    f.write("\t\t\t Thali Katuwal Library \n")
    f.write("\t\t\t Thali, Kathmandu")
    f.write("\n-------------------------------------------------------------------------------------------------------------------------")
    f.write("\n\t\t Details of the returner and books returned\n")
    f.write("\t\t\t Returned By: "+ name+"\n")
    f.write("\t\t\t Date and Time: " + Date_Time.getDateTime()+"\n\n")
    f.write("S.N. \t\t Book Name \t\t Author Name \t\t Price\n")
    f.close()

    # Assinging int 0 to count and float 0.0 to total
    count=0
    total=0.0
    
    for i in range(5):
    # Using for loop
        if BooksList.BookName[i] in data:
        # Checks if the value is in data and executes the code
            count=count+1
            f=open(Return,"a")
            f.write(str(count)+" \t\t "+BooksList.BookName[i]+" \t\t"+BooksList.AuthorName[i]+" \t\t"+" $"+BooksList.Price[i]+"\n")
            f.close()
            BooksList.Quantity[i]=int(BooksList.Quantity[i])+1
            total+=int(BooksList.Price[i])

    Check=False
    Fine=False
    while Check==False:
    # Using while loop
        print("The book return date expires in 10 days. Has the book return date already expired?")
        print("Press Y for Yes and N for No")
        
        # Asking the user for input
        choice=input().upper
    
        while Fine==False:
        # Using while loop
            if(choice()=="Y"):
            # Checks if the value is equal and executes the code
                print("By how many days was the book returned late?")
                try:
                # Try block to check for exceptions
                    # Asking the user for input
                    day=int(input())
                    fine=3*day
                    
                    # Opening file in append mode
                    f=open(Return,"a")
                    f.write("\n\t\t\t\t\t\t\tFine: $"+ str(fine)+"\n")
                    f.close()
                    total=total+fine
                    Check=True
                    Fine=True
                except ValueError:
                # Using except block to handle exceptions
                    print("Please input the days you were late in integer type.\n")
            elif(choice()=="N"):
            # Checks if the value is equal and executes the code
                print("Please wait your bill is being ready")
                Check=True
                Fine=True
            else:
            # Executing the else block if the if block does not execute
                print("Please input as suggested\n")
                break
    print("\nFinal Total: "+ "$"+str(total))
    print("\n Thank you for returning back the book. Here's your bill.\n")

    # Opening file in append mode
    f=open(Return,"a")
    f.write("\t\t\t\t\t\t\tFinal Total: $"+ str(total))
    f.write("\n*************************************************************************************************************************")
    f.write("\nTHANK YOU FOR YOUR TIME HERE.\nWE HOPE TO SEE YOU AGAIN")
    f.write("\n*************************************************************************************************************************")
    f.close()
    
    # Opening file in read and write mode    
    f=open("Books.txt","w+")
    for i in range(5):
    # Using for loop
        f.write(BooksList.BookName[i]+","+BooksList.AuthorName[i]+","+str(BooksList.Quantity[i])+","+"$"+BooksList.Price[i]+"\n")
    f.close()

    # Opening file in read mode
    f=open(Return,"r")
    lines=f.read()
    print(lines)
    f.close()
