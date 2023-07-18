// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import com.google.gson.JsonObject;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class SlackApi_send_85eb5e756b_Test {

    @Mock
    private HttpURLConnection connection;

    @Mock
    private URL url;

    @InjectMocks
    private SlackApi slackApi;

    @Before
    public void setup() throws IOException {
        MockitoAnnotations.initMocks(this);
        when(url.openConnection()).thenReturn(connection);
    }

    @Test
    public void testSend_success() throws IOException {
        JsonObject message = new JsonObject();
        message.addProperty("text", "Hello, World!");

        String responseMessage = "ok";
        InputStream inputStream = new ByteArrayInputStream(responseMessage.getBytes());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        when(connection.getInputStream()).thenReturn(inputStream);
        when(connection.getResponseCode()).thenReturn(HttpURLConnection.HTTP_OK);

        String response = slackApi.send(message);

        assertEquals(responseMessage, response);
        verify(connection, times(1)).disconnect();
    }

    @Test(expected = SlackException.class)
    public void testSend_failure() throws IOException {
        JsonObject message = new JsonObject();
        message.addProperty("text", "Hello, World!");

        when(connection.getResponseCode()).thenReturn(HttpURLConnection.HTTP_BAD_REQUEST);

        slackApi.send(message);

        verify(connection, times(1)).disconnect();
    }
}
