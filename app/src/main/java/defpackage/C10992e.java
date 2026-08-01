package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10992e {
    public final C8212e ad;
    public boolean appmetrica;
    public final C12618e license;
    public final C12618e metrica;
    public final ViewTreeObserverOnGlobalLayoutListenerC5014e vip;

    public C10992e(C8212e c8212e, ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e) {
        this.ad = c8212e;
        this.vip = viewTreeObserverOnGlobalLayoutListenerC5014e;
        C12618e c12618e = AbstractC1710e.ad;
        this.metrica = new C12618e();
        this.license = new C12618e();
    }

    public final void ad() {
        if (this.appmetrica) {
            return;
        }
        C15101e c15101e = new C15101e(0, this, C10992e.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 6);
        C12328e c12328e = this.vip.f10667e;
        if (c12328e.startapp(c15101e) < 0) {
            c12328e.ad(c15101e);
        }
        this.appmetrica = true;
    }
}
