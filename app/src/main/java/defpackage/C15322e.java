package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15322e implements InterfaceC13125e {
    public final InterfaceC15169e ad;
    public final int appmetrica;
    public C5401e license;
    public final C18478e metrica;
    public final C2007e vip;

    public C15322e(InterfaceC15169e interfaceC15169e, InterfaceC6440e interfaceC6440e) {
        C2007e c2007e = new C2007e(3, interfaceC6440e);
        C18478e c18478e = new C18478e(13);
        C5401e c5401e = new C5401e(-1, 6, (byte) 0);
        this.ad = interfaceC15169e;
        this.vip = c2007e;
        this.metrica = c18478e;
        this.license = c5401e;
        this.appmetrica = 1048576;
    }

    @Override // defpackage.InterfaceC13125e
    public final InterfaceC13125e ad(C4524e c4524e) {
        return this;
    }

    @Override // defpackage.InterfaceC13125e
    public final InterfaceC13125e appmetrica(C5401e c5401e) {
        AbstractC2301e.amazon(c5401e, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.license = c5401e;
        return this;
    }

    @Override // defpackage.InterfaceC13125e
    public final AbstractC3317e license(C1962e c1962e) {
        c1962e.vip.getClass();
        return new C9841e(c1962e, this.ad, this.vip, this.metrica.m4546interface(c1962e), this.license, this.appmetrica, null);
    }

    @Override // defpackage.InterfaceC13125e
    public final InterfaceC13125e metrica(boolean z) {
        return this;
    }

    @Override // defpackage.InterfaceC13125e
    public final InterfaceC13125e vip(int i) {
        return this;
    }
}
