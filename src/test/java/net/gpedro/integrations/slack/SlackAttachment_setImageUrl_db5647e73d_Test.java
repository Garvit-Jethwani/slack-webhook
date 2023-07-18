// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SlackAttachment_setImageUrl_db5647e73d_Test {

    private SlackAttachment slackAttachment;

    @BeforeEach
    public void setup() {
        slackAttachment = new SlackAttachment();
    }

    @Test
    public void testSetImageUrl_Success() {
        String imageUrl = "http://example.com/image.jpg";
        slackAttachment.setImageUrl(imageUrl);
        assertEquals(imageUrl, slackAttachment.getImageUrl());
    }

    @Test
    public void testSetImageUrl_Null() {
        String imageUrl = null;
        slackAttachment.setImageUrl(imageUrl);
        assertEquals(imageUrl, slackAttachment.getImageUrl());
    }
}