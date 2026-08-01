package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۛ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6653e {
    public static final String billing;
    public static final String purchase;
    public static final String startapp;
    public static final String yandex;
    public final int ad;
    public final boolean[] appmetrica;
    public final int[] license;
    public final boolean metrica;
    public final C16437e vip;

    static {
        String str = AbstractC9413e.ad;
        purchase = Integer.toString(0, 36);
        billing = Integer.toString(1, 36);
        yandex = Integer.toString(3, 36);
        startapp = Integer.toString(4, 36);
    }

    public C6653e(C16437e c16437e, boolean z, int[] iArr, boolean[] zArr) {
        int i = c16437e.ad;
        this.ad = i;
        boolean z2 = false;
        AbstractC2301e.billing(i == iArr.length && i == zArr.length);
        this.vip = c16437e;
        if (z && i > 1) {
            z2 = true;
        }
        this.metrica = z2;
        this.license = (int[]) iArr.clone();
        this.appmetrica = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6653e.class == obj.getClass()) {
            C6653e c6653e = (C6653e) obj;
            if (this.metrica == c6653e.metrica && this.vip.equals(c6653e.vip) && Arrays.equals(this.license, c6653e.license) && Arrays.equals(this.appmetrica, c6653e.appmetrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.appmetrica) + ((Arrays.hashCode(this.license) + (((this.vip.hashCode() * 31) + (this.metrica ? 1 : 0)) * 31)) * 31);
    }
}
