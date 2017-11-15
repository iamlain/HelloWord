package qianqi.com.qianqi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import qianqi.com.qianqi.mode.Zhiwei_itemInfo;

/**
 * Created by Administrator on 2017/11/7.
 */

class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<Zhiwei_itemInfo> mData;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_job_fragment, parent,false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }
    public void updateData(ArrayList<Zhiwei_itemInfo> data) {
        this.mData = data;
        notifyDataSetChanged();
    }

    public MyAdapter(ArrayList<Zhiwei_itemInfo> data) {
        this.mData = data;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
          holder.zhiwei.setText(mData.get(position).getZhiwei());
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
         TextView zhiwei,gongsi,dizhi;

        public ViewHolder(View itemView) {
            super(itemView);
            zhiwei= (TextView) itemView.findViewById(R.id.tv1_zhiwei);
        }
    }
}
