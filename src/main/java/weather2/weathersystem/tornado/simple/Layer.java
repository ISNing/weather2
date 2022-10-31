package weather2.weathersystem.tornado.simple;

import extendedrenderer.particle.entity.PivotingParticle;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.List;

public class Layer {

    @OnlyIn(Dist.CLIENT)
    private List<PivotingParticle> listParticles = new ArrayList<>();
    @OnlyIn(Dist.CLIENT)
    private List<PivotingParticle> listParticlesExtra = new ArrayList<>();
    private Vec3 pos = Vec3.ZERO;

    public Layer(Vec3 pos) {
        this.pos = new Vec3(pos.x, pos.y, pos.z);
    }

    @OnlyIn(Dist.CLIENT)
    public List<PivotingParticle> getListParticles() {
        return listParticles;
    }

    @OnlyIn(Dist.CLIENT)
    public void setListParticles(List<PivotingParticle> listParticles) {
        this.listParticles = listParticles;
    }

    @OnlyIn(Dist.CLIENT)
    public List<PivotingParticle> getListParticlesExtra() {
        return listParticlesExtra;
    }

    @OnlyIn(Dist.CLIENT)
    public void setListParticlesExtra(List<PivotingParticle> listParticlesExtra) {
        this.listParticlesExtra = listParticlesExtra;
    }

    public Vec3 getPos() {
        return pos;
    }

    public void setPos(Vec3 pos) {
        this.pos = pos;
    }
}
