package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٜۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12681e {
    public static final C2892e ad;
    public static final C2892e metrica;
    public static final C2892e vip;

    static {
        new C2892e(1524080993, false, new C4509e(21));
        new C2892e(-97021387, false, new C4509e(22));
        new C2892e(-587602735, false, new C4509e(23));
        ad = new C2892e(-161223236, false, new C4509e(24));
        vip = new C2892e(783456056, false, new C4509e(25));
        metrica = new C2892e(1019625879, false, new C4509e(26));
    }

    public static final boolean ad() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static final void license(C14479e c14479e, InterfaceC11305e interfaceC11305e, int i) {
        while (true) {
            int i2 = c14479e.tapsense;
            if (i > i2 && i < c14479e.signatures) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            c14479e.m3823while();
            if (c14479e.isPro(c14479e.tapsense)) {
                interfaceC11305e.advert();
            }
            c14479e.adcel();
        }
    }

    public static C3658e metrica(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = AbstractC16303e.ad;
        }
        if ((i & 2) != 0) {
            f2 = AbstractC16303e.license;
        }
        if ((i & 4) != 0) {
            f3 = AbstractC16303e.vip;
        }
        if ((i & 8) != 0) {
            f4 = AbstractC16303e.metrica;
        }
        return new C3658e(f, f2, f3, f4);
    }

    public static final boolean vip(int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i == 1) {
            i2 = 23;
        } else if (i == 2) {
            i2 = 28;
        } else if (i == 3) {
            i2 = 26;
        } else if (i == 4) {
            i2 = 29;
        } else {
            if (i != 5) {
                throw null;
            }
            i2 = 30;
        }
        return i3 >= i2;
    }
}
