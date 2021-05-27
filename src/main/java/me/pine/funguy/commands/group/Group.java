package me.pine.funguy.commands.group;

public class Group
{
    public String name;
    public String description = "no description";
    public String brief = "";
    public boolean admin = false;
    public final boolean hidden = false;
    public Group parentGroup;

    public Group() {}

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description) { this.description = description; }

    public void setAdmin(boolean admin)
    {
        this.admin = admin;
    }

    public void setBrief(String brief)
    {
        this.brief = brief;
    }

    public void setParentGroup(Group parentGroup)
    {
        this.parentGroup = parentGroup;
    }

    public String getName() { return this.name; }

    public String getDescription() { return this.description; }

    public String getBrief() { return this.brief; }

    public boolean isAdmin() { return admin; }

}
