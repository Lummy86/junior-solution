package ru.parsentev.models;


/**
 * TODO: comment
 *
 * @author parsentev
 * @since 22.05.2016
 */
public class Comment {
    private int id;
    private String desc;
    private int spent;
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getSpent() {
        return spent;
    }

    public void setSpent(int spent) {
        this.spent = spent;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", spent=" + spent +
                '}';
    }
}