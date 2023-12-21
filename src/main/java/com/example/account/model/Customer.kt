package com.example.account.model

import org.hibernate.annotations.GenericGenerator
import jakarta.persistence.*

@Entity
data class Customer(

        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: String? = null,

        val name: String? = null,
        val surname: String? = null,

        @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
        val accounts: Set<Account> = emptySet()
) {

        constructor(name: String, surname: String) : this(null, name, surname, emptySet())

        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as Customer

                if (id != other.id) return false
                if (name != other.name) return false
                if (surname != other.surname) return false
                if (accounts != other.accounts) return false

                return true
        }

        override fun hashCode(): Int {
                var result = id?.hashCode() ?: 0
                result = 50 * result + (name?.hashCode() ?: 0)
                result = 50 * result + (surname?.hashCode() ?: 0)
                return result

        }
}