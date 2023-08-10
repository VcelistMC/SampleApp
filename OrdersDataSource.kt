package com.s2c.akalatdrd.sampleApp

interface OrdersDataSource {
    fun getOrders(): List<Order>
    fun createOrder(order: Order)
}