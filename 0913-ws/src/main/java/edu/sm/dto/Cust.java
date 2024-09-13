package edu.sm.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //Getter Setter 와 toString 까지 만들어줌 개.사.기.
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cust {
    private String id;
    private String pwd;
    private String name;
}
