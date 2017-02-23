package comsci.alice.myfirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aom on 23/2/2560.
 */
//Activity นี้ ทำเพื่อ สร้าง Layout เสมือน

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int[] ints;
    private String[] titleStrings, detailStrings;

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater)  context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

       View view = layoutInflater.inflate(R.layout.my_listview, parent ,false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imvIcon);
        TextView titleTextView = (TextView) view.findViewById(R.id.txtTitleLiv);
        TextView detaiTextView = (TextView) view.findViewById(R.id.txtDetailLiv);

        imageView.setImageResource(ints[position]);
        titleTextView.setText(titleStrings[position]);
        detaiTextView.setText(detailStrings[position]);
        return view;
    }
} //MainClass