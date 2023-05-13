package kg.geeks.foodlin.main.stuffs_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.geeks.foodlin.databinding.ItemListStoresStuffBinding

class StuffAdapter(private val arrayList: ArrayList<Stuff>,
                   private val onItemClicked:(position:Int) -> Unit
): RecyclerView.Adapter<StuffAdapter.StuffViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StuffViewHolder {
        return StuffViewHolder(ItemListStoresStuffBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: StuffViewHolder, position: Int) {
        holder.onBind(arrayList[position])
    }

    override fun getItemCount(): Int = arrayList.size

   inner class StuffViewHolder(val binding: ItemListStoresStuffBinding) : RecyclerView.ViewHolder(binding.root){

//       private val itemPosition = arrayList[adapterPosition]

       fun onBind(stuff: Stuff){

           itemView.setOnClickListener {
               onItemClicked(position)
           }

           binding.apply {
               imageViewStoresStuffItem.setImageResource(stuff.image)
               textViewTitleStoresStuffItem.text = stuff.title
               textViewStoreOpenInfo.text = stuff.isOpen
               textViewReviewGrade.text = stuff.reviewGrade.toString()
               textViewNumReviewsItem.text = stuff.numReviews.toString()
               textViewAdjectiveItem.text = stuff.adjective
               textViewObjectsItem.text = stuff.stuff
               textViewDeliveryPriceItem.text = stuff.deliveryPrice
               textViewMinSumItem.text = stuff.minPrice.toString()
               textViewDistanceInfoItem.text = stuff.distance.toString()
           }

       }
    }
}