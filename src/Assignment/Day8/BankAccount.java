/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day8;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class BankAccount  implements Comparable<BankAccount>{

    private static int autoId = 0;
    private String name;
    private double balance;
    private Date created;

    public BankAccount(String name, double balance, Date created) {
        this.name = name;
        this.balance = balance;
        this.created = created;
        autoId++;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        BankAccount.autoId = autoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "name=" + name + ", balance=" + balance + ", created=" + created + '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof BankAccount) {
            BankAccount b = (BankAccount) obj;
            if (b.getBalance() == balance) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(BankAccount o) {
        if(balance < o.balance){
            return -1;
        }
        if(balance < o.balance){
            return 1;
        }
        if(balance == o.balance){
            return 0;
        }
        return 1;
    }
    

}
