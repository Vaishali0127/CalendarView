package calendar.holidaycalendar.publicholiday;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by H.P on 14-07-2018.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.FaqViewHolder> implements View.OnClickListener{

    private Context context;
    public List<DateModel> list;
    public List<DateModel> imglist;
    int flag;

    public MainAdapter(Context context, List<String> ansList, List<DateModel> list, int flag/*, List<String> msgCountList*/) {
      //  this.list = ansList;
       // this.msgCountList = msgCountList;
        this.imglist = list;
        this.context = context;
        this.flag = flag;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
          /*  case R.id.rl_item:
                break;*/
        }
    }

    public class FaqViewHolder extends RecyclerView.ViewHolder {
        public TextView mTxtName, mTxtMsgCount;
        ImageView mImg;
        RelativeLayout mCardView;

        public FaqViewHolder(View view) {
            super(view);
            mTxtName = view.findViewById(R.id.textViewName);
       //     mTxtMsgCount = view.findViewById(R.id.tv_msg_count);
          //  mImg = view.findViewById(R.id.img);
            mCardView = view.findViewById(R.id.card_view);
        }
    }

    @Override
    public FaqViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_adapter, parent, false);

        return new FaqViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FaqViewHolder holder, final int position) {
        String que;
      //  Typeface custom_font = Typeface.createFromAsset(context.getAssets(),  "fonts/Pacifico.ttf");

        //holder.mTxtName.setTypeface(custom_font);
        holder.mTxtName.setText(imglist.get(position).getMonthNameEng());
//        holder.mTxtMsgCount.setText(msgCountList.get(position)+" messages");
       // holder.mImg.setBackgroundResource(imglist.get(position));
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  Intent intent = new Intent(context, OptionListActivity.class);
                intent.putExtra("pos",position);
                intent.putExtra("title",list.get(position));
                context.startActivity(intent);*/
            }
        });
    }

    @Override
    public int getItemCount() {
        return imglist.size();
    }
}

