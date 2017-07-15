package com.amandasv.library;

import org.junit.Assert;
import org.junit.Test;

public class WelcomeTest {

    @Test
    public void welcomeMessageShouldAppear() {
        Welcome welcome = new Welcome();
        welcome.showMessage();

    }

}
