package j$.time;

import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.TextStyle;
import j$.time.format.d0;
import j$.time.format.u;
import j$.time.temporal.TemporalAccessor;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {
    public static final Map a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.T("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.T("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.T("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.T("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.T("AST", "America/Anchorage"), j$.com.android.tools.r8.a.T("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.T("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.T("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.T("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.T("CST", "America/Chicago"), j$.com.android.tools.r8.a.T("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.T("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.T("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.T("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.T("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.T("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.T("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.T("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.T("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.T("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.T("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.T("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.T("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.T("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.T("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.T("EST", "-05:00"), j$.com.android.tools.r8.a.T("MST", "-07:00"), j$.com.android.tools.r8.a.T("HST", "-10:00")};
        HashMap hashMap = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object requireNonNull = Objects.requireNonNull(entry.getKey());
            if (hashMap.put(requireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + requireNonNull);
            }
        }
        a = Collections.unmodifiableMap(hashMap);
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != s.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId M(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.D(j$.time.temporal.p.e);
        if (zoneId != null) {
            return zoneId;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static ZoneId N(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        return (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) ? ZoneOffset.R(str) : (str.startsWith("UTC") || str.startsWith("GMT")) ? P(str, 3, z) : str.startsWith("UT") ? P(str, 2, z) : s.R(str, z);
    }

    public static ZoneId O(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.getTotalSeconds() != 0) {
            str = str.concat(zoneOffset.c);
        }
        return new s(str, zoneOffset.getRules());
    }

    public static ZoneId P(String str, int i, boolean z) {
        String substring = str.substring(0, i);
        if (str.length() == i) {
            return O(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return s.R(str, z);
        }
        try {
            ZoneOffset R = ZoneOffset.R(str.substring(i));
            return R == ZoneOffset.UTC ? O(substring, R) : O(substring, R);
        } catch (DateTimeException e) {
            throw new RuntimeException("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public static ZoneId of(String str) {
        return N(str, true);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZoneId systemDefault() {
        String id = TimeZone.getDefault().getID();
        Map map = a;
        Objects.requireNonNull(id, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        Object obj = (String) map.get(id);
        if (obj == null) {
            obj = Objects.requireNonNull(id, "defaultObj");
        }
        return of((String) obj);
    }

    private Object writeReplace() {
        return new n((byte) 7, this);
    }

    public abstract void Q(DataOutput dataOutput);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.c(new u(textStyle, false));
        return dateTimeFormatterBuilder.m(locale, d0.SMART, null).format(new r(0, this));
    }

    public abstract String getId();

    public abstract ZoneRules getRules();

    public int hashCode() {
        return getId().hashCode();
    }

    public ZoneId normalized() {
        try {
            ZoneRules rules = getRules();
            if (rules.isFixedOffset()) {
                return rules.d(Instant.c);
            }
        } catch (j$.time.zone.f unused) {
        }
        return this;
    }

    public String toString() {
        return getId();
    }
}
