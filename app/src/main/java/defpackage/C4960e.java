package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4960e {
    public static final String appmetrica;
    public static final String license;
    public static final String purchase;
    public final int ad;
    public final Bundle metrica;
    public final String vip;

    static {
        String str = AbstractC9413e.ad;
        license = Integer.toString(0, 36);
        appmetrica = Integer.toString(1, 36);
        purchase = Integer.toString(2, 36);
    }

    public C4960e(int i) {
        this("no error message provided", i, Bundle.EMPTY);
    }

    public C4960e(String str, int i, Bundle bundle) {
        boolean z = true;
        if (i >= 0 && i != 1) {
            z = false;
        }
        AbstractC2301e.billing(z);
        this.ad = i;
        this.vip = str;
        this.metrica = bundle;
    }

    public static C4960e ad(Bundle bundle) {
        int i = bundle.getInt(license, 1000);
        String string = bundle.getString(appmetrica, BuildConfig.FLAVOR);
        Bundle Signature = AbstractC9413e.Signature(bundle.getBundle(purchase));
        if (Signature == null) {
            Signature = Bundle.EMPTY;
        }
        return new C4960e(string, i, Signature);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4960e)) {
            return false;
        }
        C4960e c4960e = (C4960e) obj;
        return this.ad == c4960e.ad && Objects.equals(this.vip, c4960e.vip);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.ad), this.vip);
    }

    public final Bundle vip() {
        Bundle bundle = new Bundle();
        bundle.putInt(license, this.ad);
        bundle.putString(appmetrica, this.vip);
        Bundle bundle2 = this.metrica;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(purchase, bundle2);
        }
        return bundle;
    }
}
