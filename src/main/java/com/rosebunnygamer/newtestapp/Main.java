package com.rosebunnygamer.newtestapp;



import com.rosebunnygamer.TwitchClient;
import com.rosebunnygamer.TwitchClientBuilder;

public class Main {


    public static void Main(String[] args){

        //Client Builder Example from https://twitch4j.gitlab.io/twitch4j/getting-started/client-builder/

        TwitchClient twitchClient = TwitchClientBuilder.builder()
                .withEventManager(eventManager)
                .build();

        System.out.println("OK OK OK OK ");
    }
}
