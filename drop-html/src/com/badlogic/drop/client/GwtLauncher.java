package com.badlogic.drop.client;

import com.badlogic.drop.Drop;

public class GwtLauncher extends GwtApplication {
   @Override
   public GwtApplicationConfiguration getConfig () {
      GwtApplicationConfiguration cfg = new GwtApplicationConfiguration(800, 480);
      return cfg;
   }

   @Override
   public ApplicationListener getApplicationListener () {
      return new Drop();
   }
}