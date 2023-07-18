// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class SlackMessage_prepareAttach_20c695829a_Test {

    private SlackMessage slackMessage;
    private List<SlackAttachment> attachments;

    @BeforeEach
    public void setup() {
        slackMessage = new SlackMessage();
        attachments = new ArrayList<>();
        // TODO: Add your own SlackAttachment objects to the list
        for (int i = 0; i < 3; i++) {
            SlackAttachment attachment = mock(SlackAttachment.class);
            when(attachment.toJson()).thenReturn(new JsonObject());
            attachments.add(attachment);
        }
    }

    @Test
    public void testPrepareAttach() {
        JsonArray expectedArray = new JsonArray();
        for (SlackAttachment attachment : attachments) {
            expectedArray.add(attachment.toJson());
        }

        assertEquals(expectedArray, slackMessage.prepareAttach());
    }

    @Test
    public void testPrepareAttachWithEmptyAttachments() {
        attachments.clear();
        JsonArray expectedArray = new JsonArray();

        assertEquals(expectedArray, slackMessage.prepareAttach());
    }
}