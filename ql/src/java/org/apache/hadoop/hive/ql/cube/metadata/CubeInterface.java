/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
*/
package org.apache.hadoop.hive.ql.cube.metadata;

import java.util.Set;

/**
 * The cube interface on which queries can be accepted
 */
public interface CubeInterface extends Named {

  /**
   * Get all measures of the cube
   *
   * @return set of {@link CubeMeasure}
   */
  public Set<CubeMeasure> getMeasures();

  /**
   * Get all dimension keys of the cube
   *
   * @return set {@link CubeDimAttribute}
   */
  public Set<CubeDimAttribute> getDimKeys();

  /**
   * Get dimension key given by name
   *
   * @param dimKeyName dimension key name
   *
   * @return A {@link CubeDimAttribute} object
   */
  public CubeDimAttribute getDimKeyByName(String dimKeyName);

  /**
   * Get measure by given by name
   *
   * @param msrName Measure name
   *
   * @return A {@link CubeMeasure} object
   */
  public CubeMeasure getMeasureByName(String msrName);

  /**
   * Get cube column given by column name
   *
   * @param colName Column name
   *
   * @return A {@link CubeColumn} object
   */
  public CubeColumn getColumnByName(String colName);

  /**
   * Get all timed dimensions of cube
   *
   * @return Set of strings
   */
  public Set<String> getTimedDimensions();

  /**
   * Is the cube a derived cube or base cube
   *
   * @return true if cube is derived, false if it is base
   */
  public boolean isDerivedCube();

  /**
   * Get all measure names
   *
   * @return Set of strings
   */
  public Set<String> getMeasureNames();

  /**
   * Get all dimension key names
   *
   * @return Set of strings
   */
  public Set<String> getDimKeyNames();

  /**
   * Whether cube can be queried directly. 
   *
   * @return true or false
   */
  public boolean canBeQueried();
}
