package com.food.ordering.system.order.service.domain.valueobject

import java.util.UUID

class StreetAddress(
    private val id: UUID,
    private val street: String,
    private val postalCode: String,
    private val city: String
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as StreetAddress

        if (id != other.id) return false
        if (street != other.street) return false
        if (postalCode != other.postalCode) return false
        if (city != other.city) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + postalCode.hashCode()
        result = 31 * result + city.hashCode()
        return result
    }
}