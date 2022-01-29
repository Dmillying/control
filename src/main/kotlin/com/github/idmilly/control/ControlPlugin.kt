package com.github.idmilly.control

import io.papermc.paper.event.player.AsyncChatEvent
import net.md_5.bungee.api.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.block.BlockPlaceEvent
import org.bukkit.event.entity.EntityDamageByEntityEvent
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.event.inventory.CraftItemEvent
import org.bukkit.event.inventory.InventoryOpenEvent
import org.bukkit.event.player.*
import org.bukkit.plugin.java.JavaPlugin

class ControlPlugin : JavaPlugin(), Listener {
    override fun onEnable() {
        logger.info("${ChatColor.GREEN}control enable.")
        server.pluginManager.registerEvents(this, this)

        saveDefaultConfig()
    }

    private fun blockPlace(event: BlockPlaceEvent) {
        if (config.getBoolean("event.blockPlace") && !event.player.isOp) { event.isCancelled = true }
    }

    @EventHandler
    private fun blockBreak(event: BlockBreakEvent) {
        if (config.getBoolean("event.blockBreak") && !event.player.isOp) { event.isCancelled = true }
    }

    @EventHandler
    private fun playerInteract(event: PlayerInteractEvent) {
        if (config.getBoolean("event.playerInteract") && !event.player.isOp) { event.isCancelled = true }
    }

    @EventHandler
    private fun playerMove(event: PlayerMoveEvent) {
        if (config.getBoolean("event.playerMove") && !event.player.isOp) { event.isCancelled = true }
    }

    @EventHandler
    private fun playerPortal(event: PlayerPortalEvent) {
        if (config.getBoolean("event.playerPortal") && !event.player.isOp) { event.isCancelled = true }
    }

    @EventHandler
    private fun asyncChat(event: AsyncChatEvent) {
        if (config.getBoolean("event.asyncChat") && !event.player.isOp) { event.isCancelled = true }
    }

    @EventHandler
    private fun inventoryOpen(event: InventoryOpenEvent) {
        if (config.getBoolean("event.inventoryOpen") && !event.player.isOp) { event.isCancelled = true }
    }

    @EventHandler
    private fun playerJoinMessage(event: PlayerJoinEvent) {
        if (config.getBoolean("event.playerJoinMessage") && !event.player.isOp) { event.joinMessage(null) }
    }

    @EventHandler
    private fun playerQuitMessage(event: PlayerQuitEvent) {
        if (config.getBoolean("event.playerQuitMessage") && !event.player.isOp) { event.quitMessage(null) }
    }

    @EventHandler
    private fun craftItem(event: CraftItemEvent) {
        if (config.getBoolean("event.craftItem")) { event.isCancelled = true }
    }

    @EventHandler
    private fun entityDamage(event: EntityDamageEvent) {
        if (config.getBoolean("event.entityDamage")) { event.isCancelled = true }
    }

    @EventHandler
    private fun entityDamageByEntity(event: EntityDamageByEntityEvent) {
        if (config.getBoolean("event.entityDamageByEntity")) { event.isCancelled = true }
    }

    @EventHandler
    private fun playerCommandPreprocess(event: PlayerCommandPreprocessEvent) {
        if (config.getBoolean("event.playerCommandPreprocess") && !event.player.isOp) { event.isCancelled = true }
    }
}