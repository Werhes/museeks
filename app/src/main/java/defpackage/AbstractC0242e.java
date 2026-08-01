package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;

/* renamed from: eُٜؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0242e {
    public static final HashSet ad;

    static {
        HashSet hashSet = new HashSet(5);
        ad = hashSet;
        hashSet.add(InterfaceC6859e.remoteconfig);
        hashSet.add(InterfaceC6859e.pro);
        hashSet.add(InterfaceC6859e.signatures);
        hashSet.add(InterfaceC6859e.tapsense);
        hashSet.add(InterfaceC6859e.isVip);
    }

    public static C7179e ad(AbstractC9027e abstractC9027e, Cfinal cfinal) {
        int bitLength;
        C14004e c14004e;
        Ctry ctry;
        if (abstractC9027e instanceof C7362e) {
            C16043e c16043e = (C16043e) abstractC9027e;
            return new C7179e(new C16527e(InterfaceC5051e.f10833protected, C0503e.f2592e), new C10897e(c16043e.f15093e, c16043e.f31606e, c16043e.f15092e, c16043e.f31605e, c16043e.f31602e, c16043e.f31604e, c16043e.f31601e, c16043e.f31603e), cfinal, (byte[]) null);
        }
        if (abstractC9027e instanceof C3592e) {
            C3592e c3592e = (C3592e) abstractC9027e;
            C6818e c6818e = (C6818e) c3592e.f3209e;
            return new C7179e(new C16527e(InterfaceC16631e.f32637e, new C17676e(c6818e.f14046e, c6818e.f14047e, c6818e.f14049e)), new Cthis(c3592e.f8124e), cfinal, (byte[]) null);
        }
        if (!(abstractC9027e instanceof C6988e)) {
            if (abstractC9027e instanceof C14061e) {
                C14061e c14061e = (C14061e) abstractC9027e;
                return new C7179e(new C16527e(InterfaceC16800e.vip), new Cprotected(AbstractC12442e.license(c14061e.f27809e)), cfinal, AbstractC12442e.license(c14061e.ad().f3013e));
            }
            if (abstractC9027e instanceof C0445e) {
                C0445e c0445e = (C0445e) abstractC9027e;
                return new C7179e(new C16527e(InterfaceC16800e.ad), new Cprotected(AbstractC12442e.license(c0445e.f2492e)), cfinal, AbstractC12442e.license(c0445e.ad().f23938e));
            }
            if (!(abstractC9027e instanceof C17565e)) {
                if (!(abstractC9027e instanceof C1694e)) {
                    throw new IOException("key parameters not recognized");
                }
                C1694e c1694e = (C1694e) abstractC9027e;
                return new C7179e(new C16527e(InterfaceC16800e.metrica), new Cprotected(AbstractC12442e.license(c1694e.f4625e)), cfinal, c1694e.ad().getEncoded());
            }
            C17565e c17565e = (C17565e) abstractC9027e;
            C16527e c16527e = new C16527e(InterfaceC16800e.license);
            Cprotected cprotected = new Cprotected(AbstractC12442e.license(c17565e.f34410e));
            byte[] bArr = new byte[57];
            AbstractC3995e.metrica(c17565e.ad().f13936e, bArr, 0);
            return new C7179e(c16527e, cprotected, cfinal, bArr);
        }
        C6988e c6988e = (C6988e) abstractC9027e;
        BigInteger bigInteger = c6988e.f14315e;
        C16833e c16833e = c6988e.f8719e;
        if (c16833e == null) {
            c14004e = new C14004e();
            bitLength = bigInteger.bitLength();
        } else {
            BigInteger bigInteger2 = c16833e.f32974e;
            if (c16833e instanceof C12573e) {
                C12573e c12573e = (C12573e) c16833e;
                Ctry ctry2 = c12573e.f25217e;
                C17984e c17984e = new C17984e(ctry2, c12573e.f25218e, c12573e.f25216e);
                if (ad.contains(ctry2)) {
                    ctry = InterfaceC6859e.advert;
                } else {
                    boolean z = bigInteger.bitLength() > 256;
                    Ctry ctry3 = z ? InterfaceC13429e.purchase : InterfaceC13429e.appmetrica;
                    r6 = z ? 64 : 32;
                    ctry = ctry3;
                }
                byte[] bArr2 = new byte[r6];
                byte[] byteArray = bigInteger.toByteArray();
                if (byteArray.length < r6) {
                    byte[] bArr3 = new byte[r6];
                    System.arraycopy(byteArray, 0, bArr3, r6 - byteArray.length, byteArray.length);
                    byteArray = bArr3;
                }
                for (int i = 0; i != r6; i++) {
                    bArr2[i] = byteArray[(byteArray.length - 1) - i];
                }
                return new C7179e(new C16527e(ctry, c17984e), new Cprotected(bArr2), (Cfinal) null, (byte[]) null);
            }
            C14004e c14004e2 = c16833e instanceof C17494e ? new C14004e(((C17494e) c16833e).f34311e) : new C14004e(new C9300e(c16833e.f32975e, new C1324e(c16833e.f32972e, false), c16833e.f32974e, c16833e.f32971e, AbstractC12442e.license(c16833e.f32973e)));
            bitLength = bigInteger2.bitLength();
            c14004e = c14004e2;
        }
        return new C7179e(new C16527e(InterfaceC16631e.f32653e, c14004e), new C8101e(bitLength, bigInteger, new isPro(0, new C4630e(0).license(c16833e.f32972e, bigInteger).yandex(false)), c14004e), cfinal, (byte[]) null);
    }
}
