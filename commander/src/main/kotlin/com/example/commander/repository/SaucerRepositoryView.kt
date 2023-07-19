package com.example.commander.repository

import com.example.commander.model.SaucerView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface SaucerRepositoryView: JpaRepository<SaucerView, Long> {

}
