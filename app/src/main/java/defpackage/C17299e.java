package defpackage;

/* renamed from: eٗ۠ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17299e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f33941e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f33942e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C16527e f33943e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Cthis f33944e;

    public C17299e(int i, int i2, C16527e c16527e) {
        this.f33944e = new Cthis(0L);
        this.f33942e = i;
        this.f33941e = i2;
        this.f33943e = c16527e;
    }

    public C17299e(Ccatch ccatch) {
        this.f33944e = Cthis.subs(ccatch.mo171interface(0));
        this.f33942e = Cthis.subs(ccatch.mo171interface(1)).m4666native();
        this.f33941e = Cthis.subs(ccatch.mo171interface(2)).m4666native();
        this.f33943e = C16527e.loadAd(ccatch.mo171interface(3));
    }

    public static C17299e loadAd(Object obj) {
        if (obj instanceof C17299e) {
            return (C17299e) obj;
        }
        if (obj != null) {
            return new C17299e(Ccatch.m168class(obj));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
        crashlyticsVar.appmetrica(this.f33944e);
        crashlyticsVar.appmetrica(new Cthis(this.f33942e));
        crashlyticsVar.appmetrica(new Cthis(this.f33941e));
        crashlyticsVar.appmetrica(this.f33943e);
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
