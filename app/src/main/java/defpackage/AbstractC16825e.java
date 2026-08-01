package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;

/* renamed from: eؘٗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16825e {
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

    public static C3780e ad(AbstractC9027e abstractC9027e) {
        C14004e c14004e;
        Ctry ctry;
        if (abstractC9027e instanceof C7362e) {
            C7362e c7362e = (C7362e) abstractC9027e;
            return new C3780e(new C16527e(InterfaceC5051e.f10833protected, C0503e.f2592e), new C16574e(c7362e.f15093e, c7362e.f15092e));
        }
        if (abstractC9027e instanceof C5574e) {
            C5574e c5574e = (C5574e) abstractC9027e;
            C6818e c6818e = (C6818e) c5574e.f3209e;
            return new C3780e(new C16527e(InterfaceC16631e.f32637e, c6818e != null ? new C17676e(c6818e.f14046e, c6818e.f14047e, c6818e.f14049e) : null), new Cthis(c5574e.f11922e));
        }
        if (abstractC9027e instanceof C2964e) {
            C2964e c2964e = (C2964e) abstractC9027e;
            AbstractC9932e abstractC9932e = c2964e.f7010e;
            C16833e c16833e = c2964e.f8719e;
            if (c16833e == null) {
                c14004e = new C14004e();
            } else {
                if (c16833e instanceof C12573e) {
                    C12573e c12573e = (C12573e) c16833e;
                    abstractC9932e.vip();
                    BigInteger firebase = abstractC9932e.vip.firebase();
                    BigInteger firebase2 = abstractC9932e.appmetrica().firebase();
                    Ctry ctry2 = c12573e.f25217e;
                    C17984e c17984e = new C17984e(ctry2, c12573e.f25218e);
                    boolean contains = ad.contains(ctry2);
                    int i = 32;
                    int i2 = 64;
                    if (contains) {
                        ctry = InterfaceC6859e.advert;
                    } else if (firebase.bitLength() > 256) {
                        ctry = InterfaceC13429e.purchase;
                        i2 = 128;
                        i = 64;
                    } else {
                        ctry = InterfaceC13429e.appmetrica;
                    }
                    byte[] bArr = new byte[i2];
                    int i3 = i2 / 2;
                    vip(bArr, i3, 0, firebase);
                    vip(bArr, i3, i, firebase2);
                    try {
                        return new C3780e(new C16527e(ctry, c17984e), new Cprotected(bArr));
                    } catch (IOException unused) {
                        return null;
                    }
                }
                c14004e = c16833e instanceof C17494e ? new C14004e(((C17494e) c16833e).f34311e) : new C14004e(new C9300e(c16833e.f32975e, new C1324e(c16833e.f32972e, false), c16833e.f32974e, c16833e.f32971e, AbstractC12442e.license(c16833e.f32973e)));
            }
            return new C3780e(new C16527e(InterfaceC16631e.f32653e, c14004e), abstractC9932e.yandex(false));
        }
        if (abstractC9027e instanceof C0719e) {
            return new C3780e(new C16527e(InterfaceC16800e.vip), AbstractC12442e.license(((C0719e) abstractC9027e).f3013e));
        }
        if (abstractC9027e instanceof C11963e) {
            return new C3780e(new C16527e(InterfaceC16800e.ad), AbstractC12442e.license(((C11963e) abstractC9027e).f23938e));
        }
        if (abstractC9027e instanceof C6740e) {
            C16527e c16527e = new C16527e(InterfaceC16800e.license);
            byte[] bArr2 = new byte[57];
            AbstractC3995e.metrica(((C6740e) abstractC9027e).f13936e, bArr2, 0);
            return new C3780e(c16527e, bArr2);
        }
        if (abstractC9027e instanceof C5249e) {
            return new C3780e(new C16527e(InterfaceC16800e.metrica), ((C5249e) abstractC9027e).getEncoded());
        }
        if (abstractC9027e instanceof C3100e) {
            C3100e c3100e = (C3100e) abstractC9027e;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i4 = c3100e.f7181e;
            byteArrayOutputStream.write((byte) (i4 >>> 24));
            byteArrayOutputStream.write((byte) (i4 >>> 16));
            byteArrayOutputStream.write((byte) (i4 >>> 8));
            byteArrayOutputStream.write((byte) i4);
            try {
                byteArrayOutputStream.write(c3100e.f7180e.vip());
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return new C3780e(new C16527e(InterfaceC5051e.f10810e), AbstractC12442e.adcel(new byte[]{4, (byte) byteArray.length}, byteArray));
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        }
        if (!(abstractC9027e instanceof C8459e)) {
            throw new IOException("key parameters not recognized");
        }
        C8459e c8459e = (C8459e) abstractC9027e;
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byteArrayOutputStream2.write((byte) 0);
        byteArrayOutputStream2.write((byte) 0);
        byteArrayOutputStream2.write((byte) 0);
        byteArrayOutputStream2.write((byte) 1);
        try {
            byteArrayOutputStream2.write(c8459e.vip());
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            return new C3780e(new C16527e(InterfaceC5051e.f10810e), AbstractC12442e.adcel(new byte[]{4, (byte) byteArray2.length}, byteArray2));
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public static void vip(byte[] bArr, int i, int i2, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i2 + i3] = byteArray[(byteArray.length - 1) - i3];
        }
    }
}
