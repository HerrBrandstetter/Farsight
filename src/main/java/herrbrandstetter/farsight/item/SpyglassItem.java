package herrbrandstetter.farsight.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;

public class SpyglassItem extends Item {
    public SpyglassItem() {
        super(new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1).rarity(Rarity.RARE));
    }
}