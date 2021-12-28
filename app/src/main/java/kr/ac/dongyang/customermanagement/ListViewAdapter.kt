package kr.ac.dongyang.customermanagement

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.rowitem.view.*

class ListViewAdapter(var custList: ArrayList<CustomerC>) : BaseAdapter() {
    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        var rowItemView = view
        if (rowItemView == null) {
            rowItemView = View.inflate(parent?.context, R.layout.rowitem, null)
        }
        val cust1 = custList[position]
        var sajinResid = parent!!.resources.getIdentifier("kr.ac.dongyang.customermanagement:" + "drawable/" + "s" + cust1.custId.toString(),
            null, null)
        rowItemView!!.itemImage.setImageResource(sajinResid)
        rowItemView.itemNo.text = "고객번호 : " + cust1.custId
        rowItemView.itemName.text = "이름 : " + cust1.name + "/" + cust1.sex
        rowItemView.itemPhone.text = "연락처 : " + cust1.phone
        rowItemView.itemCity.text = "지역 : " + cust1.city

        return rowItemView
    }

    override fun getItem(p0: Int): Any {
       return custList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return custList.size
    }
}