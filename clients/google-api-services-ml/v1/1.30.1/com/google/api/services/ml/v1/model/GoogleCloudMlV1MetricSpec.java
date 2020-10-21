/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.ml.v1.model;

/**
 * MetricSpec contains the specifications to use to calculate the desired nodes count when
 * autoscaling is enabled.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AI Platform Training & Prediction API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1MetricSpec extends com.google.api.client.json.GenericJson {

  /**
   * metric name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Target specifies the target value for the given metric; once real metric deviates from the
   * threshold by a certain percentage, the node count changes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer target;

  /**
   * metric name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * metric name.
   * @param name name or {@code null} for none
   */
  public GoogleCloudMlV1MetricSpec setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Target specifies the target value for the given metric; once real metric deviates from the
   * threshold by a certain percentage, the node count changes.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTarget() {
    return target;
  }

  /**
   * Target specifies the target value for the given metric; once real metric deviates from the
   * threshold by a certain percentage, the node count changes.
   * @param target target or {@code null} for none
   */
  public GoogleCloudMlV1MetricSpec setTarget(java.lang.Integer target) {
    this.target = target;
    return this;
  }

  @Override
  public GoogleCloudMlV1MetricSpec set(String fieldName, Object value) {
    return (GoogleCloudMlV1MetricSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1MetricSpec clone() {
    return (GoogleCloudMlV1MetricSpec) super.clone();
  }

}
