package org.ebanking.ebanking_backend_j2e.dtos;

import lombok.Data;
import org.ebanking.ebanking_backend_j2e.enums.OperationType;

import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}
