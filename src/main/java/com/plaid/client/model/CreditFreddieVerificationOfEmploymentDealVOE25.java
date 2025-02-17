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
import com.plaid.client.model.CreditFreddieMacLoansVOA24;
import com.plaid.client.model.CreditFreddieMacPartiesVOA24;
import com.plaid.client.model.CreditFreddieMacServicesVOE25;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing a Verification of Employment report.
 */
@ApiModel(description = "An object representing a Verification of Employment report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class CreditFreddieVerificationOfEmploymentDealVOE25 {
  public static final String SERIALIZED_NAME_L_O_A_N_S = "LOANS";
  @SerializedName(SERIALIZED_NAME_L_O_A_N_S)
  private CreditFreddieMacLoansVOA24 LOANS;

  public static final String SERIALIZED_NAME_P_A_R_T_I_E_S = "PARTIES";
  @SerializedName(SERIALIZED_NAME_P_A_R_T_I_E_S)
  private CreditFreddieMacPartiesVOA24 PARTIES;

  public static final String SERIALIZED_NAME_S_E_R_V_I_C_E_S = "SERVICES";
  @SerializedName(SERIALIZED_NAME_S_E_R_V_I_C_E_S)
  private CreditFreddieMacServicesVOE25 SERVICES;


  public CreditFreddieVerificationOfEmploymentDealVOE25 LOANS(CreditFreddieMacLoansVOA24 LOANS) {
    
    this.LOANS = LOANS;
    return this;
  }

   /**
   * Get LOANS
   * @return LOANS
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditFreddieMacLoansVOA24 getLOANS() {
    return LOANS;
  }


  public void setLOANS(CreditFreddieMacLoansVOA24 LOANS) {
    this.LOANS = LOANS;
  }


  public CreditFreddieVerificationOfEmploymentDealVOE25 PARTIES(CreditFreddieMacPartiesVOA24 PARTIES) {
    
    this.PARTIES = PARTIES;
    return this;
  }

   /**
   * Get PARTIES
   * @return PARTIES
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditFreddieMacPartiesVOA24 getPARTIES() {
    return PARTIES;
  }


  public void setPARTIES(CreditFreddieMacPartiesVOA24 PARTIES) {
    this.PARTIES = PARTIES;
  }


  public CreditFreddieVerificationOfEmploymentDealVOE25 SERVICES(CreditFreddieMacServicesVOE25 SERVICES) {
    
    this.SERVICES = SERVICES;
    return this;
  }

   /**
   * Get SERVICES
   * @return SERVICES
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditFreddieMacServicesVOE25 getSERVICES() {
    return SERVICES;
  }


  public void setSERVICES(CreditFreddieMacServicesVOE25 SERVICES) {
    this.SERVICES = SERVICES;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieVerificationOfEmploymentDealVOE25 creditFreddieVerificationOfEmploymentDealVOE25 = (CreditFreddieVerificationOfEmploymentDealVOE25) o;
    return Objects.equals(this.LOANS, creditFreddieVerificationOfEmploymentDealVOE25.LOANS) &&
        Objects.equals(this.PARTIES, creditFreddieVerificationOfEmploymentDealVOE25.PARTIES) &&
        Objects.equals(this.SERVICES, creditFreddieVerificationOfEmploymentDealVOE25.SERVICES);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LOANS, PARTIES, SERVICES);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieVerificationOfEmploymentDealVOE25 {\n");
    sb.append("    LOANS: ").append(toIndentedString(LOANS)).append("\n");
    sb.append("    PARTIES: ").append(toIndentedString(PARTIES)).append("\n");
    sb.append("    SERVICES: ").append(toIndentedString(SERVICES)).append("\n");
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

