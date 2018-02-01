/**
 * Copyright 2012 John Cummens (aka Shadowmage, Shadowmage4513)
 * This software is distributed under the terms of the GNU General Public License.
 * Please see COPYING for precise license information.
 * <p>
 * This file is part of Ancient Warfare.
 * <p>
 * Ancient Warfare is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * Ancient Warfare is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with Ancient Warfare.  If not, see <http://www.gnu.org/licenses/>.
 */

package shadowmage.ancient_warfare.common.inventory;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import shadowmage.ancient_warfare.common.registry.AmmoRegistry;
import shadowmage.ancient_warfare.common.vehicles.VehicleBase;
import shadowmage.ancient_warfare.common.vehicles.missiles.IAmmoType;

public class SlotVehicleAmmo extends Slot {

	private VehicleBase vehicle;

	/**
	 * @param par1iInventory
	 * @param par2
	 * @param par3
	 * @param par4
	 */
	public SlotVehicleAmmo(IInventory par1iInventory, VehicleBase vehicle, int par2, int par3, int par4) {
		super(par1iInventory, par2, par3, par4);
		this.vehicle = vehicle;
	}

	@Override
	public boolean isItemValid(ItemStack par1ItemStack) {
		IAmmoType ammo = AmmoRegistry.instance().getAmmoForStack(par1ItemStack);
		if (ammo != null) {
			return vehicle.vehicleType.isAmmoValidForInventory(ammo);
		}
		return false;
	}

}
