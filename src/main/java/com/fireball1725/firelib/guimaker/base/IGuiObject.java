/*
 * Copyright 2017 FireBall1725
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.fireball1725.firelib.guimaker.base;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.awt.*;
import java.io.IOException;

public interface IGuiObject {
    @SideOnly(Side.CLIENT)
    void initGui(GuiContainer guiContainer);

    @SideOnly(Side.CLIENT)
    void drawScreen(GuiContainer guiContainer, int mouseX, int mouseY, float partialTicks);

    @SideOnly(Side.CLIENT)
    void drawGuiContainerForegroundLayer(GuiContainer guiContainer, int mouseX, int mouseY);

    @SideOnly(Side.CLIENT)
    void drawGuiContainerBackgroundLayer(GuiContainer guiContainer, float partialTicks, int mouseX, int mouseY);

    @SideOnly(Side.CLIENT)
    void mouseClicked(GuiContainer guiContainer, int mouseX, int mouseY, int mouseButton) throws IOException;

    @SideOnly(Side.CLIENT)
    void keyTyped(GuiContainer guiContainer, char typedChar, int keyCode) throws IOException;

    @SideOnly(Side.CLIENT)
    void onGuiClosed(GuiContainer guiContainer);

    @SideOnly(Side.CLIENT)
    void updateScreen(GuiContainer guiContainer);

    NBTTagCompound writeNBT();

    void readNBT(NBTTagCompound nbt);

    @SideOnly(Side.CLIENT)
    default Rectangle getClickableArea(GuiContainer guiContainer) {
        return null;
    }
}
