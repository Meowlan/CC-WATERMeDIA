package de.meowlan.ccwatermedia.computercraft.implementation.peripherals;

import java.net.URI;
import java.net.URISyntaxException;

import dan200.computercraft.api.lua.LuaFunction;
import dan200.computercraft.api.peripheral.GenericPeripheral;
import me.srrapero720.waterframes.common.block.entity.DisplayTile;

public abstract class DisplayTilePeripheral implements GenericPeripheral {

   @LuaFunction(mainThread = true)
   final public String getUrl(DisplayTile frame) {
      return frame.data.uri.toString();
   }

   @LuaFunction(mainThread = true)
   final public Boolean setUrl(DisplayTile frame, String uri) {
      try {
         frame.data.uri = new URI(uri);
      } catch (URISyntaxException e) {
         return false;
      }

      frame.setDirty();

      return true;
   }

   @LuaFunction(mainThread = true)
   final public Boolean setActive(DisplayTile frame, boolean active) {
      frame.setActive(false, active);

      return true;
   }

   @LuaFunction(mainThread = true)
   final public Boolean getActive(DisplayTile frame) {
      return frame.data.active;
   }

   @LuaFunction(mainThread = true)
   final public Boolean setMute(DisplayTile frame, boolean mute) {
      frame.setMute(false, mute);

      return true;
   }

   @LuaFunction(mainThread = true)
   final public Boolean getMute(DisplayTile frame) {
      return frame.data.muted;
   }

   @LuaFunction(mainThread = true)
   final public Boolean setPause(DisplayTile frame, boolean pause) {
      frame.setPause(false, pause);

      return true;
   }

   @LuaFunction(mainThread = true)
   final public Boolean getPause(DisplayTile frame) {
      return frame.data.paused;
   }

   @LuaFunction(mainThread = true)
   final public Boolean setVolume(DisplayTile frame, int volume) {
      frame.data.volume = volume;
      frame.setDirty();

      return true;
   }

   @LuaFunction(mainThread = true)
   final public int getVolume(DisplayTile frame) {
      return frame.data.volume;
   }

   @LuaFunction(mainThread = true)
   final public Boolean setLoop(DisplayTile frame, boolean loop) {
      frame.loop(false, loop);

      return true;
   }

   @LuaFunction(mainThread = true)
   final public int getTick(DisplayTile frame) {
      return frame.data.tick;
   }

   @LuaFunction(mainThread = true)
   final public int getMaxTick(DisplayTile frame) {
      return frame.data.tickMax;
   }

   @LuaFunction(mainThread = true)
   final public Boolean setMaxTick(DisplayTile frame, int tickMax) {
      frame.data.tickMax = tickMax;
      frame.setDirty();

      return true;
   }

   @LuaFunction(mainThread = true)
   final public Boolean setTick(DisplayTile frame, int tick) {
      frame.data.tick = tick;
      frame.setDirty();

      return true;
   }

   @Override
   public abstract String id();
}
