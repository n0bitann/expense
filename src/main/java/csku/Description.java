package csku;
/**
 * Thun Rutthanawin 5810401015
 */


public class Description {
    private String description;
    private int amount;
    private String type;



    public Description(String des,int amount,String type){
        this.amount = amount;
        this.description = des;
        this.type = type;
    }







    @Override
    public String toString() {
        return this.type + " " +this.description + " "+ this.amount;
    }
}
