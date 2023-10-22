package org.polyfrost.example.command;

import org.polyfrost.example.ExampleMod;
import cc.polyfrost.oneconfig.utils.commands.annotations.Command;
import cc.polyfrost.oneconfig.utils.commands.annotations.Main;

/**
 * An example command implementing the Command api of OneConfig.
 * Registered in ExampleMod.java with `CommandManager.INSTANCE.registerCommand(new ExampleCommand());`
 *
 * @see Command
 * @see Main
 * @see ExampleMod
 */
@Command(value = ExampleMod.MODID, description = "Access the " + ExampleMod.NAME + " GUI.")
public class ExampleCommand {
    @Main
    private void handle() {
        ExampleMod.INSTANCE.config.openGui();
    }
}