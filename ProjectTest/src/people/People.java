/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author TrMTu
 */
public class People implements Serializable, Pr{

    protected String firstName, lastName;
    protected Date DateOfBirth;
    protected int hPhone, cPhone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

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

    @Override
    public Object[] toObject() {
        return new Object[]{
          this.getFirstName(), this.getLastName(), this.getcPhone(), this.gethPhone(), this.getDateOfBirth()
        };
    }

    }
