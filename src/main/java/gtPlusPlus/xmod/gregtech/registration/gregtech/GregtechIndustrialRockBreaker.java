package gtPlusPlus.xmod.gregtech.registration.gregtech;

import static gregtech.api.enums.MetaTileEntityIDs.Controller_IndustrialRockBreaker;

import gtPlusPlus.xmod.gregtech.api.enums.GregtechItemList;
import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.production.MTEIndustrialRockBreaker;

public class GregtechIndustrialRockBreaker {

    public static void run() {
        GregtechItemList.Controller_IndustrialRockBreaker.set(
            new MTEIndustrialRockBreaker(
                Controller_IndustrialRockBreaker.ID,
                "§c§lDEPRECATED§7 - " + "industrialrockcrusher.controller.tier.single",
                "§c§lDEPRECATED§7 - " + "Boldarnator").getStackForm(1L));
    }
}
