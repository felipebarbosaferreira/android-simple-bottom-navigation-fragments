package br.com.movietalks.simplebottomnavigationfragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import br.com.movietalks.simplebottomnavigationfragments.view.fragment.BlogFragment
import br.com.movietalks.simplebottomnavigationfragments.view.fragment.ChapterFragment
import br.com.movietalks.simplebottomnavigationfragments.view.fragment.StoreFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        setSupportActionBar(toolbar)

        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        if (savedInstanceState == null) {
            val fragment = BlogFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.mainHostNavigationFragment, fragment, fragment.javaClass.getSimpleName())
                .commit()
        }
    }

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            menuItem.onNavDestinationSelected(findNavController(R.id.mainHostNavigationFragment))
                    || super.onOptionsItemSelected(menuItem)

//            when (menuItem.itemId) {
//                R.id.blogFragment -> {
//                    val fragment = BlogFragment()
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.mainHostNavigationFragment, fragment, fragment.javaClass.getSimpleName())
//                        .commit()
//                    return@OnNavigationItemSelectedListener true
//                }
//                R.id.chapterFragment -> {
//                    val fragment = ChapterFragment()
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.mainHostNavigationFragment, fragment, fragment.javaClass.getSimpleName())
//                        .commit()
//                    return@OnNavigationItemSelectedListener true
//                }
//                R.id.storeFragment -> {
//                    val fragment = StoreFragment()
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.mainHostNavigationFragment, fragment, fragment.javaClass.getSimpleName())
//                        .commit()
//                    return@OnNavigationItemSelectedListener true
//                }
//            }
//            false
        }
}
