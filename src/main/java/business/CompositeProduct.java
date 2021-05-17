package business;

import java.util.ArrayList;

public class CompositeProduct extends MenuItem {
    private ArrayList<MenuItem> list = new ArrayList<MenuItem>();

    public CompositeProduct() {
    }

    public CompositeProduct(String title, float rating, int calories, int proteins, int fats, int sodium) {
        super(title, rating, calories, proteins, fats, sodium, 0);
    }

    public float computePrice() {
        int t = 0;
        for (MenuItem menuItem : list) {
            t += menuItem.getPrice();
        }
        super.setPrice(t);
        return t;
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    public ArrayList<MenuItem> getList() {
        return list;
    }

    public void setList(ArrayList<MenuItem> list) {
        this.list = list;
    }
}
