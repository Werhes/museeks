package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: eٍٞؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9625e extends Cextends {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final byte[] f19099e = {-87, -42, -21, 69, -15, 60, 112, -126, Byte.MIN_VALUE, -60, -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, -64, 55, 41, 29, 56, -39, 107, -16, 37, -54, 78, 23, -8, -23, 114, 13, -58, 21, -76, 58, 40, -105, 95, 11, -63, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, 18, 62, 109, -72, -6, -59, 121, 4};

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f19100e = f19099e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C2468e f19101e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Ctry f19102e;

    public C9625e(Ctry ctry) {
        this.f19102e = ctry;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [eٍٞؕ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [eٍِٙ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, eٍؘؔ] */
    public static C9625e loadAd(Object obj) {
        C2468e c2468e;
        int i;
        C9625e c9625e;
        if (obj instanceof C9625e) {
            return (C9625e) obj;
        }
        if (obj == null) {
            throw new IllegalArgumentException("object parse error");
        }
        Ccatch m168class = Ccatch.m168class(obj);
        if (m168class.mo171interface(0) instanceof Ctry) {
            c9625e = new C9625e(Ctry.m4669interface(m168class.mo171interface(0)));
        } else {
            subs mo171interface = m168class.mo171interface(0);
            if (mo171interface instanceof C2468e) {
                c2468e = (C2468e) mo171interface;
            } else {
                C11812e c11812e = null;
                if (mo171interface != null) {
                    Ccatch m168class2 = Ccatch.m168class(mo171interface);
                    ?? obj2 = new Object();
                    obj2.f6309e = BigInteger.valueOf(0L);
                    if (m168class2.mo171interface(0) instanceof Cstrictfp) {
                        Cstrictfp cstrictfp = (Cstrictfp) m168class2.mo171interface(0);
                        if (!cstrictfp.m4635interface() || cstrictfp.f36462e != 0) {
                            throw new IllegalArgumentException("object parse error");
                        }
                        obj2.f6309e = Cthis.subs(cstrictfp).firebase();
                        i = 1;
                    } else {
                        i = 0;
                    }
                    subs mo171interface2 = m168class2.mo171interface(i);
                    if (mo171interface2 instanceof C11812e) {
                        c11812e = (C11812e) mo171interface2;
                    } else if (mo171interface2 != null) {
                        Ccatch m168class3 = Ccatch.m168class(mo171interface2);
                        ?? obj3 = new Object();
                        obj3.f23692e = Cthis.subs(m168class3.mo171interface(0)).m4664goto();
                        if (m168class3.mo171interface(1) instanceof Cthis) {
                            obj3.f23690e = ((Cthis) m168class3.mo171interface(1)).m4664goto();
                            c11812e = obj3;
                        } else {
                            if (!(m168class3.mo171interface(1) instanceof Ccatch)) {
                                throw new IllegalArgumentException("object parse error");
                            }
                            Ccatch m168class4 = Ccatch.m168class(m168class3.mo171interface(1));
                            obj3.f23690e = Cthis.subs(m168class4.mo171interface(0)).m4664goto();
                            obj3.f23689e = Cthis.subs(m168class4.mo171interface(1)).m4664goto();
                            obj3.f23691e = Cthis.subs(m168class4.mo171interface(2)).m4664goto();
                            c11812e = obj3;
                        }
                    }
                    obj2.f6307e = c11812e;
                    obj2.f6306e = Cthis.subs(m168class2.mo171interface(i + 1));
                    obj2.f6308e = Cprotected.subs(m168class2.mo171interface(i + 2));
                    obj2.f6305e = Cthis.subs(m168class2.mo171interface(i + 3));
                    obj2.f6310e = Cprotected.subs(m168class2.mo171interface(i + 4));
                    c2468e = obj2;
                } else {
                    c2468e = null;
                }
            }
            ?? obj4 = new Object();
            obj4.f19100e = f19099e;
            obj4.f19101e = c2468e;
            c9625e = obj4;
        }
        if (m168class.size() == 2) {
            byte[] bArr = Cprotected.subs(m168class.mo171interface(1)).f36449e;
            c9625e.f19100e = bArr;
            if (bArr.length != 64) {
                throw new IllegalArgumentException("object parse error");
            }
        }
        return c9625e;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(2, 0);
        subs subsVar = this.f19102e;
        if (subsVar == null) {
            subsVar = this.f19101e;
        }
        crashlyticsVar.appmetrica(subsVar);
        if (!Arrays.equals(this.f19100e, f19099e)) {
            crashlyticsVar.appmetrica(new Cprotected(this.f19100e));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
