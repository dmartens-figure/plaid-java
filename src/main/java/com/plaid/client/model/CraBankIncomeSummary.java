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
import com.plaid.client.model.CraBankIncomeHistoricalSummary;
import com.plaid.client.model.CreditAmountWithCurrency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Summary for bank income across all income sources and items (max history of 730 days).
 */
@ApiModel(description = "Summary for bank income across all income sources and items (max history of 730 days).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class CraBankIncomeSummary {
  public static final String SERIALIZED_NAME_TOTAL_AMOUNTS = "total_amounts";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNTS)
  private List<CreditAmountWithCurrency> totalAmounts = null;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_INCOME_SOURCES_COUNT = "income_sources_count";
  @SerializedName(SERIALIZED_NAME_INCOME_SOURCES_COUNT)
  private Integer incomeSourcesCount;

  public static final String SERIALIZED_NAME_INCOME_CATEGORIES_COUNT = "income_categories_count";
  @SerializedName(SERIALIZED_NAME_INCOME_CATEGORIES_COUNT)
  private Integer incomeCategoriesCount;

  public static final String SERIALIZED_NAME_INCOME_TRANSACTIONS_COUNT = "income_transactions_count";
  @SerializedName(SERIALIZED_NAME_INCOME_TRANSACTIONS_COUNT)
  private Integer incomeTransactionsCount;

  public static final String SERIALIZED_NAME_HISTORICAL_AVERAGE_MONTHLY_GROSS_INCOME = "historical_average_monthly_gross_income";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_AVERAGE_MONTHLY_GROSS_INCOME)
  private List<CreditAmountWithCurrency> historicalAverageMonthlyGrossIncome = null;

  public static final String SERIALIZED_NAME_HISTORICAL_AVERAGE_MONTHLY_INCOME = "historical_average_monthly_income";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_AVERAGE_MONTHLY_INCOME)
  private List<CreditAmountWithCurrency> historicalAverageMonthlyIncome = null;

  public static final String SERIALIZED_NAME_FORECASTED_AVERAGE_MONTHLY_INCOME = "forecasted_average_monthly_income";
  @SerializedName(SERIALIZED_NAME_FORECASTED_AVERAGE_MONTHLY_INCOME)
  private List<CreditAmountWithCurrency> forecastedAverageMonthlyIncome = null;

  public static final String SERIALIZED_NAME_HISTORICAL_SUMMARY = "historical_summary";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_SUMMARY)
  private List<CraBankIncomeHistoricalSummary> historicalSummary = null;


  public CraBankIncomeSummary totalAmounts(List<CreditAmountWithCurrency> totalAmounts) {
    
    this.totalAmounts = totalAmounts;
    return this;
  }

  public CraBankIncomeSummary addTotalAmountsItem(CreditAmountWithCurrency totalAmountsItem) {
    if (this.totalAmounts == null) {
      this.totalAmounts = new ArrayList<>();
    }
    this.totalAmounts.add(totalAmountsItem);
    return this;
  }

   /**
   * Total amount of earnings across all the income sources in the end user&#39;s Items for the days requested by the client. This can contain multiple amounts, with each amount denominated in one unique currency.
   * @return totalAmounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of earnings across all the income sources in the end user's Items for the days requested by the client. This can contain multiple amounts, with each amount denominated in one unique currency.")

  public List<CreditAmountWithCurrency> getTotalAmounts() {
    return totalAmounts;
  }


  public void setTotalAmounts(List<CreditAmountWithCurrency> totalAmounts) {
    this.totalAmounts = totalAmounts;
  }


  public CraBankIncomeSummary startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The earliest date within the days requested in which all income sources identified by Plaid appear in a user&#39;s account. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The earliest date within the days requested in which all income sources identified by Plaid appear in a user's account. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public CraBankIncomeSummary endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The latest date in which all income sources identified by Plaid appear in the user&#39;s account. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The latest date in which all income sources identified by Plaid appear in the user's account. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public CraBankIncomeSummary incomeSourcesCount(Integer incomeSourcesCount) {
    
    this.incomeSourcesCount = incomeSourcesCount;
    return this;
  }

   /**
   * Number of income sources per end user.
   * @return incomeSourcesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of income sources per end user.")

  public Integer getIncomeSourcesCount() {
    return incomeSourcesCount;
  }


  public void setIncomeSourcesCount(Integer incomeSourcesCount) {
    this.incomeSourcesCount = incomeSourcesCount;
  }


  public CraBankIncomeSummary incomeCategoriesCount(Integer incomeCategoriesCount) {
    
    this.incomeCategoriesCount = incomeCategoriesCount;
    return this;
  }

   /**
   * Number of income categories per end user.
   * @return incomeCategoriesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of income categories per end user.")

  public Integer getIncomeCategoriesCount() {
    return incomeCategoriesCount;
  }


  public void setIncomeCategoriesCount(Integer incomeCategoriesCount) {
    this.incomeCategoriesCount = incomeCategoriesCount;
  }


  public CraBankIncomeSummary incomeTransactionsCount(Integer incomeTransactionsCount) {
    
    this.incomeTransactionsCount = incomeTransactionsCount;
    return this;
  }

   /**
   * Number of income transactions per end user.
   * @return incomeTransactionsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of income transactions per end user.")

  public Integer getIncomeTransactionsCount() {
    return incomeTransactionsCount;
  }


  public void setIncomeTransactionsCount(Integer incomeTransactionsCount) {
    this.incomeTransactionsCount = incomeTransactionsCount;
  }


  public CraBankIncomeSummary historicalAverageMonthlyGrossIncome(List<CreditAmountWithCurrency> historicalAverageMonthlyGrossIncome) {
    
    this.historicalAverageMonthlyGrossIncome = historicalAverageMonthlyGrossIncome;
    return this;
  }

  public CraBankIncomeSummary addHistoricalAverageMonthlyGrossIncomeItem(CreditAmountWithCurrency historicalAverageMonthlyGrossIncomeItem) {
    if (this.historicalAverageMonthlyGrossIncome == null) {
      this.historicalAverageMonthlyGrossIncome = new ArrayList<>();
    }
    this.historicalAverageMonthlyGrossIncome.add(historicalAverageMonthlyGrossIncomeItem);
    return this;
  }

   /**
   * An estimate of the average gross monthly income based on the historical net amount and income category for the income source(s).
   * @return historicalAverageMonthlyGrossIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An estimate of the average gross monthly income based on the historical net amount and income category for the income source(s).")

  public List<CreditAmountWithCurrency> getHistoricalAverageMonthlyGrossIncome() {
    return historicalAverageMonthlyGrossIncome;
  }


  public void setHistoricalAverageMonthlyGrossIncome(List<CreditAmountWithCurrency> historicalAverageMonthlyGrossIncome) {
    this.historicalAverageMonthlyGrossIncome = historicalAverageMonthlyGrossIncome;
  }


  public CraBankIncomeSummary historicalAverageMonthlyIncome(List<CreditAmountWithCurrency> historicalAverageMonthlyIncome) {
    
    this.historicalAverageMonthlyIncome = historicalAverageMonthlyIncome;
    return this;
  }

  public CraBankIncomeSummary addHistoricalAverageMonthlyIncomeItem(CreditAmountWithCurrency historicalAverageMonthlyIncomeItem) {
    if (this.historicalAverageMonthlyIncome == null) {
      this.historicalAverageMonthlyIncome = new ArrayList<>();
    }
    this.historicalAverageMonthlyIncome.add(historicalAverageMonthlyIncomeItem);
    return this;
  }

   /**
   * The average monthly income amount estimated based on the historical data for the income source(s).
   * @return historicalAverageMonthlyIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average monthly income amount estimated based on the historical data for the income source(s).")

  public List<CreditAmountWithCurrency> getHistoricalAverageMonthlyIncome() {
    return historicalAverageMonthlyIncome;
  }


  public void setHistoricalAverageMonthlyIncome(List<CreditAmountWithCurrency> historicalAverageMonthlyIncome) {
    this.historicalAverageMonthlyIncome = historicalAverageMonthlyIncome;
  }


  public CraBankIncomeSummary forecastedAverageMonthlyIncome(List<CreditAmountWithCurrency> forecastedAverageMonthlyIncome) {
    
    this.forecastedAverageMonthlyIncome = forecastedAverageMonthlyIncome;
    return this;
  }

  public CraBankIncomeSummary addForecastedAverageMonthlyIncomeItem(CreditAmountWithCurrency forecastedAverageMonthlyIncomeItem) {
    if (this.forecastedAverageMonthlyIncome == null) {
      this.forecastedAverageMonthlyIncome = new ArrayList<>();
    }
    this.forecastedAverageMonthlyIncome.add(forecastedAverageMonthlyIncomeItem);
    return this;
  }

   /**
   * The predicted average monthly income amount for the income source(s).
   * @return forecastedAverageMonthlyIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The predicted average monthly income amount for the income source(s).")

  public List<CreditAmountWithCurrency> getForecastedAverageMonthlyIncome() {
    return forecastedAverageMonthlyIncome;
  }


  public void setForecastedAverageMonthlyIncome(List<CreditAmountWithCurrency> forecastedAverageMonthlyIncome) {
    this.forecastedAverageMonthlyIncome = forecastedAverageMonthlyIncome;
  }


  public CraBankIncomeSummary historicalSummary(List<CraBankIncomeHistoricalSummary> historicalSummary) {
    
    this.historicalSummary = historicalSummary;
    return this;
  }

  public CraBankIncomeSummary addHistoricalSummaryItem(CraBankIncomeHistoricalSummary historicalSummaryItem) {
    if (this.historicalSummary == null) {
      this.historicalSummary = new ArrayList<>();
    }
    this.historicalSummary.add(historicalSummaryItem);
    return this;
  }

   /**
   * Get historicalSummary
   * @return historicalSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CraBankIncomeHistoricalSummary> getHistoricalSummary() {
    return historicalSummary;
  }


  public void setHistoricalSummary(List<CraBankIncomeHistoricalSummary> historicalSummary) {
    this.historicalSummary = historicalSummary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraBankIncomeSummary craBankIncomeSummary = (CraBankIncomeSummary) o;
    return Objects.equals(this.totalAmounts, craBankIncomeSummary.totalAmounts) &&
        Objects.equals(this.startDate, craBankIncomeSummary.startDate) &&
        Objects.equals(this.endDate, craBankIncomeSummary.endDate) &&
        Objects.equals(this.incomeSourcesCount, craBankIncomeSummary.incomeSourcesCount) &&
        Objects.equals(this.incomeCategoriesCount, craBankIncomeSummary.incomeCategoriesCount) &&
        Objects.equals(this.incomeTransactionsCount, craBankIncomeSummary.incomeTransactionsCount) &&
        Objects.equals(this.historicalAverageMonthlyGrossIncome, craBankIncomeSummary.historicalAverageMonthlyGrossIncome) &&
        Objects.equals(this.historicalAverageMonthlyIncome, craBankIncomeSummary.historicalAverageMonthlyIncome) &&
        Objects.equals(this.forecastedAverageMonthlyIncome, craBankIncomeSummary.forecastedAverageMonthlyIncome) &&
        Objects.equals(this.historicalSummary, craBankIncomeSummary.historicalSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmounts, startDate, endDate, incomeSourcesCount, incomeCategoriesCount, incomeTransactionsCount, historicalAverageMonthlyGrossIncome, historicalAverageMonthlyIncome, forecastedAverageMonthlyIncome, historicalSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraBankIncomeSummary {\n");
    sb.append("    totalAmounts: ").append(toIndentedString(totalAmounts)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    incomeSourcesCount: ").append(toIndentedString(incomeSourcesCount)).append("\n");
    sb.append("    incomeCategoriesCount: ").append(toIndentedString(incomeCategoriesCount)).append("\n");
    sb.append("    incomeTransactionsCount: ").append(toIndentedString(incomeTransactionsCount)).append("\n");
    sb.append("    historicalAverageMonthlyGrossIncome: ").append(toIndentedString(historicalAverageMonthlyGrossIncome)).append("\n");
    sb.append("    historicalAverageMonthlyIncome: ").append(toIndentedString(historicalAverageMonthlyIncome)).append("\n");
    sb.append("    forecastedAverageMonthlyIncome: ").append(toIndentedString(forecastedAverageMonthlyIncome)).append("\n");
    sb.append("    historicalSummary: ").append(toIndentedString(historicalSummary)).append("\n");
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

