package defpackage;

/* renamed from: eؘؘۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5473e extends Cextends {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public byte[] f11750e;

    public C5473e(byte[] bArr) {
        this.f11750e = bArr;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eؘؘۤ] */
    public static C5473e loadAd(subs subsVar) {
        if (subsVar instanceof C5473e) {
            return (C5473e) subsVar;
        }
        if (subsVar == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(subsVar);
        ?? obj = new Object();
        obj.f11750e = AbstractC12442e.license(Cprotected.subs(m168class.mo171interface(0)).f36449e);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
        crashlyticsVar.appmetrica(new Cprotected(this.f11750e));
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
