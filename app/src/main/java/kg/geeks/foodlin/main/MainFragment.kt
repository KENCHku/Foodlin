package kg.geeks.foodlin.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kg.geeks.foodlin.R
import kg.geeks.foodlin.databinding.FragmentMainBinding
import kg.geeks.foodlin.detail.DetailFragment
import kg.geeks.foodlin.main.stores_adapter.Stores
import kg.geeks.foodlin.main.stores_adapter.StoresAdapter
import kg.geeks.foodlin.main.stuffs_adapter.Stuff
import kg.geeks.foodlin.main.stuffs_adapter.StuffAdapter
import java.text.FieldPosition

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    private val arrayListStuff= ArrayList<Stuff>()//stuff
    private lateinit var stuffAdapter: StuffAdapter

    private val arrayListStore = ArrayList<Stores>()//stores
    private lateinit var storesAdapter: StoresAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadDataStuff()

        loadDataStores()
    }

    private fun loadDataStuff() {//stuff
        arrayListStuff.add(Stuff("Bish", "Closed", 0.2, "(666)", "Kyrgyz", "Samsy", "250", 900.0, 9.5, "around 7 hours", R.drawable.burger_craze))
        arrayListStuff.add(Stuff("2ish", "Closed", 0.2, "(666)", "Kyrgyz", "Samsy", "250", 900.0, 9.5, "around 7 hours", R.drawable.burger_craze))
        arrayListStuff.add(Stuff("3ish", "Closed", 0.2, "(666)", "Kyrgyz", "Samsy", "250", 900.0, 9.5, "around 7 hours", R.drawable.burger_craze))
        arrayListStuff.add(Stuff("4ish", "Closed", 0.2, "(666)", "Kyrgyz", "Samsy", "250", 900.0, 9.5, "around 7 hours", R.drawable.burger_craze))
        arrayListStuff.add(Stuff("5ish", "Closed", 0.2, "(666)", "Kyrgyz", "Samsy", "250", 900.0, 9.5, "around 7 hours", R.drawable.burger_craze))
        arrayListStuff.add(Stuff("6ish", "Closed", 0.2, "(666)", "Kyrgyz", "Samsy", "250", 900.0, 9.5, "around 7 hours", R.drawable.burger_craze))
        arrayListStuff.add(Stuff("7ish Food", "OPEN", 3.2, "(234)", "Kyrgyz", "Samsy", "250", 900.0, 1.5, "around 1 hour", R.drawable.vegeterian_pizza))
        arrayListStuff.add(Stuff("8ish Food", "OPEN", 3.2, "(234)", "Kyrgyz", "Samsy", "250", 900.0, 1.5, "around 1 hour", R.drawable.burger_craze))


        stuffAdapter = StuffAdapter(arrayListStuff, this::onStuffClicked)
        binding.recyclerViewStoreStuff.adapter = stuffAdapter
    }

    private fun onStuffClicked(position: Int) {
        val bundle = Bundle()
        val fragment = DetailFragment()
        val stuffParcelable = arrayListStuff[position]
        bundle.putParcelable("stuff", stuffParcelable)
        fragment.arguments = bundle

        findNavController().navigate(R.id.action_mainFragment_to_detailFragment, bundle)
    }

    private fun loadDataStores() {//stores
        arrayListStore.add(Stores("Takeaways", R.drawable.takeaways))
        arrayListStore.add(Stores("Takeaways", R.drawable.takeaways))
        arrayListStore.add(Stores("Takeaways", R.drawable.takeaways))
        arrayListStore.add(Stores("j", R.drawable.takeaways))
        arrayListStore.add(Stores("Takeaways", R.drawable.takeaways))
        arrayListStore.add(Stores("Takeaways", R.drawable.takeaways))

        storesAdapter = StoresAdapter(arrayListStore)
        binding.recyclerViewStoresType.adapter = storesAdapter

    }

}