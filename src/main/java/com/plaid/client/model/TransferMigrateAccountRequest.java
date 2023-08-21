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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the request schema for &#x60;/transfer/migrate_account&#x60;
 */
@ApiModel(description = "Defines the request schema for `/transfer/migrate_account`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class TransferMigrateAccountRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routing_number";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_WIRE_ROUTING_NUMBER = "wire_routing_number";
  @SerializedName(SERIALIZED_NAME_WIRE_ROUTING_NUMBER)
  private String wireRoutingNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;


  public TransferMigrateAccountRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public TransferMigrateAccountRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public TransferMigrateAccountRequest accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The user&#39;s account number.
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The user's account number.")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public TransferMigrateAccountRequest routingNumber(String routingNumber) {
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * The user&#39;s routing number.
   * @return routingNumber
  **/
  @ApiModelProperty(required = true, value = "The user's routing number.")

  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public TransferMigrateAccountRequest wireRoutingNumber(String wireRoutingNumber) {
    
    this.wireRoutingNumber = wireRoutingNumber;
    return this;
  }

   /**
   * The user&#39;s wire transfer routing number. This is the ABA number; for some institutions, this may differ from the ACH number used in &#x60;routing_number&#x60;.
   * @return wireRoutingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's wire transfer routing number. This is the ABA number; for some institutions, this may differ from the ACH number used in `routing_number`.")

  public String getWireRoutingNumber() {
    return wireRoutingNumber;
  }


  public void setWireRoutingNumber(String wireRoutingNumber) {
    this.wireRoutingNumber = wireRoutingNumber;
  }


  public TransferMigrateAccountRequest accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * The type of the bank account (&#x60;checking&#x60; or &#x60;savings&#x60;).
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "The type of the bank account (`checking` or `savings`).")

  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferMigrateAccountRequest transferMigrateAccountRequest = (TransferMigrateAccountRequest) o;
    return Objects.equals(this.clientId, transferMigrateAccountRequest.clientId) &&
        Objects.equals(this.secret, transferMigrateAccountRequest.secret) &&
        Objects.equals(this.accountNumber, transferMigrateAccountRequest.accountNumber) &&
        Objects.equals(this.routingNumber, transferMigrateAccountRequest.routingNumber) &&
        Objects.equals(this.wireRoutingNumber, transferMigrateAccountRequest.wireRoutingNumber) &&
        Objects.equals(this.accountType, transferMigrateAccountRequest.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, accountNumber, routingNumber, wireRoutingNumber, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferMigrateAccountRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    wireRoutingNumber: ").append(toIndentedString(wireRoutingNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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

