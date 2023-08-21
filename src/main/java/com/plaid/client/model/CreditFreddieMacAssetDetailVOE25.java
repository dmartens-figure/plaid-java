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
import com.plaid.client.model.AssetType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details about an asset.
 */
@ApiModel(description = "Details about an asset.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class CreditFreddieMacAssetDetailVOE25 {
  public static final String SERIALIZED_NAME_ASSET_UNIQUE_IDENTIFIER = "AssetUniqueIdentifier";
  @SerializedName(SERIALIZED_NAME_ASSET_UNIQUE_IDENTIFIER)
  private String assetUniqueIdentifier;

  public static final String SERIALIZED_NAME_ASSET_ACCOUNT_IDENTIFIER = "AssetAccountIdentifier";
  @SerializedName(SERIALIZED_NAME_ASSET_ACCOUNT_IDENTIFIER)
  private String assetAccountIdentifier;

  public static final String SERIALIZED_NAME_ASSET_AS_OF_DATE = "AssetAsOfDate";
  @SerializedName(SERIALIZED_NAME_ASSET_AS_OF_DATE)
  private String assetAsOfDate;

  public static final String SERIALIZED_NAME_ASSET_DESCRIPTION = "AssetDescription";
  @SerializedName(SERIALIZED_NAME_ASSET_DESCRIPTION)
  private String assetDescription;

  public static final String SERIALIZED_NAME_ASSET_TYPE = "AssetType";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private AssetType assetType;

  public static final String SERIALIZED_NAME_ASSET_TYPE_ADDITIONAL_DESCRIPTION = "AssetTypeAdditionalDescription";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE_ADDITIONAL_DESCRIPTION)
  private String assetTypeAdditionalDescription;

  public static final String SERIALIZED_NAME_ASSET_DAYS_REQUESTED_COUNT = "AssetDaysRequestedCount";
  @SerializedName(SERIALIZED_NAME_ASSET_DAYS_REQUESTED_COUNT)
  private Integer assetDaysRequestedCount;

  public static final String SERIALIZED_NAME_ASSET_OWNERSHIP_TYPE = "AssetOwnershipType";
  @SerializedName(SERIALIZED_NAME_ASSET_OWNERSHIP_TYPE)
  private String assetOwnershipType;


  public CreditFreddieMacAssetDetailVOE25 assetUniqueIdentifier(String assetUniqueIdentifier) {
    
    this.assetUniqueIdentifier = assetUniqueIdentifier;
    return this;
  }

   /**
   * A vendor created unique Identifier.
   * @return assetUniqueIdentifier
  **/
  @ApiModelProperty(required = true, value = "A vendor created unique Identifier.")

  public String getAssetUniqueIdentifier() {
    return assetUniqueIdentifier;
  }


  public void setAssetUniqueIdentifier(String assetUniqueIdentifier) {
    this.assetUniqueIdentifier = assetUniqueIdentifier;
  }


  public CreditFreddieMacAssetDetailVOE25 assetAccountIdentifier(String assetAccountIdentifier) {
    
    this.assetAccountIdentifier = assetAccountIdentifier;
    return this;
  }

   /**
   * A unique alphanumeric string identifying an asset.
   * @return assetAccountIdentifier
  **/
  @ApiModelProperty(required = true, value = "A unique alphanumeric string identifying an asset.")

  public String getAssetAccountIdentifier() {
    return assetAccountIdentifier;
  }


  public void setAssetAccountIdentifier(String assetAccountIdentifier) {
    this.assetAccountIdentifier = assetAccountIdentifier;
  }


  public CreditFreddieMacAssetDetailVOE25 assetAsOfDate(String assetAsOfDate) {
    
    this.assetAsOfDate = assetAsOfDate;
    return this;
  }

   /**
   * Account Report As of Date / Create Date. Format YYYY-MM-DD
   * @return assetAsOfDate
  **/
  @ApiModelProperty(required = true, value = "Account Report As of Date / Create Date. Format YYYY-MM-DD")

  public String getAssetAsOfDate() {
    return assetAsOfDate;
  }


  public void setAssetAsOfDate(String assetAsOfDate) {
    this.assetAsOfDate = assetAsOfDate;
  }


  public CreditFreddieMacAssetDetailVOE25 assetDescription(String assetDescription) {
    
    this.assetDescription = assetDescription;
    return this;
  }

   /**
   * A text description that further defines the Asset. This could be used to describe the shares associated with the stocks, bonds or mutual funds, retirement funds or business owned that the borrower has disclosed (named) as an asset.
   * @return assetDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A text description that further defines the Asset. This could be used to describe the shares associated with the stocks, bonds or mutual funds, retirement funds or business owned that the borrower has disclosed (named) as an asset.")

  public String getAssetDescription() {
    return assetDescription;
  }


  public void setAssetDescription(String assetDescription) {
    this.assetDescription = assetDescription;
  }


  public CreditFreddieMacAssetDetailVOE25 assetType(AssetType assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetType getAssetType() {
    return assetType;
  }


  public void setAssetType(AssetType assetType) {
    this.assetType = assetType;
  }


  public CreditFreddieMacAssetDetailVOE25 assetTypeAdditionalDescription(String assetTypeAdditionalDescription) {
    
    this.assetTypeAdditionalDescription = assetTypeAdditionalDescription;
    return this;
  }

   /**
   * Additional Asset Decription some examples are Investment Tax-Deferred , Loan, 401K, 403B, Checking, Money Market, Credit Card,ROTH,529,Biller,ROLLOVER,CD,Savings,Investment Taxable, IRA, Mortgage, Line Of Credit.
   * @return assetTypeAdditionalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Additional Asset Decription some examples are Investment Tax-Deferred , Loan, 401K, 403B, Checking, Money Market, Credit Card,ROTH,529,Biller,ROLLOVER,CD,Savings,Investment Taxable, IRA, Mortgage, Line Of Credit.")

  public String getAssetTypeAdditionalDescription() {
    return assetTypeAdditionalDescription;
  }


  public void setAssetTypeAdditionalDescription(String assetTypeAdditionalDescription) {
    this.assetTypeAdditionalDescription = assetTypeAdditionalDescription;
  }


  public CreditFreddieMacAssetDetailVOE25 assetDaysRequestedCount(Integer assetDaysRequestedCount) {
    
    this.assetDaysRequestedCount = assetDaysRequestedCount;
    return this;
  }

   /**
   * The Number of days requested made to the Financial Institution. Example When looking for 3 months of data from the FI, pass in 90 days.
   * @return assetDaysRequestedCount
  **/
  @ApiModelProperty(required = true, value = "The Number of days requested made to the Financial Institution. Example When looking for 3 months of data from the FI, pass in 90 days.")

  public Integer getAssetDaysRequestedCount() {
    return assetDaysRequestedCount;
  }


  public void setAssetDaysRequestedCount(Integer assetDaysRequestedCount) {
    this.assetDaysRequestedCount = assetDaysRequestedCount;
  }


  public CreditFreddieMacAssetDetailVOE25 assetOwnershipType(String assetOwnershipType) {
    
    this.assetOwnershipType = assetOwnershipType;
    return this;
  }

   /**
   * Ownership type of the asset account.
   * @return assetOwnershipType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Ownership type of the asset account.")

  public String getAssetOwnershipType() {
    return assetOwnershipType;
  }


  public void setAssetOwnershipType(String assetOwnershipType) {
    this.assetOwnershipType = assetOwnershipType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacAssetDetailVOE25 creditFreddieMacAssetDetailVOE25 = (CreditFreddieMacAssetDetailVOE25) o;
    return Objects.equals(this.assetUniqueIdentifier, creditFreddieMacAssetDetailVOE25.assetUniqueIdentifier) &&
        Objects.equals(this.assetAccountIdentifier, creditFreddieMacAssetDetailVOE25.assetAccountIdentifier) &&
        Objects.equals(this.assetAsOfDate, creditFreddieMacAssetDetailVOE25.assetAsOfDate) &&
        Objects.equals(this.assetDescription, creditFreddieMacAssetDetailVOE25.assetDescription) &&
        Objects.equals(this.assetType, creditFreddieMacAssetDetailVOE25.assetType) &&
        Objects.equals(this.assetTypeAdditionalDescription, creditFreddieMacAssetDetailVOE25.assetTypeAdditionalDescription) &&
        Objects.equals(this.assetDaysRequestedCount, creditFreddieMacAssetDetailVOE25.assetDaysRequestedCount) &&
        Objects.equals(this.assetOwnershipType, creditFreddieMacAssetDetailVOE25.assetOwnershipType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUniqueIdentifier, assetAccountIdentifier, assetAsOfDate, assetDescription, assetType, assetTypeAdditionalDescription, assetDaysRequestedCount, assetOwnershipType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacAssetDetailVOE25 {\n");
    sb.append("    assetUniqueIdentifier: ").append(toIndentedString(assetUniqueIdentifier)).append("\n");
    sb.append("    assetAccountIdentifier: ").append(toIndentedString(assetAccountIdentifier)).append("\n");
    sb.append("    assetAsOfDate: ").append(toIndentedString(assetAsOfDate)).append("\n");
    sb.append("    assetDescription: ").append(toIndentedString(assetDescription)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    assetTypeAdditionalDescription: ").append(toIndentedString(assetTypeAdditionalDescription)).append("\n");
    sb.append("    assetDaysRequestedCount: ").append(toIndentedString(assetDaysRequestedCount)).append("\n");
    sb.append("    assetOwnershipType: ").append(toIndentedString(assetOwnershipType)).append("\n");
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

