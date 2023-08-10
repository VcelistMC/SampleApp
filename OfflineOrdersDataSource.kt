package com.s2c.akalatdrd.sampleApp

interface OfflineOrdersDataSource: OrdersDataSource {
    fun clearLocalOrders()
}