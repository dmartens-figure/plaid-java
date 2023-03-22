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
import com.plaid.client.model.TransferScheduleIntervalUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * The schedule that the recurring transfer will be executed on.
 */
@ApiModel(description = "The schedule that the recurring transfer will be executed on.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-22T21:32:38.660057Z[Etc/UTC]")
public class TransferRecurringSchedule {
  public static final String SERIALIZED_NAME_INTERVAL_UNIT = "interval_unit";
  @SerializedName(SERIALIZED_NAME_INTERVAL_UNIT)
  private TransferScheduleIntervalUnit intervalUnit;

  public static final String SERIALIZED_NAME_INTERVAL_COUNT = "interval_count";
  @SerializedName(SERIALIZED_NAME_INTERVAL_COUNT)
  private Integer intervalCount;

  public static final String SERIALIZED_NAME_INTERVAL_EXECUTION_DAY = "interval_execution_day";
  @SerializedName(SERIALIZED_NAME_INTERVAL_EXECUTION_DAY)
  private Integer intervalExecutionDay;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;


  public TransferRecurringSchedule intervalUnit(TransferScheduleIntervalUnit intervalUnit) {
    
    this.intervalUnit = intervalUnit;
    return this;
  }

   /**
   * Get intervalUnit
   * @return intervalUnit
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferScheduleIntervalUnit getIntervalUnit() {
    return intervalUnit;
  }


  public void setIntervalUnit(TransferScheduleIntervalUnit intervalUnit) {
    this.intervalUnit = intervalUnit;
  }


  public TransferRecurringSchedule intervalCount(Integer intervalCount) {
    
    this.intervalCount = intervalCount;
    return this;
  }

   /**
   * The number of recurring &#x60;interval_units&#x60; between originations. The recurring interval(before holiday adjustment) is calculated by multiplying &#x60;interval_unit&#x60; and &#x60;interval_count&#x60;. For instance, to schedule a recurring transfer which originates once every two weeks, set &#x60;interval_unit&#x60; &#x3D; &#x60;week&#x60; and &#x60;interval_count&#x60; &#x3D; 2.
   * @return intervalCount
  **/
  @ApiModelProperty(required = true, value = "The number of recurring `interval_units` between originations. The recurring interval(before holiday adjustment) is calculated by multiplying `interval_unit` and `interval_count`. For instance, to schedule a recurring transfer which originates once every two weeks, set `interval_unit` = `week` and `interval_count` = 2.")

  public Integer getIntervalCount() {
    return intervalCount;
  }


  public void setIntervalCount(Integer intervalCount) {
    this.intervalCount = intervalCount;
  }


  public TransferRecurringSchedule intervalExecutionDay(Integer intervalExecutionDay) {
    
    this.intervalExecutionDay = intervalExecutionDay;
    return this;
  }

   /**
   * The day of the interval on which to schedule the transfer.  If the &#x60;interval_unit&#x60; is &#x60;week&#x60;, &#x60;interval_execution_day&#x60; should be an integer from 1 (Monday) to 5 (Friday).  If the &#x60;interval_unit&#x60; is &#x60;month&#x60;, &#x60;interval_execution_day&#x60; should be an integer indicating which day of the month to make the transfer on. Integers from 1 to 28 can be used to make a transfer on that day of the month. Negative integers from -1 to -5 can be used to make a transfer relative to the end of the month. To make a transfer on the last day of the month, use -1; to make the transfer on the second-to-last day, use -2, and so on.  The transfer will be originated on next available banking day if the designated day is a non banking day.
   * @return intervalExecutionDay
  **/
  @ApiModelProperty(required = true, value = "The day of the interval on which to schedule the transfer.  If the `interval_unit` is `week`, `interval_execution_day` should be an integer from 1 (Monday) to 5 (Friday).  If the `interval_unit` is `month`, `interval_execution_day` should be an integer indicating which day of the month to make the transfer on. Integers from 1 to 28 can be used to make a transfer on that day of the month. Negative integers from -1 to -5 can be used to make a transfer relative to the end of the month. To make a transfer on the last day of the month, use -1; to make the transfer on the second-to-last day, use -2, and so on.  The transfer will be originated on next available banking day if the designated day is a non banking day.")

  public Integer getIntervalExecutionDay() {
    return intervalExecutionDay;
  }


  public void setIntervalExecutionDay(Integer intervalExecutionDay) {
    this.intervalExecutionDay = intervalExecutionDay;
  }


  public TransferRecurringSchedule startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * A date in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). The recurring transfer will begin on the first &#x60;interval_execution_day&#x60; on or after the &#x60;start_date&#x60;.  If the first &#x60;interval_execution_day&#x60; on or after the start date is also the same day that &#x60;/transfer/recurring/create&#x60; was called, the bank *may* make the first payment on that day, but it is not guaranteed to do so.
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "A date in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). The recurring transfer will begin on the first `interval_execution_day` on or after the `start_date`.  If the first `interval_execution_day` on or after the start date is also the same day that `/transfer/recurring/create` was called, the bank *may* make the first payment on that day, but it is not guaranteed to do so.")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public TransferRecurringSchedule endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * A date in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). The recurring transfer will end on the last &#x60;interval_execution_day&#x60; on or before the &#x60;end_date&#x60;. If the &#x60;interval_execution_day&#x60; between the start date and the end date (inclusive) is also the same day that &#x60;/transfer/recurring/create&#x60; was called, the bank *may* make a payment on that day, but it is not guaranteed to do so.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A date in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). The recurring transfer will end on the last `interval_execution_day` on or before the `end_date`. If the `interval_execution_day` between the start date and the end date (inclusive) is also the same day that `/transfer/recurring/create` was called, the bank *may* make a payment on that day, but it is not guaranteed to do so.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRecurringSchedule transferRecurringSchedule = (TransferRecurringSchedule) o;
    return Objects.equals(this.intervalUnit, transferRecurringSchedule.intervalUnit) &&
        Objects.equals(this.intervalCount, transferRecurringSchedule.intervalCount) &&
        Objects.equals(this.intervalExecutionDay, transferRecurringSchedule.intervalExecutionDay) &&
        Objects.equals(this.startDate, transferRecurringSchedule.startDate) &&
        Objects.equals(this.endDate, transferRecurringSchedule.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervalUnit, intervalCount, intervalExecutionDay, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRecurringSchedule {\n");
    sb.append("    intervalUnit: ").append(toIndentedString(intervalUnit)).append("\n");
    sb.append("    intervalCount: ").append(toIndentedString(intervalCount)).append("\n");
    sb.append("    intervalExecutionDay: ").append(toIndentedString(intervalExecutionDay)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

