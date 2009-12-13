/**
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

package org.apache.mahout.clustering.kmeans;

/**
 * This class holds all config keys that are relevant to be used in the KMeans MapReduce JobConf.
 * */
public interface KMeansConfigKeys {
  /** Configuration key for distance measure to use. */
  String DISTANCE_MEASURE_KEY = "org.apache.mahout.clustering.kmeans.measure";
  /** Configuration key for convergence threshold. */
  String CLUSTER_CONVERGENCE_KEY = "org.apache.mahout.clustering.kmeans.convergence";
  /** Configuration key for ?? */
  String CLUSTER_PATH_KEY = "org.apache.mahout.clustering.kmeans.path";
  /** The number of iterations that have taken place */
  String ITERATION_NUMBER = "org.apache.mahout.clustering.kmeans.iteration";
  
}
