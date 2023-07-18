// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;

public class SlackMessage_setChannel_74956d50ce_Test {

    private SlackMessage slackMessage;

    @Before
    public void setUp() {
        slackMessage = Mockito.mock(SlackMessage.class);
    }

    @Test
    public void testSetChannelSuccess() {
        Mockito.when(slackMessage.setChannel("channel1")).thenReturn(slackMessage);
        slackMessage = slackMessage.setChannel("channel1");
        assertEquals("channel1", slackMessage.getChannel());
    }

    @Test
    public void testSetChannelNull() {
        Mockito.when(slackMessage.setChannel(null)).thenReturn(slackMessage);
        slackMessage = slackMessage.setChannel(null);
        assertEquals(null, slackMessage.getChannel());
    }
}
