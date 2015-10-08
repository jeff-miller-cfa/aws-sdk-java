/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * TopicRuleMarshaller
 */
public class TopicRuleJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(TopicRule topicRule, JSONWriter jsonWriter) {
        if (topicRule == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (topicRule.getRuleName() != null) {
                jsonWriter.key("ruleName").value(topicRule.getRuleName());
            }

            if (topicRule.getSql() != null) {
                jsonWriter.key("sql").value(topicRule.getSql());
            }

            if (topicRule.getDescription() != null) {
                jsonWriter.key("description").value(topicRule.getDescription());
            }

            if (topicRule.getCreatedAt() != null) {
                jsonWriter.key("createdAt").value(topicRule.getCreatedAt());
            }

            java.util.List<Action> actionsList = topicRule.getActions();
            if (actionsList != null) {
                jsonWriter.key("actions");
                jsonWriter.array();
                for (Action actionsListValue : actionsList) {
                    if (actionsListValue != null) {

                        ActionJsonMarshaller.getInstance().marshall(
                                actionsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (topicRule.getRuleDisabled() != null) {
                jsonWriter.key("ruleDisabled").value(
                        topicRule.getRuleDisabled());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TopicRuleJsonMarshaller instance;

    public static TopicRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TopicRuleJsonMarshaller();
        return instance;
    }

}
