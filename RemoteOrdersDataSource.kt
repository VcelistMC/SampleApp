package com.s2c.akalatdrd.sampleApp

interface RemoteOrdersDataSource: OrdersDataSource {
    fun syncWithRemote()
}