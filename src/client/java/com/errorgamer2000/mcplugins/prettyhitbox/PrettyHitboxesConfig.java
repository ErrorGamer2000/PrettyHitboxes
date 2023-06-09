package com.errorgamer2000.mcplugins.prettyhitbox;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "pretty-hitboxes")
public class PrettyHitboxesConfig implements ConfigData {
    @ConfigEntry.Category("Features")
    @ConfigEntry.Gui.Tooltip
    public boolean hitboxesEnabledByDefault = false;

    @ConfigEntry.Category("Features")
    @ConfigEntry.Gui.Tooltip
    public boolean hideBigDragonBox = false;
    @ConfigEntry.Category("Features")
    @ConfigEntry.Gui.Tooltip
    public boolean showBoundingBox = true;
    @ConfigEntry.Category("Features")
    @ConfigEntry.Gui.Tooltip
    public boolean showEyeHeight = true;
    @ConfigEntry.Category("Features")
    @ConfigEntry.Gui.Tooltip
    public boolean showEntityRotationVector = true;
    @ConfigEntry.Category("Features")
    @ConfigEntry.Gui.Tooltip
    public boolean differentColorWhenTargeted = false;
    @ConfigEntry.Category("Features")
    @ConfigEntry.Gui.Tooltip
    public boolean showItemHitboxes = true;
    @ConfigEntry.Category("Features")
    @ConfigEntry.Gui.Tooltip
    public boolean showItemFrameHitboxes = true;
    @ConfigEntry.Category("Features")
    @ConfigEntry.Gui.Tooltip
    public boolean showPaintingHitboxes = true;
    @ConfigEntry.Category("Features")
    @ConfigEntry.Gui.Tooltip
    public boolean showBoatHitboxes = true;
    @ConfigEntry.Category("Features")
    @ConfigEntry.Gui.Tooltip
    public boolean showThrowableItemHitboxes = true;

    @ConfigEntry.Category("Colors")
    @ConfigEntry.Gui.CollapsibleObject
    public Color boundingBoxColor = new Color(255, 255, 255);
    @ConfigEntry.Category("Colors")
    @ConfigEntry.Gui.CollapsibleObject
    public Color dragonPartColor = new Color(0, 255, 0);
    @ConfigEntry.Category("Colors")
    @ConfigEntry.Gui.CollapsibleObject
    public Color eyeHeightColor = new Color(255, 0, 0);
    @ConfigEntry.Category("Colors")
    @ConfigEntry.Gui.CollapsibleObject
    public Color entityRotationVectorColor = new Color(0, 0, 255);
    @ConfigEntry.Category("Colors")
    @ConfigEntry.Gui.CollapsibleObject
    public Color entityTargetedColor = new Color(100, 100, 100);
    @ConfigEntry.Category("Colors")
    @ConfigEntry.Gui.CollapsibleObject
    public Color itemHitboxColor = new Color(255, 255, 255);


    public static class Color {
        public Color(int r, int g, int b) {
            this.red = r;
            this.green = g;
            this.blue = b;
        }
        @ConfigEntry.Gui.Tooltip
        public int red;
        @ConfigEntry.Gui.Tooltip
        public int green;
        @ConfigEntry.Gui.Tooltip
        public int blue;
        @ConfigEntry.Gui.Tooltip
        public int alpha = 100;
    }

    @Override
    public void validatePostLoad() throws ValidationException {

    }
}
