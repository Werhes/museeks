package defpackage;

import java.lang.reflect.Array;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1085e {
    public static final char[] ad = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static Object ad(C8221e c8221e, int i, int i2, Long l, Integer num, AbstractC10731e abstractC10731e, int i3) {
        if ((i3 & 16) != 0) {
            num = null;
        }
        C5577e c5577e = new C5577e("audio.get", C15802e.f31125e);
        c5577e.vip(i2, "count");
        c5577e.vip(i, "offset");
        c5577e.metrica(l.longValue(), "owner_id");
        if (num != null) {
            c5577e.vip(num.intValue(), "playlist_id");
        }
        return c8221e.license(c5577e, abstractC10731e);
    }

    public static byte[] adcel(short[][][] sArr, boolean z) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        int length2 = sArr2.length;
        int length3 = sArr2[0].length;
        byte[] bArr = new byte[z ? (((length2 + 1) * length2) / 2) * length : length * length2 * length3];
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length3; i3++) {
                for (short[][] sArr3 : sArr) {
                    if (!z || i2 <= i3) {
                        bArr[i] = (byte) sArr3[i2][i3];
                        i++;
                    }
                }
            }
        }
        return bArr;
    }

    public static int advert(short[][] sArr, byte[] bArr, int i) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length; i3++) {
                sArr[i3][i2] = (short) (bArr[(i2 * length) + i + i3] & 255);
            }
        }
        return length * length2;
    }

    public static C12040e amazon(int i) {
        int i2 = 6;
        if (i != 0) {
            int i3 = 1;
            if (i != 1) {
                if (i != 2) {
                    i3 = 5;
                    if (i != 3) {
                        if (i == 4) {
                            i2 = 3;
                        } else if (i != 5) {
                            if (i != 6) {
                                i3 = 7;
                                if (i != 7 && i != 8) {
                                    if (i == 9) {
                                        i2 = 4;
                                    } else if (i != 10) {
                                        if (i != 11 && i != 12 && i != 13) {
                                            throw new IllegalArgumentException("Unexpected CameraError: " + ((Object) C1096e.ad(i)));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i3;
            }
            i2 = 2;
        }
        return new C12040e(i2);
    }

    public static short[][] appmetrica(short[][] sArr) {
        short[][] sArr2 = new short[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr2[i] = AbstractC12442e.yandex(sArr[i]);
        }
        return sArr2;
    }

    public static short[][][] billing(C14877e c14877e, int i, int i2, int i3, boolean z) {
        byte[] bArr = new byte[z ? (((i2 + 1) * i2) / 2) * i : i * i2 * i3];
        c14877e.nextBytes(bArr);
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i, i2, i3);
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                for (int i7 = 0; i7 < i; i7++) {
                    if (!z || i5 <= i6) {
                        sArr[i7][i5][i6] = (short) (bArr[i4] & 255);
                        i4++;
                    }
                }
            }
        }
        return sArr;
    }

    public static Object license(C8221e c8221e, String str, int i, Long l, List list, C12230e c12230e) {
        C5577e c5577e = new C5577e("audio.searchPlaylists", C4524e.f9800e);
        c5577e.ad("q", str);
        c5577e.vip(100, "count");
        c5577e.vip(i, "offset");
        c5577e.metrica(l.longValue(), "owner_id");
        c5577e.ad("filters", AbstractC13480e.m3608try(list, ",", null, null, null, 62));
        return c8221e.license(c5577e, c12230e);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [eٖؑۡ, eُۙۨ] */
    public static Object metrica(C8221e c8221e, String str, int i, Long l, C2686e c2686e) {
        C15060e c15060e = EnumC5195e.Companion;
        C5577e c5577e = new C5577e("audio.search", C5438e.f11690e);
        c5577e.ad("q", str);
        c5577e.vip(AbstractC3062e.license(120, new C11241e(0, 300, 1)), "count");
        c5577e.vip(i, "offset");
        c5577e.metrica(l.longValue(), "owner_id");
        c5577e.ad("filter", "all");
        return c8221e.license(c5577e, c2686e);
    }

    public static boolean mopub(int i) {
        return i == 6 || i == 1 || i == 2 || i == 4;
    }

    public static short[][][] purchase(short[][][] sArr) {
        short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) short[].class, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i][i2] = AbstractC12442e.yandex(sArr[i][i2]);
            }
        }
        return sArr2;
    }

    public static int smaato(short[][][] sArr, byte[] bArr, int i, boolean z) {
        short[][] sArr2 = sArr[0];
        int length = sArr2.length;
        int length2 = sArr2[0].length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            for (int i4 = 0; i4 < length2; i4++) {
                for (short[][] sArr3 : sArr) {
                    if (!z || i3 <= i4) {
                        sArr3[i3][i4] = (short) (bArr[i2 + i] & 255);
                        i2++;
                    }
                }
            }
        }
        return i2;
    }

    public static byte[] startapp(short[][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        byte[] bArr = new byte[length * length2];
        for (int i = 0; i < length2; i++) {
            for (int i2 = 0; i2 < length; i2++) {
                bArr[(i * length) + i2] = (byte) sArr[i2][i];
            }
        }
        return bArr;
    }

    public static Object vip(C8221e c8221e, Integer num, Long l, List list, AbstractC10731e abstractC10731e, int i) {
        if ((i & 128) != 0) {
            list = null;
        }
        List list2 = list;
        C5577e c5577e = new C5577e("audio.getPlaylists", C5170e.f11066e);
        c5577e.metrica(l.longValue(), "owner_id");
        if (list2 != null) {
            c5577e.ad("filters", AbstractC13480e.m3608try(list2, ",", null, null, null, 62));
        }
        c5577e.vip(100, "count");
        c5577e.vip(num.intValue(), "offset");
        return c8221e.license(c5577e, abstractC10731e);
    }

    public static short[][] yandex(C14877e c14877e, int i, int i2) {
        byte[] bArr = new byte[i * i2];
        c14877e.nextBytes(bArr);
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                sArr[i4][i3] = (short) (bArr[(i3 * i) + i4] & 255);
            }
        }
        return sArr;
    }
}
