package defpackage;

/* renamed from: eٗۦَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17410e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f34126e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public byte[] f34127e;

    public C17410e(int i, byte[] bArr) {
        this.f34127e = AbstractC12442e.license(bArr);
        this.f34126e = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eٗۦَ] */
    public static C17410e loadAd(Object obj) {
        if (obj instanceof C17410e) {
            return (C17410e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        obj2.f34127e = Cprotected.subs(m168class.mo171interface(0)).f36449e;
        obj2.f34126e = m168class.size() == 2 ? Cthis.subs(m168class.mo171interface(1)).m4666native() : 12;
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(2, 0);
        crashlyticsVar.appmetrica(new Cprotected(this.f34127e));
        int i = this.f34126e;
        if (i != 12) {
            crashlyticsVar.appmetrica(new Cthis(i));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
