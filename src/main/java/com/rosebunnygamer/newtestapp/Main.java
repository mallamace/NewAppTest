package com.rosebunnygamer.newtestapp;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.github.philippheuer.credentialmanager.domain.OAuth2Credential;
import com.github.twitch4j.TwitchClient;
import com.github.twitch4j.TwitchClientBuilder;

import java.io.InputStream;


public class Main {

    private TwitchClient twitchClient;
    public Config config;

    public static void main(String[] args){

        //Client Builder Example from https://twitch4j.gitlab.io/twitch4j/getting-started/client-builder/


        // What's going on here?
        TwitchClientBuilder clientBuilder = TwitchClientBuilder.builder();
        OAuth2Credential credential = new OAuth2Credential(  //region Auth
                "twitch",
                "oauth:s9vpxiwr18tbcvmyri0491y9q3r248"
        );  //endregion

        //region TwitchClient
        TwitchClient twitchClient = TwitchClientBuilder.builder()
                .withChatAccount(credential)
                .withEnableHelix(true)
                .withEnableChat(true)
                .build();
        ///endregion

        twitchClient.getChat().sendMessage("fifthnail", "Hello, world!");

        //System.out.println("OK OK OK OK ");
    }


    private void loadConfiguration() {
        try {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream is = classloader.getResourceAsStream("config.yaml");

            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            config = mapper.readValue(is, Config.class);

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Unable to load Configuration ... Exiting.");
            System.exit(1);
        }


    }
}
