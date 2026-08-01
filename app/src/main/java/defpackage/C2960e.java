package defpackage;

/* renamed from: eۣؔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2960e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C16527e f6997e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C14643e f6998e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public isPro f6999e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Ccatch f7000e;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eۣؔ۟] */
    public static C2960e loadAd(Object obj) {
        if (obj instanceof C2960e) {
            return (C2960e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        obj2.f7000e = m168class;
        if (m168class.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        obj2.f6998e = C14643e.loadAd(m168class.mo171interface(0));
        obj2.f6997e = C16527e.loadAd(m168class.mo171interface(1));
        obj2.f6999e = isPro.firebase(m168class.mo171interface(2));
        return obj2;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this.f7000e;
    }
}
