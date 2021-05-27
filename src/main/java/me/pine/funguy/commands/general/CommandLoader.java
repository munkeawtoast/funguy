package me.pine.funguy.commands.general;

import me.pine.funguy.commands.group.Group;

import java.util.ArrayList;

public class CommandLoader
{
    private ArrayList<Command> commands;
    private ArrayList<Group> groups;

    private Group mainGroup() { return new Group(); }
    public CommandLoader()
    {
        this.commands = new ArrayList<Command>();
        this.groups = new ArrayList<Group>();
    }

    public CommandLoader(boolean loaddefault)
    {

    }

    public void addCommand(Command command)
    {
        this.commands.add(command);
    }

    public void addGroup(Group group)
    {
        this.groups.add(group);
    }
    public void build()
    {
        for (Command i : commands)
        {
            while (true)
            {
                Group aaa = i.parentGroup;
                if (aaa != null)
                {

                } else break;
            }

        }
    }

}
