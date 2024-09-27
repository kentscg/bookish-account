package com.example.accountservice;

import com.example.openapi.api.V1Api;
import com.example.openapi.model.Account;
import com.example.openapi.model.Pagination;
import java.time.LocalDate;
import java.util.Arrays;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class V1AccountController implements V1Api {

  @Override
  public ResponseEntity<Pagination> listAccounts(Integer limit, Integer offset) {
    return ResponseEntity.ok(
        new Pagination()
            .currentPage(1)
            .itemsPerPage(10)
            .totalPages(1)
            .totalItems(1)
            .items(
                Arrays.asList(
                    new Account()
                        .accountId("1")
                        .fullName("Kent")
                        .email("kent@reldyn.co")
                        .phoneNumber("0123456789")
                        .dateOfBirth(LocalDate.now()))));
  }
}
