// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlackField_setShorten_0df2cffd87_Test {
    private SlackField slackField;

    @BeforeEach
    public void setUp() {
        slackField = new SlackField();
    }

    @Test
    public void testSetShortenTrue() {
        slackField.setShorten(true);
        assertEquals(true, slackField.isShorten());
    }

    @Test
    public void testSetShortenFalse() {
        slackField.setShorten(false);
        assertEquals(false, slackField.isShorten());
    }
}
