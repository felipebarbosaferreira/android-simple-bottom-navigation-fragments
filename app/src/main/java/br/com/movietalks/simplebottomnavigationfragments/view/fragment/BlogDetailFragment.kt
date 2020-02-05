package br.com.movietalks.simplebottomnavigationfragments.view.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.movietalks.simplebottomnavigationfragments.R
import br.com.movietalks.simplebottomnavigationfragments.viewmodel.BlogDetailViewModel

class BlogDetailFragment : Fragment() {

    companion object {
        fun newInstance() = BlogDetailFragment()
    }

    private lateinit var viewModel: BlogDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.blog_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BlogDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
