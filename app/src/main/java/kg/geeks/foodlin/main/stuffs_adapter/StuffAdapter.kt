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

           binding.imageViewStoresStuffItem.setImageResource(stuff.image)
           binding.textViewTitleStoresStuffItem.text = stuff.title
           binding.textViewStoreOpenInfo.text = stuff.isOpen
           binding.textViewReviewGrade.text = stuff.reviewGrade.toString()
           binding.textViewNumReviewsItem.text = stuff.numReviews
           binding.textViewAdjectiveItem.text = stuff.adjective
           binding.textViewObjectsItem.text = stuff.stuff
           binding.textViewDeliveryPriceItem.text = stuff.deliveryPrice
           binding.textViewMinSumItem.text = stuff.minPrice.toString()
           binding.textViewDistanceInfoItem.text = stuff.distance.toString()
       }
    }
}