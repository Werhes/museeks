package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۚۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3618e {
    public static final long adcel;
    public static final long appmetrica;
    public static final long billing;
    public static final long license;
    public static final long metrica;
    public static final /* synthetic */ int mopub = 0;
    public static final long purchase;
    public static final long startapp;
    public static final long vip = AbstractC6532e.license(4278190080L);
    public static final long yandex;
    public final long ad;

    static {
        AbstractC6532e.license(4282664004L);
        metrica = AbstractC6532e.license(4287137928L);
        license = AbstractC6532e.license(4291611852L);
        appmetrica = AbstractC6532e.license(4294967295L);
        purchase = AbstractC6532e.license(4294901760L);
        AbstractC6532e.license(4278255360L);
        billing = AbstractC6532e.license(4278190335L);
        AbstractC6532e.license(4294967040L);
        AbstractC6532e.license(4278255615L);
        yandex = AbstractC6532e.license(4294902015L);
        startapp = AbstractC6532e.vip(0);
        adcel = AbstractC6532e.ad(0.0f, 0.0f, 0.0f, 0.0f, C4717e.signatures);
    }

    public /* synthetic */ C3618e(long j) {
        this.ad = j;
    }

    public static final long ad(long j, AbstractC14213e abstractC14213e) {
        C5759e c5759e;
        AbstractC14213e purchase2 = purchase(j);
        int i = purchase2.metrica;
        int i2 = abstractC14213e.metrica;
        if ((i | i2) < 0) {
            c5759e = AbstractC16852e.appmetrica(purchase2, abstractC14213e);
        } else {
            C3123e c3123e = AbstractC15981e.ad;
            int i3 = i | (i2 << 6);
            Object vip2 = c3123e.vip(i3);
            if (vip2 == null) {
                vip2 = AbstractC16852e.appmetrica(purchase2, abstractC14213e);
                c3123e.startapp(i3, vip2);
            }
            c5759e = (C5759e) vip2;
        }
        return c5759e.ad(j);
    }

    public static final float appmetrica(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC17202e.purchase((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC15233e.ad;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float billing(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC17202e.purchase((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC15233e.ad;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float license(long j) {
        float purchase2;
        float f;
        if ((63 & j) == 0) {
            purchase2 = (float) AbstractC17202e.purchase((j >>> 56) & 255);
            f = 255.0f;
        } else {
            purchase2 = (float) AbstractC17202e.purchase((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return purchase2 / f;
    }

    public static final boolean metrica(long j, long j2) {
        return j == j2;
    }

    public static final AbstractC14213e purchase(long j) {
        float[] fArr = C4717e.ad;
        return C4717e.isPro[(int) (j & 63)];
    }

    public static String startapp(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(yandex(j));
        sb.append(", ");
        sb.append(billing(j));
        sb.append(", ");
        sb.append(appmetrica(j));
        sb.append(", ");
        sb.append(license(j));
        sb.append(", ");
        return AbstractC4653e.applovin(sb, purchase(j).ad, ')');
    }

    public static long vip(float f, long j) {
        return AbstractC6532e.ad(yandex(j), billing(j), appmetrica(j), f, purchase(j));
    }

    public static final float yandex(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC17202e.purchase((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC15233e.ad;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3618e) {
            return this.ad == ((C3618e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return C10994e.ad(this.ad);
    }

    public final String toString() {
        return startapp(this.ad);
    }
}
