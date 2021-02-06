package com.ada;

/**
 * Created by contemplativemimosa on 12/4/20.
 */

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

public class Main {
    public static void main(String[] args){

        DiscordApi api = new DiscordApiBuilder()
                .setToken("") //there is a bot token connected, but it must remain private or functionality will be compromised
                .login().join();

        api.addListener(new Listener());


    }
}
