package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11765e {
    public static final C2892e ad = new C2892e(-1418460802, false, new C11832e(16));
    public static final C2892e vip = new C2892e(-2128356513, false, new C11832e(17));

    public static C8368e ad(C1362e c1362e, int i) {
        C8368e c8368e = new C8368e(c1362e, (c1362e.ad.getHeight() & 4294967295L) | (c1362e.ad.getWidth() << 32));
        c8368e.f17118e = i;
        return c8368e;
    }

    public static boolean license(byte b) {
        return b > -65;
    }

    public static boolean metrica() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final void vip(C3247e c3247e, C2892e c2892e, C13770e c13770e, int i) {
        c13770e.m3671package(-1991437157);
        if (((i | 2) & 19) == 18 && c13770e.ads()) {
            c13770e.m3659default();
        } else {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                c3247e = (C3247e) c13770e.adcel(AbstractC4449e.appmetrica);
            } else {
                c13770e.m3659default();
            }
            c13770e.admob();
            AbstractC1101e.ad(AbstractC4449e.appmetrica.ad(c3247e), c2892e, c13770e, 48);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C17785e(c3247e, c2892e, i, 7);
        }
    }
}
