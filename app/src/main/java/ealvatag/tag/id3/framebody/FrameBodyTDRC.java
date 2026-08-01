package ealvatag.tag.id3.framebody;

import defpackage.AbstractC18186e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C7936e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyTDRC extends AbstractFrameBodyTextInfo implements ID3v24FrameBody {
    private static final InterfaceC4279e LOG;
    private static final int PRECISION_DAY = 3;
    private static final int PRECISION_HOUR = 2;
    private static final int PRECISION_MINUTE = 1;
    private static final int PRECISION_MONTH = 4;
    private static final int PRECISION_SECOND = 0;
    private static final int PRECISION_YEAR = 5;
    private static SimpleDateFormat formatDateIn;
    private static SimpleDateFormat formatDateOut;
    private static SimpleDateFormat formatHoursOut;
    private static SimpleDateFormat formatMonthOut;
    private static SimpleDateFormat formatTimeIn;
    private static SimpleDateFormat formatTimeOut;
    private static SimpleDateFormat formatYearIn;
    private static SimpleDateFormat formatYearOut;
    private static final List<SimpleDateFormat> formatters;
    private String date;
    private boolean hoursOnly;
    private boolean monthOnly;
    private String originalID;
    private String time;
    private String year;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        LOG = new C7936e(2);
        ArrayList arrayList = new ArrayList();
        formatters = arrayList;
        Locale locale = Locale.UK;
        arrayList.add(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale));
        arrayList.add(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", locale));
        arrayList.add(new SimpleDateFormat("yyyy-MM-dd'T'HH", locale));
        arrayList.add(new SimpleDateFormat("yyyy-MM-dd", locale));
        arrayList.add(new SimpleDateFormat("yyyy-MM", locale));
        arrayList.add(new SimpleDateFormat("yyyy", locale));
        formatYearIn = new SimpleDateFormat("yyyy", locale);
        formatDateIn = new SimpleDateFormat("ddMM", locale);
        formatTimeIn = new SimpleDateFormat("HHmm", locale);
        formatYearOut = new SimpleDateFormat("yyyy", locale);
        formatDateOut = new SimpleDateFormat("-MM-dd", locale);
        formatMonthOut = new SimpleDateFormat("-MM", locale);
        formatTimeOut = new SimpleDateFormat("'T'HH:mm", locale);
        formatHoursOut = new SimpleDateFormat("'T'HH", locale);
    }

    public FrameBodyTDRC() {
        this.year = BuildConfig.FLAVOR;
        this.time = BuildConfig.FLAVOR;
        this.date = BuildConfig.FLAVOR;
        this.monthOnly = false;
        this.hoursOnly = false;
    }

    public FrameBodyTDRC(byte b, String str) {
        super(b, str);
        this.year = BuildConfig.FLAVOR;
        this.time = BuildConfig.FLAVOR;
        this.date = BuildConfig.FLAVOR;
        this.monthOnly = false;
        this.hoursOnly = false;
        findMatchingMaskAndExtractV3Values();
    }

    public FrameBodyTDRC(FrameBodyTDAT frameBodyTDAT) {
        this.year = BuildConfig.FLAVOR;
        this.time = BuildConfig.FLAVOR;
        this.date = BuildConfig.FLAVOR;
        this.monthOnly = false;
        this.hoursOnly = false;
        this.originalID = "TDAT";
        this.date = frameBodyTDAT.getText();
        setMonthOnly(frameBodyTDAT.isMonthOnly());
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, getFormattedText());
    }

    public FrameBodyTDRC(FrameBodyTDRC frameBodyTDRC) {
        super(frameBodyTDRC);
        this.year = BuildConfig.FLAVOR;
        this.time = BuildConfig.FLAVOR;
        this.date = BuildConfig.FLAVOR;
        this.monthOnly = false;
        this.hoursOnly = false;
    }

    public FrameBodyTDRC(FrameBodyTIME frameBodyTIME) {
        this.year = BuildConfig.FLAVOR;
        this.time = BuildConfig.FLAVOR;
        this.date = BuildConfig.FLAVOR;
        this.monthOnly = false;
        this.hoursOnly = false;
        this.originalID = "TIME";
        this.time = frameBodyTIME.getText();
        setHoursOnly(frameBodyTIME.isHoursOnly());
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, getFormattedText());
    }

    public FrameBodyTDRC(FrameBodyTRDA frameBodyTRDA) {
        this.year = BuildConfig.FLAVOR;
        this.time = BuildConfig.FLAVOR;
        this.date = BuildConfig.FLAVOR;
        this.monthOnly = false;
        this.hoursOnly = false;
        this.originalID = "TRDA";
        this.date = frameBodyTRDA.getText();
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, getFormattedText());
    }

    public FrameBodyTDRC(FrameBodyTYER frameBodyTYER) {
        this.year = BuildConfig.FLAVOR;
        this.time = BuildConfig.FLAVOR;
        this.date = BuildConfig.FLAVOR;
        this.monthOnly = false;
        this.hoursOnly = false;
        this.originalID = "TYER";
        this.year = frameBodyTYER.getText();
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, getFormattedText());
    }

    public FrameBodyTDRC(C16151e c16151e, int i) {
        super(c16151e, i);
        this.year = BuildConfig.FLAVOR;
        this.time = BuildConfig.FLAVOR;
        this.date = BuildConfig.FLAVOR;
        this.monthOnly = false;
        this.hoursOnly = false;
        findMatchingMaskAndExtractV3Values();
    }

    public FrameBodyTDRC(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
        this.year = BuildConfig.FLAVOR;
        this.time = BuildConfig.FLAVOR;
        this.date = BuildConfig.FLAVOR;
        this.monthOnly = false;
        this.hoursOnly = false;
        findMatchingMaskAndExtractV3Values();
    }

    private void extractID3v23Formats(Date date, int i) {
        InterfaceC4279e interfaceC4279e = LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        date.toString();
        ((C7936e) interfaceC4279e).getClass();
        int i2 = C1724e.ad;
        if (i == 5) {
            setYear(formatDateAsYear(date));
            return;
        }
        if (i == 4) {
            setYear(formatDateAsYear(date));
            setDate(formatDateAsDate(date));
            this.monthOnly = true;
            return;
        }
        if (i == 3) {
            setYear(formatDateAsYear(date));
            setDate(formatDateAsDate(date));
            return;
        }
        if (i == 2) {
            setYear(formatDateAsYear(date));
            setDate(formatDateAsDate(date));
            setTime(formatDateAsTime(date));
            this.hoursOnly = true;
            return;
        }
        if (i == 1) {
            setYear(formatDateAsYear(date));
            setDate(formatDateAsDate(date));
            setTime(formatDateAsTime(date));
        } else if (i == 0) {
            setYear(formatDateAsYear(date));
            setDate(formatDateAsDate(date));
            setTime(formatDateAsTime(date));
        }
    }

    private static synchronized String formatAndParse(SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2, String str) {
        String format;
        synchronized (FrameBodyTDRC.class) {
            try {
                format = simpleDateFormat.format(simpleDateFormat2.parse(str));
            } catch (ParseException unused) {
                InterfaceC4279e interfaceC4279e = LOG;
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                ((C7936e) interfaceC4279e).getClass();
                int i = C1724e.ad;
                return BuildConfig.FLAVOR;
            }
        }
        return format;
    }

    private static synchronized String formatDateAsDate(Date date) {
        String format;
        synchronized (FrameBodyTDRC.class) {
            format = formatDateIn.format(date);
        }
        return format;
    }

    private static synchronized String formatDateAsTime(Date date) {
        String format;
        synchronized (FrameBodyTDRC.class) {
            format = formatTimeIn.format(date);
        }
        return format;
    }

    private static synchronized String formatDateAsYear(Date date) {
        String format;
        synchronized (FrameBodyTDRC.class) {
            format = formatYearIn.format(date);
        }
        return format;
    }

    public void findMatchingMaskAndExtractV3Values() {
        Date parse;
        int i = 0;
        while (true) {
            List<SimpleDateFormat> list = formatters;
            if (i >= list.size()) {
                return;
            }
            try {
                synchronized (list.get(i)) {
                    parse = list.get(i).parse(getText());
                }
            } catch (NumberFormatException unused) {
                InterfaceC4279e interfaceC4279e = LOG;
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                formatters.get(i).toPattern();
                getText();
                ((C7936e) interfaceC4279e).getClass();
                int i2 = C1724e.ad;
            } catch (ParseException unused2) {
            }
            if (parse != null) {
                extractID3v23Formats(parse, i);
                return;
            }
            i++;
        }
    }

    public String getDate() {
        return this.date;
    }

    public String getFormattedText() {
        StringBuilder sb = new StringBuilder();
        if (this.originalID == null) {
            return getText();
        }
        String str = this.year;
        if (str != null && !str.trim().isEmpty()) {
            sb.append(formatAndParse(formatYearOut, formatYearIn, this.year));
        }
        if (!this.date.equals(BuildConfig.FLAVOR)) {
            if (isMonthOnly()) {
                sb.append(formatAndParse(formatMonthOut, formatDateIn, this.date));
            } else {
                sb.append(formatAndParse(formatDateOut, formatDateIn, this.date));
            }
        }
        if (!this.time.equals(BuildConfig.FLAVOR)) {
            if (isHoursOnly()) {
                sb.append(formatAndParse(formatHoursOut, formatTimeIn, this.time));
            } else {
                sb.append(formatAndParse(formatTimeOut, formatTimeIn, this.time));
            }
        }
        return sb.toString();
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TDRC";
    }

    public String getOriginalID() {
        return this.originalID;
    }

    public String getTime() {
        return this.time;
    }

    public String getYear() {
        return this.year;
    }

    public boolean isHoursOnly() {
        return this.hoursOnly;
    }

    public boolean isMonthOnly() {
        return this.monthOnly;
    }

    public void setDate(String str) {
        InterfaceC4279e interfaceC4279e = LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i = C1724e.ad;
        this.date = str;
    }

    public void setHoursOnly(boolean z) {
        this.hoursOnly = z;
    }

    public void setMonthOnly(boolean z) {
        this.monthOnly = z;
    }

    public void setTime(String str) {
        InterfaceC4279e interfaceC4279e = LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i = C1724e.ad;
        this.time = str;
    }

    public void setYear(String str) {
        InterfaceC4279e interfaceC4279e = LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i = C1724e.ad;
        this.year = str;
    }
}
