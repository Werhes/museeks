package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12213e implements InterfaceC8559e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C12916e f24525e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC7046e f24526e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0318e f24527e;

    public C12213e(C0318e c0318e, InterfaceC7046e interfaceC7046e) {
        this.f24527e = c0318e;
        this.f24526e = interfaceC7046e;
        this.f24525e = interfaceC7046e.ad();
        interfaceC7046e.vip();
    }

    @Override // defpackage.InterfaceC8559e
    public final C12916e ad() {
        return this.f24525e;
    }

    @Override // defpackage.InterfaceC8559e
    public final boolean admob() {
        return this.f24526e.admob();
    }

    @Override // defpackage.InterfaceC8559e
    public final void billing(C2394e c2394e) {
        this.f24526e.billing(c2394e);
    }

    @Override // defpackage.InterfaceC8559e
    public final InterfaceC6141e metrica() {
        return this.f24527e;
    }

    @Override // defpackage.InterfaceC8559e
    public final boolean mopub() {
        return this.f24526e.mopub();
    }

    @Override // defpackage.InterfaceC8559e
    public final C2394e smaato() {
        return this.f24526e.smaato();
    }
}
