package me.pine.funguy.commands.general;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CommandListener extends ListenerAdapter
{
    CommandGroup mainGroup = new CommandGroup();

    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        //String guild = event.getGuild().getId(); // custom prefix to be implemented
        String prefix = new DefaultGuildValues().defaultPrefix;
        String unmodifiedMessage = event.getMessage().getContentRaw();
        if (unmodifiedMessage.startsWith(prefix))
        {
            String[] noprefix = unmodifiedMessage.replaceFirst(prefix, "").split(" ");
            String command = noprefix[0];
            noprefix[0] = null;
            String[] args = noprefix;

        }


    }
}
