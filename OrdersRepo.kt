package com.s2c.akalatdrd.sampleApp

import javax.inject.Inject


class OrdersRepo @Inject constructor(
    private val remoteOrdersDataSource: RemoteOrdersDataSource,
    private val offlineOrdersDataSource: OfflineOrdersDataSource
) {
    fun getAllOrders(): List<Order>{
        return if(isOnline) remoteOrdersDataSource.getOrders()
        else offlineOrdersDataSource.getOrders()
    }

    fun createOrder(order: Order){
        if(isOnline) remoteOrdersDataSource.createOrder(order)
        else offlineOrdersDataSource.createOrder(order)
    }

    fun syncWithRemote(){
        if(isOnline){
            remoteOrdersDataSource.syncWithRemote()
            offlineOrdersDataSource.clearLocalOrders()
        }
    }
}