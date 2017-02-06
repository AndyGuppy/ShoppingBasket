package example.codeclan.com.shoppingbasket;



/**
 * Created by Andy Guppy on 05/02/2017.
 */

public class Item {

        private String name;
        private Boolean Bogof;
        private double itemPrice;


        public Item(String name, Boolean bogof, double itemPrice) {
            this.name = name;
            this.Bogof = bogof;
            this.itemPrice = itemPrice;
        }

        public String getName() {
            return name;
        }


        public double getItemPrice() {
            return itemPrice;
        }


        public Boolean getBogof() {
        return this.Bogof;
        }

        public Boolean setBogof(Boolean bogof) {
            this.Bogof = bogof;
            return this.Bogof;
        }

        public double setItemPrice(double itemPrice) {
            this.itemPrice = itemPrice;
            return this.itemPrice;
    }
}