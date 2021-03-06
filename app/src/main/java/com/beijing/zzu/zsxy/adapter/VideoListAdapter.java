package com.beijing.zzu.zsxy.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;

import com.beijing.zzu.zsxy.R;
import com.beijing.zzu.zsxy.model.GankItem;
import com.beijing.zzu.zsxy.model.VideoItemData;
import com.beijing.zzu.zsxy.utils.ImageLoader;
import com.bumptech.glide.Glide;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by jiayongkai on 2017/4/19.
 */

public class VideoListAdapter extends BaseAdapter<VideoItemData> {


    public VideoListAdapter(Context context, List<VideoItemData> datas, boolean isOpenLoadMore) {
        super(context, datas, isOpenLoadMore);
    }

    @Override
    protected void convert(ViewHolder holder, VideoItemData data) {
//        holder.setText(R.id.title,data.getTitle());
//        ImageView videobg=holder.getView(R.id.video_bg);
//        ImageLoader.load(mContext,data.getImgUrl(),videobg);

        JCVideoPlayerStandard videoplayer=holder.getView(R.id.videoplayer);
        videoplayer.setUp(data.getVideoUrl()
                , JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL, data.getTitle());
        ImageLoader.load(mContext,data.getImgUrl(),videoplayer.thumbImageView);
    }

    @Override
    protected int getItemLayoutId() {
        return R.layout.item_video_layout;
    }
}