package example.codeclan.com.shoppingbasket;



/**
 * Created by Andy Guppy on 05/02/2017.
 */

public class Item {

        private String name;
        private SpecialsEnum special;
        private int itemPrice;

    // Preload some items
        public static Item FireStick = new Item("Firestick", SpecialsEnum.NONE, 35);
        public static Item Xbox = new Item("Xbox", SpecialsEnum.NONE, 20);
        public static Item Melon = new Item("Melon", SpecialsEnum.BOGOF, 50);
        public static Item Lime = new Item("Lime", SpecialsEnum.B3F2, 15);

        public Item(String name, SpecialsEnum special, Integer itemPrice) {
            this.name = name;
            this.special = special;
            this.itemPrice = itemPrice;
        }

        public String getName() {
            return name;
        }


        public int getItemPrice() {
            return itemPrice;
        }


        public SpecialsEnum getSpecial() {
        return this.special;
        }

        public SpecialsEnum setSpecial(SpecialsEnum special) {
            this.special = special;
            return this.special;
        }

        public int setItemPrice(int itemPrice) {
            this.itemPrice = itemPrice;
        return this.itemPrice;
    }
}