package defpackage;

/* renamed from: eٖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16474e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f32299e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f32300e;

    public C16474e(Ccatch ccatch) {
        if (!Cthis.subs(ccatch.mo171interface(0)).m4663class(0)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f32300e = AbstractC12442e.license(Cprotected.subs(ccatch.mo171interface(1)).f36449e);
        this.f32299e = AbstractC12442e.license(Cprotected.subs(ccatch.mo171interface(2)).f36449e);
    }

    public C16474e(byte[] bArr, byte[] bArr2) {
        this.f32300e = AbstractC12442e.license(bArr);
        this.f32299e = AbstractC12442e.license(bArr2);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
        crashlyticsVar.appmetrica(new Cthis(0L));
        crashlyticsVar.appmetrica(new Cprotected(this.f32300e));
        crashlyticsVar.appmetrica(new Cprotected(this.f32299e));
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
