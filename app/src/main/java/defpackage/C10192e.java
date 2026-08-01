package defpackage;

import java.util.Enumeration;

/* renamed from: eَُ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10192e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Cprotected f20163e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C16527e f20164e;

    public C10192e(C16527e c16527e, byte[] bArr) {
        this.f20164e = c16527e;
        this.f20163e = new Cprotected(AbstractC12442e.license(bArr));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eَُ٘, java.lang.Object] */
    public static C10192e loadAd(Object obj) {
        if (obj instanceof C10192e) {
            return (C10192e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        Enumeration mo170goto = m168class.mo170goto();
        obj2.f20164e = C16527e.loadAd(mo170goto.nextElement());
        obj2.f20163e = Cprotected.subs(mo170goto.nextElement());
        return obj2;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new C10154e(this.f20164e, this.f20163e);
    }
}
