package defpackage;

/* renamed from: eؔٔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2582e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12862e f6440e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C12862e f6441e;

    public C2582e(Ccatch ccatch) {
        int size = ccatch.size();
        if (size != 2) {
            throw new IllegalArgumentException(AbstractC1786e.admob(size, "Bad sequence size: "));
        }
        this.f6441e = C12862e.Signature(ccatch.mo171interface(0));
        this.f6440e = C12862e.Signature(ccatch.mo171interface(1));
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new C10154e(this.f6441e, this.f6440e);
    }
}
