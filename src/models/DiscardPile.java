package models;

import java.util.ArrayList;
import java.util.Stack;

public class DiscardPile {
    private Stack<Card> discardPile;

    public DiscardPile(){
        discardPile = new Stack<>();
    }

    public void push(Card card) {
        this.discardPile.push(card);
    }

    public Stack<Card> getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(Stack<Card> discardPile) {
        this.discardPile = discardPile;
    }

    public boolean checkCard(Card dropCard) {
        Card topCard = this.discardPile.peek();
        return topCard.getValue().equals(dropCard.getValue()) || topCard.getCardSuit().equals(dropCard.getCardSuit());
    }

    public void showTopCard() {
        Card currCard = this.discardPile.peek();
        System.out.print("--------------------(");
        System.out.print("Current card is " + currCard.getValue() + " of " + currCard.getCardSuit());
        System.out.print(")--------------------");
        System.out.println();
    }

    public Card getTopCard() {
        return this.discardPile.peek();
    }
}
