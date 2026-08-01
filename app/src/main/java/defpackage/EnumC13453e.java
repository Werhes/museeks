package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۘٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC13453e {
    /* JADX INFO: Fake field, exist only in values array */
    FORMAT_VERSION("FVER"),
    /* JADX INFO: Fake field, exist only in values array */
    APPLICATION("APPL"),
    /* JADX INFO: Fake field, exist only in values array */
    SOUND("SSND"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMON("COMM"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS("COMT"),
    /* JADX INFO: Fake field, exist only in values array */
    NAME("NAME"),
    /* JADX INFO: Fake field, exist only in values array */
    AUTHOR("AUTH"),
    /* JADX INFO: Fake field, exist only in values array */
    COPYRIGHT("(c) "),
    /* JADX INFO: Fake field, exist only in values array */
    ANNOTATION("ANNO"),
    TAG("ID3 "),
    CORRUPT_TAG_LATE("D3 \u0000"),
    CORRUPT_TAG_EARLY("\u0000ID3");


    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final HashMap f26709e = new HashMap();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f26714e;

    EnumC13453e(String str) {
        this.f26714e = str;
    }

    public static synchronized EnumC13453e ad(String str) {
        EnumC13453e enumC13453e;
        synchronized (EnumC13453e.class) {
            try {
                if (f26709e.isEmpty()) {
                    for (EnumC13453e enumC13453e2 : values()) {
                        f26709e.put(enumC13453e2.f26714e, enumC13453e2);
                    }
                }
                enumC13453e = (EnumC13453e) f26709e.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return enumC13453e;
    }
}
