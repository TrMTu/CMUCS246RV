/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author TrMTu
 */
public class IOFile {

    public void input(ArrayList list, String fileName){
        try (
                FileOutputStream fos = new FileOutputStream(new File(fileName)); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list);
        } catch (Exception e) {
            System.out.println("Got An Exception1");
        }
    }

    public ArrayList outputPro(String file) {
        ArrayList<Professor> list = new ArrayList();
        try (FileInputStream out = new FileInputStream(new File(file)); ObjectInputStream oos = new ObjectInputStream(out)) {
            list = (ArrayList) oos.readObject();
        } catch (Exception e) {
            System.out.println("Got an exception2!");
        }
        return list;
    }
     public ArrayList outputStu(String file) {
        ArrayList<Student> list = new ArrayList();
        try (FileInputStream out = new FileInputStream(new File(file)); ObjectInputStream oos = new ObjectInputStream(out)) {
            list = (ArrayList) oos.readObject();
        } catch (Exception e) {
            System.out.println("Got an exception3!");
        }
        return list;
    }


}
