package defpackage;

/* renamed from: eؖؑٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3816e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Cthis f8442e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public isPro f8443e;

    public C3816e(int i, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("'seed' cannot be null");
        }
        this.f8443e = new isPro(0, bArr);
        this.f8442e = new Cthis(i);
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new C10154e(this.f8443e, this.f8442e);
    }
}
