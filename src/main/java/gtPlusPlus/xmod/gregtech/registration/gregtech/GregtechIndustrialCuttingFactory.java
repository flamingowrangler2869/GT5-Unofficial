package gtPlusPlus.xmod.gregtech.registration.gregtech;

import static gregtech.api.enums.MetaTileEntityIDs.Industrial_CuttingFactoryController;

import gtPlusPlus.xmod.gregtech.api.enums.GregtechItemList;
import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialCuttingMachine;

@Deprecated
public class GregtechIndustrialCuttingFactory {

    public static void run() {
        GregtechItemList.Industrial_CuttingFactoryController.set(
            new MTEIndustrialCuttingMachine(
                Industrial_CuttingFactoryController.ID,
                "§c§lDEPRECATED§7 - " + "industrialcuttingmachine.controller.tier.01",
                "§c§lDEPRECATED§7 - " + "Industrial Cutting Factory").getStackForm(1L));
    }

}
