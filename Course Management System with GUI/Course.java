public class Course
{
        //Declaration of variables
        private String CourseID;
        private String CourseName;
        private String CourseLeader;
        private int CourseDuration;
        
        //Creating a constructor of Course
        public Course(String CourseID, String CourseName, int CourseDuration)
        {
            /*
             * this keyword is used to refer to instance variable
             * Assigning CourseLeader as empty string
             */
            this.CourseID = CourseID;
            this.CourseName = CourseName;
            this.CourseDuration = CourseDuration;
            CourseLeader = "";
            
        }
        
        //get accesses the value of attributes
        public String getCourseID()
        {
            return CourseID;
        }
        
        public String getCourseName()
        {
            return CourseName;
        }
        
        public String getCourseLeader()
        {
            return CourseLeader;
        }
        
        public int getCourseDuration()
        {
            return CourseDuration;
        }
        
        //sets the value of CourseLeader by passing newCourseLeader parameter
        public void setCourseLeader(String newCourseLeader)
        {
            this.CourseLeader = newCourseLeader;
        }
        
        //Displays the values of the attributes of course class
        public void Display()
        {
            System.out.println("The course ID is " + CourseID + ".");
            System.out.println("The name of the course is " + CourseName + ".");
            System.out.println("The duration of the course is " + CourseDuration + " years.");
            
            //Conditional statement is used to display CourseLeader if it has value
            if (CourseLeader!="")
            {
                System.out.println("The course leader is " + CourseLeader + ".");
            }
        }
}