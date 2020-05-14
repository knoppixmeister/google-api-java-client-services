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

package com.google.api.services.gamesManagement.model;

/**
 * 1P/3P metadata about the player's experience.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Management. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GamesPlayerExperienceInfoResource extends com.google.api.client.json.GenericJson {

  /**
   * The current number of experience points for the player.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long currentExperiencePoints;

  /**
   * The current level of the player.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GamesPlayerLevelResource currentLevel;

  /**
   * The timestamp when the player was leveled up, in millis since Unix epoch UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastLevelUpTimestampMillis;

  /**
   * The next level of the player. If the current level is the maximum level, this should be same as
   * the current level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GamesPlayerLevelResource nextLevel;

  /**
   * The current number of experience points for the player.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCurrentExperiencePoints() {
    return currentExperiencePoints;
  }

  /**
   * The current number of experience points for the player.
   * @param currentExperiencePoints currentExperiencePoints or {@code null} for none
   */
  public GamesPlayerExperienceInfoResource setCurrentExperiencePoints(java.lang.Long currentExperiencePoints) {
    this.currentExperiencePoints = currentExperiencePoints;
    return this;
  }

  /**
   * The current level of the player.
   * @return value or {@code null} for none
   */
  public GamesPlayerLevelResource getCurrentLevel() {
    return currentLevel;
  }

  /**
   * The current level of the player.
   * @param currentLevel currentLevel or {@code null} for none
   */
  public GamesPlayerExperienceInfoResource setCurrentLevel(GamesPlayerLevelResource currentLevel) {
    this.currentLevel = currentLevel;
    return this;
  }

  /**
   * The timestamp when the player was leveled up, in millis since Unix epoch UTC.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastLevelUpTimestampMillis() {
    return lastLevelUpTimestampMillis;
  }

  /**
   * The timestamp when the player was leveled up, in millis since Unix epoch UTC.
   * @param lastLevelUpTimestampMillis lastLevelUpTimestampMillis or {@code null} for none
   */
  public GamesPlayerExperienceInfoResource setLastLevelUpTimestampMillis(java.lang.Long lastLevelUpTimestampMillis) {
    this.lastLevelUpTimestampMillis = lastLevelUpTimestampMillis;
    return this;
  }

  /**
   * The next level of the player. If the current level is the maximum level, this should be same as
   * the current level.
   * @return value or {@code null} for none
   */
  public GamesPlayerLevelResource getNextLevel() {
    return nextLevel;
  }

  /**
   * The next level of the player. If the current level is the maximum level, this should be same as
   * the current level.
   * @param nextLevel nextLevel or {@code null} for none
   */
  public GamesPlayerExperienceInfoResource setNextLevel(GamesPlayerLevelResource nextLevel) {
    this.nextLevel = nextLevel;
    return this;
  }

  @Override
  public GamesPlayerExperienceInfoResource set(String fieldName, Object value) {
    return (GamesPlayerExperienceInfoResource) super.set(fieldName, value);
  }

  @Override
  public GamesPlayerExperienceInfoResource clone() {
    return (GamesPlayerExperienceInfoResource) super.clone();
  }

}
