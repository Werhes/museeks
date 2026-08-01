package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8130e extends AbstractC6950e {
    public static final C13391e advert = new C13391e("Nearby.CONNECTIONS_API", new C17150e(6), new C17647e(23));
    public C18381e mopub;

    public final void adcel(String str) {
        C2580e ad;
        C18381e c18381e = this.mopub;
        synchronized (c18381e) {
            C2271e c2271e = c18381e.metrica;
            if (!c2271e.containsKey(str)) {
                c2271e.put(str, new Object());
            }
            ad = c18381e.ad(this, c2271e.get(str), "connection");
        }
        C18381e c18381e2 = this.mopub;
        C18100e purchase = C10312e.purchase();
        purchase.f35495e = ad;
        purchase.f35492e = C15802e.f31135e;
        purchase.f35489e = C12575e.f25228e;
        purchase.f35491e = 1268;
        c18381e2.vip(this, purchase.vip());
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [e٘ٚٙ, java.lang.Object, eٗۛۖ] */
    public final C0560e billing(String str) {
        C6140e c6140e = new C6140e(str, 3);
        C9321e ad = C0381e.ad();
        ad.appmetrica = 1229;
        ?? obj = new Object();
        obj.f33877e = c6140e;
        ad.ad = obj;
        return appmetrica(1, ad.ad());
    }

    public final void mopub(String str) {
        C9364e vip;
        C18381e c18381e = this.mopub;
        synchronized (c18381e) {
            C2271e c2271e = c18381e.metrica;
            if (!c2271e.containsKey(str)) {
                c2271e.put(str, new Object());
            }
            vip = AbstractC5092e.vip(c2271e.get(str), "connection");
        }
        c18381e.license(this, vip);
    }

    public final C0560e purchase(String str, C17157e c17157e) {
        C2580e license = license(c17157e, C17157e.class.getName());
        C9321e ad = C0381e.ad();
        ad.ad = new C0642e(this, str, license);
        ad.appmetrica = 1227;
        return appmetrica(1, ad.ad());
    }

    public final void startapp() {
        this.mopub.metrica(this, "advertising");
        this.mopub.metrica(this, "discovery").appmetrica(new C3432e(this));
        C5170e c5170e = C5170e.f11078e;
        C9321e ad = C0381e.ad();
        ad.appmetrica = 1229;
        ad.ad = new C14240e(c5170e);
        appmetrica(1, ad.ad()).ad(new C0731e(4, this));
    }

    public final C0560e yandex(String str, C2180e c2180e) {
        C9321e ad = C0381e.ad();
        ad.ad = new C7302e(this, str, c2180e);
        ad.appmetrica = 1228;
        return appmetrica(1, ad.ad());
    }
}
