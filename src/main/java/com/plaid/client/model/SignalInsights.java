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
import com.plaid.client.model.SignalScores;
import com.plaid.client.model.SignalWarning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Signal insights including scores and attributes. This response is offered as an add-on to &#x60;/transfer/authorization/create&#x60;. To request access to these fields please contact your Plaid account manager.
 */
@ApiModel(description = "Signal insights including scores and attributes. This response is offered as an add-on to `/transfer/authorization/create`. To request access to these fields please contact your Plaid account manager.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class SignalInsights {
  public static final String SERIALIZED_NAME_SCORES = "scores";
  @SerializedName(SERIALIZED_NAME_SCORES)
  private SignalScores scores;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<SignalWarning> warnings = null;


  public SignalInsights scores(SignalScores scores) {
    
    this.scores = scores;
    return this;
  }

   /**
   * Get scores
   * @return scores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignalScores getScores() {
    return scores;
  }


  public void setScores(SignalScores scores) {
    this.scores = scores;
  }


  public SignalInsights warnings(List<SignalWarning> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public SignalInsights addWarningsItem(SignalWarning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * If bank information was not available to be used in the Signal model, this array contains warnings describing why bank data is missing. If you want to receive an API error instead of Signal scores in the case of missing bank data, file a support ticket or contact your Plaid account manager.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If bank information was not available to be used in the Signal model, this array contains warnings describing why bank data is missing. If you want to receive an API error instead of Signal scores in the case of missing bank data, file a support ticket or contact your Plaid account manager.")

  public List<SignalWarning> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<SignalWarning> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalInsights signalInsights = (SignalInsights) o;
    return Objects.equals(this.scores, signalInsights.scores) &&
        Objects.equals(this.warnings, signalInsights.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scores, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalInsights {\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

