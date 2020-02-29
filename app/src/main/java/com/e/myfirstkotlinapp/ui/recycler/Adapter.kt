package com.e.myfirstkotlinapp.ui.recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.e.myfirstkotlinapp.R
import com.e.myfirstkotlinapp.model.MockModel
import com.e.myfirstkotlinapp.model.Purchases

class Adapter(private val list: List<Purchases>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvItemNumber = itemView.findViewById(R.id.tv_item_number) as TextView
        val tvItemPurchaseName = itemView.findViewById(R.id.tv_item_purchaseName) as TextView
        val tvItemPurchaseQuantity = itemView.findViewById(R.id.tv_item_purchaseQuantity) as TextView
        val tvItemPurchasePrice = itemView.findViewById(R.id.tv_item_purchasePrice) as TextView
        val tvItemNPurchaseDiscount = itemView.findViewById(R.id.tv_item_purchaseDiscount) as TextView
        val tvItemPurchaseResult = itemView.findViewById(R.id.tv_item_purchaseResult) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_third_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val purchases : Purchases = list[position]
        holder.tvItemNumber.text = purchases.number.toString()
        holder.tvItemPurchaseName.text = purchases.purchasesName
        holder.tvItemPurchaseQuantity.text = purchases.quantity.toString()
        holder.tvItemPurchasePrice.text = purchases.price.toString()
        holder.tvItemNPurchaseDiscount.text = purchases.discount.toString()
        holder.tvItemPurchaseResult.text = purchases.result.toString()
    }
}