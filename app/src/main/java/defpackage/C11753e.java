package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11753e {
    public static final String appmetrica;
    public static final String billing;
    public static final String purchase;
    public static final String yandex;
    public final Bundle ad;
    public final boolean license;
    public final boolean metrica;
    public final boolean vip;

    static {
        String str = AbstractC9413e.ad;
        appmetrica = Integer.toString(0, 36);
        purchase = Integer.toString(1, 36);
        billing = Integer.toString(2, 36);
        yandex = Integer.toString(3, 36);
    }

    public C11753e(Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.ad = new Bundle(bundle);
        this.vip = z;
        this.metrica = z2;
        this.license = z3;
    }

    public static C11753e ad(Bundle bundle) {
        Bundle Signature = AbstractC9413e.Signature(bundle.getBundle(appmetrica));
        boolean z = bundle.getBoolean(purchase, false);
        boolean z2 = bundle.getBoolean(billing, false);
        boolean z3 = bundle.getBoolean(yandex, false);
        if (Signature == null) {
            Signature = Bundle.EMPTY;
        }
        return new C11753e(Signature, z, z2, z3);
    }

    public final Bundle vip() {
        Bundle bundle = new Bundle();
        bundle.putBundle(appmetrica, this.ad);
        bundle.putBoolean(purchase, this.vip);
        bundle.putBoolean(billing, this.metrica);
        bundle.putBoolean(yandex, this.license);
        return bundle;
    }
}
