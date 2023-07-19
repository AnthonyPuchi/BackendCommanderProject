package com.example.commander.model

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "saucer_view")

class SaucerView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var name: String? = null
    var category: String? = null
    @Column(name= "price")
    var price: BigDecimal? = null
    var preparation: String? = null
    var proteins: String? = null
}
