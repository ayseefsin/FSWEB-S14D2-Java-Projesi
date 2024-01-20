public class Main {
    public static void main(String[] args) {
        Bed b1 = new Bed("soft",2,10);
        Carpet c1 = new Carpet(100,200);
        Ceiling ce1 = new Ceiling(100, PaintColor.BLUE);
        Lamp l1 = new Lamp(LampType.MEDIUM,true,5);
        Wall w1 = new Wall("north");
        Wall w2 = new Wall("south");
        Wall w3 = new Wall("east");
        Wall w4 = new Wall("west");
        Wardrobe ward1 = new Wardrobe(200,180,10.50);
        Bedroom bedroom = new Bedroom("aysin",w1,w2,w3,w4,ce1,b1,l1,ward1,c1 );
        System.out.println("bedroom: " + bedroom);
        System.out.println("bedroom wall 3 direction is " + w3.getDirection());
    }
}