/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.343.0
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
import com.plaid.client.model.TaxpayerIdentifierType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about the Taxpayer identification values assigned to the individual or legal entity.Information about the Taxpayer identification values assigned to the individual or legal entity.
 */
@ApiModel(description = "Information about the Taxpayer identification values assigned to the individual or legal entity.Information about the Taxpayer identification values assigned to the individual or legal entity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-22T21:32:38.660057Z[Etc/UTC]")
public class TaxpayerIdentifier {
  public static final String SERIALIZED_NAME_TAXPAYER_IDENTIFIER_TYPE = "TaxpayerIdentifierType";
  @SerializedName(SERIALIZED_NAME_TAXPAYER_IDENTIFIER_TYPE)
  private TaxpayerIdentifierType taxpayerIdentifierType;

  public static final String SERIALIZED_NAME_TAXPAYER_IDENTIFIER_VALUE = "TaxpayerIdentifierValue";
  @SerializedName(SERIALIZED_NAME_TAXPAYER_IDENTIFIER_VALUE)
  private String taxpayerIdentifierValue;


  public TaxpayerIdentifier taxpayerIdentifierType(TaxpayerIdentifierType taxpayerIdentifierType) {
    
    this.taxpayerIdentifierType = taxpayerIdentifierType;
    return this;
  }

   /**
   * Get taxpayerIdentifierType
   * @return taxpayerIdentifierType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TaxpayerIdentifierType getTaxpayerIdentifierType() {
    return taxpayerIdentifierType;
  }


  public void setTaxpayerIdentifierType(TaxpayerIdentifierType taxpayerIdentifierType) {
    this.taxpayerIdentifierType = taxpayerIdentifierType;
  }


  public TaxpayerIdentifier taxpayerIdentifierValue(String taxpayerIdentifierValue) {
    
    this.taxpayerIdentifierValue = taxpayerIdentifierValue;
    return this;
  }

   /**
   * The value of the taxpayer identifier as assigned by the IRS to the individual or legal entity.
   * @return taxpayerIdentifierValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The value of the taxpayer identifier as assigned by the IRS to the individual or legal entity.")

  public String getTaxpayerIdentifierValue() {
    return taxpayerIdentifierValue;
  }


  public void setTaxpayerIdentifierValue(String taxpayerIdentifierValue) {
    this.taxpayerIdentifierValue = taxpayerIdentifierValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxpayerIdentifier taxpayerIdentifier = (TaxpayerIdentifier) o;
    return Objects.equals(this.taxpayerIdentifierType, taxpayerIdentifier.taxpayerIdentifierType) &&
        Objects.equals(this.taxpayerIdentifierValue, taxpayerIdentifier.taxpayerIdentifierValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxpayerIdentifierType, taxpayerIdentifierValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxpayerIdentifier {\n");
    sb.append("    taxpayerIdentifierType: ").append(toIndentedString(taxpayerIdentifierType)).append("\n");
    sb.append("    taxpayerIdentifierValue: ").append(toIndentedString(taxpayerIdentifierValue)).append("\n");
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

