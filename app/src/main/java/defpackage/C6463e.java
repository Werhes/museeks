package defpackage;

/* renamed from: eؙٜ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6463e extends Cextends implements InterfaceC16631e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Cdefault f13367e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Ctry f13368e = InterfaceC16631e.f32655e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [subs, catch, eًٌَ] */
    /* JADX WARN: Type inference failed for: r7v4, types: [default, catch, eًٌَ] */
    public C6463e(int i, int i2, int i3, int i4) {
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        crashlyticsVar.appmetrica(new Cthis(i));
        if (i3 == 0) {
            if (i4 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            crashlyticsVar.appmetrica(InterfaceC16631e.f32641e);
            crashlyticsVar.appmetrica(new Cthis(i2));
        } else {
            if (i3 <= i2 || i4 <= i3) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            crashlyticsVar.appmetrica(InterfaceC16631e.f32644e);
            crashlytics crashlyticsVar2 = new crashlytics(3, 0);
            crashlyticsVar2.appmetrica(new Cthis(i2));
            crashlyticsVar2.appmetrica(new Cthis(i3));
            crashlyticsVar2.appmetrica(new Cthis(i4));
            ?? ccatch = new Ccatch(crashlyticsVar2);
            ccatch.f20096e = -1;
            crashlyticsVar.appmetrica(ccatch);
        }
        ?? ccatch2 = new Ccatch(crashlyticsVar);
        ccatch2.f20096e = -1;
        this.f13367e = ccatch2;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new C10154e(this.f13368e, this.f13367e);
    }
}
