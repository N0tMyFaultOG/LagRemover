/*
 * LagRemover - A simple plugin for Bukkit servers removing the annoying lag.
 * Copyright (C) NotMyFault 2021
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package de.n0tmyfaultog.lagremover

import org.bukkit.plugin.java.JavaPlugin
import org.bstats.bukkit.Metrics

class LagRemoverPlugin : JavaPlugin() {

    private val BSTATS_ID = 9667

    override fun onEnable() {
        val metrics = Metrics(this, BSTATS_ID)
        logger.info("LagRemover has started. Terminating the lag...")
    }

    override fun onDisable() {
        logger.info("The source of lag has been terminated.")
    }
}