package defpackage;

/* renamed from: eَٓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10245e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Cprotected f20253e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C16527e f20254e;

    public C10245e(Ccatch ccatch) {
        this.f20254e = C16527e.loadAd(ccatch.mo171interface(0));
        this.f20253e = Cprotected.subs(ccatch.mo171interface(1));
    }

    public C10245e(C16527e c16527e, byte[] bArr) {
        this.f20254e = c16527e;
        this.f20253e = new Cprotected(AbstractC12442e.license(bArr));
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new C10154e(this.f20254e, this.f20253e);
    }
}
