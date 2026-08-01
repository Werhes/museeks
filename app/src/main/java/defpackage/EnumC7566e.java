package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC7566e {
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_OF_DAY_PADDED('H'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_OF_DAY('k'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_12H_PADDED('I'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_12H('l'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_MINUTE_OF_HOUR_PADDED('M'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_SECONDS_OF_MINUTE_PADDED('S'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_MILLIS_OF_SECOND_PADDED('L'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_NANOS_OF_SECOND_PADDED('N'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_AM_PM('p'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TZ_NUMERIC('z'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TZ_SHORT('Z'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_EPOCH_SECONDS('s'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_EPOCH_MILLIS('Q'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_FULL('B'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_SHORT('b'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_SHORT_ALT('h'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_FULL('A'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_SHORT('a'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_CENTURY_PADDED('C'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_YEAR_PADDED('Y'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_YEAR_OF_CENTURY_PADDED('y'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_YEAR_PADDED('j'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_PADDED('m'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_MONTH_PADDED('d'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_MONTH('e'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES('R'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES_SECONDS('T'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES_SECONDS_12H('r'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_MONTH_DAY_YEAR('D'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_YEAR_MONTH_DAY('F'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_FULL('c');


    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final Map f15389e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final char f15390e;

    static {
        HashMap hashMap = new HashMap();
        for (EnumC7566e enumC7566e : values()) {
            if (hashMap.put(Character.valueOf(enumC7566e.f15390e), enumC7566e) != null) {
                throw new IllegalStateException("duplicate format character: ".concat(String.valueOf(enumC7566e)));
            }
        }
        f15389e = DesugarCollections.unmodifiableMap(hashMap);
    }

    EnumC7566e(char c) {
        this.f15390e = c;
    }
}
