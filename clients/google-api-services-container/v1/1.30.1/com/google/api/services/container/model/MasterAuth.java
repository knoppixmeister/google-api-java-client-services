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

package com.google.api.services.container.model;

/**
 * The authentication information for accessing the master endpoint. Authentication can be done
 * using HTTP basic auth or using client certificates.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MasterAuth extends com.google.api.client.json.GenericJson {

  /**
   * [Output only] Base64-encoded public certificate used by clients to authenticate to the cluster
   * endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientCertificate;

  /**
   * Configuration for client certificate authentication on the cluster. For clusters before v1.12,
   * if no configuration is specified, a client certificate is issued.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClientCertificateConfig clientCertificateConfig;

  /**
   * [Output only] Base64-encoded private key used by clients to authenticate to the cluster
   * endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientKey;

  /**
   * [Output only] Base64-encoded public certificate that is the root of trust for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterCaCertificate;

  /**
   * The password to use for HTTP basic authentication to the master endpoint. Because the master
   * endpoint is open to the Internet, you should create a strong password. If a password is
   * provided for cluster creation, username must be non-empty. Warning: basic authentication is
   * deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of
   * recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to
   * /api-server-authentication
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * The username to use for HTTP basic authentication to the master endpoint. For clusters v1.6.0
   * and later, basic authentication can be disabled by leaving username unspecified (or setting it
   * to the empty string). Warning: basic authentication is deprecated, and will be removed in GKE
   * control plane versions 1.19 and newer. For a list of recommended authentication methods, see:
   * https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * [Output only] Base64-encoded public certificate used by clients to authenticate to the cluster
   * endpoint.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientCertificate() {
    return clientCertificate;
  }

  /**
   * [Output only] Base64-encoded public certificate used by clients to authenticate to the cluster
   * endpoint.
   * @param clientCertificate clientCertificate or {@code null} for none
   */
  public MasterAuth setClientCertificate(java.lang.String clientCertificate) {
    this.clientCertificate = clientCertificate;
    return this;
  }

  /**
   * Configuration for client certificate authentication on the cluster. For clusters before v1.12,
   * if no configuration is specified, a client certificate is issued.
   * @return value or {@code null} for none
   */
  public ClientCertificateConfig getClientCertificateConfig() {
    return clientCertificateConfig;
  }

  /**
   * Configuration for client certificate authentication on the cluster. For clusters before v1.12,
   * if no configuration is specified, a client certificate is issued.
   * @param clientCertificateConfig clientCertificateConfig or {@code null} for none
   */
  public MasterAuth setClientCertificateConfig(ClientCertificateConfig clientCertificateConfig) {
    this.clientCertificateConfig = clientCertificateConfig;
    return this;
  }

  /**
   * [Output only] Base64-encoded private key used by clients to authenticate to the cluster
   * endpoint.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientKey() {
    return clientKey;
  }

  /**
   * [Output only] Base64-encoded private key used by clients to authenticate to the cluster
   * endpoint.
   * @param clientKey clientKey or {@code null} for none
   */
  public MasterAuth setClientKey(java.lang.String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

  /**
   * [Output only] Base64-encoded public certificate that is the root of trust for the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterCaCertificate() {
    return clusterCaCertificate;
  }

  /**
   * [Output only] Base64-encoded public certificate that is the root of trust for the cluster.
   * @param clusterCaCertificate clusterCaCertificate or {@code null} for none
   */
  public MasterAuth setClusterCaCertificate(java.lang.String clusterCaCertificate) {
    this.clusterCaCertificate = clusterCaCertificate;
    return this;
  }

  /**
   * The password to use for HTTP basic authentication to the master endpoint. Because the master
   * endpoint is open to the Internet, you should create a strong password. If a password is
   * provided for cluster creation, username must be non-empty. Warning: basic authentication is
   * deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of
   * recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to
   * /api-server-authentication
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * The password to use for HTTP basic authentication to the master endpoint. Because the master
   * endpoint is open to the Internet, you should create a strong password. If a password is
   * provided for cluster creation, username must be non-empty. Warning: basic authentication is
   * deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of
   * recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to
   * /api-server-authentication
   * @param password password or {@code null} for none
   */
  public MasterAuth setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * The username to use for HTTP basic authentication to the master endpoint. For clusters v1.6.0
   * and later, basic authentication can be disabled by leaving username unspecified (or setting it
   * to the empty string). Warning: basic authentication is deprecated, and will be removed in GKE
   * control plane versions 1.19 and newer. For a list of recommended authentication methods, see:
   * https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * The username to use for HTTP basic authentication to the master endpoint. For clusters v1.6.0
   * and later, basic authentication can be disabled by leaving username unspecified (or setting it
   * to the empty string). Warning: basic authentication is deprecated, and will be removed in GKE
   * control plane versions 1.19 and newer. For a list of recommended authentication methods, see:
   * https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
   * @param username username or {@code null} for none
   */
  public MasterAuth setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public MasterAuth set(String fieldName, Object value) {
    return (MasterAuth) super.set(fieldName, value);
  }

  @Override
  public MasterAuth clone() {
    return (MasterAuth) super.clone();
  }

}
