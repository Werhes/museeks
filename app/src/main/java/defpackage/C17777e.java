package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17777e extends AbstractC6690e {
    public static final Object adcel = new Object();
    public final C1962e appmetrica;
    public final boolean billing;
    public final boolean purchase;
    public final long startapp;
    public final C15197e yandex;

    public C17777e(C6268e c6268e) {
        this.appmetrica = c6268e.mo2113e();
        this.purchase = c6268e.mo2120e();
        this.billing = c6268e.mo2124e();
        this.yandex = c6268e.mo2081e() ? C15197e.purchase : null;
        this.startapp = AbstractC9413e.m2546case(c6268e.mo2061abstract());
    }

    @Override // defpackage.AbstractC6690e
    public final Object advert(int i) {
        return adcel;
    }

    @Override // defpackage.AbstractC6690e
    public final int loadAd() {
        return 1;
    }

    @Override // defpackage.AbstractC6690e
    public final C6158e purchase(int i, C6158e c6158e, boolean z) {
        c6158e.getClass();
        C11541e c11541e = C11541e.purchase;
        Object obj = adcel;
        c6158e.startapp(obj, obj, 0, this.startapp, 0L, c11541e, false);
        c6158e.purchase = false;
        return c6158e;
    }

    @Override // defpackage.AbstractC6690e
    public final C11501e smaato(int i, C11501e c11501e, long j) {
        c11501e.vip(adcel, this.appmetrica, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.purchase, this.billing, this.yandex, 0L, this.startapp, 0, 0, 0L);
        c11501e.mopub = false;
        return c11501e;
    }

    @Override // defpackage.AbstractC6690e
    public final int vip(Object obj) {
        return adcel.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.AbstractC6690e
    public final int yandex() {
        return 1;
    }
}
