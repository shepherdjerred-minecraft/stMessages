package com.shepherdjerred.minecraft.stmessages;

import com.shepherdjerred.minecraft.stmessages.configuration.Configuration;
import com.shepherdjerred.minecraft.stmessages.configuration.flatfile.FlatfileConfigurationGetter;
import com.shepherdjerred.minecraft.stmessages.configuration.flatfile.JsonSerializer;
import com.shepherdjerred.minecraft.stmessages.motd.PlayerJoinEventHandler;
import java.io.IOException;
import lombok.SneakyThrows;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class Main extends JavaPlugin {

  @SneakyThrows
  @Override
  public void onEnable() {
    var configuration = getConfiguration();
    getServer().getPluginManager().registerEvents(new PlayerJoinEventHandler(configuration), this);
  }

  private Configuration getConfiguration() throws IOException {
    var path = getDataFolder() + "/configuration.json";
    var serializer = new JsonSerializer();
    var configurationGetter = new FlatfileConfigurationGetter(serializer, path);
    return configurationGetter.getConfiguration();
  }
}
