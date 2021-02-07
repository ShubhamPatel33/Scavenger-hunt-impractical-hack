package com.ada;

import java.util.*;

import org.javacord.api.entity.channel.PrivateChannel;
import org.javacord.api.entity.message.MessageAuthor;
import org.javacord.api.entity.server.Server;
import org.javacord.api.entity.server.ServerUpdater;
import org.javacord.api.entity.user.User;
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
        Optional<User> use = event.getMessageAuthor().asUser();
        if (event.getMessageContent().equalsIgnoreCase("jabberwocky") || event.getMessageContent().equalsIgnoreCase("jabberwock")) {
            use.ifPresent( user -> user.sendMessage("So rested he by the Tumtum Tree" +
                    "\nAnd stood awhile in thought. \n What tool do you need? "));
        } else if (event.getMessageContent().equalsIgnoreCase("vorpal sword")) {
            use.ifPresent(user -> user.sendMessage("The Jabberwock, with eyes of flame," +
                    "\n Came whiffling through the tulgey wood," +
                    "\n and burbled as it came! \n What does the vorpal sword go?"));
        }
        else if (event.getMessageContent().equalsIgnoreCase("snickersnack")) {
            use.ifPresent(user -> user.sendMessage("Oh frabjous day! Calloh! Callay!" +
                    "\nhttps://thegu5.github.io/impractical-hackers/congrats.html"));

        }else if (event.getMessageContent().equalsIgnoreCase("begin")) {
            use.ifPresent(user -> user.sendMessage("Welcome to the rabbit hole," +
                    "\nYou've fallen down today." +
                    "\nI'm here to help you in your search," +
                    "\n and not lead you astray."
                    + "\nIn this land there is a beast we need your help to slay." +
                    "\nIf you remember it's name then write it out, \nand we will send you on your way"));
        }else if (event.getMessageContent().equalsIgnoreCase("!help")) {
            use.ifPresent(user -> user.sendMessage("Simply type begin to start."));
        }else{
            use.ifPresent(user -> user.sendMessage("I'm afraid that does not connect, \n try and get it correct!"));
        }
    }

}
