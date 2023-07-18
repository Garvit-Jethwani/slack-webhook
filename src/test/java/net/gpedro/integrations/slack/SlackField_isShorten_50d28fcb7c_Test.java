// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SlackField_isShorten_50d28fcb7c_Test {

    private SlackField slackField;

    @BeforeEach
    public void setUp() {
        slackField = new SlackField();
    }

    @Test
    public void testIsShorten_whenShortenIsTrue() {
        slackField.setShorten(true);
        boolean result = slackField.isShorten();
        Assertions.assertTrue(result, "Expected true when shorten is set to true");
    }

    @Test
    public void testIsShorten_whenShortenIsFalse() {
        slackField.setShorten(false);
        boolean result = slackField.isShorten();
        Assertions.assertFalse(result, "Expected false when shorten is set to false");
    }
}
