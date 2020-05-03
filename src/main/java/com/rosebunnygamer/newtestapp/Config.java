package com.rosebunnygamer.newtestapp;

import java.util.List;
import java.util.Map;


//
// I really don't know what I'm doing here, I believe in the chatbot example there is a configuration class
// that we are using to define the credentialsm that are needed to connect. This is some psuedo code.
//
public class Config {

    private Boolean debug;
    private Map<String, String> bot; // bot for what? I don't understand this
    private Map<String, String> api; // do I need to delcare this here? if not where? is this my Twitch app token api?
    private Map<String, String> credentials; // is this my Twitch app token api?
    private List<String> channels; // there will only be one channel that I'm managing can I make this static?

    //Constructor
    public static void Config(){


    }

    public Map<String, String> getApi() {
        return api;
    }
    public void setApi(Map<String, String> api) {
        this.api = api;
    }



    @Override
    public String toString() {
        return "Configuration{" +
                "bot=" + bot +
                ", api=" + api +
                ", credentials=" + credentials +
                ", channels=" + channels +
                '}';
    }
}
