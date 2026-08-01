package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11858e {
    public static final C1410e appmetrica;
    public static final String billing;
    public static final C1410e license = AbstractC17475e.ads(40010);
    public static final String purchase;
    public static final String yandex;
    public final int ad;
    public final Bundle metrica;
    public final String vip;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        AbstractC8306e.ad(7, objArr);
        appmetrica = AbstractC17475e.loadAd(7, objArr);
        String str = AbstractC9413e.ad;
        purchase = Integer.toString(0, 36);
        billing = Integer.toString(1, 36);
        yandex = Integer.toString(2, 36);
    }

    public C11858e(int i) {
        AbstractC2301e.yandex(i != 0, "commandCode shouldn't be COMMAND_CODE_CUSTOM");
        this.ad = i;
        this.vip = BuildConfig.FLAVOR;
        this.metrica = Bundle.EMPTY;
    }

    public C11858e(String str, Bundle bundle) {
        this.ad = 0;
        str.getClass();
        this.vip = str;
        bundle.getClass();
        this.metrica = new Bundle(bundle);
    }

    public static C11858e ad(Bundle bundle) {
        int i = bundle.getInt(purchase, 0);
        if (i != 0) {
            return new C11858e(i);
        }
        String string = bundle.getString(billing);
        string.getClass();
        Bundle Signature = AbstractC9413e.Signature(bundle.getBundle(yandex));
        if (Signature == null) {
            Signature = Bundle.EMPTY;
        }
        return new C11858e(string, Signature);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11858e)) {
            return false;
        }
        C11858e c11858e = (C11858e) obj;
        return this.ad == c11858e.ad && TextUtils.equals(this.vip, c11858e.vip);
    }

    public final int hashCode() {
        return Objects.hash(this.vip, Integer.valueOf(this.ad));
    }

    public final Bundle vip() {
        Bundle bundle = new Bundle();
        bundle.putInt(purchase, this.ad);
        bundle.putString(billing, this.vip);
        bundle.putBundle(yandex, this.metrica);
        return bundle;
    }
}
