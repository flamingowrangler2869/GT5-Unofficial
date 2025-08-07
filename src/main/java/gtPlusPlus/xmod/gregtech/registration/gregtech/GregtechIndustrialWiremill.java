package gtPlusPlus.xmod.gregtech.registration.gregtech;

import static gregtech.api.enums.MetaTileEntityIDs.Industrial_WireFactory;

import gtPlusPlus.xmod.gregtech.api.enums.GregtechItemList;
import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialWireMill;

public class GregtechIndustrialWiremill {

    public static void run() {
        GregtechItemList.Industrial_WireFactory.set(
            new MTEIndustrialWireMill(
                Industrial_WireFactory.ID,
                "§c§lDEPRECATED§7 - " + "industrialwiremill.controller.tier.single",
                "§c§lDEPRECATED§7 - " + "Industrial Wire Factory").getStackForm(1L));
    }
}
