package defpackage;

import java.math.BigInteger;

/* renamed from: eًًۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7806e extends Cextends implements InterfaceC2796e, InterfaceC5051e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C15466e f15813e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C15466e f15814e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Ccatch f15815e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eًًۡ] */
    public static C7806e loadAd(Cdefault cdefault) {
        int i;
        if (cdefault == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(cdefault);
        ?? obj = new Object();
        obj.f15815e = m168class;
        if (m168class.mo171interface(0) instanceof Cstrictfp) {
            i = 0;
        } else {
            BigInteger.valueOf(0L).toByteArray();
            i = -1;
        }
        Cthis.subs(m168class.mo171interface(i + 1));
        C16527e.loadAd(m168class.mo171interface(i + 2));
        obj.f15814e = C15466e.Signature(m168class.mo171interface(i + 3));
        subs mo171interface = m168class.mo171interface(i + 4);
        if (!(mo171interface instanceof C2582e) && mo171interface != null) {
            Ccatch m168class2 = Ccatch.m168class(mo171interface);
            int size = m168class2.size();
            if (size != 2) {
                throw new IllegalArgumentException(AbstractC1786e.admob(size, "Bad sequence size: "));
            }
            C12862e.Signature(m168class2.mo171interface(0));
            C12862e.Signature(m168class2.mo171interface(1));
        }
        obj.f15813e = C15466e.Signature(m168class.mo171interface(i + 5));
        int i2 = i + 6;
        C3780e.loadAd(m168class.mo171interface(i2));
        for (int size2 = (m168class.size() - i2) - 1; size2 > 0; size2--) {
            Cstrictfp m4634class = Cstrictfp.m4634class(m168class.mo171interface(i2 + size2));
            int i3 = m4634class.f36462e;
            inmobi inmobiVar = isPro.f36412e;
            if (i3 == 1 || i3 == 2) {
                AbstractC9947e.ad(m4634class);
                Cdefault crashlytics = m4634class.crashlytics(false, inmobiVar);
                inmobiVar.m4630e(crashlytics);
            } else if (i3 == 3) {
                C17141e.loadAd(m4634class);
            }
        }
        return obj;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this.f15815e;
    }
}
