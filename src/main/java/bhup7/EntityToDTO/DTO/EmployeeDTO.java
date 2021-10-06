package bhup7.EntityToDTO.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeDTO {

    private  int id;
    private String name;
    private String designation;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private int age;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int id, String name, String designation, int age) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
   // @JsonIgnore
    public int getAge() {
        return age;
    }
  //  @JsonProperty
    public void setAge(int age) {
        this.age = age;
    }
}
