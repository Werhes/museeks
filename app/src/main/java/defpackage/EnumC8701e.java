package defpackage;

import java.util.EnumSet;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC8701e {
    IMPLICIT(0),
    TEXT(1),
    /* JADX INFO: Fake field, exist only in values array */
    TEXT_UTF16BE(2),
    /* JADX INFO: Fake field, exist only in values array */
    TEXT_JAPANESE(3),
    /* JADX INFO: Fake field, exist only in values array */
    HTML(6),
    /* JADX INFO: Fake field, exist only in values array */
    XML(7),
    /* JADX INFO: Fake field, exist only in values array */
    GUID(8),
    /* JADX INFO: Fake field, exist only in values array */
    ISRC(9),
    /* JADX INFO: Fake field, exist only in values array */
    MI3P(10),
    COVERART_GIF(12),
    COVERART_JPEG(13),
    COVERART_PNG(14),
    /* JADX INFO: Fake field, exist only in values array */
    URL(15),
    /* JADX INFO: Fake field, exist only in values array */
    DURATION(16),
    /* JADX INFO: Fake field, exist only in values array */
    UPC(17),
    /* JADX INFO: Fake field, exist only in values array */
    RIAAPA(18),
    INTEGER(21),
    /* JADX INFO: Fake field, exist only in values array */
    RIAAPA(24),
    /* JADX INFO: Fake field, exist only in values array */
    UPC(25),
    COVERART_BMP(27);


    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final EnumSet f17561e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final HashMap f17566e = new HashMap(values().length);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f17569e;

    static {
        for (EnumC8701e enumC8701e : values()) {
            f17566e.put(Integer.valueOf(enumC8701e.f17569e), enumC8701e);
        }
        f17561e = EnumSet.of(COVERART_GIF, COVERART_JPEG, COVERART_PNG, COVERART_BMP);
    }

    EnumC8701e(int i) {
        this.f17569e = i;
    }
}
