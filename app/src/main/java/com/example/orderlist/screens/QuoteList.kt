package com.example.orderlist.screens

import QuoteListItem
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.orderlist.models.Quote

@Composable
fun QuoteList(data: Array<Quote>,onClick:(quote:Quote)->Unit) {
    LazyColumn(content = {
        items(data) {
            QuoteListItem(quote = it,onClick)


            }
        })
    }
