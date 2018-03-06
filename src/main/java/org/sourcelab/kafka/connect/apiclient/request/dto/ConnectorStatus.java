/**
 * Copyright 2018 SourceLab.org https://github.com/SourceLabOrg/kafka-connect-client
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.sourcelab.kafka.connect.apiclient.request.dto;

import java.util.List;
import java.util.Map;

/**
 * Represents the status of a deployed connector.
 */
public final class ConnectorStatus {
    private String name;
    private Map<String, String> connector;
    private List<TaskStatus> tasks;

    public String getName() {
        return name;
    }

    public Map<String, String> getConnector() {
        return connector;
    }

    public List<TaskStatus> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "ConnectorStatus{"
            + "name='" + name + '\''
            + ", connector=" + connector
            + ", tasks=" + tasks
            + '}';
    }

    /**
     * Defines the status of a Task.
     */
    private static final class TaskStatus {
        private int id;
        private String state;
        private String workerId;
        private String trace;

        public int getId() {
            return id;
        }

        public String getState() {
            return state;
        }

        public String getWorkerId() {
            return workerId;
        }

        public String getTrace() {
            return trace;
        }

        @Override
        public String toString() {
            return "TaskStatus{"
                + "id=" + id
                + ", state='" + state + '\''
                + ", workerId='" + workerId + '\''
                + ", trace='" + trace + '\''
                + '}';
        }
    }
}
