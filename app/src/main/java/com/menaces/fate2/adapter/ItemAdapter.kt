package com.menaces.fate2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.menaces.fate2.MainActivity
import com.menaces.fate2.data.StoryList
import com.menaces.fate2.model.Story


/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Story>,
    private val onClick: (Int) -> Unit
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    private val storyList = StoryList.stories

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a Story object.
    inner class ItemViewHolder(private val view: View, val onClick:(Int) -> Unit) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view!!.findViewById(com.menaces.fate2.R.id.story_picture)
        val titleTextView: TextView = view.findViewById(com.menaces.fate2.R.id.story_title)
        val genreTextView: TextView = view!!.findViewById(com.menaces.fate2.R.id.story_genre)
        val descTextView: TextView = view!!.findViewById(com.menaces.fate2.R.id.story_description)
        val completionTextView: TextView = view!!.findViewById(com.menaces.fate2.R.id.story_completion)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                onClick(position)
            }
        }
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(com.menaces.fate2.R.layout.story_list_item, parent, false)

        return ItemViewHolder(adapterLayout, onClick)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val story = storyList[position]

//         Set the image resource for the current story
        val resources = context.resources
        holder.imageView.setImageResource(story.imageResourceId)

        // Set the text for the current story's title
        holder.titleTextView.text = resources?.getString(com.menaces.fate2.R.string.story_title, story.title)

        // Set the text for the current story's genre
        holder.genreTextView.text = resources?.getString(com.menaces.fate2.R.string.story_genre, story.genre)

        // Set the text for the current story's description
        holder.descTextView.text = resources?.getString(com.menaces.fate2.R.string.story_desc, story.desc)

        // Set the text for the current story's completion percentage
        holder.completionTextView.text = resources?.getString(com.menaces.fate2.R.string.story_completion, story.completionPercent.toString())
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount() = storyList.size
}