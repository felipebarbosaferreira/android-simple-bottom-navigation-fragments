package br.com.movietalks.simplebottomnavigationfragments.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import br.com.movietalks.simplebottomnavigationfragments.R
import br.com.movietalks.simplebottomnavigationfragments.viewmodel.BlogViewModel


class BlogFragment : Fragment() {

    companion object {
        fun newInstance() = BlogFragment()
    }

    private lateinit var viewModel: BlogViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.blog_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BlogViewModel::class.java)
        // TODO: Use the ViewModel

        val buttonBlogDetail: Button = view!!.findViewById(R.id.buttonBlogDetail) as Button
        buttonBlogDetail.setOnClickListener(View.OnClickListener { goToDetailBlogFragment() })
    }

    fun goToDetailBlogFragment() {
        findNavController().navigate(R.id.blogDetailFragment)
    }
}
