/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.store.tiered.metadata;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.rocketmq.remoting.protocol.RemotingSerializable;

public class TieredMetadataSerializeWrapper extends RemotingSerializable {
    private AtomicInteger maxTopicId;
    private Map<String /*topic*/, TopicMetadata> topicMetadataTable;
    private Map<String /*topic*/, Map<Integer /*queueId*/, QueueMetadata>> queueMetadataTable;


    public AtomicInteger getMaxTopicId() {
        return maxTopicId;
    }

    public void setMaxTopicId(AtomicInteger maxTopicId) {
        this.maxTopicId = maxTopicId;
    }

    public Map<String, TopicMetadata> getTopicMetadataTable() {
        return topicMetadataTable;
    }

    public void setTopicMetadataTable(
        Map<String, TopicMetadata> topicMetadataTable) {
        this.topicMetadataTable = topicMetadataTable;
    }

    public Map<String, Map<Integer, QueueMetadata>> getQueueMetadataTable() {
        return queueMetadataTable;
    }

    public void setQueueMetadataTable(
        Map<String, Map<Integer, QueueMetadata>> queueMetadataTable) {
        this.queueMetadataTable = queueMetadataTable;
    }
}
