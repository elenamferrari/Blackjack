public class Card {
    public String suit;
    public int value;
    public String name;
    public boolean isDealt;


    public Card (int pSuit, int pName){
        if(pName==1) {
            name = "ace";
        }
        if(pName==2) {
            name = "two";
        }
        if(pName==3) {
            name = "three";
        }
        if(pName==4) {
            name = "four";
        }
        if(pName==5) {
            name = "five";
        }
        if(pName==6) {
            name = "six";
        }
        if(pName==7) {
            name = "seven";
        }
        if(pName==8) {
            name = "eight";
        }
        if(pName==9) {
            name = "nine";
        }
        if(pName==10) {
            name = "ten";
        }
        if(pName==11) {
            name = "jack";
        }
        if(pName==12) {
            name = "queen";
        }
        if(pName==13) {
            name = "king";
        }

        if(pSuit==0) {
            suit="diamonds";
        }
        else if(pSuit==1) {
            suit="clubs";
        }
        else if(pSuit==2) {
            suit="spades";
        }
        else if(pSuit==3) {
            suit="hearts";
        }
    }

    public void printCard() {
        System.out.println(name + " of " + suit);
    }
}
