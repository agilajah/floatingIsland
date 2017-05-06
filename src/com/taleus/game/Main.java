package com.taleus.game;

import com.taleus.renderEngine.GameEngine;
import com.taleus.renderEngine.IGameLogic;

/**
 * Created by Febi Agil Ifdillah on 06/05/2017.
 */

public class Main {

    public static void main(String[] args) {
        try {
            boolean vSync = true;
            IGameLogic gameLogic = new DummyGame();
            GameEngine gameEng = new GameEngine("ITB MAP", 600, 480, vSync, gameLogic);
            gameEng.start();
        } catch (Exception excp) {
            excp.printStackTrace();
            System.exit(-1);
        }
    }
}
