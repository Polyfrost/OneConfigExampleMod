package cc.polyfrost.example;

import cc.polyfrost.example.command.ExampleCommand;
import cc.polyfrost.example.config.TestConfig;
import cc.polyfrost.oneconfig.events.event.InitializationEvent;
import cc.polyfrost.oneconfig.libs.eventbus.Subscribe;
import cc.polyfrost.oneconfig.utils.commands.CommandManager;

/**
 * The entrypoint of the Example Mod that initializes it.
 */
@net.minecraftforge.fml.common.Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod {
    @net.minecraftforge.fml.common.Mod.Instance("@ID@")
    public static ExampleMod INSTANCE;
    public static final String MODID = "@ID@";
    public static final String NAME = "@NAME@";
    public static final String VERSION = "@VER@";
    public static TestConfig config;

    // Register the config and commands.
    @Subscribe
    public void onInit(InitializationEvent event) {
        config = new TestConfig();
        CommandManager.INSTANCE.registerCommand(new ExampleCommand());
    }
}
