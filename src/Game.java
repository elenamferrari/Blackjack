public class Game {
    public Card card1;
    public Card[] deck;
    public int count = 0;
    public static void main(String[] args) {
//        Game myGame;
//        myGame = new Game();
        Game blackjack = new Game();
    }

    public Game() {
        deck = new Card[52];
        //deck[0] = new Card(1,1);
        //card1 = new Card(1,1);
        //card1.printCard();
        int curr=0;
        //deck[0].printCard();
        for(int w=0; w<4; w++) {
            for (int x = 1; x < 14; x++) {
                deck[curr] = new Card(w,x);
                deck[curr].printCard();
                curr++;
            }
        }
//        for(int x=0; x<deck.length;x++) {
//            deck[x].printCard();
//        }
        shuffle();
    }

    public void restartGame(){

    }

    public void shuffle(){
        Card[] shuffledDeck = new Card[52];

        for(int f=0; f<shuffledDeck.length; f++) {
            int randomCard = (int)(Math.random()*52);
            //System.out.println(randomCard);
            Card shuffleCard = deck[randomCard];
            while(deck[randomCard].isDealt==false) {
                randomCard = (int)(Math.random()*52);
                shuffleCard=deck[randomCard];
            }
            deck[randomCard].isDealt=true;
            shuffleCard.printCard();

            shuffledDeck[f] = shuffleCard;
        }
        deck=shuffledDeck;
    }
}
