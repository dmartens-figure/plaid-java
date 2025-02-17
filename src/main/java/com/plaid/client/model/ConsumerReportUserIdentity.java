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
import com.plaid.client.model.AddressData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ConsumerReportUserIdentity defines the user identity data collected for consumer report purpose. This field is required to be set if you later use the created user for consumer report purpose.
 */
@ApiModel(description = "ConsumerReportUserIdentity defines the user identity data collected for consumer report purpose. This field is required to be set if you later use the created user for consumer report purpose.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class ConsumerReportUserIdentity {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phone_numbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<String> phoneNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<String> emails = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRIMARY_ADDRESS = "primary_address";
  @SerializedName(SERIALIZED_NAME_PRIMARY_ADDRESS)
  private AddressData primaryAddress;


  public ConsumerReportUserIdentity firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The user&#39;s first name
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "The user's first name")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ConsumerReportUserIdentity lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The user&#39;s last name
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "The user's last name")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ConsumerReportUserIdentity phoneNumbers(List<String> phoneNumbers) {
    
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public ConsumerReportUserIdentity addPhoneNumbersItem(String phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * The user&#39;s phone numbers
   * @return phoneNumbers
  **/
  @ApiModelProperty(required = true, value = "The user's phone numbers")

  public List<String> getPhoneNumbers() {
    return phoneNumbers;
  }


  public void setPhoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public ConsumerReportUserIdentity emails(List<String> emails) {
    
    this.emails = emails;
    return this;
  }

  public ConsumerReportUserIdentity addEmailsItem(String emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * The user&#39;s emails
   * @return emails
  **/
  @ApiModelProperty(required = true, value = "The user's emails")

  public List<String> getEmails() {
    return emails;
  }


  public void setEmails(List<String> emails) {
    this.emails = emails;
  }


  public ConsumerReportUserIdentity primaryAddress(AddressData primaryAddress) {
    
    this.primaryAddress = primaryAddress;
    return this;
  }

   /**
   * Get primaryAddress
   * @return primaryAddress
  **/
  @ApiModelProperty(required = true, value = "")

  public AddressData getPrimaryAddress() {
    return primaryAddress;
  }


  public void setPrimaryAddress(AddressData primaryAddress) {
    this.primaryAddress = primaryAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerReportUserIdentity consumerReportUserIdentity = (ConsumerReportUserIdentity) o;
    return Objects.equals(this.firstName, consumerReportUserIdentity.firstName) &&
        Objects.equals(this.lastName, consumerReportUserIdentity.lastName) &&
        Objects.equals(this.phoneNumbers, consumerReportUserIdentity.phoneNumbers) &&
        Objects.equals(this.emails, consumerReportUserIdentity.emails) &&
        Objects.equals(this.primaryAddress, consumerReportUserIdentity.primaryAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phoneNumbers, emails, primaryAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerReportUserIdentity {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    primaryAddress: ").append(toIndentedString(primaryAddress)).append("\n");
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

