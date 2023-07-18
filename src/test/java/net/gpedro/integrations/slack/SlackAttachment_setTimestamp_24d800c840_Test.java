// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlackAttachment_setTimestamp_24d800c840_Test {

    private SlackAttachment slackAttachment;

    @BeforeEach
    public void setup() {
        slackAttachment = new SlackAttachment();
    }

    @Test
    public void testSetTimestamp() {
        Long timestamp = System.currentTimeMillis();
        slackAttachment.setTimestamp(timestamp);
        assertEquals(timestamp, slackAttachment.getTimestamp(), "The timestamp should match the set value");
    }

    @Test
    public void testSetTimestampNull() {
        slackAttachment.setTimestamp(null);
        assertEquals(null, slackAttachment.getTimestamp(), "The timestamp should be null");
    }
}
