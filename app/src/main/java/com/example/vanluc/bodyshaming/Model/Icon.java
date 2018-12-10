package com.example.vanluc.bodyshaming.Model;

public class Icon {
    private int icon;
    private String textIcon;

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTextIcon() {
        return textIcon;
    }

    public void setTextIcon(String textIcon) {
        this.textIcon = textIcon;
    }

    public Icon(int icon, String textIcon) {

        this.icon = icon;
        this.textIcon = textIcon;
    }
}
