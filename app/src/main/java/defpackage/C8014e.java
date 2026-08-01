package defpackage;

import java.net.SocketAddress;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٙۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8014e implements InterfaceC18435e, InterfaceC8376e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C6582e f16266e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC8850e f16267e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C5874e f16268e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C14219e f16269e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5033e f16270e;

    public C8014e(C5033e c5033e, C5317e c5317e, InterfaceC13033e interfaceC13033e, InterfaceC1618e interfaceC1618e, ExecutorC3603e executorC3603e, ExecutorC3603e executorC3603e2, InterfaceC6334e interfaceC6334e, SocketAddress socketAddress, SocketAddress socketAddress2, InterfaceC8850e interfaceC8850e) {
        this.f16270e = c5033e;
        C5874e ad = AbstractC12176e.ad(false);
        this.f16268e = ad;
        this.f16267e = interfaceC8850e;
        this.f16269e = new C14219e(this, socketAddress, socketAddress2, interfaceC13033e, c5317e);
        C6582e c6582e = new C6582e(this, interfaceC1618e, interfaceC13033e, executorC3603e, executorC3603e2, interfaceC6334e);
        this.f16266e = c6582e;
        ad.billing(C6582e.f13569e, c6582e);
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f16267e;
    }

    @Override // defpackage.InterfaceC6141e
    /* renamed from: extends */
    public final C5033e mo324extends() {
        return this.f16270e;
    }

    @Override // defpackage.InterfaceC6141e
    public final C5874e getAttributes() {
        return this.f16268e;
    }

    @Override // defpackage.InterfaceC6141e
    public final InterfaceC11129e getParameters() {
        return this.f16269e.admob();
    }

    @Override // defpackage.InterfaceC6141e
    public final InterfaceC2861e license() {
        return this.f16269e;
    }

    @Override // defpackage.InterfaceC8376e, defpackage.InterfaceC6141e
    public final InterfaceC13646e license() {
        return this.f16269e;
    }

    @Override // defpackage.InterfaceC8376e, defpackage.InterfaceC6141e
    public final InterfaceC7046e loadAd() {
        return this.f16266e;
    }

    @Override // defpackage.InterfaceC6141e
    public final InterfaceC8559e loadAd() {
        return this.f16266e;
    }

    @Override // defpackage.InterfaceC6141e
    /* renamed from: static */
    public final /* bridge */ Object mo325static(Object obj, C12025e c12025e, AbstractC10731e abstractC10731e) {
        return AbstractC1634e.ad(this, obj, c12025e, abstractC10731e);
    }
}
