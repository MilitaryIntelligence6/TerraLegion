package com.jmrapp.terralegion.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jmrapp.terralegion.PhysicsGame;
import com.jmrapp.terralegion.engine.utils.Settings;

/**
 * @author javaman
 */
public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        PhysicsGame.instantiateSettings();
        config.width = Settings.getWidth();
        config.height = Settings.getHeight();
        new LwjglApplication(new PhysicsGame(), config);
    }
}
