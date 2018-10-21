package calendar.holidaycalendar.publicholiday;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<String> monthList = new ArrayList<>();
    List<String> month2List = new ArrayList<>();

    List<String> tab1List = new ArrayList<>();
    List<String> tab2List = new ArrayList<>();
    List<String> tab3List = new ArrayList<>();
    List<String> tab4List = new ArrayList<>();
    List<String> tab5List = new ArrayList<>();

    List<String> list = new ArrayList<>();

    ImageView mImgPerv, mImgNext;
    TextView mTxtMonth1, mTxtMonth2;
    TextView mTab1, mTab2, mTab3, mTab4, mTab5;

    RecyclerView mRecyclerView;

    int month = 1;

    Context mContext;

    private List<DateModel> dataList = new ArrayList<>();
   // DateModel dateModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

       // dateModel = new DateModel();
        addDataToLists();

        mImgPerv = findViewById(R.id.iv_prev);
        mImgNext = findViewById(R.id.iv_next);

        mTxtMonth1 = findViewById(R.id.month_name);
        mTxtMonth2 = findViewById(R.id.month_name2);

        mTab1 = findViewById(R.id.tab1);
        mTab2 = findViewById(R.id.tab2);
        mTab3 = findViewById(R.id.tab3);
        mTab4 = findViewById(R.id.tab4);
        mTab5 = findViewById(R.id.tab5);

        mImgPerv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (month == 1) {

                } else {
                    month = month - 1;
                    mTxtMonth1.setText(monthList.get(month - 1));
                    mTxtMonth2.setText(month2List.get(month - 1));

                    mTab1.setText(tab1List.get(month - 1));
                    mTab2.setText(tab2List.get(month - 1));
                    mTab3.setText(tab3List.get(month - 1));
                    mTab4.setText(tab4List.get(month - 1));
                    mTab5.setText(tab5List.get(month - 1));
                }
            }
        });

        mImgNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (month == 12) {

                } else {
                    month = month + 1;
                    mTxtMonth1.setText(monthList.get(month - 1));
                    mTxtMonth2.setText(month2List.get(month - 1));

                    mTab1.setText(tab1List.get(month - 1));
                    mTab2.setText(tab2List.get(month - 1));
                    mTab3.setText(tab3List.get(month - 1));
                    mTab4.setText(tab4List.get(month - 1));
                    mTab5.setText(tab5List.get(month - 1));
                }
            }
        });


        mRecyclerView = findViewById(R.id.recycler_view);
        MainAdapter faqListAdapter = new MainAdapter(mContext, list, dataList, 0);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(mContext);
        //   RecyclerView.LayoutManager mLayoutManager = (new GridLayoutManager(this, 2));
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(faqListAdapter);


    }

    public void addDataToLists() {
        monthList.add("जनवरी 2019");
        monthList.add("फरवरी 2019");
        monthList.add("मार्च 2019");
        monthList.add("अप्रैल 2019");
        monthList.add("मई 2019");
        monthList.add("जून 2019");
        monthList.add("जुलाई 2019");
        monthList.add("अगस्त 2019");
        monthList.add("सितम्बर 2019");
        monthList.add("अक्टूबर 2019");
        monthList.add("नवम्बर 2019");
        monthList.add("दिसम्बर 2019");

        month2List.add("मार्गशीर्ष – पौष   2075");
        month2List.add("पौष – माघ   2075");
        month2List.add("माघ – फाल्गुन   2075");
        month2List.add("फाल्गुन – चैत्र   2075");
        month2List.add("चैत्र – बैशाख   2076");
        month2List.add("बैशाख – ज्येष्ठ   2076");
        month2List.add("ज्येष्ठ – आषाढ़   2076");
        month2List.add("आषाढ़ – भाद्रपद   2076");
        month2List.add("भाद्रपद – आश्विन   2076");
        month2List.add("आश्विन – कार्तिक   2076");
        month2List.add("कार्तिक – मार्गशीर्ष   2076");
        month2List.add("मार्गशीर्ष – पौष   2076");

        tab1List.add("विक्रम सम्वत: 2075");
        tab1List.add("विक्रम सम्वत: 2075");
        tab1List.add("विक्रम सम्वत: 2075");
        tab1List.add("विक्रम सम्वत: 2075");
        tab1List.add("विक्रम सम्वत: 2076");
        tab1List.add("विक्रम सम्वत: 2076");
        tab1List.add("विक्रम सम्वत: 2076");
        tab1List.add("विक्रम सम्वत: 2076");
        tab1List.add("विक्रम सम्वत: 2076");
        tab1List.add("विक्रम सम्वत: 2076");
        tab1List.add("विक्रम सम्वत: 2076");
        tab1List.add("विक्रम सम्वत: 2076");

        tab2List.add("शक सम्वत: 1941");
        tab2List.add("शक सम्वत: 1941");
        tab2List.add("शक सम्वत: 1941");
        tab2List.add("शक सम्वत: 1941");
        tab2List.add("शक सम्वत: 1941");
        tab2List.add("शक सम्वत: 1941");
        tab2List.add("शक सम्वत: 1941");
        tab2List.add("शक सम्वत: 1941");
        tab2List.add("शक सम्वत: 1941");
        tab2List.add("शक सम्वत: 1941");
        tab2List.add("शक सम्वत: 1941");
        tab2List.add("शक सम्वत: 1941");

        tab3List.add("हिज्जरा : 1440");
        tab3List.add("हिज्जरा : 1440");
        tab3List.add("हिज्जरा : 1440");
        tab3List.add("हिज्जरा : 1440");
        tab3List.add("हिज्जरा : 1440");
        tab3List.add("हिज्जरा : 1440");
        tab3List.add("हिज्जरा : 1440");
        tab3List.add("हिज्जरा : 1440");
        tab3List.add("हिज्जरा : 1441");
        tab3List.add("हिज्जरा : 1441");
        tab3List.add("हिज्जरा : 1441");
        tab3List.add("हिज्जरा : 1441");

        tab4List.add("अयन : दक्षिणायन");
        tab4List.add("अयन : दक्षिणायन");
        tab4List.add("अयन : दक्षिणायन");
        tab4List.add("अयन : दक्षिणायन");
        tab4List.add("अयन : दक्षिणायन");
        tab4List.add("अयन : दक्षिणायन");
        tab4List.add("अयन : दक्षिणायन");
        tab4List.add("अयन : दक्षिणायन");
        tab4List.add("अयन : दक्षिणायन");
        tab4List.add("अयन : दक्षिणायन");
        tab4List.add("अयन : दक्षिणायन");
        tab4List.add("अयन : दक्षिणायन");

        tab5List.add("ऋतु : शरद");
        tab5List.add("ऋतु : शरद");
        tab5List.add("ऋतु : शरद");
        tab5List.add("ऋतु : शरद");
        tab5List.add("ऋतु : शरद");
        tab5List.add("ऋतु : शरद");
        tab5List.add("ऋतु : शरद");
        tab5List.add("ऋतु : शरद");
        tab5List.add("ऋतु : शरद");
        tab5List.add("ऋतु : शरद");
        tab5List.add("ऋतु : शरद");
        tab5List.add("ऋतु : शरद");

        // month-wise list
        if(month == 1){
            DateModel dateModel = new DateModel(true,"Sun","रवि","","","","","",
                    "","","","","","");
            dataList.add(dateModel);


        }
    }
}
