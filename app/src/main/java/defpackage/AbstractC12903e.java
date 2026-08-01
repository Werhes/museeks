package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;

/* renamed from: eؙّۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12903e {
    public static final HashMap ad;

    static {
        HashMap hashMap = new HashMap();
        ad = hashMap;
        hashMap.put(InterfaceC5051e.f10833protected, new C1617e(10));
        hashMap.put(InterfaceC5051e.f10838super, new C1617e(10));
        hashMap.put(InterfaceC2796e.f6746e, new C1617e(10));
        hashMap.put(InterfaceC16631e.f32633e, new C1617e(1));
        hashMap.put(InterfaceC5051e.f10829instanceof, new C1617e(0));
        hashMap.put(InterfaceC16631e.f32637e, new C1617e(2));
        hashMap.put(InterfaceC12598e.billing, new C1617e(2));
        hashMap.put(InterfaceC12598e.startapp, new C1617e(7));
        hashMap.put(InterfaceC16631e.f32653e, new C1617e(4));
        hashMap.put(InterfaceC6859e.advert, new C1617e(8));
        hashMap.put(InterfaceC13429e.appmetrica, new C1617e(9));
        hashMap.put(InterfaceC13429e.purchase, new C1617e(9));
        hashMap.put(InterfaceC6237e.vip, new C1617e(3));
        hashMap.put(InterfaceC6237e.ad, new C1617e(3));
        hashMap.put(InterfaceC16800e.ad, new C1617e(11));
        hashMap.put(InterfaceC16800e.vip, new C1617e(12));
        hashMap.put(InterfaceC16800e.metrica, new C1617e(5));
        hashMap.put(InterfaceC16800e.license, new C1617e(6));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x001f. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v20, types: [eؔؖۘ, java.lang.Object] */
    public static AbstractC9027e ad(byte[] bArr) {
        C2381e c2381e;
        AbstractC9027e c2149e;
        C6818e c6818e;
        C16833e c16833e;
        AbstractC9027e c2964e;
        byte b;
        if (bArr == null) {
            throw new IllegalArgumentException("keyInfoData array null");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("keyInfoData array empty");
        }
        C3780e loadAd = C3780e.loadAd(Cdefault.inmobi(bArr));
        if (loadAd == null) {
            throw new IllegalArgumentException("keyInfo argument null");
        }
        C16527e c16527e = loadAd.f8386e;
        C1617e c1617e = (C1617e) ad.get(c16527e.f32408e);
        if (c1617e == null) {
            throw new IOException("algorithm identifier in public key not recognised: " + c16527e.f32408e);
        }
        switch (c1617e.ad) {
            case 0:
                C3204e loadAd2 = C3204e.loadAd(loadAd.f8386e.f32407e);
                Cthis cthis = (Cthis) loadAd.Signature();
                BigInteger Signature = loadAd2.Signature();
                return new C2149e(cthis.firebase(), new C3236e(Signature == null ? 0 : Signature.intValue(), loadAd2.f7322e.crashlytics(), loadAd2.f7321e.crashlytics()));
            case 1:
                Cextends Signature2 = loadAd.Signature();
                if (Signature2 == null) {
                    c2381e = (C2381e) Signature2;
                } else {
                    if (!(Signature2 instanceof Cthis)) {
                        throw new IllegalArgumentException("Invalid DHPublicKey: ".concat(Signature2.getClass().getName()));
                    }
                    ?? obj = new Object();
                    obj.f6091e = (Cthis) Signature2;
                    c2381e = obj;
                }
                BigInteger crashlytics = c2381e.f6091e.crashlytics();
                C5394e loadAd3 = C5394e.loadAd(loadAd.f8386e.f32407e);
                BigInteger crashlytics2 = loadAd3.f11552e.crashlytics();
                BigInteger crashlytics3 = loadAd3.f11550e.crashlytics();
                BigInteger crashlytics4 = loadAd3.f11549e.crashlytics();
                BigInteger Signature3 = loadAd3.Signature() != null ? loadAd3.Signature() : null;
                C3816e c3816e = loadAd3.f11548e;
                c2149e = new C2149e(crashlytics, new C3236e(crashlytics2, crashlytics3, crashlytics4, 160, 0, Signature3, c3816e != null ? new C10165e(c3816e.f8442e.crashlytics().intValue(), c3816e.f8443e.crashlytics()) : null));
                return c2149e;
            case 2:
                Cthis cthis2 = (Cthis) loadAd.Signature();
                subs subsVar = loadAd.f8386e.f32407e;
                if (subsVar != null) {
                    C17676e loadAd4 = C17676e.loadAd(subsVar.billing());
                    c6818e = new C6818e(loadAd4.f34641e.crashlytics(), loadAd4.f34640e.crashlytics(), loadAd4.f34639e.crashlytics());
                } else {
                    c6818e = null;
                }
                c2149e = new C5574e(cthis2.firebase(), c6818e);
                return c2149e;
            case 3:
                C16527e c16527e2 = loadAd.f8386e;
                Ctry ctry = c16527e2.f32408e;
                C9625e loadAd5 = C9625e.loadAd(c16527e2.f32407e);
                try {
                    byte[] license = AbstractC12442e.license(((Cprotected) loadAd.Signature()).f36449e);
                    Ctry ctry2 = InterfaceC6237e.ad;
                    if (ctry.isVip(ctry2)) {
                        C1617e.ad(license);
                    }
                    Ctry ctry3 = loadAd5.f19102e;
                    if (ctry3 != null) {
                        c16833e = AbstractC2216e.vip(ctry3);
                    } else {
                        C2468e c2468e = loadAd5.f19101e;
                        byte[] license2 = AbstractC12442e.license(c2468e.f6308e.f36449e);
                        if (ctry.isVip(ctry2)) {
                            C1617e.ad(license2);
                        }
                        BigInteger bigInteger = new BigInteger(1, license2);
                        C11812e c11812e = c2468e.f6307e;
                        C13022e c13022e = new C13022e(c11812e.f23692e, c11812e.f23690e, c11812e.f23689e, c11812e.f23691e, c2468e.f6306e.firebase(), bigInteger, null, null);
                        byte[] license3 = AbstractC12442e.license(c2468e.f6310e.f36449e);
                        if (ctry.isVip(ctry2)) {
                            C1617e.ad(license3);
                        }
                        c16833e = new C16833e(c13022e, AbstractC1561e.vip(c13022e, license3), c2468e.f6305e.firebase(), InterfaceC4563e.Signature, null);
                    }
                    c2964e = new C2964e(AbstractC1561e.vip(c16833e.f32975e, license), c16833e);
                    return c2964e;
                } catch (IOException unused) {
                    throw new IllegalArgumentException("error recovering DSTU public key");
                }
            case 4:
                Cdefault cdefault = C14004e.loadAd(loadAd.f8386e.f32407e).f27736e;
                C16833e c16833e2 = null;
                if (cdefault instanceof Ctry) {
                    Ctry ctry4 = (Ctry) cdefault;
                    AbstractC4068e abstractC4068e = (AbstractC4068e) AbstractC11301e.metrica.get(ctry4);
                    C9300e license4 = abstractC4068e != null ? abstractC4068e.license() : null;
                    if (license4 == null) {
                        license4 = AbstractC16377e.appmetrica(ctry4);
                    }
                    c16833e2 = new C17494e(ctry4, license4);
                } else if (!(cdefault instanceof Cnative)) {
                    c16833e2 = new C16833e(C9300e.loadAd(cdefault));
                }
                byte[] crashlytics5 = loadAd.f8385e.crashlytics();
                Cprotected cprotected = new Cprotected(crashlytics5);
                if (crashlytics5[0] == 4 && crashlytics5[1] == crashlytics5.length - 2 && (((b = crashlytics5[2]) == 2 || b == 3) && c16833e2.f32975e.mopub() >= crashlytics5.length - 3)) {
                    try {
                        cprotected = (Cprotected) Cdefault.inmobi(crashlytics5);
                    } catch (IOException unused2) {
                        throw new IllegalArgumentException("error recovering public key");
                    }
                }
                AbstractC0362e abstractC0362e = c16833e2.f32975e;
                byte[] license5 = AbstractC12442e.license(cprotected.f36449e);
                new Cprotected(license5);
                c2964e = new C2964e(abstractC0362e.billing(license5).Signature(), c16833e2);
                return c2964e;
            case 5:
                return new C5249e(loadAd.f8385e.m4602class());
            case 6:
                return new C6740e(loadAd.f8385e.m4602class());
            case 7:
                C15292e loadAd6 = C15292e.loadAd(loadAd.f8386e.f32407e);
                c2964e = new C1348e(((Cthis) loadAd.Signature()).firebase(), new C1559e(0, loadAd6.f30215e.crashlytics(), loadAd6.f30214e.crashlytics()));
                return c2964e;
            case 8:
                C17984e loadAd7 = C17984e.loadAd(loadAd.f8386e.f32407e);
                Ctry ctry5 = loadAd7.f35279e;
                C12573e c12573e = new C12573e(new C17494e(ctry5, AbstractC7899e.license(ctry5)), ctry5, loadAd7.f35278e, loadAd7.f35277e);
                try {
                    byte[] bArr2 = ((Cprotected) loadAd.Signature()).f36449e;
                    if (bArr2.length != 64) {
                        throw new IllegalArgumentException("invalid length for GOST3410_2001 public key");
                    }
                    byte[] bArr3 = new byte[65];
                    bArr3[0] = 4;
                    for (int i = 1; i <= 32; i++) {
                        bArr3[i] = bArr2[32 - i];
                        bArr3[i + 32] = bArr2[64 - i];
                    }
                    return new C2964e(c12573e.f32975e.billing(bArr3), c12573e);
                } catch (IOException unused3) {
                    throw new IllegalArgumentException("error recovering GOST3410_2001 public key");
                }
            case 9:
                C16527e c16527e3 = loadAd.f8386e;
                Ctry ctry6 = c16527e3.f32408e;
                C17984e loadAd8 = C17984e.loadAd(c16527e3.f32407e);
                Ctry ctry7 = loadAd8.f35279e;
                C12573e c12573e2 = new C12573e(new C17494e(ctry7, AbstractC7899e.license(ctry7)), ctry7, loadAd8.f35278e, loadAd8.f35277e);
                try {
                    Cprotected cprotected2 = (Cprotected) loadAd.Signature();
                    int i2 = ctry6.isVip(InterfaceC13429e.purchase) ? 64 : 32;
                    int i3 = i2 * 2;
                    byte[] bArr4 = cprotected2.f36449e;
                    if (bArr4.length != i3) {
                        throw new IllegalArgumentException("invalid length for GOST3410_2012 public key");
                    }
                    byte[] bArr5 = new byte[i3 + 1];
                    bArr5[0] = 4;
                    for (int i4 = 1; i4 <= i2; i4++) {
                        bArr5[i4] = bArr4[i2 - i4];
                        bArr5[i4 + i2] = bArr4[i3 - i4];
                    }
                    return new C2964e(c12573e2.f32975e.billing(bArr5), c12573e2);
                } catch (IOException unused4) {
                    throw new IllegalArgumentException("error recovering GOST3410_2012 public key");
                }
            case 10:
                C16574e loadAd9 = C16574e.loadAd(loadAd.Signature());
                return new C7362e(false, loadAd9.f32518e, loadAd9.f32517e, false);
            case 11:
                return new C11963e(loadAd.f8385e.m4602class());
            default:
                return new C0719e(loadAd.f8385e.m4602class());
        }
    }
}
