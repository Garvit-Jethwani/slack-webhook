// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class SlackAttachment_addAction_534f1e1a18_Test {

    @Mock
    private SlackAction action;

    private SlackAttachment slackAttachment;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        slackAttachment = new SlackAttachment();
    }

    @Test
    public void testAddAction_Success() {
        slackAttachment.addAction(action);
        assertEquals(1, slackAttachment.getActions().size());
        assertEquals(action, slackAttachment.getActions().get(0));
    }

    @Test
    public void testAddAction_NullAction() {
        slackAttachment.addAction(null);
        assertEquals(0, slackAttachment.getActions().size());
    }
}
