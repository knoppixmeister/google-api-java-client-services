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

package com.google.api.services.monitoring.v3.model;

/**
 * A DistributionCut defines a TimeSeries and thresholds used for measuring good service and total
 * service. The TimeSeries must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind =
 * CUMULATIVE. The computed good_service will be the count of values x in the Distribution such that
 * range.min <= x < range.max.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DistributionCut extends com.google.api.client.json.GenericJson {

  /**
   * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a
   * TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or
   * MetricKind = CUMULATIVE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String distributionFilter;

  /**
   * Range of values considered "good." For a one-sided range, set one bound to an infinite value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleMonitoringV3Range range;

  /**
   * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a
   * TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or
   * MetricKind = CUMULATIVE.
   * @return value or {@code null} for none
   */
  public java.lang.String getDistributionFilter() {
    return distributionFilter;
  }

  /**
   * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a
   * TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or
   * MetricKind = CUMULATIVE.
   * @param distributionFilter distributionFilter or {@code null} for none
   */
  public DistributionCut setDistributionFilter(java.lang.String distributionFilter) {
    this.distributionFilter = distributionFilter;
    return this;
  }

  /**
   * Range of values considered "good." For a one-sided range, set one bound to an infinite value.
   * @return value or {@code null} for none
   */
  public GoogleMonitoringV3Range getRange() {
    return range;
  }

  /**
   * Range of values considered "good." For a one-sided range, set one bound to an infinite value.
   * @param range range or {@code null} for none
   */
  public DistributionCut setRange(GoogleMonitoringV3Range range) {
    this.range = range;
    return this;
  }

  @Override
  public DistributionCut set(String fieldName, Object value) {
    return (DistributionCut) super.set(fieldName, value);
  }

  @Override
  public DistributionCut clone() {
    return (DistributionCut) super.clone();
  }

}
