package theoni.anticaps;

import cn.nukkit.plugin.PluginBase;
import theoni.anticaps.listeners.EventListener;

public class Main extends PluginBase {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new EventListener(), this);
    }
}
