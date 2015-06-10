package lukesterlee.c4q.nyc.asynctaskpractice;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Willee on 6/9/15.
 */
public class ImageAdapter extends BaseAdapter {

    List<Bitmap> imageList;




    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
        imageList = new ArrayList<Bitmap>();
    }

    public int getCount() {
        return imageList.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }


        imageView.setImageBitmap(imageList.get(position));
        return imageView;
    }

    public void refreshImages(List<Bitmap> imageList) {
        this.imageList = imageList;
    }


}