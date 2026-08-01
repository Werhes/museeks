package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕ٘٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3434e {
    public static final C3434e adcel;
    public static final C3434e appmetrica;
    public static final C3434e billing;
    public static final C3434e license;
    public static final C3434e metrica;
    public static final List mopub;
    public static final C3434e purchase;
    public static final C3434e startapp;
    public static final C3434e vip;
    public static final C3434e yandex;
    public final String ad;

    static {
        C3434e c3434e = new C3434e("GET");
        vip = c3434e;
        C3434e c3434e2 = new C3434e("POST");
        metrica = c3434e2;
        C3434e c3434e3 = new C3434e("PUT");
        license = c3434e3;
        C3434e c3434e4 = new C3434e("PATCH");
        appmetrica = c3434e4;
        C3434e c3434e5 = new C3434e("DELETE");
        purchase = c3434e5;
        C3434e c3434e6 = new C3434e("HEAD");
        billing = c3434e6;
        C3434e c3434e7 = new C3434e("OPTIONS");
        yandex = c3434e7;
        startapp = new C3434e("TRACE");
        adcel = new C3434e("QUERY");
        mopub = AbstractC6874e.startapp(c3434e, c3434e2, c3434e3, c3434e4, c3434e5, c3434e6, c3434e7);
    }

    public C3434e(String str) {
        this.ad = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3434e) && AbstractC7890e.billing(this.ad, ((C3434e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return this.ad;
    }
}
