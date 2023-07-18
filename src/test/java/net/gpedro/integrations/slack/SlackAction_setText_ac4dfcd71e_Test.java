// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SlackAction_setText_ac4dfcd71e_Test {

    private SlackAction slackAction;

    @BeforeEach
    public void setup() {
        slackAction = new SlackAction();
    }

    @Test
    public void testSetText() {
        // TODO: Replace 'sample text' with the text you want to set
        String expectedText = "sample text";
        slackAction.setText(expectedText);
        assertEquals(expectedText, slackAction.getText(), "The set text should match the expected text");
    }

    @Test
    public void testSetTextWithEmptyString() {
        String expectedText = "";
        slackAction.setText(expectedText);
        assertEquals(expectedText, slackAction.getText(), "The set text should match the expected text even if it's an empty string");
    }

    @Test
    public void testSetTextWithNull() {
        String expectedText = null;
        slackAction.setText(expectedText);
        assertEquals(expectedText, slackAction.getText(), "The set text should match the expected text even if it's null");
    }
}
