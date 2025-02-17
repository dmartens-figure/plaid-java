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
import com.plaid.client.model.TransferCapabilitiesGetRTP;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains the RTP network and types supported by the linked Item&#39;s institution.
 */
@ApiModel(description = "Contains the RTP network and types supported by the linked Item's institution.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class InstitutionSupportedNetworks {
  public static final String SERIALIZED_NAME_RTP = "rtp";
  @SerializedName(SERIALIZED_NAME_RTP)
  private TransferCapabilitiesGetRTP rtp;


  public InstitutionSupportedNetworks rtp(TransferCapabilitiesGetRTP rtp) {
    
    this.rtp = rtp;
    return this;
  }

   /**
   * Get rtp
   * @return rtp
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferCapabilitiesGetRTP getRtp() {
    return rtp;
  }


  public void setRtp(TransferCapabilitiesGetRTP rtp) {
    this.rtp = rtp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionSupportedNetworks institutionSupportedNetworks = (InstitutionSupportedNetworks) o;
    return Objects.equals(this.rtp, institutionSupportedNetworks.rtp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rtp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionSupportedNetworks {\n");
    sb.append("    rtp: ").append(toIndentedString(rtp)).append("\n");
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

