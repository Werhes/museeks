package defpackage;

import java.util.Enumeration;

/* renamed from: e٘ؔۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17530e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f34368e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public isPro f34369e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C16527e f34370e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f34371e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C16888e f34372e;

    /* JADX WARN: Type inference failed for: r1v0, types: [e٘ؔۥ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eٌٌٗ, java.lang.Object] */
    public static C17530e loadAd(subs subsVar) {
        if (subsVar instanceof C17530e) {
            return (C17530e) subsVar;
        }
        C16888e c16888e = null;
        if (subsVar == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(subsVar);
        ?? obj = new Object();
        int i = 0;
        obj.f34371e = false;
        if (m168class.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for CertificateList");
        }
        subs mo171interface = m168class.mo171interface(0);
        if (mo171interface instanceof C16888e) {
            c16888e = (C16888e) mo171interface;
        } else if (mo171interface != null) {
            Ccatch m168class2 = Ccatch.m168class(mo171interface);
            ?? obj2 = new Object();
            if (m168class2.size() < 3 || m168class2.size() > 7) {
                throw new IllegalArgumentException(AbstractC0054e.premium(m168class2, new StringBuilder("Bad sequence size: ")));
            }
            if (m168class2.mo171interface(0) instanceof Cthis) {
                obj2.f33098e = Cthis.subs(m168class2.mo171interface(0));
                i = 1;
            } else {
                obj2.f33098e = null;
            }
            obj2.f33096e = C16527e.loadAd(m168class2.mo171interface(i));
            obj2.f33095e = C15466e.Signature(m168class2.mo171interface(i + 1));
            int i2 = i + 3;
            obj2.f33097e = C12862e.Signature(m168class2.mo171interface(i + 2));
            if (i2 < m168class2.size() && ((m168class2.mo171interface(i2) instanceof Cprivate) || (m168class2.mo171interface(i2) instanceof Cinterface) || (m168class2.mo171interface(i2) instanceof C12862e))) {
                obj2.f33094e = C12862e.Signature(m168class2.mo171interface(i2));
                i2 = i + 4;
            }
            if (i2 < m168class2.size() && !(m168class2.mo171interface(i2) instanceof Cstrictfp)) {
                obj2.f33100e = Ccatch.m168class(m168class2.mo171interface(i2));
                i2++;
            }
            if (i2 < m168class2.size() && (m168class2.mo171interface(i2) instanceof Cstrictfp)) {
                obj2.f33099e = C9216e.admob(Ccatch.firebase((Cstrictfp) m168class2.mo171interface(i2), true));
            }
            c16888e = obj2;
        }
        obj.f34372e = c16888e;
        obj.f34370e = C16527e.loadAd(m168class.mo171interface(1));
        obj.f34369e = isPro.firebase(m168class.mo171interface(2));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Enumeration, java.lang.Object] */
    public final Enumeration Signature() {
        Ccatch ccatch = this.f34372e.f33100e;
        return ccatch == null ? new Object() : new C4319e(ccatch.mo170goto());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        crashlyticsVar.appmetrica(this.f34372e);
        crashlyticsVar.appmetrica(this.f34370e);
        crashlyticsVar.appmetrica(this.f34369e);
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }

    @Override // defpackage.Cextends
    public final int hashCode() {
        if (!this.f34371e) {
            this.f34368e = super.hashCode();
            this.f34371e = true;
        }
        return this.f34368e;
    }
}
