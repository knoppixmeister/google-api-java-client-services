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

package com.google.api.services.civicinfo.v2.model;

/**
 * Describes information about a regional election administrative area.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Civic Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdministrationRegion extends com.google.api.client.json.GenericJson {

  /**
   * The election administration body for this area.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdministrativeBody electionAdministrationBody;

  /**
   * An ID for this object. IDs may change in future requests and should not be cached. Access to
   * this field requires special access that can be requested from the Request more link on the
   * Quotas page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The city or county that provides election information for this voter. This object can have the
   * same elements as state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("local_jurisdiction")
  private AdministrationRegion localJurisdiction;

  /**
   * The name of the jurisdiction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A list of sources for this area. If multiple sources are listed the data has been aggregated
   * from those sources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Source> sources;

  /**
   * The election administration body for this area.
   * @return value or {@code null} for none
   */
  public AdministrativeBody getElectionAdministrationBody() {
    return electionAdministrationBody;
  }

  /**
   * The election administration body for this area.
   * @param electionAdministrationBody electionAdministrationBody or {@code null} for none
   */
  public AdministrationRegion setElectionAdministrationBody(AdministrativeBody electionAdministrationBody) {
    this.electionAdministrationBody = electionAdministrationBody;
    return this;
  }

  /**
   * An ID for this object. IDs may change in future requests and should not be cached. Access to
   * this field requires special access that can be requested from the Request more link on the
   * Quotas page.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * An ID for this object. IDs may change in future requests and should not be cached. Access to
   * this field requires special access that can be requested from the Request more link on the
   * Quotas page.
   * @param id id or {@code null} for none
   */
  public AdministrationRegion setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The city or county that provides election information for this voter. This object can have the
   * same elements as state.
   * @return value or {@code null} for none
   */
  public AdministrationRegion getLocalJurisdiction() {
    return localJurisdiction;
  }

  /**
   * The city or county that provides election information for this voter. This object can have the
   * same elements as state.
   * @param localJurisdiction localJurisdiction or {@code null} for none
   */
  public AdministrationRegion setLocalJurisdiction(AdministrationRegion localJurisdiction) {
    this.localJurisdiction = localJurisdiction;
    return this;
  }

  /**
   * The name of the jurisdiction.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the jurisdiction.
   * @param name name or {@code null} for none
   */
  public AdministrationRegion setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A list of sources for this area. If multiple sources are listed the data has been aggregated
   * from those sources.
   * @return value or {@code null} for none
   */
  public java.util.List<Source> getSources() {
    return sources;
  }

  /**
   * A list of sources for this area. If multiple sources are listed the data has been aggregated
   * from those sources.
   * @param sources sources or {@code null} for none
   */
  public AdministrationRegion setSources(java.util.List<Source> sources) {
    this.sources = sources;
    return this;
  }

  @Override
  public AdministrationRegion set(String fieldName, Object value) {
    return (AdministrationRegion) super.set(fieldName, value);
  }

  @Override
  public AdministrationRegion clone() {
    return (AdministrationRegion) super.clone();
  }

}
