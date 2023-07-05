package com.example.commander.service

import com.example.commander.model.SaucerProteins
import com.example.commander.repository.SaucerProteinsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class SaucerProteinsService {
    @Autowired
    lateinit var saucerProteinsRepository: SaucerProteinsRepository

    fun list(): List<SaucerProteins> {
        return saucerProteinsRepository.findAll()
    }

    fun save(saucerProteins: SaucerProteins):  SaucerProteins? {
        return saucerProteinsRepository.save(saucerProteins)
    }
}