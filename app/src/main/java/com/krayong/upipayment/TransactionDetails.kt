package com.krayong.upipayment

data class TransactionDetails(
    val transactionId: String,
    val transactionRefId: String,
    val responseCode: String,
    val status: String,
    val approvalRefNo: String
    )
