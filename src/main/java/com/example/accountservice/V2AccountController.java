package com.example.accountservice;

import com.example.openapi.api.V2Api;
import com.example.openapi.model.AccountV2;
import com.example.openapi.model.PaginationV2;
import java.time.LocalDate;
import java.util.Arrays;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class V2AccountController implements V2Api {

  @Override
  public ResponseEntity<PaginationV2> listAccounts(Integer limit, Integer offset) {
    return ResponseEntity.ok(
        new PaginationV2()
            .currentPage(1)
            .itemsPerPage(10)
            .totalPages(1)
            .totalItems(1)
            .items(
                Arrays.asList(
                    new AccountV2()
                        .accountId("1")
                        .fullName("Kent")
                        .email("kent@reldyn.co")
                        .phoneNumber("0123456789")
                        .dateOfBirth(LocalDate.now())
                        .race("Malay"))));
  }
}
