public class AcademicCourse extends Course
{
    //Declaration of variables
    private String LecturerName;
    private String Level;
    private String Credit;
    private String StartingDate;
    private String CompletionDate;
    private int NumberOfAssessments;
    private boolean isRegistered;
    
    //Creating a constructor of AcademicCourse
    public AcademicCourse(String CourseID, String CourseName, int CourseDuration, String Level, String Credit, int NumberOfAssessments)
    {
        /*
         * A call is made from the parent class Course
         * this keyword is used to refer to instance variable
         */ 
        super(CourseID, CourseName, CourseDuration);
        this.Level = Level;
        this.NumberOfAssessments = NumberOfAssessments;
        this.Credit = Credit;
        //Declaring variables as empty string
        LecturerName = "";
        StartingDate = "";
        CompletionDate = "";
        isRegistered = false;
    }
    
    //get accesses the value of attributes
    public String getLecturerName()
    {
        return LecturerName;
    }
    
    public String getLevel()
    {
        return Level;
    }
    
    public String getCredit()
    {
        return Credit;
    }
    
    public String getStartingDate()
    {
        return StartingDate;
    }
    
    public String getCompletionDate()
    {
        return CompletionDate;
    }
    
    public int getNumberOfAssessments()
    {
        return NumberOfAssessments;
    }
    
    public boolean getisRegistered()
    {
        return isRegistered;
    }
    
    //sets the value of LecturerName by passing newLecturerName parameter
    public void setLecturerName(String newLecturerName)
    {
        this.LecturerName = newLecturerName;
    }
    
    //sets the value of NumberOfAssignments by passing newNumberOfAssignments parameter
    public void setNumberOfAssessments(int newNumberOfAssessments)
    {
        this.NumberOfAssessments = newNumberOfAssessments;
    }
    
    //Registers the values of the attributes of AcademicCourse class of the given parameters
    public void Register(String CourseLeader, String LecturerName, String StartingDate, String CompletionDate)
    {
        /*
         * Conditional statement is used to check if a course has already been registered.
         * If it is not registered then parameter is passed.
         */
        if(isRegistered == true)
        {
            System.out.println("The academic course has already been registered.");
            System.out.println("The lecturer name is " + LecturerName + ".");
            System.out.println("The course starting date is " + StartingDate + ".");
            System.out.println("The course completion date is " + CompletionDate + ".");
        }
        else
        {
            super.setCourseLeader(CourseLeader);
            this.LecturerName = LecturerName;
            this.StartingDate = StartingDate;
            this.CompletionDate = CompletionDate;
            isRegistered = true;
        }
    }
    
    //Displays the values of the attributes of AcademicCourse class
    public void display()
    {
        /*
         * A call is made to parent class display method
         * Condiotional is used to check if a course is registered.
         */ 
        super.Display();
        if(isRegistered == true)
        {
            System.out.println("The lecturer name is " + LecturerName + ".");
            System.out.println("The level of the course is Level " + Level + ".");
            System.out.println("The credit of the course is " + Credit + " credits.");
            System.out.println("The course starting date is " + StartingDate + ".");
            System.out.println("The course completion date is " + CompletionDate + ".");
            System.out.println("The number of assessments given is " + NumberOfAssessments + ".");
        }
    }
}