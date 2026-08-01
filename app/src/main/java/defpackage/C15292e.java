package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: eؘؙٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15292e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Cthis f30214e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Cthis f30215e;

    public C15292e(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f30215e = new Cthis(bigInteger);
        this.f30214e = new Cthis(bigInteger2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eؘؙٕ, java.lang.Object] */
    public static C15292e loadAd(Object obj) {
        if (obj instanceof C15292e) {
            return (C15292e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        Enumeration mo170goto = m168class.mo170goto();
        obj2.f30215e = (Cthis) mo170goto.nextElement();
        obj2.f30214e = (Cthis) mo170goto.nextElement();
        return obj2;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new C10154e(this.f30215e, this.f30214e);
    }
}
