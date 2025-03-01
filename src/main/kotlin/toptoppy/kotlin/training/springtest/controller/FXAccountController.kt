package toptoppy.kotlin.training.springtest.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import toptoppy.kotlin.training.springtest.dto.AccountBalanceResponse

@RestController
@RequestMapping("/fx")
class FXAccountController {
    @GetMapping("/{accountNumber}/balance-thb")
    fun getBalanceByAccountNumber(
        @PathVariable accountNumber: String,
    ): ResponseEntity<AccountBalanceResponse> =
        ResponseEntity
            .ok(
                AccountBalanceResponse(
                    accountNumber
                        .takeIf { it == "A123" }
                        ?.let { 3500.0 } ?: 8000.0,
                ),
            )
}
