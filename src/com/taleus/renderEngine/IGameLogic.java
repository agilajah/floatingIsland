package com.taleus.renderEngine;

/**
 * Created by Febi Agil Ifdillah on 06/05/2017.
 */
public interface IGameLogic {

    void init() throws Exception;

    void input(Window window);

    void update(float interval);

    void render(Window window);

    void cleanup();
}
