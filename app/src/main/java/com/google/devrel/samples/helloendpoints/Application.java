package com.google.devrel.samples.helloendpoints;

import com.appspot.brave_monitor_820.helloworld.model.HelloGreeting;
import com.appspot.brave_monitor_820.helloworld.model.HelloGreetingCollection;
import com.google.api.client.util.Lists;

import java.util.ArrayList;

/**
 * Dummy Application class that can hold static data for use only in sample applications.
 *
 * TODO(developer): Implement a proper data storage technique for your application.
 */
public class Application extends android.app.Application {
    ArrayList<HelloGreeting> greetings = Lists.newArrayList();
}