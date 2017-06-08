/*
 * Student.java
 */

package bo.edu.ucbcba.simplescheduling.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Student {

    private int studentId;
    private String lastName;
    private String firstName;
    private String classCodes;

    public Student() {
         classCodes = lastName = firstName = "";
       
    }

    public Student(int studentId, String lastName, String firstName) {
        this.studentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the classCodes
     */
    public String getClassCodes() {
        return classCodes;
    }

    /**
     * @param classCodes the classCodes to set
     */
    public void setClassCodes(String classCodes) {
        this.classCodes = classCodes;
    }
    
   
}
