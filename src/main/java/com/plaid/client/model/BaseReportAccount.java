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
import com.plaid.client.model.AccountBalance;
import com.plaid.client.model.AccountSubtype;
import com.plaid.client.model.AccountType;
import com.plaid.client.model.BaseReportAccountInsights;
import com.plaid.client.model.BaseReportTransaction;
import com.plaid.client.model.HistoricalBalance;
import com.plaid.client.model.Owner;
import com.plaid.client.model.OwnershipType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Base Report information about an account
 */
@ApiModel(description = "Base Report information about an account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class BaseReportAccount {
  public static final String SERIALIZED_NAME_BALANCES = "balances";
  @SerializedName(SERIALIZED_NAME_BALANCES)
  private AccountBalance balances;

  public static final String SERIALIZED_NAME_MASK = "mask";
  @SerializedName(SERIALIZED_NAME_MASK)
  private String mask;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OFFICIAL_NAME = "official_name";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_NAME)
  private String officialName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AccountType type;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private AccountSubtype subtype;

  public static final String SERIALIZED_NAME_DAYS_AVAILABLE = "days_available";
  @SerializedName(SERIALIZED_NAME_DAYS_AVAILABLE)
  private Double daysAvailable;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<BaseReportTransaction> transactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<Owner> owners = new ArrayList<>();

  public static final String SERIALIZED_NAME_OWNERSHIP_TYPE = "ownership_type";
  @SerializedName(SERIALIZED_NAME_OWNERSHIP_TYPE)
  private OwnershipType ownershipType;

  public static final String SERIALIZED_NAME_HISTORICAL_BALANCES = "historical_balances";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_BALANCES)
  private List<HistoricalBalance> historicalBalances = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCOUNT_INSIGHTS = "account_insights";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INSIGHTS)
  private BaseReportAccountInsights accountInsights;


  public BaseReportAccount balances(AccountBalance balances) {
    
    this.balances = balances;
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(required = true, value = "")

  public AccountBalance getBalances() {
    return balances;
  }


  public void setBalances(AccountBalance balances) {
    this.balances = balances;
  }


  public BaseReportAccount mask(String mask) {
    
    this.mask = mask;
    return this;
  }

   /**
   * The last 2-4 alphanumeric characters of an account&#39;s official account number. Note that the mask may be non-unique between an Item&#39;s accounts, and it may also not match the mask that the bank displays to the user.
   * @return mask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The last 2-4 alphanumeric characters of an account's official account number. Note that the mask may be non-unique between an Item's accounts, and it may also not match the mask that the bank displays to the user.")

  public String getMask() {
    return mask;
  }


  public void setMask(String mask) {
    this.mask = mask;
  }


  public BaseReportAccount name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the account, either assigned by the user or by the financial institution itself
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the account, either assigned by the user or by the financial institution itself")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BaseReportAccount officialName(String officialName) {
    
    this.officialName = officialName;
    return this;
  }

   /**
   * The official name of the account as given by the financial institution
   * @return officialName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The official name of the account as given by the financial institution")

  public String getOfficialName() {
    return officialName;
  }


  public void setOfficialName(String officialName) {
    this.officialName = officialName;
  }


  public BaseReportAccount type(AccountType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public AccountType getType() {
    return type;
  }


  public void setType(AccountType type) {
    this.type = type;
  }


  public BaseReportAccount subtype(AccountSubtype subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public AccountSubtype getSubtype() {
    return subtype;
  }


  public void setSubtype(AccountSubtype subtype) {
    this.subtype = subtype;
  }


  public BaseReportAccount daysAvailable(Double daysAvailable) {
    
    this.daysAvailable = daysAvailable;
    return this;
  }

   /**
   * The duration of transaction history available for this Item, typically defined as the time since the date of the earliest transaction in that account. Only returned by Base Report endpoints.
   * @return daysAvailable
  **/
  @ApiModelProperty(required = true, value = "The duration of transaction history available for this Item, typically defined as the time since the date of the earliest transaction in that account. Only returned by Base Report endpoints.")

  public Double getDaysAvailable() {
    return daysAvailable;
  }


  public void setDaysAvailable(Double daysAvailable) {
    this.daysAvailable = daysAvailable;
  }


  public BaseReportAccount transactions(List<BaseReportTransaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public BaseReportAccount addTransactionsItem(BaseReportTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Transaction history associated with the account. Only returned by Base Report endpoints. Transaction history returned by endpoints such as &#x60;/transactions/get&#x60; or &#x60;/investments/transactions/get&#x60; will be returned in the top-level &#x60;transactions&#x60; field instead.
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "Transaction history associated with the account. Only returned by Base Report endpoints. Transaction history returned by endpoints such as `/transactions/get` or `/investments/transactions/get` will be returned in the top-level `transactions` field instead.")

  public List<BaseReportTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<BaseReportTransaction> transactions) {
    this.transactions = transactions;
  }


  public BaseReportAccount owners(List<Owner> owners) {
    
    this.owners = owners;
    return this;
  }

  public BaseReportAccount addOwnersItem(Owner ownersItem) {
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Data returned by the financial institution about the account owner or owners. For business accounts, the name reported may be either the name of the individual or the name of the business, depending on the institution. Multiple owners on a single account will be represented in the same &#x60;owner&#x60; object, not in multiple owner objects within the array.
   * @return owners
  **/
  @ApiModelProperty(required = true, value = "Data returned by the financial institution about the account owner or owners. For business accounts, the name reported may be either the name of the individual or the name of the business, depending on the institution. Multiple owners on a single account will be represented in the same `owner` object, not in multiple owner objects within the array.")

  public List<Owner> getOwners() {
    return owners;
  }


  public void setOwners(List<Owner> owners) {
    this.owners = owners;
  }


  public BaseReportAccount ownershipType(OwnershipType ownershipType) {
    
    this.ownershipType = ownershipType;
    return this;
  }

   /**
   * Get ownershipType
   * @return ownershipType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public OwnershipType getOwnershipType() {
    return ownershipType;
  }


  public void setOwnershipType(OwnershipType ownershipType) {
    this.ownershipType = ownershipType;
  }


  public BaseReportAccount historicalBalances(List<HistoricalBalance> historicalBalances) {
    
    this.historicalBalances = historicalBalances;
    return this;
  }

  public BaseReportAccount addHistoricalBalancesItem(HistoricalBalance historicalBalancesItem) {
    this.historicalBalances.add(historicalBalancesItem);
    return this;
  }

   /**
   * Calculated data about the historical balances on the account. Only returned by Base Report endpoints and currently not supported by &#x60;brokerage&#x60; or &#x60;investment&#x60; accounts.
   * @return historicalBalances
  **/
  @ApiModelProperty(required = true, value = "Calculated data about the historical balances on the account. Only returned by Base Report endpoints and currently not supported by `brokerage` or `investment` accounts.")

  public List<HistoricalBalance> getHistoricalBalances() {
    return historicalBalances;
  }


  public void setHistoricalBalances(List<HistoricalBalance> historicalBalances) {
    this.historicalBalances = historicalBalances;
  }


  public BaseReportAccount accountInsights(BaseReportAccountInsights accountInsights) {
    
    this.accountInsights = accountInsights;
    return this;
  }

   /**
   * Get accountInsights
   * @return accountInsights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BaseReportAccountInsights getAccountInsights() {
    return accountInsights;
  }


  public void setAccountInsights(BaseReportAccountInsights accountInsights) {
    this.accountInsights = accountInsights;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseReportAccount baseReportAccount = (BaseReportAccount) o;
    return Objects.equals(this.balances, baseReportAccount.balances) &&
        Objects.equals(this.mask, baseReportAccount.mask) &&
        Objects.equals(this.name, baseReportAccount.name) &&
        Objects.equals(this.officialName, baseReportAccount.officialName) &&
        Objects.equals(this.type, baseReportAccount.type) &&
        Objects.equals(this.subtype, baseReportAccount.subtype) &&
        Objects.equals(this.daysAvailable, baseReportAccount.daysAvailable) &&
        Objects.equals(this.transactions, baseReportAccount.transactions) &&
        Objects.equals(this.owners, baseReportAccount.owners) &&
        Objects.equals(this.ownershipType, baseReportAccount.ownershipType) &&
        Objects.equals(this.historicalBalances, baseReportAccount.historicalBalances) &&
        Objects.equals(this.accountInsights, baseReportAccount.accountInsights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances, mask, name, officialName, type, subtype, daysAvailable, transactions, owners, ownershipType, historicalBalances, accountInsights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReportAccount {\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officialName: ").append(toIndentedString(officialName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    daysAvailable: ").append(toIndentedString(daysAvailable)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    ownershipType: ").append(toIndentedString(ownershipType)).append("\n");
    sb.append("    historicalBalances: ").append(toIndentedString(historicalBalances)).append("\n");
    sb.append("    accountInsights: ").append(toIndentedString(accountInsights)).append("\n");
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

