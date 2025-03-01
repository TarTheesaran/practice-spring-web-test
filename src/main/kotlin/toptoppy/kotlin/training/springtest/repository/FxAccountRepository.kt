package toptoppy.kotlin.training.springtest.repository

import org.springframework.data.jpa.repository.JpaRepository
import toptoppy.kotlin.training.springtest.entity.FxAccountEntity

interface FxAccountRepository : JpaRepository<FxAccountEntity, String>
