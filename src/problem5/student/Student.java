/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {

    private int backlogCount;

    private String studentName;

    public Student(int backlogCount, String studentName) {

        this.backlogCount = backlogCount;

        this.studentName = studentName;

    }

    public int getBacklogCount() {


        return backlogCount;
    }

    public void setBacklogCount(int backlogCount) {

        this.backlogCount = backlogCount;

    }

    public String getStudentName() {

        return studentName;

    }

    public void setStudentName(String studentName) {

        this.studentName = studentName;

    }

}