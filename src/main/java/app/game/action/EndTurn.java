package app.game.action;

import app.game.model.GameModel;
import app.game.model.GameProperty;
import app.game.model.Player;

/**
 * Created by james on 11/26/16.
 */
public class EndTurn implements Action {

    private String message;

    public String getMessage() {
        return message;
    }

    public boolean isLegal(GameModel model) {
        return true;
    }
    public void apply(GameModel model) {
        // stub
    }
}
