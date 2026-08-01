package defpackage;

/* renamed from: eٕؒۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15184e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f30043e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f30044e;

    public C15184e(byte[] bArr, byte[] bArr2) {
        this.f30044e = AbstractC12442e.license(bArr);
        this.f30043e = AbstractC12442e.license(bArr2);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
        crashlyticsVar.appmetrica(new Cthis(0L));
        crashlyticsVar.appmetrica(new Cprotected(this.f30044e));
        crashlyticsVar.appmetrica(new Cprotected(this.f30043e));
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
