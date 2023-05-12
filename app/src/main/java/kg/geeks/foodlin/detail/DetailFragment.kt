package kg.geeks.foodlin.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kg.geeks.foodlin.databinding.FragmentDetailBinding
import kg.geeks.foodlin.databinding.FragmentMainBinding
import kg.geeks.foodlin.main.stuffs_adapter.Stuff

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getDataParcelable()
    }

    private fun getDataParcelable() {
        val bundle = arguments
        if (bundle != null) {
            val stuff = bundle.getParcelable<Stuff>("stuff")

            if (stuff != null) {
                binding.imageViewStuffDetailFragment.setImageResource(stuff.image)
                binding.textViewTitleStoresStuffDetail.text = stuff.title
                binding.textViewStoreDetailOpenInfoDetail.text = stuff.isOpen
                binding.textViewReviewGrade.text = stuff.reviewGrade.toString()
                binding.textViewDetailNumReviews.text = stuff.numReviews
                binding.textViewDetailAdjective.text = stuff.adjective
                binding.textViewDetailObjects.text = stuff.stuff
                binding.textViewDetailDeliveryPrice.text = stuff.deliveryPrice
                binding.textViewDetailMinSum.text = stuff.minPrice.toString()
                binding.textViewDetailDistanceInfo.text = stuff.distance.toString()
                binding.textViewDetailCookTime.text = stuff.cookTime
            }
        }
    }
}
