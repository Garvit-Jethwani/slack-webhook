// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

public class SlackAttachment_addMarkdownAttribute_25712be432_Test {

    @InjectMocks
    SlackAttachment slackAttachment;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddMarkdownAttribute() {
        String attr = "test";
        slackAttachment.addMarkdownAttribute(attr);
        assertTrue(slackAttachment.getMarkdownAttributes().contains(attr));
    }

    @Test
    public void testAddMarkdownAttributeWithNull() {
        String attr = null;
        slackAttachment.addMarkdownAttribute(attr);
        assertFalse(slackAttachment.getMarkdownAttributes().contains(attr));
    }

    @Test
    public void testAddMarkdownAttributeWithEmptyString() {
        String attr = "";
        slackAttachment.addMarkdownAttribute(attr);
        assertTrue(slackAttachment.getMarkdownAttributes().contains(attr));
    }
}
