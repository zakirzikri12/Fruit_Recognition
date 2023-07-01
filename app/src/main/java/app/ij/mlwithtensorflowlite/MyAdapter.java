package app.ij.mlwithtensorflowlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private ArrayList<Model>modelArrayList;
    private Context context;
    public int layout;

    public MyAdapter(ArrayList<Model> modelArrayList, Context context, int layout) {
        this.modelArrayList = modelArrayList;
        this.context = context;
        this.layout = layout;
    }

//    public MyAdapter(ArrayList<Model> modelArrayList, PriceFruit priceFruit, int singleview) {
//    }

    @Override
    public int getCount() {
        return modelArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return modelArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    private class ViewHolder{
        TextView idtxt,nametxt,pricetxt,datetxt;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder=new ViewHolder();
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=layoutInflater.inflate(layout,null);

        viewHolder.idtxt=view.findViewById(R.id.idtxt);
        viewHolder.nametxt=view.findViewById(R.id.nametxt);
        viewHolder.pricetxt=view.findViewById(R.id.pricetxt);
        viewHolder.datetxt=view.findViewById(R.id.datetxt);

        Model model=modelArrayList.get(i);
        viewHolder.idtxt.setText(model.getId());
        viewHolder.nametxt.setText(model.getName());
        viewHolder.pricetxt.setText(model.getPrice());
        viewHolder.datetxt.setText(model.getDate());
        return view;
    }
}
