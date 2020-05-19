package dsu.software.soft3_101;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListviewAdapter extends  BaseAdapter {


    Context context;
    ArrayList<ListViewItem> list_itemArrayList;
    ViewHolder viewholder;

    public ListviewAdapter(Context context, ArrayList<ListViewItem> list_itemArrayList) {
        this.context = context;
        this.list_itemArrayList = list_itemArrayList;
    }



    @Override
    public int getCount() {
        return this.list_itemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list_itemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_layout,null);
            viewholder = new ViewHolder();
            viewholder.content_textView = (TextView)convertView.findViewById(R.id.text_view_at_custom_layout);
            convertView.setTag(viewholder);
        }else{
            viewholder = (ViewHolder)convertView.getTag();
        }

        viewholder.content_textView.setText(list_itemArrayList.get(position).getContent());

        return convertView;
    }


    static class ViewHolder{

        TextView content_textView;
    }
}
