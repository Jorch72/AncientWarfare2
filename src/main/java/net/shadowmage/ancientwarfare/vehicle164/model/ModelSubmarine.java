//auto-generated model template
//template generated by MEIM
//template v 1.0
//author Shadowmage45 (shadowage_catapults@hotmail.com)

package shadowmage.ancient_warfare.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import shadowmage.ancient_warfare.common.utils.Trig;

public class ModelSubmarine extends ModelVehicleBase {

	ModelRenderer bottom;
	ModelRenderer left;
	ModelRenderer top1;
	ModelRenderer frontB1;
	ModelRenderer frontT1;
	ModelRenderer frontB2;
	ModelRenderer frontB3;
	ModelRenderer frontB4;
	ModelRenderer frontR1;
	ModelRenderer frontR2;
	ModelRenderer frontR3;
	ModelRenderer frontR4;
	ModelRenderer frontR5;
	ModelRenderer frontB5;
	ModelRenderer left1;
	ModelRenderer frontB6;
	ModelRenderer frontB7;
	ModelRenderer frontTip;
	ModelRenderer frontR6;
	ModelRenderer frontR7;
	ModelRenderer top2;
	ModelRenderer frontT2;
	ModelRenderer frontT3;
	ModelRenderer frontT4;
	ModelRenderer frontT5;
	ModelRenderer frontT6;
	ModelRenderer frontT7;
	ModelRenderer frontL3;
	ModelRenderer frontL1;
	ModelRenderer frontL2;
	ModelRenderer frontL4;
	ModelRenderer frontL5;
	ModelRenderer frontL6;
	ModelRenderer frontL7;
	ModelRenderer rearL1;
	ModelRenderer rearL2;
	ModelRenderer rearL3;
	ModelRenderer rearL4;
	ModelRenderer rearL5;
	ModelRenderer rearL6;
	ModelRenderer rearL7;
	ModelRenderer rearR1;
	ModelRenderer rearR2;
	ModelRenderer rearR3;
	ModelRenderer rearR4;
	ModelRenderer rearR5;
	ModelRenderer rearT1;
	ModelRenderer rearT2;
	ModelRenderer rearT3;
	ModelRenderer rearT4;
	ModelRenderer rearT5;
	ModelRenderer rearT6;
	ModelRenderer rearT7;
	ModelRenderer rearR6;
	ModelRenderer rearR7;
	ModelRenderer rearB1;
	ModelRenderer rearB2;
	ModelRenderer rearB3;
	ModelRenderer rearB4;
	ModelRenderer rearB5;
	ModelRenderer rearB6;
	ModelRenderer rearB7;
	ModelRenderer rearTip;
	ModelRenderer left1R;
	ModelRenderer left1R2;
	ModelRenderer leftR2;
	ModelRenderer leftR3;
	ModelRenderer top1R;
	ModelRenderer top2R;
	ModelRenderer right1;
	ModelRenderer right;
	ModelRenderer rightR2;
	ModelRenderer right1R;
	ModelRenderer rightR3;
	ModelRenderer right1R2;
	ModelRenderer propAxle;
	ModelRenderer propBlade1;
	ModelRenderer propBlade2;
	ModelRenderer propBlade3;
	ModelRenderer propBlade4;
	ModelRenderer flagPole;
	ModelRenderer chairBrace;
	ModelRenderer chairBottom;
	ModelRenderer chairBack;
	ModelRenderer flagCloth;

