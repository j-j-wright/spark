/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.spark.internal

import java.util.Locale

/**
 * All structured logging `keys` used in `MDC` must be extends `LogKey`
 */
trait LogKey {
  val name: String = this.toString.toLowerCase(Locale.ROOT)
}

/**
 * Various keys used for mapped diagnostic contexts(MDC) in logging.
 * All structured logging keys should be defined here for standardization.
 */
object LogKeys {
  case object ACCUMULATOR_ID extends LogKey
  case object ACTUAL_NUM_FILES extends LogKey
  case object ACTUAL_PARTITION_COLUMN extends LogKey
  case object ALPHA extends LogKey
  case object ANALYSIS_ERROR extends LogKey
  case object APP_ATTEMPT_ID extends LogKey
  case object APP_DESC extends LogKey
  case object APP_ID extends LogKey
  case object APP_NAME extends LogKey
  case object APP_STATE extends LogKey
  case object ARGS extends LogKey
  case object BACKUP_FILE extends LogKey
  case object BATCH_ID extends LogKey
  case object BATCH_TIMESTAMP extends LogKey
  case object BATCH_WRITE extends LogKey
  case object BLOCK_ID extends LogKey
  case object BLOCK_MANAGER_ID extends LogKey
  case object BROADCAST_ID extends LogKey
  case object BUCKET extends LogKey
  case object BYTECODE_SIZE extends LogKey
  case object CACHED_TABLE_PARTITION_METADATA_SIZE extends LogKey
  case object CACHE_AUTO_REMOVED_SIZE extends LogKey
  case object CACHE_UNTIL_HIGHEST_CONSUMED_SIZE extends LogKey
  case object CACHE_UNTIL_LAST_PRODUCED_SIZE extends LogKey
  case object CALL_SITE_LONG_FORM extends LogKey
  case object CATALOG_NAME extends LogKey
  case object CATEGORICAL_FEATURES extends LogKey
  case object CHECKPOINT_FILE extends LogKey
  case object CHECKPOINT_LOCATION extends LogKey
  case object CHECKPOINT_PATH extends LogKey
  case object CHECKPOINT_ROOT extends LogKey
  case object CHECKPOINT_TIME extends LogKey
  case object CHECKSUM_FILE_NUM extends LogKey
  case object CHOSEN_WATERMARK extends LogKey
  case object CLASS_LOADER extends LogKey
  case object CLASS_NAME extends LogKey
  case object CLUSTER_CENTROIDS extends LogKey
  case object CLUSTER_ID extends LogKey
  case object CLUSTER_LABEL extends LogKey
  case object CLUSTER_LEVEL extends LogKey
  case object CLUSTER_WEIGHT extends LogKey
  case object CODEC_LEVEL extends LogKey
  case object CODEC_NAME extends LogKey
  case object CODEGEN_STAGE_ID extends LogKey
  case object COLUMN_DATA_TYPE_SOURCE extends LogKey
  case object COLUMN_DATA_TYPE_TARGET extends LogKey
  case object COLUMN_DEFAULT_VALUE extends LogKey
  case object COLUMN_NAME extends LogKey
  case object COMMAND extends LogKey
  case object COMMAND_OUTPUT extends LogKey
  case object COMMITTED_VERSION extends LogKey
  case object COMPACT_INTERVAL extends LogKey
  case object COMPONENT extends LogKey
  case object CONFIG extends LogKey
  case object CONFIG2 extends LogKey
  case object CONFIG3 extends LogKey
  case object CONFIG4 extends LogKey
  case object CONFIG5 extends LogKey
  case object CONSUMER extends LogKey
  case object CONTAINER extends LogKey
  case object CONTAINER_ID extends LogKey
  case object CONTAINER_STATE extends LogKey
  case object COST extends LogKey
  case object COUNT extends LogKey
  case object CROSS_VALIDATION_METRIC extends LogKey
  case object CROSS_VALIDATION_METRICS extends LogKey
  case object CSV_HEADER_COLUMN_NAME extends LogKey
  case object CSV_HEADER_COLUMN_NAMES extends LogKey
  case object CSV_HEADER_LENGTH extends LogKey
  case object CSV_SCHEMA_FIELD_NAME extends LogKey
  case object CSV_SCHEMA_FIELD_NAMES extends LogKey
  case object CSV_SOURCE extends LogKey
  case object CURRENT_BATCH_ID extends LogKey
  case object CURRENT_PATH extends LogKey
  case object DATA extends LogKey
  case object DATABASE_NAME extends LogKey
  case object DATAFRAME_CACHE_ENTRY extends LogKey
  case object DATAFRAME_ID extends LogKey
  case object DATA_FILE_NUM extends LogKey
  case object DATA_SOURCE extends LogKey
  case object DATA_SOURCES extends LogKey
  case object DATA_SOURCE_PROVIDER extends LogKey
  case object DEFAULT_COMPACT_INTERVAL extends LogKey
  case object DEFAULT_ISOLATION_LEVEL extends LogKey
  case object DEFAULT_VALUE extends LogKey
  case object DELAY extends LogKey
  case object DELEGATE extends LogKey
  case object DELTA extends LogKey
  case object DESCRIPTION extends LogKey
  case object DESIRED_PARTITIONS_SIZE extends LogKey
  case object DFS_FILE extends LogKey
  case object DIFF_DELTA extends LogKey
  case object DIVISIBLE_CLUSTER_INDICES_SIZE extends LogKey
  case object DRIVER_ID extends LogKey
  case object DROPPED_PARTITIONS extends LogKey
  case object DURATION extends LogKey
  case object EFFECTIVE_STORAGE_LEVEL extends LogKey
  case object ELAPSED_TIME extends LogKey
  case object ENCODING extends LogKey
  case object END_INDEX extends LogKey
  case object END_POINT extends LogKey
  case object END_VERSION extends LogKey
  case object ENGINE extends LogKey
  case object EPOCH extends LogKey
  case object ERROR extends LogKey
  case object ESTIMATOR_PARAMETER_MAP extends LogKey
  case object EVENT_LOOP extends LogKey
  case object EVENT_QUEUE extends LogKey
  case object EXCEPTION extends LogKey
  case object EXECUTE_INFO extends LogKey
  case object EXECUTE_KEY extends LogKey
  case object EXECUTION_PLAN_LEAVES extends LogKey
  case object EXECUTOR_DESIRED_COUNT extends LogKey
  case object EXECUTOR_ENVS extends LogKey
  case object EXECUTOR_ENV_REGEX extends LogKey
  case object EXECUTOR_ID extends LogKey
  case object EXECUTOR_IDS extends LogKey
  case object EXECUTOR_LAUNCH_COMMANDS extends LogKey
  case object EXECUTOR_LAUNCH_COUNT extends LogKey
  case object EXECUTOR_RESOURCES extends LogKey
  case object EXECUTOR_STATE extends LogKey
  case object EXECUTOR_TARGET_COUNT extends LogKey
  case object EXISTING_FILE extends LogKey
  case object EXIT_CODE extends LogKey
  case object EXPECTED_NUM_FILES extends LogKey
  case object EXPECTED_PARTITION_COLUMN extends LogKey
  case object EXPIRY_TIMESTAMP extends LogKey
  case object EXPR extends LogKey
  case object EXPR_TERMS extends LogKey
  case object EXTENDED_EXPLAIN_GENERATOR extends LogKey
  case object FAILURES extends LogKey
  case object FALLBACK_VERSION extends LogKey
  case object FEATURE_COLUMN extends LogKey
  case object FEATURE_DIMENSION extends LogKey
  case object FIELD_NAME extends LogKey
  case object FILE_ABSOLUTE_PATH extends LogKey
  case object FILE_END_OFFSET extends LogKey
  case object FILE_FORMAT extends LogKey
  case object FILE_FORMAT2 extends LogKey
  case object FILE_MODIFICATION_TIME extends LogKey
  case object FILE_NAME extends LogKey
  case object FILE_START_OFFSET extends LogKey
  case object FILE_VERSION extends LogKey
  case object FINAL_PATH extends LogKey
  case object FINISH_TRIGGER_DURATION extends LogKey
  case object FROM_OFFSET extends LogKey
  case object FROM_TIME extends LogKey
  case object FUNCTION_NAME extends LogKey
  case object FUNCTION_PARAMETER extends LogKey
  case object GLOBAL_WATERMARK extends LogKey
  case object GROUP_ID extends LogKey
  case object HADOOP_VERSION extends LogKey
  case object HASH_JOIN_KEYS extends LogKey
  case object HEARTBEAT_INTERVAL extends LogKey
  case object HISTORY_DIR extends LogKey
  case object HIVE_CLIENT_VERSION extends LogKey
  case object HIVE_METASTORE_VERSION extends LogKey
  case object HIVE_OPERATION_STATE extends LogKey
  case object HIVE_OPERATION_TYPE extends LogKey
  case object HOST extends LogKey
  case object HOST_PORT extends LogKey
  case object IDENTIFIER extends LogKey
  case object INCOMPATIBLE_TYPES extends LogKey
  case object INDEX extends LogKey
  case object INDEX_FILE_NUM extends LogKey
  case object INDEX_NAME extends LogKey
  case object INFERENCE_MODE extends LogKey
  case object INITIAL_CAPACITY extends LogKey
  case object INITIAL_HEARTBEAT_INTERVAL extends LogKey
  case object INIT_MODE extends LogKey
  case object INTERVAL extends LogKey
  case object ISOLATION_LEVEL extends LogKey
  case object JOB_ID extends LogKey
  case object JOIN_CONDITION extends LogKey
  case object JOIN_CONDITION_SUB_EXPR extends LogKey
  case object K8S_CONTEXT extends LogKey
  case object KAFKA_PULLS_COUNT extends LogKey
  case object KAFKA_RECORDS_PULLED_COUNT extends LogKey
  case object KEY extends LogKey
  case object KEYTAB extends LogKey
  case object LABEL_COLUMN extends LogKey
  case object LARGEST_CLUSTER_INDEX extends LogKey
  case object LAST_ACCESS_TIME extends LogKey
  case object LAST_VALID_TIME extends LogKey
  case object LATEST_BATCH_ID extends LogKey
  case object LATEST_COMMITTED_BATCH_ID extends LogKey
  case object LEARNING_RATE extends LogKey
  case object LEFT_EXPR extends LogKey
  case object LINE extends LogKey
  case object LINE_NUM extends LogKey
  case object LISTENER extends LogKey
  case object LOADED_VERSION extends LogKey
  case object LOAD_FACTOR extends LogKey
  case object LOAD_TIME extends LogKey
  case object LOGICAL_PLAN_COLUMNS extends LogKey
  case object LOGICAL_PLAN_LEAVES extends LogKey
  case object LOG_ID extends LogKey
  case object LOG_OFFSET extends LogKey
  case object LOG_TYPE extends LogKey
  case object LOWER_BOUND extends LogKey
  case object MALFORMATTED_STIRNG extends LogKey
  case object MASTER_URL extends LogKey
  case object MAX_ATTEMPTS extends LogKey
  case object MAX_CACHE_UNTIL_HIGHEST_CONSUMED_SIZE extends LogKey
  case object MAX_CACHE_UNTIL_LAST_PRODUCED_SIZE extends LogKey
  case object MAX_CAPACITY extends LogKey
  case object MAX_CATEGORIES extends LogKey
  case object MAX_EXECUTOR_FAILURES extends LogKey
  case object MAX_FILE_VERSION extends LogKey
  case object MAX_MEMORY_SIZE extends LogKey
  case object MAX_PARTITIONS_SIZE extends LogKey
  case object MAX_SIZE extends LogKey
  case object MAX_TABLE_PARTITION_METADATA_SIZE extends LogKey
  case object MEMORY_SIZE extends LogKey
  case object MERGE_DIR_NAME extends LogKey
  case object MESSAGE extends LogKey
  case object METADATA_DIRECTORY extends LogKey
  case object METADATA_JSON extends LogKey
  case object METHOD_NAME extends LogKey
  case object METRICS_JSON extends LogKey
  case object MIN_COMPACTION_BATCH_ID extends LogKey
  case object MIN_FREQUENT_PATTERN_COUNT extends LogKey
  case object MIN_POINT_PER_CLUSTER extends LogKey
  case object MIN_SIZE extends LogKey
  case object MIN_VERSION_NUMBER extends LogKey
  case object MODEL_WEIGHTS extends LogKey
  case object NAMESPACE extends LogKey
  case object NEW_FEATURE_COLUMN_NAME extends LogKey
  case object NEW_LABEL_COLUMN_NAME extends LogKey
  case object NEW_PATH extends LogKey
  case object NEW_VALUE extends LogKey
  case object NODES extends LogKey
  case object NODE_LOCATION extends LogKey
  case object NORM extends LogKey
  case object NUM_BIN extends LogKey
  case object NUM_BYTES extends LogKey
  case object NUM_CLASSES extends LogKey
  case object NUM_COLUMNS extends LogKey
  case object NUM_EXAMPLES extends LogKey
  case object NUM_FEATURES extends LogKey
  case object NUM_FILES extends LogKey
  case object NUM_FILES_COPIED extends LogKey
  case object NUM_FILES_FAILED_TO_DELETE extends LogKey
  case object NUM_FILES_REUSED extends LogKey
  case object NUM_FREQUENT_ITEMS extends LogKey
  case object NUM_ITERATIONS extends LogKey
  case object NUM_LOCAL_FREQUENT_PATTERN extends LogKey
  case object NUM_PARTITION extends LogKey
  case object NUM_POINT extends LogKey
  case object NUM_PREFIXES extends LogKey
  case object NUM_SEQUENCES extends LogKey
  case object OBJECT_ID extends LogKey
  case object OFFSET extends LogKey
  case object OFFSETS extends LogKey
  case object OFFSET_SEQUENCE_METADATA extends LogKey
  case object OLD_BLOCK_MANAGER_ID extends LogKey
  case object OLD_VALUE extends LogKey
  case object OPTIMIZED_PLAN_COLUMNS extends LogKey
  case object OPTIMIZER_CLASS_NAME extends LogKey
  case object OPTIONS extends LogKey
  case object OP_ID extends LogKey
  case object OP_TYPE extends LogKey
  case object OVERHEAD_MEMORY_SIZE extends LogKey
  case object PARSE_MODE extends LogKey
  case object PARTITIONED_FILE_READER extends LogKey
  case object PARTITIONS_SIZE extends LogKey
  case object PARTITION_ID extends LogKey
  case object PARTITION_SPECIFICATION extends LogKey
  case object PARTITION_SPECS extends LogKey
  case object PATH extends LogKey
  case object PATHS extends LogKey
  case object PIPELINE_STAGE_UID extends LogKey
  case object POD_COUNT extends LogKey
  case object POD_ID extends LogKey
  case object POD_NAME extends LogKey
  case object POD_NAMESPACE extends LogKey
  case object POD_PHASE extends LogKey
  case object POD_SHARED_SLOT_COUNT extends LogKey
  case object POD_STATE extends LogKey
  case object POD_TARGET_COUNT extends LogKey
  case object POLICY extends LogKey
  case object PORT extends LogKey
  case object PRETTY_ID_STRING extends LogKey
  case object PRINCIPAL extends LogKey
  case object PROCESSING_TIME extends LogKey
  case object PRODUCER_ID extends LogKey
  case object PROVIDER extends LogKey
  case object PVC_METADATA_NAME extends LogKey
  case object QUERY_CACHE_VALUE extends LogKey
  case object QUERY_HINT extends LogKey
  case object QUERY_ID extends LogKey
  case object QUERY_PLAN extends LogKey
  case object QUERY_PLAN_COMPARISON extends LogKey
  case object QUERY_PLAN_LENGTH_ACTUAL extends LogKey
  case object QUERY_PLAN_LENGTH_MAX extends LogKey
  case object QUERY_RUN_ID extends LogKey
  case object RANGE extends LogKey
  case object RDD_ID extends LogKey
  case object READ_LIMIT extends LogKey
  case object REASON extends LogKey
  case object REATTACHABLE extends LogKey
  case object RECEIVED_BLOCK_INFO extends LogKey
  case object RECEIVED_BLOCK_TRACKER_LOG_EVENT extends LogKey
  case object RECEIVER_ID extends LogKey
  case object RECEIVER_IDS extends LogKey
  case object RECORDS extends LogKey
  case object REDACTED_STATEMENT extends LogKey
  case object REDUCE_ID extends LogKey
  case object RELATION_NAME extends LogKey
  case object RELATIVE_TOLERANCE extends LogKey
  case object REMAINING_PARTITIONS extends LogKey
  case object REPORT_DETAILS extends LogKey
  case object RESOURCE extends LogKey
  case object RESOURCE_NAME extends LogKey
  case object RESOURCE_PROFILE_ID extends LogKey
  case object RESOURCE_PROFILE_IDS extends LogKey
  case object RETRY_COUNT extends LogKey
  case object RETRY_INTERVAL extends LogKey
  case object RIGHT_EXPR extends LogKey
  case object RMSE extends LogKey
  case object ROCKS_DB_LOG_LEVEL extends LogKey
  case object ROCKS_DB_LOG_MESSAGE extends LogKey
  case object RPC_ENDPOINT_REF extends LogKey
  case object RULE_BATCH_NAME extends LogKey
  case object RULE_NAME extends LogKey
  case object RULE_NUMBER_OF_RUNS extends LogKey
  case object RUN_ID extends LogKey
  case object SCHEMA extends LogKey
  case object SCHEMA2 extends LogKey
  case object SERVICE_NAME extends LogKey
  case object SESSION_HOLD_INFO extends LogKey
  case object SESSION_ID extends LogKey
  case object SESSION_KEY extends LogKey
  case object SHARD_ID extends LogKey
  case object SHUFFLE_BLOCK_INFO extends LogKey
  case object SHUFFLE_ID extends LogKey
  case object SHUFFLE_MERGE_ID extends LogKey
  case object SHUFFLE_SERVICE_NAME extends LogKey
  case object SIZE extends LogKey
  case object SLEEP_TIME extends LogKey
  case object SLIDE_DURATION extends LogKey
  case object SMALLEST_CLUSTER_INDEX extends LogKey
  case object SNAPSHOT_VERSION extends LogKey
  case object SPARK_DATA_STREAM extends LogKey
  case object SPARK_PLAN_ID extends LogKey
  case object SQL_TEXT extends LogKey
  case object SRC_PATH extends LogKey
  case object STAGE_ATTEMPT extends LogKey
  case object STAGE_ID extends LogKey
  case object START_INDEX extends LogKey
  case object STATEMENT_ID extends LogKey
  case object STATE_STORE_ID extends LogKey
  case object STATE_STORE_PROVIDER extends LogKey
  case object STATE_STORE_VERSION extends LogKey
  case object STATUS extends LogKey
  case object STDERR extends LogKey
  case object STORAGE_LEVEL extends LogKey
  case object STORAGE_LEVEL_DESERIALIZED extends LogKey
  case object STORAGE_LEVEL_REPLICATION extends LogKey
  case object STORE_ID extends LogKey
  case object STREAMING_DATA_SOURCE_DESCRIPTION extends LogKey
  case object STREAMING_DATA_SOURCE_NAME extends LogKey
  case object STREAMING_OFFSETS_END extends LogKey
  case object STREAMING_OFFSETS_START extends LogKey
  case object STREAMING_QUERY_PROGRESS extends LogKey
  case object STREAMING_SOURCE extends LogKey
  case object STREAMING_TABLE extends LogKey
  case object STREAMING_WRITE extends LogKey
  case object STREAM_ID extends LogKey
  case object STREAM_NAME extends LogKey
  case object SUBMISSION_ID extends LogKey
  case object SUBSAMPLING_RATE extends LogKey
  case object SUB_QUERY extends LogKey
  case object TABLE_NAME extends LogKey
  case object TABLE_TYPES extends LogKey
  case object TARGET_PATH extends LogKey
  case object TASK_ATTEMPT_ID extends LogKey
  case object TASK_ID extends LogKey
  case object TASK_NAME extends LogKey
  case object TASK_SET_NAME extends LogKey
  case object TASK_STATE extends LogKey
  case object TEMP_FILE extends LogKey
  case object TEMP_PATH extends LogKey
  case object TEST_SIZE extends LogKey
  case object THREAD extends LogKey
  case object THREAD_NAME extends LogKey
  case object TID extends LogKey
  case object TIME extends LogKey
  case object TIMEOUT extends LogKey
  case object TIMER extends LogKey
  case object TIME_UNITS extends LogKey
  case object TIP extends LogKey
  case object TOKEN_REGEX extends LogKey
  case object TOPIC extends LogKey
  case object TOPIC_PARTITION extends LogKey
  case object TOPIC_PARTITIONS extends LogKey
  case object TOPIC_PARTITION_OFFSET extends LogKey
  case object TOPIC_PARTITION_OFFSET_RANGE extends LogKey
  case object TOTAL extends LogKey
  case object TOTAL_EFFECTIVE_TIME extends LogKey
  case object TOTAL_RECORDS_READ extends LogKey
  case object TOTAL_TIME extends LogKey
  case object TOTAL_TIME_READ extends LogKey
  case object TO_TIME extends LogKey
  case object TRAINING_SIZE extends LogKey
  case object TRAIN_VALIDATION_SPLIT_METRIC extends LogKey
  case object TRAIN_VALIDATION_SPLIT_METRICS extends LogKey
  case object TRAIN_WORD_COUNT extends LogKey
  case object TREE_NODE extends LogKey
  case object TRIGGER_INTERVAL extends LogKey
  case object UI_FILTER extends LogKey
  case object UI_FILTER_PARAMS extends LogKey
  case object UI_PROXY_BASE extends LogKey
  case object UNSUPPORTED_EXPR extends LogKey
  case object UNSUPPORTED_HINT_REASON extends LogKey
  case object UNTIL_OFFSET extends LogKey
  case object UPPER_BOUND extends LogKey
  case object URI extends LogKey
  case object USER_ID extends LogKey
  case object USER_NAME extends LogKey
  case object VALUE extends LogKey
  case object VERSION_NUMBER extends LogKey
  case object VIRTUAL_CORES extends LogKey
  case object VOCAB_SIZE extends LogKey
  case object WAIT_RESULT_TIME extends LogKey
  case object WAIT_SEND_TIME extends LogKey
  case object WAIT_TIME extends LogKey
  case object WATERMARK_CONSTRAINT extends LogKey
  case object WEIGHTED_NUM extends LogKey
  case object WORKER_URL extends LogKey
  case object WRITE_AHEAD_LOG_INFO extends LogKey
  case object WRITE_JOB_UUID extends LogKey
  case object XSD_PATH extends LogKey
}