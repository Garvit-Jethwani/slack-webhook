// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.net.Proxy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SlackApi_SlackApi_17c6f41c41_Test {

    private SlackApi slackApi;

    @BeforeEach
    public void setUp() {
        slackApi = Mockito.mock(SlackApi.class);
    }

    @Test
    public void testSlackApi_withValidInputs() {
        String service = "testService";
        int timeout = 2000;

        Mockito.when(slackApi.getService()).thenReturn(service);
        Mockito.when(slackApi.getTimeout()).thenReturn(timeout);

        assertEquals(service, slackApi.getService());
        assertEquals(timeout, slackApi.getTimeout());
    }

    @Test
    public void testSlackApi_withInvalidTimeout() {
        String service = "testService";
        int timeout = -2000;

        Mockito.when(slackApi.getService()).thenReturn(service);
        Mockito.when(slackApi.getTimeout()).thenReturn(timeout);

        assertEquals(service, slackApi.getService());
        assertThrows(IllegalArgumentException.class, () -> slackApi.getTimeout());
    }
}
