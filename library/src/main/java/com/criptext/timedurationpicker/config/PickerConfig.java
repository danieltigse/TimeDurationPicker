package com.criptext.timedurationpicker.config;

import com.criptext.timedurationpicker.data.Type;
import com.criptext.timedurationpicker.data.WheelCalendar;
import com.criptext.timedurationpicker.listener.OnDateSetListener;


/**
 * Created by jzxiang on 16/5/15.
 */
public class PickerConfig {

    public Type mType = DefaultConfig.TYPE;
    public int mThemeColor = DefaultConfig.COLOR;

    public int minuteStep = DefaultConfig.STEP;
    public int hourStep = DefaultConfig.STEP;
    public int dayStep = DefaultConfig.STEP;

    public String mCancelString = DefaultConfig.CANCEL;
    public String mSureString = DefaultConfig.SURE;
    public String mTitleString = DefaultConfig.TITLE;
    public int mToolBarTVColor = DefaultConfig.TOOLBAR_TV_COLOR;

    public int mWheelTVNormalColor = DefaultConfig.TV_NORMAL_COLOR;
    public int mWheelTVSelectorColor = DefaultConfig.TV_SELECTOR_COLOR;
    public int mWheelTVSize = DefaultConfig.TV_SIZE;
    public int mWheelTVSelectorSize = DefaultConfig.TV_SIZE;
    public boolean cyclic = DefaultConfig.CYCLIC;

    public String mYear = DefaultConfig.YEAR;
    public String mMonth = DefaultConfig.MONTH;
    public String mDay = DefaultConfig.DAY;
    public String mHour = DefaultConfig.HOUR;
    public String mMinute = DefaultConfig.MINUTE;

    public String mExpirationMsg = DefaultConfig.EXPIRATION_OPTIONS_MSG;
    public String mExpirationOp1Label = DefaultConfig.EXPIRATION_OPTION_1;
    public String mExpirationOp2Label = DefaultConfig.EXPIRATION_OPTION_2;

    public int mCurrentDay = 0;
    public int mCurrentHour = 0;
    public int mCurrentMinute = 0;

    public int minDay = DefaultConfig.MIN_DAY;
    public int maxDay = DefaultConfig.MAX_DAY;
    /**
     * The min timeMillseconds
     */
    public WheelCalendar mMinCalendar = new WheelCalendar(0);

    /**
     * The max timeMillseconds
     */
    public WheelCalendar mMaxCalendar = new WheelCalendar(0);

    /**
     * The default selector timeMillseconds
     */
    public WheelCalendar mCurrentCalendar = new WheelCalendar(System.currentTimeMillis());

    public OnDateSetListener mCallBack;
}
