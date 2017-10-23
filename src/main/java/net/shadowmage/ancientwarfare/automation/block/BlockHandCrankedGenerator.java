package net.shadowmage.ancientwarfare.automation.block;

import codechicken.lib.model.ModelRegistryHelper;
import codechicken.lib.model.bakery.CCBakeryModel;
import codechicken.lib.model.bakery.IBakeryProvider;
import codechicken.lib.model.bakery.generation.IBakery;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.property.IExtendedBlockState;
import net.shadowmage.ancientwarfare.automation.render.HandCrankedGeneratorRenderer;
import net.shadowmage.ancientwarfare.automation.tile.torque.TileHandCrankedGenerator;
import net.shadowmage.ancientwarfare.core.AncientWarfareCore;
import net.shadowmage.ancientwarfare.core.block.BlockRotationHandler.RotationType;

public class BlockHandCrankedGenerator extends BlockTorqueBase implements IBakeryProvider {

    protected BlockHandCrankedGenerator(String regName) {
        super(Material.ROCK, regName);
    }

    @Override
    public IBlockState getExtendedState(IBlockState state, IBlockAccess world, BlockPos pos) {
        return HandCrankedGeneratorRenderer.INSTANCE.handleState((IExtendedBlockState) state, world, pos);
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileHandCrankedGenerator();
    }

    @Override
    public RotationType getRotationType() {
        return RotationType.FOUR_WAY;
    }

    @Override
    public boolean invertFacing() {
        return false;
    }

    @Override
    public void registerClient() {
        super.registerClient();

        ModelLoader.setCustomStateMapper(this, new StateMapperBase() {
            @Override protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return HandCrankedGeneratorRenderer.MODEL_LOCATION;
            }
        });

        ModelRegistryHelper.register(HandCrankedGeneratorRenderer.MODEL_LOCATION, new CCBakeryModel(AncientWarfareCore.modID + ":model/automation/hand_cranked_generator") {
            @Override
            public TextureAtlasSprite getParticleTexture() {
                return HandCrankedGeneratorRenderer.INSTANCE.sprite;
            }
        });
    }

    @Override
    public IBakery getBakery() {
        return HandCrankedGeneratorRenderer.INSTANCE;
    }
}
