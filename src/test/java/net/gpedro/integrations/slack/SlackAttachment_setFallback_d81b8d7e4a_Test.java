// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SlackAttachment_setFallback_d81b8d7e4a_Test {

    private SlackAttachment slackAttachment;

    @BeforeEach
    public void setup() {
        slackAttachment = new SlackAttachment();
    }

    @Test
    public void testSetFallback_Success() {
        String fallback = "Test fallback";
        slackAttachment.setFallback(fallback);
        assertEquals(fallback, slackAttachment.getFallback(), "Fallback should be set correctly");
    }

    @Test
    public void testSetFallback_Null() {
        String fallback = null;
        slackAttachment.setFallback(fallback);
        assertNull(slackAttachment.getFallback(), "Fallback should be null");
    }
}
