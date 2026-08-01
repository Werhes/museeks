package defpackage;

/* renamed from: eؙؑۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0153e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public subs f1386e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Ctry f1387e;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eؙؑۜ] */
    public static C0153e loadAd(subs subsVar) {
        if (subsVar instanceof C0153e) {
            return (C0153e) subsVar;
        }
        if (subsVar == null) {
            throw new IllegalArgumentException("null value in getInstance()");
        }
        Ccatch m168class = Ccatch.m168class(subsVar);
        ?? obj = new Object();
        obj.f1387e = (Ctry) m168class.mo171interface(0);
        obj.f1386e = m168class.mo171interface(1);
        return obj;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new C10154e(this.f1387e, this.f1386e);
    }
}
