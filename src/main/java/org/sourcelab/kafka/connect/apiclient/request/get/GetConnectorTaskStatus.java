package org.sourcelab.kafka.connect.apiclient.request.get;

import com.sun.xml.internal.rngom.util.Uri;
import org.sourcelab.kafka.connect.apiclient.request.JacksonFactory;
import org.sourcelab.kafka.connect.apiclient.request.dto.TaskStatus;

import java.io.IOException;

public class GetConnectorTaskStatus implements GetRequest<TaskStatus> {

    private final String connectorName;
    private final int taskId;

    public GetConnectorTaskStatus(final String connectorName, final int taskId) {
        if (connectorName == null) {
            throw new NullPointerException("connectorName parameter may not be null!");
        }
        this.connectorName = connectorName;
        this.taskId = taskId;
    }

    @Override
    public String getApiEndpoint() {
        return "/connectors/" + Uri.escapeDisallowedChars(connectorName) + "/tasks/" + taskId + "/status";
    }

    @Override
    public Object getRequestBody() {
        return null;
    }

    @Override
    public TaskStatus parseResponse(final String responseStr) throws IOException {
        return JacksonFactory.newInstance().readValue(responseStr, TaskStatus.class);
    }
}