	public ModelSubmarine() {
		bottom = new ModelRenderer(this, "bottom");
		bottom.setTextureOffset(0, 207);
		bottom.setTextureSize(256, 256);
		bottom.setRotationPoint(0.0f, -1.0f, 0.0f);
		setPieceRotation(bottom, 0.0f, 0.0f, 0.0f);
		bottom.addBox(-12.0f, 0.0f, -24.0f, 24, 1, 48);
		left = new ModelRenderer(this, "left");
		left.setTextureOffset(0, 146);
		left.setTextureSize(256, 256);
		left.setRotationPoint(12.0f, -12.0f, 0.0f);
		setPieceRotation(left, 0.0f, 0.0f, 0.0f);
		left.addBox(0.0f, 0.0f, -24.0f, 1, 12, 48);
		bottom.addChild(left);
		top1 = new ModelRenderer(this, "top1");
		top1.setTextureOffset(145, 237);
		top1.setTextureSize(256, 256);
		top1.setRotationPoint(-12.0f, -25.0f, 0.0f);
		setPieceRotation(top1, 0.0f, 0.0f, 0.0f);
		top1.addBox(0.0f, 0.0f, -24.0f, 24, 1, 18);
		bottom.addChild(top1);
		frontB1 = new ModelRenderer(this, "frontB1");
		frontB1.setTextureOffset(145, 232);
		frontB1.setTextureSize(256, 256);
		frontB1.setRotationPoint(-12.0f, -1.0f, -2.0f);
		setPieceRotation(frontB1, 0.0f, 0.0f, 0.0f);
		frontB1.addBox(0.0f, 0.0f, -24.0f, 24, 1, 3);
		bottom.addChild(frontB1);
		frontT1 = new ModelRenderer(this, "frontT1");
		frontT1.setTextureOffset(145, 232);
		frontT1.setTextureSize(256, 256);
		frontT1.setRotationPoint(-12.0f, -24.0f, -2.0f);
		setPieceRotation(frontT1, 0.0f, 0.0f, 0.0f);
		frontT1.addBox(0.0f, 0.0f, -24.0f, 24, 1, 3);
		bottom.addChild(frontT1);
		frontB2 = new ModelRenderer(this, "frontB2");
		frontB2.setTextureOffset(145, 227);
		frontB2.setTextureSize(256, 256);
		frontB2.setRotationPoint(-11.0f, -2.0f, -28.0f);
		setPieceRotation(frontB2, 0.0f, 0.0f, 0.0f);
		frontB2.addBox(0.0f, 0.0f, 0.0f, 22, 1, 3);
		bottom.addChild(frontB2);
		frontB3 = new ModelRenderer(this, "frontB3");
		frontB3.setTextureOffset(145, 222);
		frontB3.setTextureSize(256, 256);
		frontB3.setRotationPoint(-10.0f, -3.0f, -30.0f);
		setPieceRotation(frontB3, 0.0f, 0.0f, 0.0f);
		frontB3.addBox(0.0f, 0.0f, 0.0f, 20, 1, 3);
		bottom.addChild(frontB3);
		frontB4 = new ModelRenderer(this, "frontB4");
		frontB4.setTextureOffset(145, 217);
		frontB4.setTextureSize(256, 256);
		frontB4.setRotationPoint(-9.0f, -4.0f, -32.0f);
		setPieceRotation(frontB4, 0.0f, 0.0f, 0.0f);
		frontB4.addBox(0.0f, 0.0f, 0.0f, 18, 1, 3);
		bottom.addChild(frontB4);
		frontR1 = new ModelRenderer(this, "frontR1");
		frontR1.setTextureOffset(230, 231);
		frontR1.setTextureSize(256, 256);
		frontR1.setRotationPoint(-12.0f, -23.0f, -2.0f);
		setPieceRotation(frontR1, 0.0f, 0.0f, 0.0f);
		frontR1.addBox(0.0f, 0.0f, -24.0f, 1, 22, 3);
		bottom.addChild(frontR1);
		frontR2 = new ModelRenderer(this, "frontR2");
		frontR2.setTextureOffset(239, 233);
		frontR2.setTextureSize(256, 256);
		frontR2.setRotationPoint(-11.0f, -22.0f, -4.0f);
		setPieceRotation(frontR2, 0.0f, 0.0f, 0.0f);
		frontR2.addBox(0.0f, 0.0f, -24.0f, 1, 20, 3);
		bottom.addChild(frontR2);
		frontR3 = new ModelRenderer(this, "frontR3");
		frontR3.setTextureOffset(248, 235);
		frontR3.setTextureSize(256, 256);
		frontR3.setRotationPoint(-10.0f, -21.0f, -6.0f);
		setPieceRotation(frontR3, 0.0f, 0.0f, 0.0f);
		frontR3.addBox(0.0f, 0.0f, -24.0f, 1, 18, 3);
		bottom.addChild(frontR3);
		frontR4 = new ModelRenderer(this, "frontR4");
		frontR4.setTextureOffset(248, 215);
		frontR4.setTextureSize(256, 256);
		frontR4.setRotationPoint(-9.0f, -20.0f, -8.0f);
		setPieceRotation(frontR4, 0.0f, 0.0f, 0.0f);
		frontR4.addBox(0.0f, 0.0f, -24.0f, 1, 16, 3);
		bottom.addChild(frontR4);
		frontR5 = new ModelRenderer(this, "frontR5");
		frontR5.setTextureOffset(239, 215);
		frontR5.setTextureSize(256, 256);
		frontR5.setRotationPoint(-8.0f, -19.0f, -10.0f);
		setPieceRotation(frontR5, 0.0f, 0.0f, 0.0f);
		frontR5.addBox(0.0f, 0.0f, -24.0f, 1, 14, 3);
		bottom.addChild(frontR5);
		frontB5 = new ModelRenderer(this, "frontB5");
		frontB5.setTextureOffset(145, 212);
		frontB5.setTextureSize(256, 256);
		frontB5.setRotationPoint(-8.0f, -5.0f, -34.0f);
		setPieceRotation(frontB5, 0.0f, 0.0f, 0.0f);
		frontB5.addBox(0.0f, 0.0f, 0.0f, 16, 1, 3);
		bottom.addChild(frontB5);
		left1 = new ModelRenderer(this, "left1");
		left1.setTextureOffset(5, 91);
		left1.setTextureSize(256, 256);
		left1.setRotationPoint(13.0f, -12.0f, 2.0f);
		setPieceRotation(left1, 0.0f, 0.0f, 0.0f);
		left1.addBox(0.0f, 0.0f, -24.0f, 1, 10, 44);
		bottom.addChild(left1);
		frontB6 = new ModelRenderer(this, "frontB6");
		frontB6.setTextureOffset(145, 208);
		frontB6.setTextureSize(256, 256);
		frontB6.setRotationPoint(-7.0f, -6.0f, -35.0f);
		setPieceRotation(frontB6, 0.0f, 0.0f, 0.0f);
		frontB6.addBox(0.0f, 0.0f, 0.0f, 14, 1, 2);
		bottom.addChild(frontB6);
		frontB7 = new ModelRenderer(this, "frontB7");
		frontB7.setTextureOffset(145, 204);
		frontB7.setTextureSize(256, 256);
		frontB7.setRotationPoint(-6.0f, -7.0f, -36.0f);
		setPieceRotation(frontB7, 0.0f, 0.0f, 0.0f);
		frontB7.addBox(0.0f, 0.0f, 0.0f, 12, 1, 2);
		bottom.addChild(frontB7);
		frontTip = new ModelRenderer(this, "frontTip");
		frontTip.setTextureOffset(234, 203);
		frontTip.setTextureSize(256, 256);
		frontTip.setRotationPoint(-5.0f, -17.0f, -37.0f);
		setPieceRotation(frontTip, 0.0f, 0.0f, 0.0f);
		frontTip.addBox(0.0f, 0.0f, 0.0f, 10, 10, 1);
		bottom.addChild(frontTip);
		frontR6 = new ModelRenderer(this, "frontR6");
		frontR6.setTextureOffset(232, 216);
		frontR6.setTextureSize(256, 256);
		frontR6.setRotationPoint(-7.0f, -18.0f, -11.0f);
		setPieceRotation(frontR6, 0.0f, 0.0f, 0.0f);
		frontR6.addBox(0.0f, 0.0f, -24.0f, 1, 12, 2);
		bottom.addChild(frontR6);
		frontR7 = new ModelRenderer(this, "frontR7");
		frontR7.setTextureOffset(225, 216);
		frontR7.setTextureSize(256, 256);
		frontR7.setRotationPoint(-6.0f, -17.0f, -12.0f);
		setPieceRotation(frontR7, 0.0f, 0.0f, 0.0f);
		frontR7.addBox(0.0f, 0.0f, -24.0f, 1, 10, 2);
		bottom.addChild(frontR7);
		top2 = new ModelRenderer(this, "top2");
		top2.setTextureOffset(145, 186);
		top2.setTextureSize(256, 256);
		top2.setRotationPoint(-10.0f, -26.0f, 2.0f);
		setPieceRotation(top2, 0.0f, 0.0f, 0.0f);
		top2.addBox(0.0f, 0.0f, -24.0f, 20, 1, 16);
		bottom.addChild(top2);
		frontT2 = new ModelRenderer(this, "frontT2");
		frontT2.setTextureOffset(145, 227);
		frontT2.setTextureSize(256, 256);
		frontT2.setRotationPoint(-11.0f, -23.0f, -28.0f);
		setPieceRotation(frontT2, 0.0f, 0.0f, 0.0f);
		frontT2.addBox(0.0f, 0.0f, 0.0f, 22, 1, 3);
		bottom.addChild(frontT2);
		frontT3 = new ModelRenderer(this, "frontT3");
		frontT3.setTextureOffset(145, 222);
		frontT3.setTextureSize(256, 256);
		frontT3.setRotationPoint(-10.0f, -22.0f, -30.0f);
		setPieceRotation(frontT3, 0.0f, 0.0f, 0.0f);
		frontT3.addBox(0.0f, 0.0f, 0.0f, 20, 1, 3);
		bottom.addChild(frontT3);
		frontT4 = new ModelRenderer(this, "frontT4");
		frontT4.setTextureOffset(145, 217);
		frontT4.setTextureSize(256, 256);
		frontT4.setRotationPoint(-9.0f, -21.0f, -32.0f);
		setPieceRotation(frontT4, 0.0f, 0.0f, 0.0f);
		frontT4.addBox(0.0f, 0.0f, 0.0f, 18, 1, 3);
		bottom.addChild(frontT4);
		frontT5 = new ModelRenderer(this, "frontT5");
		frontT5.setTextureOffset(145, 212);
		frontT5.setTextureSize(256, 256);
		frontT5.setRotationPoint(-8.0f, -20.0f, -34.0f);
		setPieceRotation(frontT5, 0.0f, 0.0f, 0.0f);
		frontT5.addBox(0.0f, 0.0f, 0.0f, 16, 1, 3);
		bottom.addChild(frontT5);
		frontT6 = new ModelRenderer(this, "frontT6");
		frontT6.setTextureOffset(145, 208);
		frontT6.setTextureSize(256, 256);
		frontT6.setRotationPoint(-7.0f, -19.0f, -35.0f);
		setPieceRotation(frontT6, 0.0f, 0.0f, 0.0f);
		frontT6.addBox(0.0f, 0.0f, 0.0f, 14, 1, 2);
		bottom.addChild(frontT6);
		frontT7 = new ModelRenderer(this, "frontT7");
		frontT7.setTextureOffset(145, 204);
		frontT7.setTextureSize(256, 256);
		frontT7.setRotationPoint(-6.0f, -18.0f, -36.0f);
		setPieceRotation(frontT7, 0.0f, 0.0f, 0.0f);
		frontT7.addBox(0.0f, 0.0f, 0.0f, 12, 1, 2);
		bottom.addChild(frontT7);
		frontL3 = new ModelRenderer(this, "frontL3");
		frontL3.setTextureOffset(248, 235);
		frontL3.setTextureSize(256, 256);
		frontL3.setRotationPoint(9.0f, -21.0f, -6.0f);
		setPieceRotation(frontL3, 0.0f, 0.0f, 0.0f);
		frontL3.addBox(0.0f, 0.0f, -24.0f, 1, 18, 3);
		bottom.addChild(frontL3);
		frontL1 = new ModelRenderer(this, "frontL1");
		frontL1.setTextureOffset(230, 231);
		frontL1.setTextureSize(256, 256);
		frontL1.setRotationPoint(11.0f, -23.0f, -2.0f);
		setPieceRotation(frontL1, 0.0f, 0.0f, 0.0f);
		frontL1.addBox(0.0f, 0.0f, -24.0f, 1, 22, 3);
		bottom.addChild(frontL1);
		frontL2 = new ModelRenderer(this, "frontL2");
		frontL2.setTextureOffset(239, 233);
		frontL2.setTextureSize(256, 256);
		frontL2.setRotationPoint(10.0f, -22.0f, -4.0f);
		setPieceRotation(frontL2, 0.0f, 0.0f, 0.0f);
		frontL2.addBox(0.0f, 0.0f, -24.0f, 1, 20, 3);
		bottom.addChild(frontL2);
		frontL4 = new ModelRenderer(this, "frontL4");
		frontL4.setTextureOffset(248, 215);
		frontL4.setTextureSize(256, 256);
		frontL4.setRotationPoint(8.0f, -20.0f, -8.0f);
		setPieceRotation(frontL4, 0.0f, 0.0f, 0.0f);
		frontL4.addBox(0.0f, 0.0f, -24.0f, 1, 16, 3);
		bottom.addChild(frontL4);
		frontL5 = new ModelRenderer(this, "frontL5");
		frontL5.setTextureOffset(239, 215);
		frontL5.setTextureSize(256, 256);
		frontL5.setRotationPoint(7.0f, -19.0f, -10.0f);
		setPieceRotation(frontL5, 0.0f, 0.0f, 0.0f);
		frontL5.addBox(0.0f, 0.0f, -24.0f, 1, 14, 3);
		bottom.addChild(frontL5);
		frontL6 = new ModelRenderer(this, "frontL6");
		frontL6.setTextureOffset(232, 216);
		frontL6.setTextureSize(256, 256);
		frontL6.setRotationPoint(6.0f, -18.0f, -11.0f);
		setPieceRotation(frontL6, 0.0f, 0.0f, 0.0f);
		frontL6.addBox(0.0f, 0.0f, -24.0f, 1, 12, 2);
		bottom.addChild(frontL6);
		frontL7 = new ModelRenderer(this, "frontL7");
		frontL7.setTextureOffset(225, 216);
		frontL7.setTextureSize(256, 256);
		frontL7.setRotationPoint(5.0f, -17.0f, -12.0f);
		setPieceRotation(frontL7, 0.0f, 0.0f, 0.0f);
		frontL7.addBox(0.0f, 0.0f, -24.0f, 1, 10, 2);
		bottom.addChild(frontL7);
		rearL1 = new ModelRenderer(this, "rearL1");
		rearL1.setTextureOffset(230, 0);
		rearL1.setTextureSize(256, 256);
		rearL1.setRotationPoint(11.0f, -23.0f, 23.0f);
		setPieceRotation(rearL1, 0.0f, 0.0f, 0.0f);
		rearL1.addBox(0.0f, 0.0f, 0.0f, 1, 22, 3);
		bottom.addChild(rearL1);
		rearL2 = new ModelRenderer(this, "rearL2");
		rearL2.setTextureOffset(239, 0);
		rearL2.setTextureSize(256, 256);
		rearL2.setRotationPoint(10.0f, -22.0f, 25.0f);
		setPieceRotation(rearL2, 0.0f, 0.0f, 0.0f);
		rearL2.addBox(0.0f, 0.0f, 0.0f, 1, 20, 3);
		bottom.addChild(rearL2);
		rearL3 = new ModelRenderer(this, "rearL3");
		rearL3.setTextureOffset(248, 0);
		rearL3.setTextureSize(256, 256);
		rearL3.setRotationPoint(9.0f, -21.0f, 27.0f);
		setPieceRotation(rearL3, 0.0f, 0.0f, 0.0f);
		rearL3.addBox(0.0f, 0.0f, 0.0f, 1, 18, 3);
		bottom.addChild(rearL3);
		rearL4 = new ModelRenderer(this, "rearL4");
		rearL4.setTextureOffset(248, 22);
		rearL4.setTextureSize(256, 256);
		rearL4.setRotationPoint(8.0f, -20.0f, 29.0f);
		setPieceRotation(rearL4, 0.0f, 0.0f, 0.0f);
		rearL4.addBox(0.0f, 0.0f, 0.0f, 1, 16, 3);
		bottom.addChild(rearL4);
		rearL5 = new ModelRenderer(this, "rearL5");
		rearL5.setTextureOffset(239, 24);
		rearL5.setTextureSize(256, 256);
		rearL5.setRotationPoint(7.0f, -19.0f, 31.0f);
		setPieceRotation(rearL5, 0.0f, 0.0f, 0.0f);
		rearL5.addBox(0.0f, 0.0f, 0.0f, 1, 14, 3);
		bottom.addChild(rearL5);
		rearL6 = new ModelRenderer(this, "rearL6");
		rearL6.setTextureOffset(232, 26);
		rearL6.setTextureSize(256, 256);
		rearL6.setRotationPoint(6.0f, -18.0f, 33.0f);
		setPieceRotation(rearL6, 0.0f, 0.0f, 0.0f);
		rearL6.addBox(0.0f, 0.0f, 0.0f, 1, 12, 2);
		bottom.addChild(rearL6);
		rearL7 = new ModelRenderer(this, "rearL7");
		rearL7.setTextureOffset(225, 28);
		rearL7.setTextureSize(256, 256);
		rearL7.setRotationPoint(5.0f, -17.0f, 34.0f);
		setPieceRotation(rearL7, 0.0f, 0.0f, 0.0f);
		rearL7.addBox(0.0f, 0.0f, 0.0f, 1, 10, 2);
		bottom.addChild(rearL7);
		rearR1 = new ModelRenderer(this, "rearR1");
		rearR1.setTextureOffset(230, 0);
		rearR1.setTextureSize(256, 256);
		rearR1.setRotationPoint(-12.0f, -23.0f, 23.0f);
		setPieceRotation(rearR1, 0.0f, 0.0f, 0.0f);
		rearR1.addBox(0.0f, 0.0f, 0.0f, 1, 22, 3);
		bottom.addChild(rearR1);
		rearR2 = new ModelRenderer(this, "rearR2");
		rearR2.setTextureOffset(239, 0);
		rearR2.setTextureSize(256, 256);
		rearR2.setRotationPoint(-11.0f, -22.0f, 25.0f);
		setPieceRotation(rearR2, 0.0f, 0.0f, 0.0f);
		rearR2.addBox(0.0f, 0.0f, 0.0f, 1, 20, 3);
		bottom.addChild(rearR2);
		rearR3 = new ModelRenderer(this, "rearR3");
		rearR3.setTextureOffset(248, 0);
		rearR3.setTextureSize(256, 256);
		rearR3.setRotationPoint(-10.0f, -21.0f, 27.0f);
		setPieceRotation(rearR3, 0.0f, 0.0f, 0.0f);
		rearR3.addBox(0.0f, 0.0f, 0.0f, 1, 18, 3);
		bottom.addChild(rearR3);
		rearR4 = new ModelRenderer(this, "rearR4");
		rearR4.setTextureOffset(248, 22);
		rearR4.setTextureSize(256, 256);
		rearR4.setRotationPoint(-9.0f, -20.0f, 29.0f);
		setPieceRotation(rearR4, 0.0f, 0.0f, 0.0f);
		rearR4.addBox(0.0f, 0.0f, 0.0f, 1, 16, 3);
		bottom.addChild(rearR4);
		rearR5 = new ModelRenderer(this, "rearR5");
		rearR5.setTextureOffset(239, 24);
		rearR5.setTextureSize(256, 256);
		rearR5.setRotationPoint(-8.0f, -19.0f, 31.0f);
		setPieceRotation(rearR5, 0.0f, 0.0f, 0.0f);
		rearR5.addBox(0.0f, 0.0f, 0.0f, 1, 14, 3);
		bottom.addChild(rearR5);
		rearT1 = new ModelRenderer(this, "rearT1");
		rearT1.setTextureOffset(145, 0);
		rearT1.setTextureSize(256, 256);
		rearT1.setRotationPoint(-12.0f, -24.0f, 23.0f);
		setPieceRotation(rearT1, 0.0f, 0.0f, 0.0f);
		rearT1.addBox(0.0f, 0.0f, 0.0f, 24, 1, 3);
		bottom.addChild(rearT1);
		rearT2 = new ModelRenderer(this, "rearT2");
		rearT2.setTextureOffset(145, 5);
		rearT2.setTextureSize(256, 256);
		rearT2.setRotationPoint(-11.0f, -23.0f, 25.0f);
		setPieceRotation(rearT2, 0.0f, 0.0f, 0.0f);
		rearT2.addBox(0.0f, 0.0f, 0.0f, 22, 1, 3);
		bottom.addChild(rearT2);
		rearT3 = new ModelRenderer(this, "rearT3");
		rearT3.setTextureOffset(145, 10);
		rearT3.setTextureSize(256, 256);
		rearT3.setRotationPoint(-10.0f, -22.0f, 27.0f);
		setPieceRotation(rearT3, 0.0f, 0.0f, 0.0f);
		rearT3.addBox(0.0f, 0.0f, 0.0f, 20, 1, 3);
		bottom.addChild(rearT3);
		rearT4 = new ModelRenderer(this, "rearT4");
		rearT4.setTextureOffset(145, 15);
		rearT4.setTextureSize(256, 256);
		rearT4.setRotationPoint(-9.0f, -21.0f, 29.0f);
		setPieceRotation(rearT4, 0.0f, 0.0f, 0.0f);
		rearT4.addBox(0.0f, 0.0f, 0.0f, 18, 1, 3);
		bottom.addChild(rearT4);
		rearT5 = new ModelRenderer(this, "rearT5");
		rearT5.setTextureOffset(145, 20);
		rearT5.setTextureSize(256, 256);
		rearT5.setRotationPoint(-8.0f, -20.0f, 31.0f);
		setPieceRotation(rearT5, 0.0f, 0.0f, 0.0f);
		rearT5.addBox(0.0f, 0.0f, 0.0f, 16, 1, 3);
		bottom.addChild(rearT5);
		rearT6 = new ModelRenderer(this, "rearT6");
		rearT6.setTextureOffset(145, 25);
		rearT6.setTextureSize(256, 256);
		rearT6.setRotationPoint(-7.0f, -19.0f, 33.0f);
		setPieceRotation(rearT6, 0.0f, 0.0f, 0.0f);
		rearT6.addBox(0.0f, 0.0f, 0.0f, 14, 1, 2);
		bottom.addChild(rearT6);
		rearT7 = new ModelRenderer(this, "rearT7");
		rearT7.setTextureOffset(145, 29);
		rearT7.setTextureSize(256, 256);
		rearT7.setRotationPoint(-6.0f, -18.0f, 34.0f);
		setPieceRotation(rearT7, 0.0f, 0.0f, 0.0f);
		rearT7.addBox(0.0f, 0.0f, 0.0f, 12, 1, 2);
		bottom.addChild(rearT7);
		rearR6 = new ModelRenderer(this, "rearR6");
		rearR6.setTextureOffset(232, 26);
		rearR6.setTextureSize(256, 256);
		rearR6.setRotationPoint(-7.0f, -18.0f, 33.0f);
		setPieceRotation(rearR6, 0.0f, 0.0f, 0.0f);
		rearR6.addBox(0.0f, 0.0f, 0.0f, 1, 12, 2);
		bottom.addChild(rearR6);
		rearR7 = new ModelRenderer(this, "rearR7");
		rearR7.setTextureOffset(225, 28);
		rearR7.setTextureSize(256, 256);
		rearR7.setRotationPoint(-6.0f, -17.0f, 34.0f);
		setPieceRotation(rearR7, 0.0f, 0.0f, 0.0f);
		rearR7.addBox(0.0f, 0.0f, 0.0f, 1, 10, 2);
		bottom.addChild(rearR7);
		rearB1 = new ModelRenderer(this, "rearB1");
		rearB1.setTextureOffset(145, 0);
		rearB1.setTextureSize(256, 256);
		rearB1.setRotationPoint(-12.0f, -1.0f, 23.0f);
		setPieceRotation(rearB1, 0.0f, 0.0f, 0.0f);
		rearB1.addBox(0.0f, 0.0f, 0.0f, 24, 1, 3);
		bottom.addChild(rearB1);
		rearB2 = new ModelRenderer(this, "rearB2");
		rearB2.setTextureOffset(145, 5);
		rearB2.setTextureSize(256, 256);
		rearB2.setRotationPoint(-11.0f, -2.0f, 25.0f);
		setPieceRotation(rearB2, 0.0f, 0.0f, 0.0f);
		rearB2.addBox(0.0f, 0.0f, 0.0f, 22, 1, 3);
		bottom.addChild(rearB2);
		rearB3 = new ModelRenderer(this, "rearB3");
		rearB3.setTextureOffset(145, 10);
		rearB3.setTextureSize(256, 256);
		rearB3.setRotationPoint(-10.0f, -3.0f, 27.0f);
		setPieceRotation(rearB3, 0.0f, 0.0f, 0.0f);
		rearB3.addBox(0.0f, 0.0f, 0.0f, 20, 1, 3);
		bottom.addChild(rearB3);
		rearB4 = new ModelRenderer(this, "rearB4");
		rearB4.setTextureOffset(145, 15);
		rearB4.setTextureSize(256, 256);
		rearB4.setRotationPoint(-9.0f, -4.0f, 29.0f);
		setPieceRotation(rearB4, 0.0f, 0.0f, 0.0f);
		rearB4.addBox(0.0f, 0.0f, 0.0f, 18, 1, 3);
		bottom.addChild(rearB4);
		rearB5 = new ModelRenderer(this, "rearB5");
		rearB5.setTextureOffset(145, 20);
		rearB5.setTextureSize(256, 256);
		rearB5.setRotationPoint(-8.0f, -5.0f, 31.0f);
		setPieceRotation(rearB5, 0.0f, 0.0f, 0.0f);
		rearB5.addBox(0.0f, 0.0f, 0.0f, 16, 1, 3);
		bottom.addChild(rearB5);
		rearB6 = new ModelRenderer(this, "rearB6");
		rearB6.setTextureOffset(145, 25);
		rearB6.setTextureSize(256, 256);
		rearB6.setRotationPoint(-7.0f, -6.0f, 33.0f);
		setPieceRotation(rearB6, 0.0f, 0.0f, 0.0f);
		rearB6.addBox(0.0f, 0.0f, 0.0f, 14, 1, 2);
		bottom.addChild(rearB6);
		rearB7 = new ModelRenderer(this, "rearB7");
		rearB7.setTextureOffset(145, 29);
		rearB7.setTextureSize(256, 256);
		rearB7.setRotationPoint(-6.0f, -7.0f, 34.0f);
		setPieceRotation(rearB7, 0.0f, 0.0f, 0.0f);
		rearB7.addBox(0.0f, 0.0f, 0.0f, 12, 1, 2);
		bottom.addChild(rearB7);
		rearTip = new ModelRenderer(this, "rearTip");
		rearTip.setTextureOffset(0, 243);
		rearTip.setTextureSize(256, 256);
		rearTip.setRotationPoint(-5.0f, -17.0f, 36.0f);
		setPieceRotation(rearTip, 0.0f, 0.0f, 0.0f);
		rearTip.addBox(0.0f, 0.0f, 0.0f, 10, 10, 1);
		bottom.addChild(rearTip);
		left1R = new ModelRenderer(this, "left1R");
		left1R.setTextureOffset(51, 155);
		left1R.setTextureSize(256, 256);
		left1R.setRotationPoint(13.0f, -22.0f, 18.0f);
		setPieceRotation(left1R, 0.0f, 0.0f, 0.0f);
		left1R.addBox(0.0f, 0.0f, -24.0f, 1, 10, 28);
		bottom.addChild(left1R);
		left1R2 = new ModelRenderer(this, "left1R2");
		left1R2.setTextureOffset(145, 159);
		left1R2.setTextureSize(256, 256);
		left1R2.setRotationPoint(13.0f, -22.0f, 2.0f);
		setPieceRotation(left1R2, 0.0f, 0.0f, 0.0f);
		left1R2.addBox(0.0f, 0.0f, -24.0f, 1, 10, 16);
		bottom.addChild(left1R2);
		leftR2 = new ModelRenderer(this, "leftR2");
		leftR2.setTextureOffset(52, 92);
		leftR2.setTextureSize(256, 256);
		leftR2.setRotationPoint(12.0f, -24.0f, 18.0f);
		setPieceRotation(leftR2, 0.0f, 0.0f, 0.0f);
		leftR2.addBox(0.0f, 0.0f, -24.0f, 1, 12, 30);
		bottom.addChild(leftR2);
		leftR3 = new ModelRenderer(this, "leftR3");
		leftR3.setTextureOffset(145, 128);
		leftR3.setTextureSize(256, 256);
		leftR3.setRotationPoint(12.0f, -24.0f, 0.0f);
		setPieceRotation(leftR3, 0.0f, 0.0f, 0.0f);
		leftR3.addBox(0.0f, 0.0f, -24.0f, 1, 12, 18);
		bottom.addChild(leftR3);
		top1R = new ModelRenderer(this, "top1R");
		top1R.setTextureOffset(148, 87);
		top1R.setTextureSize(256, 256);
		top1R.setRotationPoint(-12.0f, -25.0f, 18.0f);
		setPieceRotation(top1R, 0.0f, 0.0f, 0.0f);
		top1R.addBox(0.0f, 0.0f, -24.0f, 24, 1, 30);
		bottom.addChild(top1R);
		top2R = new ModelRenderer(this, "top2R");
		top2R.setTextureOffset(160, 57);
		top2R.setTextureSize(256, 256);
		top2R.setRotationPoint(-10.0f, -26.0f, 18.0f);
		setPieceRotation(top2R, 0.0f, 0.0f, 0.0f);
		top2R.addBox(0.0f, 0.0f, -24.0f, 20, 1, 28);
		bottom.addChild(top2R);
		right1 = new ModelRenderer(this, "right1");
		right1.setTextureOffset(5, 91);
		right1.setTextureSize(256, 256);
		right1.setRotationPoint(-14.0f, -12.0f, 2.0f);
		setPieceRotation(right1, 0.0f, 0.0f, 0.0f);
		right1.addBox(0.0f, 0.0f, -24.0f, 1, 10, 44);
		bottom.addChild(right1);
		right = new ModelRenderer(this, "right");
		right.setTextureOffset(0, 146);
		right.setTextureSize(256, 256);
		right.setRotationPoint(-13.0f, -12.0f, 0.0f);
		setPieceRotation(right, 0.0f, 0.0f, 0.0f);
		right.addBox(0.0f, 0.0f, -24.0f, 1, 12, 48);
		bottom.addChild(right);
		rightR2 = new ModelRenderer(this, "rightR2");
		rightR2.setTextureOffset(52, 92);
		rightR2.setTextureSize(256, 256);
		rightR2.setRotationPoint(-13.0f, -24.0f, 18.0f);
		setPieceRotation(rightR2, 0.0f, 0.0f, 0.0f);
		rightR2.addBox(0.0f, 0.0f, -24.0f, 1, 12, 30);
		bottom.addChild(rightR2);
		right1R = new ModelRenderer(this, "right1R");
		right1R.setTextureOffset(51, 155);
		right1R.setTextureSize(256, 256);
		right1R.setRotationPoint(-14.0f, -22.0f, 18.0f);
		setPieceRotation(right1R, 0.0f, 0.0f, 0.0f);
		right1R.addBox(0.0f, 0.0f, -24.0f, 1, 10, 28);
		bottom.addChild(right1R);
		rightR3 = new ModelRenderer(this, "rightR3");
		rightR3.setTextureOffset(145, 128);
		rightR3.setTextureSize(256, 256);
		rightR3.setRotationPoint(-13.0f, -24.0f, 0.0f);
		setPieceRotation(rightR3, 0.0f, 0.0f, 0.0f);
		rightR3.addBox(0.0f, 0.0f, -24.0f, 1, 12, 18);
		bottom.addChild(rightR3);
		right1R2 = new ModelRenderer(this, "right1R2");
		right1R2.setTextureOffset(145, 159);
		right1R2.setTextureSize(256, 256);
		right1R2.setRotationPoint(-14.0f, -22.0f, 2.0f);
		setPieceRotation(right1R2, 0.0f, 0.0f, 0.0f);
		right1R2.addBox(0.0f, 0.0f, -24.0f, 1, 10, 16);
		bottom.addChild(right1R2);
		propAxle = new ModelRenderer(this, "propAxle");
		propAxle.setTextureOffset(0, 10);
		propAxle.setTextureSize(256, 256);
		propAxle.setRotationPoint(0.0f, -12.0f, 37.0f);
		setPieceRotation(propAxle, 0.0f, 0.0f, 0.0f);
		propAxle.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5);
		propBlade2 = new ModelRenderer(this, "propBlade2");
		propBlade2.setTextureOffset(0, 0);
		propBlade2.setTextureSize(256, 256);
		propBlade2.setRotationPoint(0.0f, 0.0f, 4.0f);
		setPieceRotation(propBlade2, 1.2483568E-8f, 0.38397244f, -1.5707964f);
		propBlade2.addBox(-1.5f, 0.5f, -0.5f, 3, 8, 1);
		propAxle.addChild(propBlade2);
		propBlade4 = new ModelRenderer(this, "propBlade4");
		propBlade4.setTextureOffset(0, 0);
		propBlade4.setTextureSize(256, 256);
		propBlade4.setRotationPoint(0.0f, 0.0f, 4.0f);
		setPieceRotation(propBlade4, 1.2483568E-8f, 0.38397244f, 1.5707964f);
		propBlade4.addBox(-1.5f, 0.5f, -0.5f, 3, 8, 1);
		propAxle.addChild(propBlade4);
		propBlade3 = new ModelRenderer(this, "propBlade3");
		propBlade3.setTextureOffset(0, 0);
		propBlade3.setTextureSize(256, 256);
		propBlade3.setRotationPoint(0.0f, 0.0f, 4.0f);
		setPieceRotation(propBlade3, 1.2483568E-8f, 0.38397244f, -3.1415927f);
		propBlade3.addBox(-1.5f, 0.5f, -0.5f, 3, 8, 1);
		propAxle.addChild(propBlade3);
		propBlade1 = new ModelRenderer(this, "propBlade1");
		propBlade1.setTextureOffset(0, 0);
		propBlade1.setTextureSize(256, 256);
		propBlade1.setRotationPoint(0.0f, 0.0f, 4.0f);
		setPieceRotation(propBlade1, 0.0f, 0.38397244f, 0.0f);
		propBlade1.addBox(-1.5f, 0.5f, -0.5f, 3, 8, 1);
		propAxle.addChild(propBlade1);
		bottom.addChild(propAxle);
		flagPole = new ModelRenderer(this, "flagPole");
		flagPole.setTextureOffset(19, 78);
		flagPole.setTextureSize(256, 256);
		flagPole.setRotationPoint(-13.0f, -41.0f, 23.0f);
		setPieceRotation(flagPole, 0.0f, 0.0f, 0.0f);
		flagPole.addBox(0.0f, 0.0f, 0.0f, 1, 16, 1);
		chairBrace = new ModelRenderer(this, "chairBrace");
		chairBrace.setTextureOffset(70, 59);
		chairBrace.setTextureSize(256, 256);
		chairBrace.setRotationPoint(-1.5f, -3.0f, -8.0f);
		setPieceRotation(chairBrace, 0.0f, 0.0f, 0.0f);
		chairBrace.addBox(0.0f, 0.0f, -8.0f, 3, 1, 7);
		chairBottom = new ModelRenderer(this, "chairBottom");
		chairBottom.setTextureOffset(54, 68);
		chairBottom.setTextureSize(256, 256);
		chairBottom.setRotationPoint(-3.5f, -1.5f, -1.0f);
		setPieceRotation(chairBottom, 0.1570796f, 0.0f, 0.0f);
		chairBottom.addBox(0.0f, 0.0f, -9.0f, 10, 1, 9);
		chairBrace.addChild(chairBottom);
		chairBack = new ModelRenderer(this, "chairBack");
		chairBack.setTextureOffset(49, 79);
		chairBack.setTextureSize(256, 256);
		chairBack.setRotationPoint(-3.5f, -1.0f, -1.0f);
		setPieceRotation(chairBack, -0.1745329f, 0.0f, 0.0f);
		chairBack.addBox(0.0f, -10.0f, 0.0f, 10, 10, 1);
		chairBrace.addChild(chairBack);
		flagCloth = new ModelRenderer(this, "flagCloth");
		flagCloth.setTextureOffset(24, 78);
		flagCloth.setTextureSize(256, 256);
		flagCloth.setRotationPoint(-13.0f, -41.0f, 24.0f);
		setPieceRotation(flagCloth, 0.0f, 0.0f, 0.0f);
		flagCloth.addBox(0.0f, 0.0f, 0.0f, 1, 8, 11);
	}

	@Override
	public void render(Entity entity, float f1, float f2, float f3, float f4, float f5, float f6) {
		super.render(entity, f1, f2, f3, f4, f5, f6);
		setRotationAngles(f1, f2, f3, f4, f5, f6, entity);
		bottom.render(f6);
		flagPole.render(f6);
		chairBrace.render(f6);
	}

	public void setPieceRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setWheelRotations(float fl, float fr, float rl, float rr) {
		this.propAxle.rotateAngleZ = -Trig.toRadians(fr) * 4;
	}

	@Override
	public void renderFlag() {
		flagCloth.render(0.0625f);
	}
}
