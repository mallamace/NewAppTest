package com.rosebunnygamer.newtestapp;



import com.github.twitch4j.TwitchClient;
import com.github.twitch4j.TwitchClientBuilder;


public class Main {

    private TwitchClient twitchClient;

    public static void Main(String[] args){

        //Client Builder Example from https://twitch4j.gitlab.io/twitch4j/getting-started/client-builder/

        TwitchClient twitchClient = TwitchClientBuilder.builder()
                .withEnableHelix(true)
                .build();

        System.out.println("OK OK OK OK ");
    }
}
