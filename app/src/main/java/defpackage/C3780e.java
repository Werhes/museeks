package defpackage;

import java.util.Enumeration;

/* renamed from: eؕۧۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3780e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public isPro f8385e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C16527e f8386e;

    public C3780e(C16527e c16527e, isPro ispro) {
        this.f8385e = ispro;
        this.f8386e = c16527e;
    }

    public C3780e(C16527e c16527e, subs subsVar) {
        this.f8385e = new isPro(0, subsVar.billing().smaato());
        this.f8386e = c16527e;
    }

    public C3780e(C16527e c16527e, byte[] bArr) {
        this.f8385e = new isPro(0, bArr);
        this.f8386e = c16527e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eؕۧۤ, java.lang.Object] */
    public static C3780e loadAd(Object obj) {
        if (obj instanceof C3780e) {
            return (C3780e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        if (m168class.size() != 2) {
            throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration mo170goto = m168class.mo170goto();
        obj2.f8386e = C16527e.loadAd(mo170goto.nextElement());
        obj2.f8385e = isPro.firebase(mo170goto.nextElement());
        return obj2;
    }

    public final Cdefault Signature() {
        return Cdefault.inmobi(this.f8385e.m4602class());
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new C10154e(this.f8386e, this.f8385e);
    }
}
