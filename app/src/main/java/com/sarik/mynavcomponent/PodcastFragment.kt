package com.sarik.mynavcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_podcast.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PodcastFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PodcastFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_podcast, container, false)
        view.btn_one.setOnClickListener {
            //Move fragment programmatically
            Navigation.findNavController(it)
                .navigate(
                    R.id.homeFragment, null,
                    //Add transition animation
                    TransitionAnimation.getNavBuilder().build()
                )
        }
        return view
    }


}