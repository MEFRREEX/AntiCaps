package theoni.anticaps.listeners;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerChatEvent;

public class EventListener implements Listener {

    @EventHandler
    public void onChat(PlayerChatEvent event) {
        String message = event.getMessage();    
        message = message.trim().replaceAll("\\s+", " ");
        
        String[] words = message.split(" ");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
          String firstLetter = word.substring(0, 1);
          String restLetters = word.substring(1).toLowerCase();
          result.append(firstLetter).append(restLetters).append(" ");
        }

        event.setMessage(result.toString().trim());
    }
}
