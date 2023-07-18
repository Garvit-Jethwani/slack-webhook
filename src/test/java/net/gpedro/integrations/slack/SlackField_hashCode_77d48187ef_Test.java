// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SlackField_hashCode_77d48187ef_Test {

    private SlackField slackField;

    @BeforeEach
    public void setup() {
        slackField = new SlackField();
    }

    @Test
    public void testHashCode_AllNull() {
        int expected = 0;
        int actual = slackField.hashCode();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHashCode_AllowMarkdownNotNull() {
        slackField.setAllowMarkdown(true);
        int expected = slackField.getAllowMarkdown().hashCode();
        int actual = slackField.hashCode();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHashCode_ShortenTrue() {
        slackField.setShorten(true);
        int expected = 31;
        int actual = slackField.hashCode();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHashCode_TitleNotNull() {
        slackField.setTitle("Test Title");
        int expected = 31 * slackField.getTitle().hashCode();
        int actual = slackField.hashCode();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHashCode_ValueNotNull() {
        slackField.setValue("Test Value");
        int expected = 31 * slackField.getValue().hashCode();
        int actual = slackField.hashCode();
        Assertions.assertEquals(expected, actual);
    }
}
