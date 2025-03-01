package toptoppy.kotlin.training.springtest.repository

import org.springframework.data.jpa.repository.JpaRepository
import toptoppy.kotlin.training.springtest.entity.ExchangeRateEntity

interface ExchangeRateRepository : JpaRepository<ExchangeRateEntity, String>
