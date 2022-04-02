/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author TrMTu
 */
public class Professor extends People implements Serializable, Pr {

    private int rank, opNumber;
    private String oNumber, department;
    private People p;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    @Override
    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    @Override
    public int gethPhone() {
        return hPhone;
    }

    @Override
    public void sethPhone(int hPhone) {
        this.hPhone = hPhone;
    }

    @Override
    public int getcPhone() {
        return cPhone;
    }

    @Override
    public void setcPhone(int cPhone) {
        this.cPhone = cPhone;
    }
    
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getOpNumber() {
        return opNumber;
    }

    public void setOpNumber(int opNumber) {
        this.opNumber = opNumber;
    }

    public String getoNumber() {
        return oNumber;
    }

    public void setoNumber(String oNumber) {
        this.oNumber = oNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public People getP() {
        return p;
    }

    public void setP(People p) {
        this.p = p;
    }

    @Override
    public Object[] toObject() {
        return new Object[]{
          this.getFirstName(), this.getLastName(),this.getDateOfBirth(), this.getRank(), this.getDepartment()
                , this.getoNumber(), this.getOpNumber(), this.gethPhone(), this.getcPhone()
            
        };
    }

    
    
}
