package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۛۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9759e {
    public static final String appmetrica;
    public static final String billing;
    public static final String purchase;
    public static final String yandex;
    public final int ad;
    public final C4960e license;
    public final long metrica;
    public final Bundle vip;

    static {
        String str = AbstractC9413e.ad;
        appmetrica = Integer.toString(0, 36);
        purchase = Integer.toString(1, 36);
        billing = Integer.toString(2, 36);
        yandex = Integer.toString(3, 36);
    }

    public C9759e(int i) {
        this(i, Bundle.EMPTY);
    }

    public C9759e(int i, Bundle bundle) {
        this(i, bundle, SystemClock.elapsedRealtime(), null);
    }

    public C9759e(int i, Bundle bundle, long j, C4960e c4960e) {
        AbstractC2301e.billing(c4960e == null || i < 0);
        this.ad = i;
        this.vip = new Bundle(bundle);
        this.metrica = j;
        if (c4960e == null && i < 0) {
            c4960e = new C4960e(i);
        }
        this.license = c4960e;
    }

    public static C9759e ad(Bundle bundle) {
        int i = bundle.getInt(appmetrica, -1);
        Bundle Signature = AbstractC9413e.Signature(bundle.getBundle(purchase));
        long j = bundle.getLong(billing, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(yandex);
        C4960e ad = bundle2 != null ? C4960e.ad(bundle2) : i != 0 ? new C4960e(i) : null;
        if (Signature == null) {
            Signature = Bundle.EMPTY;
        }
        return new C9759e(i, Signature, j, ad);
    }

    public final Bundle vip() {
        Bundle bundle = new Bundle();
        bundle.putInt(appmetrica, this.ad);
        bundle.putBundle(purchase, this.vip);
        bundle.putLong(billing, this.metrica);
        C4960e c4960e = this.license;
        if (c4960e != null) {
            bundle.putBundle(yandex, c4960e.vip());
        }
        return bundle;
    }
}
