package kg.geeks.foodlin.main.stores_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.geeks.foodlin.databinding.ItemListStoresStuffBinding
import kg.geeks.foodlin.databinding.StoresTypeItemBinding

class StoresAdapter(private val arrayList: ArrayList<Stores>) : RecyclerView.Adapter<StoresAdapter.StoresViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoresViewHolder {
        return StoresViewHolder(StoresTypeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: StoresViewHolder, position: Int) {
        holder.onBind(position)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    inner class StoresViewHolder(private val binding: StoresTypeItemBinding): RecyclerView.ViewHolder(binding.root) {

      private  val itemPosition = 0
        //fuck this way
         fun onBind(position: Int){
//             itemPosition = arrayList[adapterPosition]
        println("===1" +arrayList.size)
        println("===2" +adapterPosition)
             binding.imageViewStoresItem.setImageResource(arrayList[position].image)
             binding.textViewTitleStoresItem.text = arrayList[position].type
         }
    }
}