package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2629e extends AbstractC6126e implements InterfaceC4890e, InterfaceC13046e, InterfaceC5487e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f6492e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public Function0 f6493e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C3427e f6494e;

    public C2629e(Function0 function0) {
        this.f6493e = function0;
        C3169e c3169e = new C3169e(5, this);
        C2561e c2561e = AbstractC0845e.ad;
        C3427e c3427e = new C3427e(null, null, null, c3169e);
        m2050e(c3427e);
        this.f6494e = c3427e;
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: catch */
    public final /* synthetic */ void mo708catch() {
    }

    @Override // defpackage.InterfaceC4890e
    public final void crashlytics(C2561e c2561e, EnumC13456e enumC13456e, long j) {
        this.f6494e.crashlytics(c2561e, enumC13456e, j);
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: eؘُٔ */
    public final void mo709e() {
        mo720protected();
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eُۘٙ */
    public final void mo713e() {
        mo720protected();
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: eّٔؖ */
    public final /* synthetic */ boolean mo716e() {
        return false;
    }

    @Override // defpackage.InterfaceC4890e
    public final long pro() {
        C6054e c6054e = AbstractC13091e.ad;
        InterfaceC14388e interfaceC14388e = AbstractC5851e.mopub(this).f27604e;
        c6054e.getClass();
        int i = AbstractC15287e.vip;
        return C10215e.billing(interfaceC14388e.mo493e(c6054e.ad), interfaceC14388e.mo493e(c6054e.vip), interfaceC14388e.mo493e(c6054e.metrica), interfaceC14388e.mo493e(c6054e.license));
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: protected */
    public final void mo720protected() {
        this.f6494e.mo720protected();
    }

    @Override // defpackage.InterfaceC13046e
    /* renamed from: throw, reason: not valid java name */
    public final void mo1035throw(EnumC16488e enumC16488e) {
        this.f6492e = enumC16488e.vip();
    }
}
