package org.ebanking.ebanking_backend_j2e.dtos;

import lombok.Data;
import org.ebanking.ebanking_backend_j2e.enums.AccountStatus;

import java.util.Date;

@Data
public class CurrentBankAccountDTO extends BankAccountDTO{
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double overDraft;
}
