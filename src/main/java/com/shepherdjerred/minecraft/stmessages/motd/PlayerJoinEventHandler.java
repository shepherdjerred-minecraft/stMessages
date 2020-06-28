package com.shepherdjerred.minecraft.stmessages.motd;

import com.shepherdjerred.minecraft.stmessages.configuration.Configuration;
import lombok.AllArgsConstructor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

@AllArgsConstructor
public class PlayerJoinEventHandler implements Listener {
  private final Configuration configuration;

  @EventHandler
  public void onJoin(PlayerJoinEvent event) {
    var player = event.getPlayer();
    player.sendMessage(configuration.getMessageOfTheDay());
  }
}
