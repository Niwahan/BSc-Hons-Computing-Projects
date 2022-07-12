// Importing elements for the program
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class INGCollege implements ActionListener
{
    // Initializing JFrame
    private JFrame f;
    
    // Initializing JPanels
    private JPanel p1,p2;
    
    // Initializing JLabels
    private JLabel Title1, Title2, JCourseID, JCourseName, JDuration, JLevel, JCredit, JNumberOfAssessments,
    JCourseID2, JLecturerName, JCourseLeader,JStartingDate, JCompletionDate, JCourseID1, JCourseName1, JDuration1, JPrerequisite,
    JCourseID3, JInstructorName, JCourseLeader1, JStartingDate1, JCompletionDate1, JExamDate, JCourseID4;
    
    // Initializing JTextFields
    private JTextField JCourseID_, JCourseName_, JDuration_, JCourseID2_, JLecturerName_, JCourseLeader_, JLevel_,
    JCredit_, JStartingDate_, JCompletionDate_, JNumberOfAssessments_, JCourseID1_, JCourseName1_, JDuration1_, JPrerequisite_, 
    JCourseID3_, JInstructorName_, JCourseLeader1_, JStartingDate1_, JCompletionDate1_, JExamDate_, JCourseID4_;
    
    // Initializing JButton
    private JButton Add, Register, Display, Clear, NextPage, Add1, Register1, Display1, Clear1, Remove,PreviousPage;

    // Creating a ArrayList with Course class generics 
    private ArrayList<Course>AL = new ArrayList<Course>();
    
    // Creating objects of Academic Course and Non-Academic Course
    private AcademicCourse AC;
    private NonAcademicCourse NAC;

    public INGCollege()
    {
        // Setting Jframe
        f = new JFrame("Course Registration");
        
        // Setting JPanels
        p1 = new JPanel();
        p2 = new JPanel();

        // Setting JLabels  for Adding Academic Course
        Title1 = new JLabel("Academic Course");
        JCourseID = new JLabel("Course ID : ");
        JCourseName = new JLabel("Course Name : ");
        JDuration = new JLabel("Duration : ");
        JLevel = new JLabel("Level : ");
        JCredit = new JLabel("Credit : ");
        JNumberOfAssessments = new JLabel("Number of Assessments :");

        // Setting JLabels for Adding Non-Academic Course
        Title2 = new JLabel("Non-Academic Course");
        JCourseID1 = new JLabel("Course ID : ");
        JCourseName1 = new JLabel("Course Name : ");
        JDuration1 = new JLabel("Duration : ");
        JPrerequisite = new JLabel("Prerequisite : ");

        // Setting JLabels for Registering Academic Course
        JCourseID2 = new JLabel("Course ID : ");
        JLecturerName = new JLabel("Lecturer Name : ");
        JCourseLeader = new JLabel("Course Leader : ");
        JStartingDate = new JLabel("Starting Date : ");
        JCompletionDate = new JLabel("Completion Date : ");

        // Setting JLabels for Registering Non-Academic Course
        JCourseID3 = new JLabel("Course ID : ");
        JInstructorName = new JLabel("Instructor Name : ");
        JCourseLeader1 = new JLabel("Course Leader : ");
        JStartingDate1 = new JLabel("Starting Date : ");
        JCompletionDate1 = new JLabel("Completion Date : ");
        JExamDate = new JLabel("Exam Date : ");
        
        // Setting JLabel for Removing Non-Academic Course
        JCourseID4 = new JLabel("Course ID : ");
        
        // Setting JTextFields for Adding Academic Course
        JCourseID_ = new JTextField();
        JCourseName_ = new JTextField();
        JDuration_ = new JTextField();
        JLevel_ = new JTextField();
        JCredit_ = new JTextField();
        JNumberOfAssessments_ = new JTextField();

        // Setting JTextFields for Adding Non-Academic Course
        JCourseID1_ = new JTextField();
        JCourseName1_ = new JTextField();
        JDuration1_ = new JTextField();
        JPrerequisite_ = new JTextField();
        
        // Setting JTextFields for Registering Academic Course
        JCourseID2_ = new JTextField();
        JLecturerName_ = new JTextField();
        JCourseLeader_ = new JTextField();
        JStartingDate_ = new JTextField();
        JCompletionDate_ = new JTextField();

        // Setting JTextFields for Registering Non-Academic Course
        JCourseID3_ = new JTextField();
        JInstructorName_ = new JTextField();
        JCourseLeader1_ = new JTextField();
        JStartingDate1_ = new JTextField();
        JCompletionDate1_ = new JTextField();
        JExamDate_ = new JTextField();
        
        // Setting JTextField for Removing Non-Academic Course
        JCourseID4_ = new JTextField();

        // Setting the visibility of the frame and panels
        f.setVisible(true);
        p1.setVisible(true);
        p2.setVisible(false);

        // Setting the layout of the frame and panels
        f.setLayout(null);
        p1.setLayout(null);
        p2.setLayout(null);

        // Setting the frame to non-resizable
        f.setResizable(false);
        
        // Setting the size of the frame and panels
        f.setSize(860,640);
        p1.setSize(860,640);
        p2.setSize(860,640);

        // Setting JButtons in Academic Course
        Add = new JButton("Add");
        Register = new JButton("Register");
        Display = new JButton("Display");
        Clear = new JButton("Clear");
        NextPage = new JButton("Next Page");

        // Setting JButtons in Non-Academic Course
        Add1 = new JButton("Add");
        Register1 = new JButton("Register");
        Display1 = new JButton("Display");
        Clear1 = new JButton("Clear");
        Remove = new JButton("Remove");
        PreviousPage = new JButton("Previous Page");

        // Setting the font, style and size of JLabels Titles
        Title1.setFont(new Font("Arial",Font.BOLD,25));
        Title2.setFont(new Font("Arial",Font.BOLD,25));

        // Setting the location for JLabels for Adding Academic Course
        Title1.setBounds(300,20,400,50);
        JCourseID.setBounds(40,100,120,25);
        JCourseName.setBounds(430,100,120,25);
        JDuration.setBounds(40,150,120,25);
        JLevel.setBounds(430,150,120,25);
        JCredit.setBounds(40,200,120,25);
        JNumberOfAssessments.setBounds(430,200,150,25);

        // Setting the location for JLabels for Adding Non-Academic Course
        Title2.setBounds(300,20,400,50);
        JCourseID1.setBounds(40,100,120,25);
        JCourseName1.setBounds(430,100,120,25);
        JDuration1.setBounds(40,150,120,25);
        JPrerequisite.setBounds(430,150,120,25);

        // Setting the location for JLabels for Registering Academic Course
        JCourseID2.setBounds(40,310,120,25);
        JLecturerName.setBounds(430,310,120,25);
        JCourseLeader.setBounds(40,360,120,25); 
        JStartingDate.setBounds(430,360,120,25);
        JCompletionDate.setBounds(40,410,120,25);

        // Setting the location for JLabels for Registering Non-Academic Course
        JCourseID3.setBounds(40,260,120,25);
        JInstructorName.setBounds(430,260,120,25);
        JCourseLeader1.setBounds(40,310,120,25);
        JStartingDate1.setBounds(430,310,120,25);
        JCompletionDate1.setBounds(40,360,120,25);
        JExamDate.setBounds(430,360,120,25);
        
        // Setting the location for JLabels for Removing Non-Academic Course
        JCourseID4.setBounds(40,460,120,25);

        // Setting the location for JTextFields for Adding Academic Course
        JCourseID_.setBounds(160,100,180,25);
        JCourseName_.setBounds(585,100,180,25);
        JDuration_.setBounds(160,150,180,25);
        JLevel_.setBounds(585,150,180,25);
        JCredit_.setBounds(160,200,180,25);
        JNumberOfAssessments_.setBounds(585,200,180,25);

        // Setting the location for JTextFields for Adding Non-Academic Course
        JCourseID1_.setBounds(160,100,180,25);
        JCourseName1_.setBounds(585,100,180,25);
        JDuration1_.setBounds(160,150,180,25);
        JPrerequisite_.setBounds(585,150,180,25);

        // Setting the location for JTextFields for Registering Academic Course
        JCourseID2_.setBounds(160,310,180,25);
        JLecturerName_.setBounds(585,310,180,25);
        JCourseLeader_.setBounds(160,360,180,25);
        JStartingDate_.setBounds(585,360,180,25);
        JCompletionDate_.setBounds(160,410,180,25);

        // Setting the location for JTextFields for Registering Non-Academic Course
        JCourseID3_.setBounds(160,260,180,25);
        JInstructorName_.setBounds(585,260,180,25);
        JCourseLeader1_.setBounds(160,310,180,25);
        JStartingDate1_.setBounds(585,310,180,25);
        JCompletionDate1_.setBounds(160,360,180,25);
        JExamDate_.setBounds(585,360,180,25);
        
        // Setting the location for JTextFields for Removing Non-Academic Course
        JCourseID4_.setBounds(160,460,180,25);

        // Setting the location for JButtons in Academic Course
        Add.setBounds(585,250,120,25);
        Register.setBounds(585,460,120,25);
        Display.setBounds(220,510,120,25);
        Clear.setBounds(380,510,120,25);
        NextPage.setBounds(540,510,120,25);

        // Setting the location for JButtons in Non-Academic Course
        Add1.setBounds(585,200,120,25);
        Register1.setBounds(585,410,120,25);
        Remove.setBounds(160,510,120,25);
        Display1.setBounds(220,560,120,25);
        Clear1.setBounds(380,560,120,25);
        PreviousPage.setBounds(540,560,120,25);

        // Adding JLabels, JTextFields and JButtons in panel p1
        p1.add(Title1);
        p1.add(JCourseID);
        p1.add(JCourseName);
        p1.add(JDuration);
        p1.add(JLevel);
        p1.add(JCredit);
        p1.add(JNumberOfAssessments);
        p1.add(JCourseID_);
        p1.add(JCourseName_);
        p1.add(JDuration_);
        p1.add(JLevel_);
        p1.add(JCredit_);
        p1.add(JNumberOfAssessments_);
        p1.add(Add);
        p1.add(JCourseID2);
        p1.add(JLecturerName);
        p1.add(JCourseLeader);
        p1.add(JStartingDate);
        p1.add(JCompletionDate);       
        p1.add(JCourseID2_);
        p1.add(JLecturerName_);
        p1.add(JCourseLeader_);        
        p1.add(JStartingDate_);
        p1.add(JCompletionDate_);        
        p1.add(Register);
        p1.add(Display);
        p1.add(Clear);
        p1.add(NextPage);

        // Adding JLabels, JTextFields and JButtons in panel p2
        p2.add(Title2);
        p2.add(JCourseID1);
        p2.add(JCourseName1);
        p2.add(JDuration1);
        p2.add(JPrerequisite);
        p2.add(JCourseID1_);
        p2.add(JCourseName1_);
        p2.add(JDuration1_);    
        p2.add(JPrerequisite_);
        p2.add(Add1);
        p2.add(JCourseID3);
        p2.add(JInstructorName);
        p2.add(JCourseLeader1);
        p2.add(JStartingDate1);
        p2.add(JCompletionDate1);
        p2.add(JExamDate);      
        p2.add(JCourseID3_);
        p2.add(JInstructorName_);
        p2.add(JCourseLeader1_);
        p2.add(JStartingDate1_);
        p2.add(JCompletionDate1_);
        p2.add(JExamDate_);      
        p2.add(Register1);
        p2.add(JCourseID4);
        p2.add(JCourseID4_);
        p2.add(Remove);
        p2.add(Display1);     
        p2.add(Clear1);
        p2.add(PreviousPage);

        // Adding panels to the frame
        f.add(p1);
        f.add(p2);
        
        // 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding action listener to all the JButtons
        Add.addActionListener(this);
        Add1.addActionListener(this);
        Register.addActionListener(this);
        Register1.addActionListener(this);
        Display.addActionListener(this);
        Display1.addActionListener(this);
        Remove.addActionListener(this);
        Clear.addActionListener(this);
        Clear1.addActionListener(this);
        NextPage.addActionListener(this);
        PreviousPage.addActionListener(this);
    }

    public void actionPerformed(ActionEvent A)
    {
        if(A.getSource()==Add)
        // Executing this block of code if Add is pressed
        {
            // Initializing the variables as empty and null
            String CourseID="";
            String CourseName="";
            int Duration = 0;
            String Level = "";
            int Credit = 0;
            int NumberOfAssessments = 0;            
            try
            // Using try block to check for exceptions
            {
                /*
                 *  Using .getText() to get the values from the text field
                 *  and assigning it to its respective variables
                 */
                CourseID = JCourseID_.getText();
                CourseName = JCourseName_.getText();
                Duration = Integer.parseInt(JDuration_.getText());
                Level = JLevel_.getText();
                Credit = Integer.parseInt(JCredit_.getText());
                NumberOfAssessments = Integer.parseInt(JNumberOfAssessments_.getText());
                
                // Assigning boolean value to false
                boolean SameAC = false;
                for(Course C:AL)
                // Iterating through the arraylist
                {
                    if (C.getCourseID().equals(CourseID))
                    // Checks if the values are equal and executes the code
                    {
                        SameAC = true;          
                    }
                }   
                if(SameAC==false)
                // Checks if the boolean value is false and executes the code
                {
                    AC = new AcademicCourse(CourseID,CourseName,Duration,Level,Credit,NumberOfAssessments);
                    AL.add(AC);
                    JOptionPane.showMessageDialog(f,"The Academic Course has been added.");
                }
                else
                // Executing the else block if the if block does not execute
                {
                    JOptionPane.showMessageDialog(f,"The Academic Course has already been added.");
                }
            }
            catch(NumberFormatException e)
            // Using catch block to handle exceptions
            {
                JOptionPane.showMessageDialog(p1,"Please fill up the form properly !","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (A.getSource()==Add1)
        // Executing this block of code if Add1 is pressed
        {           
            // Initializing the variables as empty and null
            String CourseID = "";
            String CourseName = "";
            int Duration=0;
            String Prerequisite = "";
            try
            // Using try block to check for exceptions
            {
                /*
                 *  Using .getText() to get the values from the text field
                 *  and assigning it to its respective variables
                 */
                CourseID = JCourseID1_.getText();
                CourseName = JCourseName1_.getText();
                Duration = Integer.parseInt(JDuration1_.getText());
                Prerequisite = JPrerequisite_.getText();  
                boolean SameNAC = false;
                for(Course C:AL)
                // Iterating through the arraylist
                {
                    if(C.getCourseID().equals(CourseID))
                    // Checks if the values are equal and executes the code
                    {
                        SameNAC = true;    
                    }
                }
                if(SameNAC == false)
                // Checks if the boolean value is false and executes the code
                {
                    NAC = new NonAcademicCourse(CourseID, CourseName, Duration, Prerequisite);
                    AL.add(NAC);
                    JOptionPane.showMessageDialog(f,"The Non-Academic Course is added.");
                }
                else
                // Executing the else block if the if block does not execute
                {
                    JOptionPane.showMessageDialog(f,"The Non-Academic Course has already been added");
                }
            }
            catch(NumberFormatException e)
            // Using catch block to handle exceptions
            {
                JOptionPane.showMessageDialog(f,"Please fill up the form properly !","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }

        else if (A.getSource()==Register)
        // Executing this block of code if Register is pressed
        {
            // Initializing the variables as empty and null
            String CourseID = "";
            String CourseLeader = "";
            String LecturerName = "";
            String StartingDate = "";
            String CompletionDate = "";
            try
            // Using try block to check for exceptions
            {
                /*
                 *  Using .getText() to get the values from the text field
                 *  and assigning it to its respective variables
                 */
                CourseID = JCourseID2_.getText();
                CourseLeader = JCourseLeader_.getText();
                LecturerName = JLecturerName_.getText();
                StartingDate = JStartingDate_.getText();
                CompletionDate = JCompletionDate_.getText();
                boolean SameAC1 = false;
                for(Course CO:AL)
                // Iterating through the arraylist
                {
                    if(AC.getCourseID().equals(CourseID))
                    // Checks if the values are equal and executes the code
                    {
                        SameAC1 = true;
                        if (CO instanceof AcademicCourse)
                        // Executing the code if CO is object of subclass
                        {
                            // Downcasting to access the method of subclass
                            AC = (AcademicCourse) CO;
                            if (AC.getisRegistered()==true)
                            // Checks if the boolean value is true and executes the code
                            {
                                JOptionPane.showMessageDialog(f,"The academic Course has already been registered.");
                            }
                            else
                            // Executing the else block if the if block does not execute
                            {
                                AC.Register(LecturerName, CourseLeader, StartingDate, CompletionDate);
                                JOptionPane.showMessageDialog(f,"The Academic Course has been registered.");                                
                            }
                        }
                    }
                    else
                    // Executing the else block if the if block does not execute
                    {
                       JOptionPane.showMessageDialog(f,"The CourseID do not match.","Alert",JOptionPane.WARNING_MESSAGE);
                       break;
                    }
                }
            }
            catch (NumberFormatException e)
            // Using catch block to handle exceptions
            {
                JOptionPane.showMessageDialog(p1,"Please fill up the forms properly !","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }

        else if (A.getSource()==Register1)
        // Executing this block of code if Register1 is pressed
        {
            // Initializing the variables as empty and null
            String CourseID = "";
            String CourseLeader = "";
            String InstructorName = "";
            String StartingDate = "";
            String CompletionDate = "";
            String ExamDate = "";
            try
            // Using try block to check for exceptions
            {
                /*
                 *  Using .getText() to get the values from the text field
                 *  and assigning it to its respective variables
                 */
                CourseID = JCourseID3_.getText();
                CourseLeader = JCourseLeader1_.getText();
                InstructorName = JLecturerName_.getText();
                StartingDate = JStartingDate1_.getText();
                CompletionDate = JCompletionDate1_.getText();
                ExamDate = JExamDate_.getText();
                boolean SameNAC1 = false;
                for(Course CO:AL)
                // Iterating through the arraylist
                {
                    if(NAC.getCourseID().equals(CourseID))
                    // Checks if the values are equal and executes the code
                    {
                        SameNAC1 = true;
                        if (CO instanceof NonAcademicCourse)
                        // Executing the code if CO is object of subclass
                        {
                            // Downcasting to access the method of subclass
                            NAC = (NonAcademicCourse)CO;
                            if (NAC.getisRegistered()==true)
                            // Checks if the boolean value is true and executes the code
                            {
                                JOptionPane.showMessageDialog(f,"The Non-Academic Course has already been registered.");
                            }
                            else
                            // Executing the else block if the if block does not execute
                            {
                                NAC.Register(CourseLeader, InstructorName, StartingDate, CompletionDate, ExamDate);
                                JOptionPane.showMessageDialog(f,"The Non-Academic Course has been registered.");   
                            }
                        }
                    }
                    else 
                    // Executing the else block if the if block does not execute
                    {
                        JOptionPane.showMessageDialog(f,"The CourseID do not match.","Alert",JOptionPane.WARNING_MESSAGE);
                        break;
                    }    
                }
            }
            catch(NumberFormatException e)
            // Using catch block to handle exceptions
            {
                JOptionPane.showMessageDialog(f,"Please fill up the form properly !","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (A.getSource()==Remove)
        // Executing this block of code if Remove is pressed
        {
            String CourseID = JCourseID4_.getText();
            try{
                // Using try block to check for exceptions
                for(Course C:AL)
                // Iterating through the arraylist
                {
                    if(NAC.getCourseID().equals(CourseID))
                    // Checks if the values are equal and executes the code
                    {
                        if(C instanceof NonAcademicCourse)
                        // Executing the code if C is object of subclass
                        {
                            // Downcasting to access the method of subclass
                            NAC=(NonAcademicCourse)C;
                            if(NAC.getisRemoved()==false)
                            // Checks if the boolean value is false and executes the code
                            {
                                NAC.Remove();
                                JOptionPane.showMessageDialog(f,"The Course has been removed.");
                            }
                            else if(NAC.getisRemoved()==true)
                            // Checks if the boolean value is true and executes the code
                            {
                                JOptionPane.showMessageDialog(f,"The Course has already been removed.");
                            }
                        }
                    }
                    else
                    // Executing the else block if the if block does not execute
                    {
                        JOptionPane.showMessageDialog(f,"Enter valid CourseID","Alert",JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                }
            }
            catch (Exception e)
            // Using catch block to handle exceptions
            {
                JOptionPane.showMessageDialog(f,"Please fill up the form properly !","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (A.getSource()==Display)
        // Executing this block of code if Display is pressed
        {
            for(Course CO:AL)
            // Iterating through the arraylist
            {
                if(CO instanceof AcademicCourse)
                {
                    AcademicCourse AC = (AcademicCourse)CO;
                    AC.Display();
                }
            } 
        }
        else if (A.getSource()==Display1)
        // Executing this block of code if Display is pressed
        {
            for(Course CO:AL)
            // Iterating through the arraylist
            {
                if(CO instanceof NonAcademicCourse)
                {
                    NonAcademicCourse NAC = (NonAcademicCourse)CO;
                    NAC.Display();
                }
            }
        }

        else if (A.getSource()==Clear)
        // Executing this block of code if Clear is pressed
        {
            // Assigning empty strings to JTextFields
            JCourseID_.setText("");
            JCourseName_.setText("");
            JDuration_.setText("");
            JLevel_.setText("");
            JCredit_.setText("");
            JNumberOfAssessments_.setText("");
            JCourseID2_.setText("");
            JLecturerName_.setText("");
            JCourseLeader_.setText("");          
            JStartingDate_.setText("");
            JCompletionDate_.setText("");         
        }
        else if (A.getSource()==Clear1)
        // Executing this block of code if Clear1 is pressed
        {
            // Assigning empty strings to JTextFields
            JCourseID1_.setText("");
            JCourseName1_.setText("");
            JDuration1_.setText("");
            JPrerequisite_.setText("");
            JCourseID3_.setText("");
            JInstructorName_.setText("");
            JCourseLeader1_.setText("");
            JStartingDate1_.setText("");
            JCompletionDate1_.setText("");
            JExamDate_.setText("");  
            JCourseID4_.setText("");
        }
        else if(A.getSource()==NextPage)
        // Executing this block of code if NextPage is pressed
        {
            // Setting the visibility of p1 to false and p2 to true
            p1.setVisible(false);
            p2.setVisible(true); 
        } 
        else if(A.getSource()==PreviousPage)
        // Executing this block of code if PreviousPage is pressed
        {
            // Setting the visibility of p2 to false and p1 to true
            p2.setVisible(false);
            p1.setVisible(true);
        }
    }

    public static void main(String[]args)
    {
        new INGCollege();
    }
}