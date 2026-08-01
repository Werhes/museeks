package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٛٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC12588e {
    /* JADX INFO: Fake field, exist only in values array */
    ARTIST("IART", EnumC8271e.ARTIST, 1),
    /* JADX INFO: Fake field, exist only in values array */
    ALBUM("IPRD", EnumC8271e.ALBUM, 2),
    /* JADX INFO: Fake field, exist only in values array */
    TITLE("INAM", EnumC8271e.TITLE, 3),
    TRACKNO("ITRK", EnumC8271e.TRACK, 4),
    /* JADX INFO: Fake field, exist only in values array */
    YEAR("ICRD", EnumC8271e.YEAR, 5),
    /* JADX INFO: Fake field, exist only in values array */
    GENRE("IGNR", EnumC8271e.GENRE, 6),
    /* JADX INFO: Fake field, exist only in values array */
    ALBUM_ARTIST("iaar", EnumC8271e.ALBUM_ARTIST, 7),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS("ICMT", EnumC8271e.COMMENT, 8),
    /* JADX INFO: Fake field, exist only in values array */
    COMPOSER("IMUS", EnumC8271e.COMPOSER, 9),
    /* JADX INFO: Fake field, exist only in values array */
    CONDUCTOR("ITCH", EnumC8271e.CONDUCTOR, 10),
    /* JADX INFO: Fake field, exist only in values array */
    LYRICIST("IWRI", EnumC8271e.LYRICIST, 11),
    /* JADX INFO: Fake field, exist only in values array */
    ENCODER("ISFT", EnumC8271e.ENCODER, 12),
    /* JADX INFO: Fake field, exist only in values array */
    RATING("IRTD", EnumC8271e.RATING, 13),
    /* JADX INFO: Fake field, exist only in values array */
    ISRC("ISRC", EnumC8271e.ISRC, 14),
    /* JADX INFO: Fake field, exist only in values array */
    LABEL("ICMS", EnumC8271e.RECORD_LABEL, 15),
    /* JADX INFO: Fake field, exist only in values array */
    TRACK_GAIN("ITGL", null, 16),
    /* JADX INFO: Fake field, exist only in values array */
    ALBUM_GAIN("IAGL", null, 17),
    /* JADX INFO: Fake field, exist only in values array */
    COPYRIGHT("ICOP", null, 18),
    /* JADX INFO: Fake field, exist only in values array */
    TWONKY_TRACKNO("itrk", null, 1);


    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f25304e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final EnumC8271e f25305e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f25306e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final HashMap f25300e = new HashMap();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final HashMap f25303e = new HashMap();

    EnumC12588e(String str, EnumC8271e enumC8271e, int i) {
        this.f25306e = str;
        this.f25305e = enumC8271e;
        this.f25304e = i;
    }

    public static synchronized EnumC12588e ad(EnumC8271e enumC8271e) {
        EnumC12588e enumC12588e;
        synchronized (EnumC12588e.class) {
            try {
                if (f25303e.isEmpty()) {
                    for (EnumC12588e enumC12588e2 : values()) {
                        EnumC8271e enumC8271e2 = enumC12588e2.f25305e;
                        if (enumC8271e2 != null) {
                            f25303e.put(enumC8271e2, enumC12588e2);
                        }
                    }
                }
                enumC12588e = (EnumC12588e) f25303e.get(enumC8271e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return enumC12588e;
    }
}
