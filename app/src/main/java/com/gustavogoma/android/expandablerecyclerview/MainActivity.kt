package com.gustavogoma.android.expandablerecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SimpleItemAnimator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MyRecyclerViewAdapter()
        adapter.items = mutableListOf(
            Item("Title 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus ac ex neque. Vestibulum rhoncus urna dignissim odio cursus, a volutpat mauris dignissim. Duis risus justo, tempor at tempus vel, semper eu nunc. Nunc maximus varius arcu et fringilla. Quisque scelerisque risus blandit elit iaculis consectetur. Curabitur at sapien et elit consequat egestas. In semper gravida diam, ac iaculis velit blandit eget. Mauris vulputate ligula nec elementum consectetur. Ut volutpat sapien nunc, ac porttitor metus tristique a. Nulla porta ligula velit, sit amet fringilla sapien hendrerit ut. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur in ligula ac justo molestie feugiat ut non nibh. In est orci, volutpat at posuere eget, pulvinar nec velit."),
            Item("Title 2", "Aenean quis lorem libero. Ut semper vulputate neque. Duis gravida varius vestibulum. Proin tincidunt, sem sed aliquet euismod, tellus lorem efficitur quam, id maximus lorem tellus eu libero. Donec sodales lorem et cursus ullamcorper. Nullam gravida nec nulla eu sagittis. Suspendisse in tortor ac nulla laoreet feugiat. Pellentesque eu facilisis mauris. Fusce eget sem non arcu facilisis sagittis. Pellentesque nec nisi vel nisi feugiat congue eget at nisl."),
            Item("Title 3", "Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec porta aliquet velit lacinia aliquet. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vivamus non tellus in felis posuere tempor. Etiam elit turpis, aliquam id nisi non, fringilla vulputate justo. Cras vestibulum ex quis massa lobortis blandit. Integer ac lectus ac sapien ultrices bibendum id sed eros."),
            Item("Title 4", "Sed feugiat turpis et sapien gravida fringilla. Interdum et malesuada fames ac ante ipsum primis in faucibus. Phasellus varius gravida ipsum quis consectetur. Donec tempus scelerisque mauris eget mattis. Cras turpis neque, tempus nec neque ut, fermentum tempor velit. Etiam lacinia, mauris sed porttitor vestibulum, ante nisl lobortis felis, id semper ex nulla eu justo. Nullam mi lorem, posuere ut sem id, accumsan mollis sapien. Interdum et malesuada fames ac ante ipsum primis in faucibus. Quisque commodo ipsum id lacus pellentesque porttitor. Sed feugiat erat orci, in eleifend velit laoreet at. Cras orci dolor, tempor vitae nibh id, mattis aliquam velit. Quisque odio lorem, finibus a purus egestas, faucibus facilisis augue. Cras sodales, turpis eget euismod fringilla, metus ante pretium elit, at tempus nulla dolor nec urna. Quisque aliquam odio id orci finibus, at aliquam massa fermentum."),
            Item("Title 5", "Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin vestibulum ultrices felis, ut lacinia purus dictum vitae. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Pellentesque condimentum libero non erat semper lacinia. Curabitur condimentum finibus nunc quis ultrices. Praesent sit amet eros aliquam, dictum ex nec, laoreet libero. Praesent blandit, dolor nec vestibulum euismod, nisi nisi cursus lorem, consectetur feugiat ipsum sem at lacus."),
            Item("Title 6", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus ac ex neque. Vestibulum rhoncus urna dignissim odio cursus, a volutpat mauris dignissim. Duis risus justo, tempor at tempus vel, semper eu nunc. Nunc maximus varius arcu et fringilla. Quisque scelerisque risus blandit elit iaculis consectetur. Curabitur at sapien et elit consequat egestas. In semper gravida diam, ac iaculis velit blandit eget. Mauris vulputate ligula nec elementum consectetur. Ut volutpat sapien nunc, ac porttitor metus tristique a. Nulla porta ligula velit, sit amet fringilla sapien hendrerit ut. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur in ligula ac justo molestie feugiat ut non nibh. In est orci, volutpat at posuere eget, pulvinar nec velit."),
            Item("Title 7", "Aenean quis lorem libero. Ut semper vulputate neque. Duis gravida varius vestibulum. Proin tincidunt, sem sed aliquet euismod, tellus lorem efficitur quam, id maximus lorem tellus eu libero. Donec sodales lorem et cursus ullamcorper. Nullam gravida nec nulla eu sagittis. Suspendisse in tortor ac nulla laoreet feugiat. Pellentesque eu facilisis mauris. Fusce eget sem non arcu facilisis sagittis. Pellentesque nec nisi vel nisi feugiat congue eget at nisl."),
            Item("Title 8", "Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec porta aliquet velit lacinia aliquet. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vivamus non tellus in felis posuere tempor. Etiam elit turpis, aliquam id nisi non, fringilla vulputate justo. Cras vestibulum ex quis massa lobortis blandit. Integer ac lectus ac sapien ultrices bibendum id sed eros."),
            Item("Title 9", "Sed feugiat turpis et sapien gravida fringilla. Interdum et malesuada fames ac ante ipsum primis in faucibus. Phasellus varius gravida ipsum quis consectetur. Donec tempus scelerisque mauris eget mattis. Cras turpis neque, tempus nec neque ut, fermentum tempor velit. Etiam lacinia, mauris sed porttitor vestibulum, ante nisl lobortis felis, id semper ex nulla eu justo. Nullam mi lorem, posuere ut sem id, accumsan mollis sapien. Interdum et malesuada fames ac ante ipsum primis in faucibus. Quisque commodo ipsum id lacus pellentesque porttitor. Sed feugiat erat orci, in eleifend velit laoreet at. Cras orci dolor, tempor vitae nibh id, mattis aliquam velit. Quisque odio lorem, finibus a purus egestas, faucibus facilisis augue. Cras sodales, turpis eget euismod fringilla, metus ante pretium elit, at tempus nulla dolor nec urna. Quisque aliquam odio id orci finibus, at aliquam massa fermentum."),
            Item("Title 10", "Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin vestibulum ultrices felis, ut lacinia purus dictum vitae. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Pellentesque condimentum libero non erat semper lacinia. Curabitur condimentum finibus nunc quis ultrices. Praesent sit amet eros aliquam, dictum ex nec, laoreet libero. Praesent blandit, dolor nec vestibulum euismod, nisi nisi cursus lorem, consectetur feugiat ipsum sem at lacus."),
            Item("Title 11", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus ac ex neque. Vestibulum rhoncus urna dignissim odio cursus, a volutpat mauris dignissim. Duis risus justo, tempor at tempus vel, semper eu nunc. Nunc maximus varius arcu et fringilla. Quisque scelerisque risus blandit elit iaculis consectetur. Curabitur at sapien et elit consequat egestas. In semper gravida diam, ac iaculis velit blandit eget. Mauris vulputate ligula nec elementum consectetur. Ut volutpat sapien nunc, ac porttitor metus tristique a. Nulla porta ligula velit, sit amet fringilla sapien hendrerit ut. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur in ligula ac justo molestie feugiat ut non nibh. In est orci, volutpat at posuere eget, pulvinar nec velit."),
            Item("Title 12", "Aenean quis lorem libero. Ut semper vulputate neque. Duis gravida varius vestibulum. Proin tincidunt, sem sed aliquet euismod, tellus lorem efficitur quam, id maximus lorem tellus eu libero. Donec sodales lorem et cursus ullamcorper. Nullam gravida nec nulla eu sagittis. Suspendisse in tortor ac nulla laoreet feugiat. Pellentesque eu facilisis mauris. Fusce eget sem non arcu facilisis sagittis. Pellentesque nec nisi vel nisi feugiat congue eget at nisl."),
            Item("Title 13", "Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec porta aliquet velit lacinia aliquet. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vivamus non tellus in felis posuere tempor. Etiam elit turpis, aliquam id nisi non, fringilla vulputate justo. Cras vestibulum ex quis massa lobortis blandit. Integer ac lectus ac sapien ultrices bibendum id sed eros."),
            Item("Title 14", "Sed feugiat turpis et sapien gravida fringilla. Interdum et malesuada fames ac ante ipsum primis in faucibus. Phasellus varius gravida ipsum quis consectetur. Donec tempus scelerisque mauris eget mattis. Cras turpis neque, tempus nec neque ut, fermentum tempor velit. Etiam lacinia, mauris sed porttitor vestibulum, ante nisl lobortis felis, id semper ex nulla eu justo. Nullam mi lorem, posuere ut sem id, accumsan mollis sapien. Interdum et malesuada fames ac ante ipsum primis in faucibus. Quisque commodo ipsum id lacus pellentesque porttitor. Sed feugiat erat orci, in eleifend velit laoreet at. Cras orci dolor, tempor vitae nibh id, mattis aliquam velit. Quisque odio lorem, finibus a purus egestas, faucibus facilisis augue. Cras sodales, turpis eget euismod fringilla, metus ante pretium elit, at tempus nulla dolor nec urna. Quisque aliquam odio id orci finibus, at aliquam massa fermentum."),
            Item("Title 15", "Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin vestibulum ultrices felis, ut lacinia purus dictum vitae. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Pellentesque condimentum libero non erat semper lacinia. Curabitur condimentum finibus nunc quis ultrices. Praesent sit amet eros aliquam, dictum ex nec, laoreet libero. Praesent blandit, dolor nec vestibulum euismod, nisi nisi cursus lorem, consectetur feugiat ipsum sem at lacus."),
            Item("Title 11", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus ac ex neque. Vestibulum rhoncus urna dignissim odio cursus, a volutpat mauris dignissim. Duis risus justo, tempor at tempus vel, semper eu nunc. Nunc maximus varius arcu et fringilla. Quisque scelerisque risus blandit elit iaculis consectetur. Curabitur at sapien et elit consequat egestas. In semper gravida diam, ac iaculis velit blandit eget. Mauris vulputate ligula nec elementum consectetur. Ut volutpat sapien nunc, ac porttitor metus tristique a. Nulla porta ligula velit, sit amet fringilla sapien hendrerit ut. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur in ligula ac justo molestie feugiat ut non nibh. In est orci, volutpat at posuere eget, pulvinar nec velit."),
            Item("Title 12", "Aenean quis lorem libero. Ut semper vulputate neque. Duis gravida varius vestibulum. Proin tincidunt, sem sed aliquet euismod, tellus lorem efficitur quam, id maximus lorem tellus eu libero. Donec sodales lorem et cursus ullamcorper. Nullam gravida nec nulla eu sagittis. Suspendisse in tortor ac nulla laoreet feugiat. Pellentesque eu facilisis mauris. Fusce eget sem non arcu facilisis sagittis. Pellentesque nec nisi vel nisi feugiat congue eget at nisl."),
            Item("Title 13", "Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec porta aliquet velit lacinia aliquet. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vivamus non tellus in felis posuere tempor. Etiam elit turpis, aliquam id nisi non, fringilla vulputate justo. Cras vestibulum ex quis massa lobortis blandit. Integer ac lectus ac sapien ultrices bibendum id sed eros."),
            Item("Title 14", "Sed feugiat turpis et sapien gravida fringilla. Interdum et malesuada fames ac ante ipsum primis in faucibus. Phasellus varius gravida ipsum quis consectetur. Donec tempus scelerisque mauris eget mattis. Cras turpis neque, tempus nec neque ut, fermentum tempor velit. Etiam lacinia, mauris sed porttitor vestibulum, ante nisl lobortis felis, id semper ex nulla eu justo. Nullam mi lorem, posuere ut sem id, accumsan mollis sapien. Interdum et malesuada fames ac ante ipsum primis in faucibus. Quisque commodo ipsum id lacus pellentesque porttitor. Sed feugiat erat orci, in eleifend velit laoreet at. Cras orci dolor, tempor vitae nibh id, mattis aliquam velit. Quisque odio lorem, finibus a purus egestas, faucibus facilisis augue. Cras sodales, turpis eget euismod fringilla, metus ante pretium elit, at tempus nulla dolor nec urna. Quisque aliquam odio id orci finibus, at aliquam massa fermentum."),
            Item("Title 15", "Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin vestibulum ultrices felis, ut lacinia purus dictum vitae. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Pellentesque condimentum libero non erat semper lacinia. Curabitur condimentum finibus nunc quis ultrices. Praesent sit amet eros aliquam, dictum ex nec, laoreet libero. Praesent blandit, dolor nec vestibulum euismod, nisi nisi cursus lorem, consectetur feugiat ipsum sem at lacus.")
        )

        (recycler_view.itemAnimator as SimpleItemAnimator).supportsChangeAnimations = false

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = adapter
        recycler_view.setHasFixedSize(true)
    }

    class MyRecyclerViewAdapter : RecyclerView.Adapter<MyViewHolder>() {
        var items = mutableListOf<Item>()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_item, parent, false)
            return MyViewHolder(view)
        }

        override fun getItemCount(): Int {
            return items.size
        }

        override fun onBindViewHolder(viewHolder: MyViewHolder, position: Int) {
            val item = items[position]
            viewHolder.bind(item)

            viewHolder.itemView.setOnClickListener {
                val isExpanded = item.isExpanded
                item.isExpanded = !isExpanded

                notifyItemChanged(position)
            }
        }

    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var title = itemView.findViewById<TextView>(R.id.title)
        var text = itemView.findViewById<TextView>(R.id.text)

        fun bind(item: Item) {

            val isExpanded = item.isExpanded
            text.visibility = if (isExpanded) View.VISIBLE else View.GONE

            title.text = item.title
            text.text = item.text
        }
    }

    data class Item(
        var title: String,
        var text: String,
        var isExpanded: Boolean = false
    )
}
