// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlackAttachment_setCallbackId_7a949957f7_Test {

    private SlackAttachment slackAttachment;
    
    @BeforeEach
    public void setUp() {
        slackAttachment = new SlackAttachment();
    }

    @Test
    public void testSetCallbackId() {
        String callbackId = "testCallbackId";
        slackAttachment.setCallbackId(callbackId);
        assertEquals(callbackId, slackAttachment.getCallbackId());
    }

    @Test
    public void testSetCallbackIdWithNull() {
        String callbackId = null;
        slackAttachment.setCallbackId(callbackId);
        assertEquals(callbackId, slackAttachment.getCallbackId());
    }
}
