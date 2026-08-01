package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۜ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC2113e {
    /* JADX INFO: Fake field, exist only in values array */
    FORMAT("fmt "),
    /* JADX INFO: Fake field, exist only in values array */
    FACT("fact"),
    /* JADX INFO: Fake field, exist only in values array */
    DATA("data"),
    /* JADX INFO: Fake field, exist only in values array */
    LIST("LIST"),
    /* JADX INFO: Fake field, exist only in values array */
    INFO("INFO"),
    /* JADX INFO: Fake field, exist only in values array */
    ID3("id3 "),
    /* JADX INFO: Fake field, exist only in values array */
    CORRUPT_LIST("iLIS"),
    /* JADX INFO: Fake field, exist only in values array */
    CORRUPT_ID3_LATE("d3 \u0000"),
    /* JADX INFO: Fake field, exist only in values array */
    CORRUPT_ID3_EARLY("\u0000id3");


    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final HashMap f5461e = new HashMap();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f5462e;

    EnumC2113e(String str) {
        this.f5462e = str;
    }

    public static synchronized EnumC2113e ad(String str) {
        EnumC2113e enumC2113e;
        synchronized (EnumC2113e.class) {
            try {
                if (f5461e.isEmpty()) {
                    for (EnumC2113e enumC2113e2 : values()) {
                        f5461e.put(enumC2113e2.f5462e, enumC2113e2);
                    }
                }
                enumC2113e = (EnumC2113e) f5461e.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return enumC2113e;
    }
}
