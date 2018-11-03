package com.example.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An individual Tax Filing record.
 */
@ApiModel(description = "An individual Tax Filing record.")

public class TaxFilingObject  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("filingID")
  private String filingID;

  @JsonProperty("jurisdiction")
  private String jurisdiction;

  @JsonProperty("year")
  private String year;

  @JsonProperty("period")
  private Integer period;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("grossIncome")
  private BigDecimal grossIncome;

  @JsonProperty("taxLiability")
  private BigDecimal taxLiability;

  @JsonProperty("taxpayer")
  private String taxpayer;

  public TaxFilingObject filingID(String filingID) {
    this.filingID = filingID;
    return this;
  }

  /**
   * Get filingID
   * @return filingID
  **/
  @ApiModelProperty(value = "")


  public String getFilingID() {
    return filingID;
  }

  public void setFilingID(String filingID) {
    this.filingID = filingID;
  }

  public TaxFilingObject jurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

  /**
   * Get jurisdiction
   * @return jurisdiction
  **/
  @ApiModelProperty(value = "")

@Size(max=5) 
  public String getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public TaxFilingObject year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(value = "")


  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public TaxFilingObject period(Integer period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(value = "")


  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public TaxFilingObject currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public TaxFilingObject grossIncome(BigDecimal grossIncome) {
    this.grossIncome = grossIncome;
    return this;
  }

  /**
   * Get grossIncome
   * maximum: 1E+1
   * @return grossIncome
  **/
  @ApiModelProperty(value = "")

  @Valid
 @DecimalMax("1E+1") 
  public BigDecimal getGrossIncome() {
    return grossIncome;
  }

  public void setGrossIncome(BigDecimal grossIncome) {
    this.grossIncome = grossIncome;
  }

  public TaxFilingObject taxLiability(BigDecimal taxLiability) {
    this.taxLiability = taxLiability;
    return this;
  }

  /**
   * Get taxLiability
   * @return taxLiability
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTaxLiability() {
    return taxLiability;
  }

  public void setTaxLiability(BigDecimal taxLiability) {
    this.taxLiability = taxLiability;
  }

  public TaxFilingObject taxpayer(String taxpayer) {
    this.taxpayer = taxpayer;
    return this;
  }

  /**
   * Get taxpayer
   * @return taxpayer
  **/
  @ApiModelProperty(value = "")


  public String getTaxpayer() {
    return taxpayer;
  }

  public void setTaxpayer(String taxpayer) {
    this.taxpayer = taxpayer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxFilingObject taxFilingObject = (TaxFilingObject) o;
    return Objects.equals(this.filingID, taxFilingObject.filingID) &&
        Objects.equals(this.jurisdiction, taxFilingObject.jurisdiction) &&
        Objects.equals(this.year, taxFilingObject.year) &&
        Objects.equals(this.period, taxFilingObject.period) &&
        Objects.equals(this.currency, taxFilingObject.currency) &&
        Objects.equals(this.grossIncome, taxFilingObject.grossIncome) &&
        Objects.equals(this.taxLiability, taxFilingObject.taxLiability) &&
        Objects.equals(this.taxpayer, taxFilingObject.taxpayer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filingID, jurisdiction, year, period, currency, grossIncome, taxLiability, taxpayer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxFilingObject {\n");
    
    sb.append("    filingID: ").append(toIndentedString(filingID)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    grossIncome: ").append(toIndentedString(grossIncome)).append("\n");
    sb.append("    taxLiability: ").append(toIndentedString(taxLiability)).append("\n");
    sb.append("    taxpayer: ").append(toIndentedString(taxpayer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

