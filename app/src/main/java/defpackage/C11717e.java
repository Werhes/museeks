package defpackage;

/* renamed from: eِْٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11717e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16527e f23551e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Cthis f23552e;

    public C11717e(Ccatch ccatch) {
        this.f23552e = Cthis.subs(ccatch.mo171interface(0));
        this.f23551e = C16527e.loadAd(ccatch.mo171interface(1));
    }

    public C11717e(C16527e c16527e) {
        this.f23552e = new Cthis(0L);
        this.f23551e = c16527e;
    }

    public static final C11717e loadAd(Object obj) {
        if (obj instanceof C11717e) {
            return (C11717e) obj;
        }
        if (obj != null) {
            return new C11717e(Ccatch.m168class(obj));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
        crashlyticsVar.appmetrica(this.f23552e);
        crashlyticsVar.appmetrica(this.f23551e);
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
