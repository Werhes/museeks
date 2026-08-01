package defpackage;

/* renamed from: eٕؔۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2603e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f6452e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public byte[] f6453e;

    public C2603e(int i, byte[] bArr) {
        this.f6453e = AbstractC12442e.license(bArr);
        this.f6452e = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eٕؔۙ, java.lang.Object] */
    public static C2603e loadAd(Object obj) {
        if (obj instanceof C2603e) {
            return (C2603e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        obj2.f6453e = Cprotected.subs(m168class.mo171interface(0)).f36449e;
        obj2.f6452e = m168class.size() == 2 ? Cthis.subs(m168class.mo171interface(1)).m4666native() : 12;
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(2, 0);
        crashlyticsVar.appmetrica(new Cprotected(this.f6453e));
        int i = this.f6452e;
        if (i != 12) {
            crashlyticsVar.appmetrica(new Cthis(i));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
