package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* renamed from: interface, reason: invalid class name */
/* loaded from: classes3.dex */
public class Cinterface extends Cdefault {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f36407e = new inmobi(6, Cinterface.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f36408e;

    public Cinterface(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", AbstractC13883e.ad);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.f36408e = AbstractC1433e.metrica(simpleDateFormat.format(date));
    }

    public Cinterface(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.f36408e = bArr;
        if (!m4597extends(0) || !m4597extends(1) || !m4597extends(2) || !m4597extends(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: class, reason: not valid java name */
    public static Cinterface m4595class(subs subsVar) {
        if (subsVar == 0 || (subsVar instanceof Cinterface)) {
            return (Cinterface) subsVar;
        }
        Cdefault billing = subsVar.billing();
        if (billing instanceof Cinterface) {
            return (Cinterface) billing;
        }
        if (!(subsVar instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(subsVar.getClass().getName()));
        }
        try {
            return (Cinterface) f36407e.m4631e((byte[]) subsVar);
        } catch (Exception e) {
            throw new IllegalArgumentException(AbstractC8703e.subscription(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public static String crashlytics(int i) {
        return i < 10 ? AbstractC1786e.admob(i, "0") : Integer.toString(i);
    }

    /* renamed from: throw, reason: not valid java name */
    public static String m4596throw(String str) {
        String str2;
        StringBuilder sb;
        char charAt;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (charAt = substring.charAt(i)) && charAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            str2 = substring.substring(0, 4) + substring.substring(i);
            sb = new StringBuilder();
        } else if (i2 == 1) {
            str2 = substring.substring(0, i) + "00" + substring.substring(i);
            sb = new StringBuilder();
        } else {
            if (i2 != 2) {
                return str;
            }
            str2 = substring.substring(0, i) + "0" + substring.substring(i);
            sb = new StringBuilder();
        }
        sb.append(str.substring(0, 14));
        sb.append(str2);
        return sb.toString();
    }

    @Override // defpackage.Cdefault
    public void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(24, z, this.f36408e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault
    public Cdefault ads() {
        return new Cinterface(this.f36408e);
    }

    /* renamed from: extends, reason: not valid java name */
    public final boolean m4597extends(int i) {
        byte b;
        byte[] bArr = this.f36408e;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    public final Date firebase() {
        SimpleDateFormat subs;
        String ad = AbstractC1433e.ad(this.f36408e);
        if (ad.endsWith("Z")) {
            subs = m4598goto() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'", AbstractC13883e.ad) : m4600native() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'", AbstractC13883e.ad) : m4601this() ? new SimpleDateFormat("yyyyMMddHHmm'Z'", AbstractC13883e.ad) : new SimpleDateFormat("yyyyMMddHH'Z'", AbstractC13883e.ad);
            subs.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (ad.indexOf(45) > 0 || ad.indexOf(43) > 0) {
            ad = m4599interface();
            subs = subs();
        } else {
            subs = m4598goto() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : m4600native() ? new SimpleDateFormat("yyyyMMddHHmmss") : m4601this() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            subs.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (m4598goto()) {
            ad = m4596throw(ad);
        }
        return subs.parse(ad);
    }

    /* renamed from: goto, reason: not valid java name */
    public final boolean m4598goto() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f36408e;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f36408e);
    }

    /* renamed from: interface, reason: not valid java name */
    public final String m4599interface() {
        String str;
        String ad = AbstractC1433e.ad(this.f36408e);
        if (ad.charAt(ad.length() - 1) == 'Z') {
            return ad.substring(0, ad.length() - 1) + "GMT+00:00";
        }
        int length = ad.length();
        char charAt = ad.charAt(length - 6);
        if ((charAt == '-' || charAt == '+') && ad.indexOf("GMT") == length - 9) {
            return ad;
        }
        int length2 = ad.length();
        int i = length2 - 5;
        char charAt2 = ad.charAt(i);
        if (charAt2 == '-' || charAt2 == '+') {
            StringBuilder sb = new StringBuilder();
            sb.append(ad.substring(0, i));
            sb.append("GMT");
            int i2 = length2 - 2;
            sb.append(ad.substring(i, i2));
            sb.append(":");
            sb.append(ad.substring(i2));
            return sb.toString();
        }
        int length3 = ad.length() - 3;
        char charAt3 = ad.charAt(length3);
        if (charAt3 == '-' || charAt3 == '+') {
            return ad.substring(0, length3) + "GMT" + ad.substring(length3) + ":00";
        }
        StringBuilder inmobi = AbstractC8703e.inmobi(ad);
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = "-";
        } else {
            str = "+";
        }
        int i3 = rawOffset / 3600000;
        int i4 = (rawOffset - (3600000 * i3)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (m4598goto()) {
                    ad = m4596throw(ad);
                }
                if (timeZone.inDaylightTime(subs().parse(ad + "GMT" + str + crashlytics(i3) + ":" + crashlytics(i4)))) {
                    i3 += str.equals("+") ? 1 : -1;
                }
            }
        } catch (ParseException unused) {
        }
        inmobi.append("GMT" + str + crashlytics(i3) + ":" + crashlytics(i4));
        return inmobi.toString();
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (!(cdefault instanceof Cinterface)) {
            return false;
        }
        return Arrays.equals(this.f36408e, ((Cinterface) cdefault).f36408e);
    }

    /* renamed from: native, reason: not valid java name */
    public final boolean m4600native() {
        return m4597extends(12) && m4597extends(13);
    }

    @Override // defpackage.Cdefault
    public int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f36408e.length, z);
    }

    public final SimpleDateFormat subs() {
        SimpleDateFormat simpleDateFormat = m4598goto() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : m4600native() ? new SimpleDateFormat("yyyyMMddHHmmssz") : m4601this() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    /* renamed from: this, reason: not valid java name */
    public final boolean m4601this() {
        return m4597extends(10) && m4597extends(11);
    }
}
