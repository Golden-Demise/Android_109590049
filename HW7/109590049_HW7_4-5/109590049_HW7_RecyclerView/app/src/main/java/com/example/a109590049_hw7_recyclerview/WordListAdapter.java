package com.example.a109590049_hw7_recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter extends
        RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private final LinkedList<String> mWordList;
    private final LinkedList<String> mDescList;
    private final  Context context;
    private LayoutInflater mInflater;

    class WordViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        public final TextView wordItemView;
        public final TextView DescItemView;
        public final Context contextView;
        final WordListAdapter mAdapter;

        public WordViewHolder(View itemView, WordListAdapter adapter){
            super(itemView);
            contextView = itemView.getContext();
            wordItemView = itemView.findViewById(R.id.word);
            DescItemView = itemView.findViewById(R.id.Description);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view){
            int mPosition = getLayoutPosition();
            String element = mWordList.get(mPosition);

            final Intent intent;
            switch (element){
                case "food 1":
                    intent = new Intent(view.getContext(),food1.class);
                    view.getContext().startActivity(intent);
                    break;
                case "food 2":
                    intent = new Intent(view.getContext(),food2.class);
                    view.getContext().startActivity(intent);
                    break;
                case "food 3":
                    intent = new Intent(view.getContext(),food3.class);
                    view.getContext().startActivity(intent);
                    break;
                case "food 4":
                    intent = new Intent(view.getContext(),food4.class);
                    view.getContext().startActivity(intent);
                    break;
                case "food 5":
                    intent = new Intent(view.getContext(),food5.class);
                    view.getContext().startActivity(intent);
                    break;
            }
            //mWordList.set(mPosition,"Clicked! "+element);
            mAdapter.notifyDataSetChanged();
        }
    }

    public WordListAdapter(Context context, LinkedList<String> wordList, LinkedList<String> DescList){
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
        this.mDescList = DescList;
        this.context = context;
    }

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View mItemView = mInflater.inflate(R.layout.wordlist_item,parent,false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position){
        String mCurrent = mWordList.get(position);
        String mDesc = mDescList.get(position);
        holder.wordItemView.setText(mCurrent);
        holder.DescItemView.setText(mDesc);
    }

    @Override
    public int getItemCount(){
        return mWordList.size();
    }
}


