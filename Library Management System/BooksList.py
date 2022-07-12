# Declaring lists
BookName=[]
AuthorName=[]
Quantity=[]
Price=[]

# Defining a fuction
def booklist():
    # Opening a text file in read mode
    f=open("Books.txt","r")
    lines=f.readlines()
    lines=[a.strip('\n') for a in lines]
    # Using for loop
    for i in range(len(lines)):
        x=0
        for j in lines[i].split(','):
            if(x==0):
                BookName.append(j)
            elif(x==1):
                AuthorName.append(j)
            elif(x==2):
                Quantity.append(j)
            elif(x==3):
                Price.append(j.strip("$"))
            x+=1
