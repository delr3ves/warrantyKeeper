package com.emaginalabs.warrantyKeeperServer.core.ticket

import java.util.*

data class Ticket(val id: String, val ticketUrl: String, val boughtOn: Date?, val yearsOfWarranty: Int?, val description: String?, val productPhotoUrl: String?)