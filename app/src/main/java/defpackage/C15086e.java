package defpackage;

/* renamed from: eٔۥۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15086e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Cthis f29867e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C9120e f29868e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Cprotected f29869e;

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        Cprotected cprotected = this.f29869e;
        if (cprotected != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(false, 0, cprotected));
        }
        C9120e c9120e = this.f29868e;
        if (c9120e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(false, 1, c9120e));
        }
        Cthis cthis = this.f29867e;
        if (cthis != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(false, 2, cthis));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }

    public final String toString() {
        String str;
        Cprotected cprotected = this.f29869e;
        if (cprotected != null) {
            byte[] bArr = cprotected.f36449e;
            C2873e c2873e = AbstractC7240e.ad;
            str = AbstractC7240e.appmetrica(0, bArr.length, bArr);
        } else {
            str = "null";
        }
        return AbstractC5087e.m1746extends("AuthorityKeyIdentifier: KeyID(", str, ")");
    }
}
