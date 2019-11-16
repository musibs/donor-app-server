package io.codefountain.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Donor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-16T11:12:22.062+11:00")

public class Donor   {
  @JsonProperty("bloodGroup")
  private String bloodGroup = null;

  @JsonProperty("contactNo")
  private String contactNo = null;

  @JsonProperty("dateOfBirth")
  private LocalDate dateOfBirth = null;

  @JsonProperty("donorId")
  private Long donorId = null;

  @JsonProperty("emergencyContactNo")
  private String emergencyContactNo = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("firstTimeDonor")
  private Boolean firstTimeDonor = null;

  @JsonProperty("lastName")
  private String lastName = null;

  public Donor bloodGroup(String bloodGroup) {
    this.bloodGroup = bloodGroup;
    return this;
  }

  /**
   * Get bloodGroup
   * @return bloodGroup
  **/
  @ApiModelProperty(value = "")


  public String getBloodGroup() {
    return bloodGroup;
  }

  public void setBloodGroup(String bloodGroup) {
    this.bloodGroup = bloodGroup;
  }

  public Donor contactNo(String contactNo) {
    this.contactNo = contactNo;
    return this;
  }

  /**
   * Get contactNo
   * @return contactNo
  **/
  @ApiModelProperty(value = "")


  public String getContactNo() {
    return contactNo;
  }

  public void setContactNo(String contactNo) {
    this.contactNo = contactNo;
  }

  public Donor dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Donor donorId(Long donorId) {
    this.donorId = donorId;
    return this;
  }

  /**
   * Get donorId
   * @return donorId
  **/
  @ApiModelProperty(value = "")


  public Long getDonorId() {
    return donorId;
  }

  public void setDonorId(Long donorId) {
    this.donorId = donorId;
  }

  public Donor emergencyContactNo(String emergencyContactNo) {
    this.emergencyContactNo = emergencyContactNo;
    return this;
  }

  /**
   * Get emergencyContactNo
   * @return emergencyContactNo
  **/
  @ApiModelProperty(value = "")


  public String getEmergencyContactNo() {
    return emergencyContactNo;
  }

  public void setEmergencyContactNo(String emergencyContactNo) {
    this.emergencyContactNo = emergencyContactNo;
  }

  public Donor firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Donor firstTimeDonor(Boolean firstTimeDonor) {
    this.firstTimeDonor = firstTimeDonor;
    return this;
  }

  /**
   * Get firstTimeDonor
   * @return firstTimeDonor
  **/
  @ApiModelProperty(value = "")


  public Boolean isFirstTimeDonor() {
    return firstTimeDonor;
  }

  public void setFirstTimeDonor(Boolean firstTimeDonor) {
    this.firstTimeDonor = firstTimeDonor;
  }

  public Donor lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Donor donor = (Donor) o;
    return Objects.equals(this.bloodGroup, donor.bloodGroup) &&
        Objects.equals(this.contactNo, donor.contactNo) &&
        Objects.equals(this.dateOfBirth, donor.dateOfBirth) &&
        Objects.equals(this.donorId, donor.donorId) &&
        Objects.equals(this.emergencyContactNo, donor.emergencyContactNo) &&
        Objects.equals(this.firstName, donor.firstName) &&
        Objects.equals(this.firstTimeDonor, donor.firstTimeDonor) &&
        Objects.equals(this.lastName, donor.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bloodGroup, contactNo, dateOfBirth, donorId, emergencyContactNo, firstName, firstTimeDonor, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Donor {\n");
    
    sb.append("    bloodGroup: ").append(toIndentedString(bloodGroup)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    donorId: ").append(toIndentedString(donorId)).append("\n");
    sb.append("    emergencyContactNo: ").append(toIndentedString(emergencyContactNo)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    firstTimeDonor: ").append(toIndentedString(firstTimeDonor)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

