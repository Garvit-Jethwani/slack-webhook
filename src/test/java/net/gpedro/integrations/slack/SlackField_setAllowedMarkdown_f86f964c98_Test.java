// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
public class SlackField_setAllowedMarkdown_f86f964c98_Test {

    @Mock
    private ArrayList<String> allowMarkdown;

    private SlackField slackField;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        slackField = new SlackField();
    }

    @Test
    public void testSetAllowedMarkdown_WithNonNullValue() {
        when(allowMarkdown.size()).thenReturn(3);
        slackField.setAllowedMarkdown(allowMarkdown);
        assertEquals(3, slackField.getAllowedMarkdown().size());
    }

    @Test
    public void testSetAllowedMarkdown_WithNullValue() {
        slackField.setAllowedMarkdown(null);
        assertNull(slackField.getAllowedMarkdown());
    }
}