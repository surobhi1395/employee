
package com.spring.employee.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "employee_name",
    "employee_salary",
    "employee_age",
    "profile_image"
})
@Generated("jsonschema2pojo")
@Data
public class Datum {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("employee_name")
    public String employeeName;
    @JsonProperty("employee_salary")
    public Integer employeeSalary;
    @JsonProperty("employee_age")
    public Integer employeeAge;
    @JsonProperty("profile_image")
    public String profileImage;

}
