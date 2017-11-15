package qianqi.com.qianqi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import qianqi.com.qianqi.mode.Zhiwei_itemInfo;

/**
 * Created by Administrator on 2017/11/7.
 */
/*
* mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
// 设置布局管理器
mRecyclerView.setLayoutManager(mLayoutManager);
// 设置adapter
mRecyclerView.setAdapter(mAdapter);
// 设置Item添加和移除的动画
mRecyclerView.setItemAnimator(new DefaultItemAnimator());
// 设置Item之间间隔样式
mRecyclerView.addItemDecoration(mDividerItemDecoration);
* */

public class JobFragment extends Fragment {
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_job, container,false);
        recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new MyAdapter(getData()));
        return inflate;
    }


    public static Fragment newInstance() {
        return new JobFragment();
    }

    public ArrayList<Zhiwei_itemInfo> getData() {
        ArrayList<Zhiwei_itemInfo> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Zhiwei_itemInfo info = new Zhiwei_itemInfo.Builder()
                    .zhiwei("android开发工程师" + i)
                    .dizhi("北京" + i)
                    .gongsi("京东商城" + i)
                    .xueli("不限学历")
                    .gongzi("25k")
                    .build();
            data.add(info);
        }
        return data;
    }
}
