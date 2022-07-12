public class NonAcademicCourse extends Course
{
    //Declaration of variables
    private String InstructorName;
    private String StartingDate;
    private String CompletionDate;
    private String ExamDate;
    private String Prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;

    //Creating a constructor of NonAcademicCourse
    public NonAcademicCourse(String CourseID, String CourseName, int CourseDuration, String Prerequisite)
    {
        /*
         * A call is made from the parent class Course
         * this keyword is used to refer to instance variable
         */ 
        super(CourseID, CourseName, CourseDuration);
        this.Prerequisite = Prerequisite;
        //Declaring variables as empty string
        StartingDate = "";
        CompletionDate = "";
        ExamDate = ""; 
        isRegistered = false;
        isRemoved = false;
    }
    
    //get accesses the value of attributes
    public String getInstructorName()
    {
        return InstructorName;
    }
    
    public String getStartingDate()
    {
        return StartingDate;
    }
    
    public String getCompletionDate()
    {
        return CompletionDate;
    }
    
    public String getExamDate()
    {
        return ExamDate;
    }
    
    public String getPrerequisite()
    {
        return Prerequisite;
    }
    
    public boolean getisRegistered()
    {
        return isRegistered;
    }
    
    public boolean getisRemoved()
    {
        return isRemoved;
    }
    
    //sets the value of InstructorName by passing newInstructorName parameter
    public void setInstructorName(String newInstructorName)
    {
        /*
         * Conditional statement is used to check if IntructorName is already registered.
         * this keyword is used to refer to instance variable
         */
        if(isRegistered == true)
        {
            System.out.println("Since the instructor name is already registered, it is not possible to change it.");
        }
        else
        {
            this.InstructorName = newInstructorName;
        }
    }
    
    ////Registers the values of the attributes of AcademicCourse class of the given parameters
    public void Register(String CourseLeader, String InstructorName, String StartingDate, String CompletionDate, String ExamDate)
    {
        /*
         * Conditional statement is used to check if a course has already been registered.
         * If it is not registered then parameter is passed.
         */
        if(isRegistered == true)
        {
            System.out.println("The non-academic course has already been registered.");
            
        }
        else
        {
            super.setCourseLeader(CourseLeader);
            this.setInstructorName(InstructorName);
            this.StartingDate = StartingDate;
            this.CompletionDate = CompletionDate;
            this.ExamDate = ExamDate;
            isRegistered = true;
            isRemoved = false;
        }
    }
    
    //Removes the values of the attributes
    public void Remove()
    {
        /*
         * Conditional statement is used to check if the course is already removed.
         * If it is not removed then it will assign empty string to the given attributes.
         */
        if(isRemoved == true)
        {
            System.out.println("The non-academic course has already been removed");
        }
        else
        {
            super.setCourseLeader("");
            this.InstructorName = "";
            this.StartingDate = "";
            this.CompletionDate = "";
            this.ExamDate = "";
            this.isRegistered = false;
            this.isRemoved = true;
        }
    }
    
    //Displays the values of the attributes of NonAcademicCourse class
    public void Display()
    {
        /*
         * A call is made to parent class display method
         * Condiotional is used to check if a course is registered.
         */ 
        super.Display();
        if(isRegistered == true)
        {
            System.out.println("The instructor name is " + InstructorName + ".");
            System.out.println("The starting date is " + StartingDate + ".");
            System.out.println("The completion date is " + CompletionDate + ".");
            System.out.println("The exam date is " + ExamDate + ".");
            System.out.println("The prerequisite is " + Prerequisite + ".");
        }
    }
}