package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5412e {
    public static final String adcel;
    public static final String advert;
    public static final String billing;
    public static final String mopub;
    public static final String startapp;
    public static final String yandex;
    public final int ad;
    public final Bundle appmetrica;
    public final int license;
    public final String metrica;
    public final int purchase;
    public final int vip;

    static {
        String str = AbstractC9413e.ad;
        billing = Integer.toString(0, 36);
        yandex = Integer.toString(1, 36);
        startapp = Integer.toString(2, 36);
        adcel = Integer.toString(3, 36);
        mopub = Integer.toString(4, 36);
        advert = Integer.toString(5, 36);
    }

    public C5412e(int i, int i2, String str, int i3, Bundle bundle, int i4) {
        this.ad = i;
        this.vip = i2;
        this.metrica = str;
        this.license = i3;
        this.appmetrica = bundle;
        this.purchase = i4;
    }

    public C5412e(String str, int i, Bundle bundle) {
        this(1010000300, 9, str, i, new Bundle(bundle), 0);
    }

    public static C5412e ad(Bundle bundle) {
        int i = bundle.getInt(billing, 0);
        int i2 = bundle.getInt(mopub, 0);
        String string = bundle.getString(yandex);
        string.getClass();
        String str = startapp;
        AbstractC2301e.billing(bundle.containsKey(str));
        int i3 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(adcel);
        int i4 = bundle.getInt(advert, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new C5412e(i, i2, string, i3, bundle2, i4);
    }

    public final Bundle vip() {
        Bundle bundle = new Bundle();
        bundle.putInt(billing, this.ad);
        bundle.putString(yandex, this.metrica);
        bundle.putInt(startapp, this.license);
        bundle.putBundle(adcel, this.appmetrica);
        bundle.putInt(mopub, this.vip);
        bundle.putInt(advert, this.purchase);
        return bundle;
    }
}
