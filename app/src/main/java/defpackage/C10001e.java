package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؒۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10001e implements InterfaceC4393e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C5874e f19751e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C6399e f19752e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0069e f19753e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C3434e f19754e;

    public C10001e(C10263e c10263e) {
        this.f19754e = c10263e.vip;
        this.f19752e = c10263e.ad.vip();
        this.f19751e = c10263e.purchase;
        this.f19753e = c10263e.metrica.m2759e();
    }

    @Override // defpackage.InterfaceC3052e
    public final InterfaceC18107e ad() {
        return this.f19753e;
    }

    @Override // defpackage.InterfaceC4393e, defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        throw new IllegalStateException("Call is not initialized");
    }

    @Override // defpackage.InterfaceC4393e
    public final C5874e getAttributes() {
        return this.f19751e;
    }

    @Override // defpackage.InterfaceC4393e
    public final C3434e getMethod() {
        return this.f19754e;
    }

    @Override // defpackage.InterfaceC4393e
    public final C6399e getUrl() {
        return this.f19752e;
    }
}
