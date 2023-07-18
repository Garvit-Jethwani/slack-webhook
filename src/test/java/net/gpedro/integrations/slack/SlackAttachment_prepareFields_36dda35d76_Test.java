// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

public class SlackAttachment_prepareFields_36dda35d76_Test {

    private SlackAttachment slackAttachment;
    private List<SlackField> fields;

    @BeforeEach
    public void setup() {
        slackAttachment = new SlackAttachment();
        fields = new ArrayList<>();
        // TODO: Add your fields here
        fields.add(new SlackField("title1", "value1", false));
        fields.add(new SlackField("title2", "value2", true));
        slackAttachment.setFields(fields);
    }

    @Test
    public void testPrepareFields() {
        JsonArray actual = slackAttachment.prepareFields();
        JsonArray expected = new JsonArray();
        for (SlackField field : fields) {
            expected.add(field.toJson());
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testPrepareFieldsWithNoFields() {
        slackAttachment.setFields(new ArrayList<>());
        JsonArray actual = slackAttachment.prepareFields();
        assertEquals(new JsonArray(), actual);
    }
}