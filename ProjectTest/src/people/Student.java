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
public class Student extends People implements Serializable, Pr{

    private int year, sta;
    private String pr;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public int gethPhone() {
        return hPhone;
    }

    public void sethPhone(int hPhone) {
        this.hPhone = hPhone;
    }

    public int getcPhone() {
        return cPhone;
    }

    public void setcPhone(int cPhone) {
        this.cPhone = cPhone;
    }
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSta() {
        return sta;
    }

    public void setSta(int sta) {
        this.sta = sta;
    }

    public String getPr() {
        return pr;
    }

    public void setPr(String pr) {
        this.pr = pr;
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
          this.getFirstName(), this.getLastName(),this.getDateOfBirth(), this.getPr(), this.getSta()
                ,this.getYear(), this.gethPhone(), this.getcPhone()
        };
    }

    
    
}
