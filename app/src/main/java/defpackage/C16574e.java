package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: eٖۡۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16574e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public BigInteger f32517e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public BigInteger f32518e;

    public C16574e(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f32518e = bigInteger;
        this.f32517e = bigInteger2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖۡۧ, java.lang.Object] */
    public static C16574e loadAd(Cdefault cdefault) {
        if (cdefault == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(cdefault);
        ?? obj = new Object();
        if (m168class.size() != 2) {
            throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration mo170goto = m168class.mo170goto();
        obj.f32518e = Cthis.subs(mo170goto.nextElement()).crashlytics();
        obj.f32517e = Cthis.subs(mo170goto.nextElement()).crashlytics();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        ?? ccatch = new Ccatch(new Cthis(this.f32518e), new Cthis(this.f32517e));
        ccatch.f20096e = -1;
        return ccatch;
    }
}
