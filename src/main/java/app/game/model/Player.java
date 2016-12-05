package app.game.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by james on 11/26/16.
 */
public class Player {
    private Character character;
    private List<Card> hand;
    private boolean computerPlayer;

    public Player(Character character) {
        this.character = character;
        hand = new LinkedList<>();
        computerPlayer = false;
    }

    public Player() {
        this.character = null;
        hand = new LinkedList<>();
        computerPlayer = false;
    }
    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public boolean acceptCard(Card card) {
        for (Iterator<Card> iter = hand.iterator(); iter.hasNext();) {
            Card next = iter.next();
            if (next.equals(card)) {
                return false;
            }
        }
        hand.add(card);
        return true;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public boolean isComputerPlayer() {
        return computerPlayer;
    }

    public void setComputerPlayer(boolean computer) {
        computerPlayer = computer;
    }

    @Override
    public boolean equals(Object obj) {
        boolean equal = false;
        return equal;
    }

    public boolean controls(Character character) {
        if (this.character == null) {
            return false;
        } else {
            return this.character.getName().equals(character.getName());
        }
    }

    public String toVisualString() {
        StringBuilder sb = new StringBuilder(32);
        if (character == null) {
            sb.append("Player not yet set");
        } else {
            sb.append(character.getName());
            sb.append(": ");
            List<String> handList = new ArrayList<>();
            for (Card card : hand) {
                handList.add(card.name);
            }
            sb.append(String.join(", ", handList));
            if (hand.isEmpty()) {
                sb.append("no cards yet");
            }
        }
        return sb.toString();
    }
}
