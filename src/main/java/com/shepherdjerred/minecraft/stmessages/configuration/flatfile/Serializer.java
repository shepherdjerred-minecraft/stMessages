package com.shepherdjerred.minecraft.stmessages.configuration.flatfile;

import com.shepherdjerred.minecraft.stmessages.configuration.Configuration;

public interface Serializer {
  String serialize(Configuration configuration);

  Configuration deserialize(String string);
}
