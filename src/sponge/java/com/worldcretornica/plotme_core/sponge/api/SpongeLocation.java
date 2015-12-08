package com.worldcretornica.plotme_core.sponge.api;

import com.flowpowered.math.vector.Vector3d;
import com.worldcretornica.plotme_core.api.IBiome;
import com.worldcretornica.plotme_core.api.IBlock;
import com.worldcretornica.plotme_core.api.ILocation;
import com.worldcretornica.plotme_core.api.IWorld;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

public class SpongeLocation implements ILocation {

    private final Location location;

    public SpongeLocation(Location location) {
        this.location = location;
    }

    @Override
    public IWorld getWorld() {
        return new SpongeWorld((World) location.getExtent());
    }

    @Override
    public int getBlockX() {
        return location.getBlockX();
    }

    @Override
    public int getBlockY() {
        return location.getBlockY();
    }

    @Override
    public int getBlockZ() {
        return location.getBlockZ();
    }

    @Override
    public double getX() {
        return location.getPosition().getX();
    }

    @Override
    public void setX(double x) {
        Vector3d pos = this.location.getPosition();
        this.location.setPosition(new Vector3d(x, pos.getY(), pos.getZ()));
    }

    @Override
    public double getY() {
        return location.getPosition().getY();
    }

    @Override
    public void setY(double y) {
        Vector3d pos = this.location.getPosition();
        this.location.setPosition(new Vector3d(pos.getX(), y, pos.getZ()));
    }

    @Override
    public double getZ() {
        return location.getPosition().getZ();
    }
    
    @Override
    public void setZ(double z) {
        Vector3d pos = this.location.getPosition();
        this.location.setPosition(new Vector3d(pos.getX(), pos.getY(), z));
    }
    
    @Override
    public IBlock getBlock() {
        //return new SpongeBlockLoc(location.getBlock());
        return new IBlock() {

            @Override
            public ILocation getLocation() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public IWorld getWorld() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getX() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getY() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getZ() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getTypeId() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public IBiome getBiome() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setBiome(IBiome biome) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean setTypeIdAndData(short id, byte data, boolean applyPhysics) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public byte getData() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setTypeId(int id, boolean applyPhysics) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
    
    @Override
    public ILocation add(double x, double y, double z) {
        return new SpongeLocation(location.add(x, y, z));
    }
    
    @Override
    public ILocation subtract(double x, double y, double z) {
        return new SpongeLocation(location.add(-x, -y, -z));
    }
    
    @Override
    public ILocation clone() {
        return this; //not sure on this
    }

    public Location getLocation() {
        return location;
    }

    public Vector3d getPosition() {
        return location.getPosition();
    }
}