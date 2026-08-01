package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۡۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC15030e {
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO("AUDIO"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO("VIDEO"),
    SUBTITLES("SUBTITLES"),
    CLOSED_CAPTIONS("CLOSED-CAPTIONS");


    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final HashMap f29798e = new HashMap();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f29799e;

    static {
        for (EnumC15030e enumC15030e : values()) {
            f29798e.put(enumC15030e.f29799e, enumC15030e);
        }
    }

    EnumC15030e(String str) {
        this.f29799e = str;
    }
}
