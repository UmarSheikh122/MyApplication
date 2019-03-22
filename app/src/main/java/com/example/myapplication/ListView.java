package com.example.myapplication;
import android.app.admin.NetworkEvent;
import android.net.Network;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListView extends AppCompatActivity  {
   public int Image[]={R.drawable.cccc,R.drawable.aaaa,R.drawable.bbbb,R.drawable.dddd,R.drawable.eeee,R.drawable.ffff,R.drawable.gggg,R.drawable.hhhh,
           R.drawable.iiii,R.drawable.jjjj,R.drawable.kkkk,R.drawable.llll,R.drawable.mmmm,R.drawable.nnnn,R.drawable.oooo,R.drawable.pppp,R.drawable.qqqq,R.drawable.rrrr};
    public String Name[]={"saad","asad","obaid","saif","abdulla","saad","asad","obaid","saif","abdulla","saad","asad","obaid","saif","abdulla","saad","asad","obaid","saif","abdulla"};
    public String Desc[]={"saad","asad","obaid","saif","abdulla","saad","asad","obaid","saif","abdulla","saad","asad","obaid","saif","abdulla","saad","asad","obaid","saif","abdulla"};

    public static android.widget.ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listview=(android.widget.ListView)findViewById(R.id.listView1);
        CustomListView customListView=new CustomListView();
        listview.setAdapter(customListView);
    }
    class CustomListView extends BaseAdapter{

        @Override
        public int getCount() {

            return Image.length;
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
        public View getView(int i, View view, ViewGroup parent) {
            view=getLayoutInflater().inflate(R.layout.listview1,null);
            ImageView image=(ImageView) view.findViewById(R.id.imageView11);
            TextView textView1=(TextView) view.findViewById(R.id.textView1);
            TextView textView12=(TextView) view.findViewById(R.id.textView2);
            image.setImageResource(Image[i]);
            textView1.setText(Name[i]);
            textView12.setText(Desc[i]);
            return view;
        }
    }
}
