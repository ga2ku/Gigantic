package com.github.unchama.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemBreakEvent;

import com.github.unchama.growthtool.GrowthTool;

public class PlayerItemBreakListener implements Listener {
	@EventHandler(priority = EventPriority.LOWEST)
	public void growthToolEvent(PlayerItemBreakEvent event) {
		GrowthTool.onEvent(event);
	}
}
