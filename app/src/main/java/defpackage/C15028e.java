package defpackage;

/* renamed from: eٔۡٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15028e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Cprotected f29793e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C16527e f29794e;

    public C15028e(Ccatch ccatch) {
        this.f29794e = C16527e.loadAd(ccatch.mo171interface(0));
        this.f29793e = Cprotected.subs(ccatch.mo171interface(1));
    }

    public C15028e(C16527e c16527e, byte[] bArr) {
        this.f29794e = c16527e;
        this.f29793e = new Cprotected(AbstractC12442e.license(bArr));
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new C10154e(this.f29794e, this.f29793e);
    }
}
