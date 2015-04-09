package com.worldcretornica.plotme_core.bukkit;

import com.worldcretornica.plotme_core.PlotId;
import com.worldcretornica.plotme_core.api.ILocation;
import com.worldcretornica.plotme_core.api.IPlayer;
import com.worldcretornica.plotme_core.api.IPlotMe_GeneratorManager;
import com.worldcretornica.plotme_core.bukkit.api.IBukkitPlotMe_GeneratorManager;
import com.worldcretornica.schematic.Schematic;

import java.util.List;

public class BukkitPlotMe_GeneratorManagerBridge implements IPlotMe_GeneratorManager {

    private final IBukkitPlotMe_GeneratorManager generatorManager;

    public BukkitPlotMe_GeneratorManagerBridge(IBukkitPlotMe_GeneratorManager generatorManager) {
        this.generatorManager = generatorManager;
    }

    @Override
    public PlotId getPlotId(ILocation location) {
        return generatorManager.getPlotId(location);
    }

    @Override
    public PlotId getPlotId(IPlayer player) {
        return generatorManager.getPlotId(player);
    }

    @Override
    public List<IPlayer> getPlayersInPlot(PlotId id) {
        return generatorManager.getPlayersInPlot(id);
    }

    @Override
    public void fillRoad(PlotId id1, PlotId id2) {
        generatorManager.fillRoad(id1, id2);
    }

    @Override
    public void fillMiddleRoad(PlotId id1, PlotId id2) {
        generatorManager.fillMiddleRoad(id1, id2);
    }

    @Override
    public void setOwnerDisplay(PlotId id, String line1, String line2, String line3, String line4) {
        generatorManager.setOwnerDisplay(id, line1, line2, line3, line4);
    }

    @Override
    public void setSellerDisplay(PlotId id, String line1, String line2, String line3, String line4) {
        generatorManager.setSellerDisplay(id, line1, line2, line3, line4);
    }


    @Override
    public void removeOwnerDisplay(PlotId id) {
        generatorManager.removeOwnerDisplay(id);
    }

    @Override
    public void removeSellerDisplay(PlotId id) {
        generatorManager.removeSellerDisplay(id);
    }

    @Override
    public ILocation getPlotBottomLoc(PlotId id) {
        return generatorManager.getPlotBottomLoc(id);
    }

    @Override
    public ILocation getPlotTopLoc(PlotId id) {
        return generatorManager.getPlotTopLoc(id);
    }

    @Override
    public void refreshPlotChunks(PlotId id) {
        generatorManager.refreshPlotChunks(id);
    }

    @Override
    public ILocation getTop(PlotId id) {
        return generatorManager.getTop(id);
    }

    @Override
    public ILocation getBottom(PlotId id) {
        return generatorManager.getBottom(id);
    }

    @Override
    public Long[] clear(PlotId id, long maxBlocks, Long[] start) {
        return generatorManager.clear(id, maxBlocks, start);
    }

    @Override
    public void adjustPlotFor(PlotId id, boolean claimed, boolean protect, boolean forSale) {
        generatorManager.adjustPlotFor(id, claimed, protect, forSale);
    }

    @Override
    public boolean isBlockInPlot(PlotId id, ILocation blockLocation) {
        return generatorManager.isBlockInPlot(id, blockLocation);
    }

    @Override
    public boolean movePlot(PlotId idFrom, PlotId idTo) {
        return generatorManager.movePlot(idFrom, idTo);
    }

    @Override
    public int bottomX(PlotId id) {
        return generatorManager.bottomX(id);
    }

    @Override
    public int bottomZ(PlotId id) {
        return generatorManager.bottomZ(id);
    }

    @Override
    public int topX(PlotId id) {
        return generatorManager.topX(id);
    }

    @Override
    public int topZ(PlotId id) {
        return generatorManager.topZ(id);
    }

    @Override
    public ILocation getPlotHome(PlotId id) {
        return generatorManager.getPlotHome(id);
    }

    @Override
    public int getPlotSize() {
        return generatorManager.getPlotSize();
    }

    @Override
    public int getGroundHeight() {
        return generatorManager.getGroundHeight();
    }

    @Override
    public ILocation getPlotMiddle(PlotId id) {
        return generatorManager.getPlotMiddle(id);
    }

    @Override
    public Schematic getPlotSchematic(PlotId id) {
        return generatorManager.getPlotSchematic(id);
    }
}
