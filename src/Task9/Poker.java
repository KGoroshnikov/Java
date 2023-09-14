package Task9;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n;
        n = scanner.nextInt();

        List<Card> cardArray = new ArrayList<Card>();
        for(int i = 0; i < 5 * n; i++)
            cardArray.add(new Card("Card" + i));
        Collections.shuffle(cardArray);

        Player[] players = new Player[n];
        for(int i = 0; i < n; i++)
            players[i] = new Player();

        for(int i = 0; i < n; i++){
            Card[] cards = new Card[5];
            for(int j = 0; j < 5; j++)
            {
                cards[j] = cardArray.get(0);
                cardArray.remove(0);
            }
            players[i].setMyCards(cards);
        }

        for (int i = 0; i < players.length; i++){
            System.out.print("Игрок " + (i + 1) + " : ");
            for(int j = 0; j < players[i].getMyCards().length; j++){
                System.out.print(players[i].getMyCards()[j].getName() + " ");
            }
            System.out.println();
        }
    }
}
