/**
 * Thun Rutthanawin 5810401015
*/

package csku;


import java.util.ArrayList;


public class Account {
    private int money;
    private int totalIncome;
    private int totalSpend;

    private ArrayList<Description> descriptions = new ArrayList<>();


    public Account(){
        this.money = 0;
    }
    public Account(int money){
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void recieve(int money){
        this.money += money;
    }
    public void spend(int money){
        if(this.money >= money){
            this.money -= money;
        }
    }

    public void addToIncome(int amount){
        this.totalIncome += amount;
    }

    public void addToSpend(int amount){
        this.totalSpend += amount;

    }

    public int getTotalSpend() {
        return this.totalSpend;
    }
    public int getTotalIncome(){
        return this.totalIncome;
    }

    public void addDescription(Description des){
        this.descriptions.add(des);

    }
    public void showDescription(){
        for (Description des:descriptions
             ) {
            System.out.println(des);
        }
    }

    public String getDescription(){
        return descriptions.toString();
    }
}
