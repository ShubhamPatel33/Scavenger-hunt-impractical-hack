package com.ada;

import java.util.*;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;
import org.javacord.core.entity.user.Member;

/**
 * Created by nhe on 12/4/20.
 */

public class Listener implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        System.out.println("event is ]  " + event);

        if (event.getMessageContent().equalsIgnoreCase("!start")) {
            event.getChannel().sendMessage("Welcome to the rabbit hole,"+
            "\n You've fallen down today."+"\n I'm here to help you find your way, \n and not lead you astray."
            +"\n ");
        }

        //choose a class
        else if (event.getMessageContent().equalsIgnoreCase("")) {
            event.getChannel().sendMessage("");
        } else if (event.getMessageContent().equalsIgnoreCase("")) {
            event.getChannel().sendMessage("");
        }
        //command dictionary
        else if (event.getMessageContent().equalsIgnoreCase("!help")) {
            event.getChannel().sendMessage();
        }
}
