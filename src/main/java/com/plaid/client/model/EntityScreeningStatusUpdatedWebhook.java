/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.419.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when an entity screening status has changed, which can occur manually via the dashboard or during ongoing monitoring.
 */
@ApiModel(description = "Fired when an entity screening status has changed, which can occur manually via the dashboard or during ongoing monitoring.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class EntityScreeningStatusUpdatedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_SCREENING_ID = "screening_id";
  @SerializedName(SERIALIZED_NAME_SCREENING_ID)
  private String screeningId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public EntityScreeningStatusUpdatedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;ENTITY_SCREENING&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`ENTITY_SCREENING`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public EntityScreeningStatusUpdatedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;STATUS_UPDATED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`STATUS_UPDATED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public EntityScreeningStatusUpdatedWebhook screeningId(String screeningId) {
    
    this.screeningId = screeningId;
    return this;
  }

   /**
   * The ID of the associated screening.
   * @return screeningId
  **/
  @ApiModelProperty(required = true, value = "The ID of the associated screening.")

  public String getScreeningId() {
    return screeningId;
  }


  public void setScreeningId(String screeningId) {
    this.screeningId = screeningId;
  }


  public EntityScreeningStatusUpdatedWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public WebhookEnvironmentValues getEnvironment() {
    return environment;
  }


  public void setEnvironment(WebhookEnvironmentValues environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityScreeningStatusUpdatedWebhook entityScreeningStatusUpdatedWebhook = (EntityScreeningStatusUpdatedWebhook) o;
    return Objects.equals(this.webhookType, entityScreeningStatusUpdatedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, entityScreeningStatusUpdatedWebhook.webhookCode) &&
        Objects.equals(this.screeningId, entityScreeningStatusUpdatedWebhook.screeningId) &&
        Objects.equals(this.environment, entityScreeningStatusUpdatedWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, screeningId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityScreeningStatusUpdatedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    screeningId: ").append(toIndentedString(screeningId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

