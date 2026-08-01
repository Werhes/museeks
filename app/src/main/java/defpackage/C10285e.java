package defpackage;

/* renamed from: eَٕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10285e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C16527e f20301e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f20302e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Cthis f20303e;

    public C10285e(int i, C16527e c16527e) {
        this.f20303e = new Cthis(0L);
        this.f20302e = i;
        this.f20301e = c16527e;
    }

    public C10285e(Ccatch ccatch) {
        this.f20303e = Cthis.subs(ccatch.mo171interface(0));
        this.f20302e = Cthis.subs(ccatch.mo171interface(1)).m4666native();
        this.f20301e = C16527e.loadAd(ccatch.mo171interface(2));
    }

    public static C10285e loadAd(Object obj) {
        if (obj instanceof C10285e) {
            return (C10285e) obj;
        }
        if (obj != null) {
            return new C10285e(Ccatch.m168class(obj));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
        crashlyticsVar.appmetrica(this.f20303e);
        crashlyticsVar.appmetrica(new Cthis(this.f20302e));
        crashlyticsVar.appmetrica(this.f20301e);
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
