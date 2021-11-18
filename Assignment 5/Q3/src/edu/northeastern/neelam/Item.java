package edu.northeastern.neelam;

public class Item {
    private String Id;
    private int price;
    public Item(String Id, int cost){
        this.Id=Id;
        this.price=cost;
    }
    public String getId(){
        return Id;
    }
    public int getPrice(){
        return price;
    }
}
