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
import com.plaid.client.model.CreditFreddieVerificationOfEmploymentDealVOE25;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Verification of Employment Report
 */
@ApiModel(description = "Verification of Employment Report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class CreditFreddieVerificationOfEmploymentVOE25 {
  public static final String SERIALIZED_NAME_D_E_A_L = "DEAL";
  @SerializedName(SERIALIZED_NAME_D_E_A_L)
  private CreditFreddieVerificationOfEmploymentDealVOE25 DEAL;

  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "SchemaVersion";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private Double schemaVersion;


  public CreditFreddieVerificationOfEmploymentVOE25 DEAL(CreditFreddieVerificationOfEmploymentDealVOE25 DEAL) {
    
    this.DEAL = DEAL;
    return this;
  }

   /**
   * Get DEAL
   * @return DEAL
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditFreddieVerificationOfEmploymentDealVOE25 getDEAL() {
    return DEAL;
  }


  public void setDEAL(CreditFreddieVerificationOfEmploymentDealVOE25 DEAL) {
    this.DEAL = DEAL;
  }


  public CreditFreddieVerificationOfEmploymentVOE25 schemaVersion(Double schemaVersion) {
    
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * The Verification Of Employment (VOE) schema version.
   * @return schemaVersion
  **/
  @ApiModelProperty(required = true, value = "The Verification Of Employment (VOE) schema version.")

  public Double getSchemaVersion() {
    return schemaVersion;
  }


  public void setSchemaVersion(Double schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieVerificationOfEmploymentVOE25 creditFreddieVerificationOfEmploymentVOE25 = (CreditFreddieVerificationOfEmploymentVOE25) o;
    return Objects.equals(this.DEAL, creditFreddieVerificationOfEmploymentVOE25.DEAL) &&
        Objects.equals(this.schemaVersion, creditFreddieVerificationOfEmploymentVOE25.schemaVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DEAL, schemaVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieVerificationOfEmploymentVOE25 {\n");
    sb.append("    DEAL: ").append(toIndentedString(DEAL)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
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

