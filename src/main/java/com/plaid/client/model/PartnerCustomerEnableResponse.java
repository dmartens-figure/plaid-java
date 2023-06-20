/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.379.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Response schema for &#x60;/partner/customer/enable&#x60;.
 */
@ApiModel(description = "Response schema for `/partner/customer/enable`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T21:31:59.039638Z[Etc/UTC]")
public class PartnerCustomerEnableResponse {
  public static final String SERIALIZED_NAME_PRODUCTION_SECRET = "production_secret";
  @SerializedName(SERIALIZED_NAME_PRODUCTION_SECRET)
  private String productionSecret;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public PartnerCustomerEnableResponse productionSecret(String productionSecret) {
    
    this.productionSecret = productionSecret;
    return this;
  }

   /**
   * The end customer&#39;s secret key for the Production environment.
   * @return productionSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end customer's secret key for the Production environment.")

  public String getProductionSecret() {
    return productionSecret;
  }


  public void setProductionSecret(String productionSecret) {
    this.productionSecret = productionSecret;
  }


  public PartnerCustomerEnableResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerCustomerEnableResponse partnerCustomerEnableResponse = (PartnerCustomerEnableResponse) o;
    return Objects.equals(this.productionSecret, partnerCustomerEnableResponse.productionSecret) &&
        Objects.equals(this.requestId, partnerCustomerEnableResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productionSecret, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerCustomerEnableResponse {\n");
    sb.append("    productionSecret: ").append(toIndentedString(productionSecret)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

