package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import org.conscrypt.BuildConfig;

/* renamed from: eٕٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4908e {
    public static final byte[] ad = AbstractC1433e.metrica("openssh-key-v1\u0000");

    /* JADX WARN: Type inference failed for: r7v23, types: [extends, catch, eًٌَ] */
    public static byte[] ad(AbstractC9027e abstractC9027e) {
        if (abstractC9027e instanceof C16043e) {
            Cdefault admob = AbstractC0242e.ad(abstractC9027e, null).admob();
            admob.getClass();
            return admob.getEncoded();
        }
        if (abstractC9027e instanceof C6988e) {
            Cdefault admob2 = AbstractC0242e.ad(abstractC9027e, null).admob();
            admob2.getClass();
            return admob2.getEncoded();
        }
        if (abstractC9027e instanceof C3592e) {
            C3592e c3592e = (C3592e) abstractC9027e;
            BigInteger bigInteger = c3592e.f8124e;
            C6818e c6818e = (C6818e) c3592e.f3209e;
            crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
            crashlyticsVar.appmetrica(new Cthis(0L));
            BigInteger bigInteger2 = c6818e.f14046e;
            BigInteger bigInteger3 = c6818e.f14049e;
            crashlyticsVar.appmetrica(new Cthis(bigInteger2));
            crashlyticsVar.appmetrica(new Cthis(c6818e.f14047e));
            crashlyticsVar.appmetrica(new Cthis(bigInteger3));
            crashlyticsVar.appmetrica(new Cthis(bigInteger3.modPow(bigInteger, c6818e.f14046e)));
            crashlyticsVar.appmetrica(new Cthis(bigInteger));
            try {
                ?? ccatch = new Ccatch(crashlyticsVar);
                ccatch.f20096e = -1;
                return ccatch.getEncoded();
            } catch (Exception e) {
                throw new IllegalStateException(AbstractC1786e.remoteconfig(e, new StringBuilder("unable to encode DSAPrivateKeyParameters ")));
            }
        }
        if (!(abstractC9027e instanceof C1694e)) {
            throw new IllegalArgumentException("unable to convert " + abstractC9027e.getClass().getName() + " to openssh private key");
        }
        C1694e c1694e = (C1694e) abstractC9027e;
        C5249e ad2 = c1694e.ad();
        C13935e c13935e = new C13935e(24);
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c13935e.f27641e;
        try {
            byteArrayOutputStream.write(ad);
            c13935e.m3742return(AbstractC1433e.metrica("none"));
            c13935e.m3742return(AbstractC1433e.metrica("none"));
            c13935e.m3742return(AbstractC1433e.metrica(BuildConfig.FLAVOR));
            c13935e.m3743static(1);
            c13935e.m3742return(AbstractC9931e.vip(ad2));
            C13935e c13935e2 = new C13935e(24);
            int nextInt = AbstractC9915e.vip().nextInt();
            c13935e2.m3743static(nextInt);
            c13935e2.m3743static(nextInt);
            c13935e2.m3742return(AbstractC1433e.metrica("ssh-ed25519"));
            byte[] encoded = ad2.getEncoded();
            c13935e2.m3742return(encoded);
            c13935e2.m3742return(AbstractC12442e.adcel(AbstractC12442e.license(c1694e.f4625e), encoded));
            c13935e2.m3742return(AbstractC1433e.metrica(BuildConfig.FLAVOR));
            ByteArrayOutputStream byteArrayOutputStream2 = (ByteArrayOutputStream) c13935e2.f27641e;
            int size = byteArrayOutputStream2.size() % 8;
            if (size != 0) {
                int i = 8 - size;
                for (int i2 = 1; i2 <= i; i2++) {
                    byteArrayOutputStream2.write(i2);
                }
            }
            c13935e.m3742return(byteArrayOutputStream2.toByteArray());
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw new IllegalStateException(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eٖٗٓ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eؙٗ, e٘ؒ۟] */
    public static AbstractC9027e vip(byte[] bArr) {
        byte[] admob;
        int i;
        AbstractC9027e c16043e;
        C16833e c16833e;
        AbstractC9027e abstractC9027e = null;
        abstractC9027e = null;
        abstractC9027e = null;
        abstractC9027e = null;
        abstractC9027e = null;
        abstractC9027e = null;
        abstractC9027e = null;
        abstractC9027e = null;
        if (bArr[0] == 48) {
            Ccatch m168class = Ccatch.m168class(bArr);
            if (m168class.size() == 6) {
                int i2 = 0;
                while (true) {
                    if (i2 < m168class.size()) {
                        if (!(m168class.mo171interface(i2) instanceof Cthis)) {
                            break;
                        }
                        i2++;
                    } else if (((Cthis) m168class.mo171interface(0)).crashlytics().equals(AbstractC5907e.ad)) {
                        abstractC9027e = new C3592e(((Cthis) m168class.mo171interface(5)).crashlytics(), new C6818e(((Cthis) m168class.mo171interface(1)).crashlytics(), ((Cthis) m168class.mo171interface(2)).crashlytics(), ((Cthis) m168class.mo171interface(3)).crashlytics()));
                    }
                }
            } else if (m168class.size() == 9) {
                int i3 = 0;
                while (true) {
                    if (i3 < m168class.size()) {
                        if (!(m168class.mo171interface(i3) instanceof Cthis)) {
                            break;
                        }
                        i3++;
                    } else if (((Cthis) m168class.mo171interface(0)).crashlytics().equals(AbstractC5907e.ad)) {
                        C10897e loadAd = C10897e.loadAd(m168class);
                        abstractC9027e = new C16043e(loadAd.f21569e, loadAd.f21567e, loadAd.f21571e, loadAd.f21566e, loadAd.f21575e, loadAd.f21574e, loadAd.f21570e, loadAd.f21572e, false);
                    }
                }
            } else if (m168class.size() == 4 && (m168class.mo171interface(3) instanceof Cstrictfp) && (m168class.mo171interface(2) instanceof Cstrictfp)) {
                C8101e loadAd2 = C8101e.loadAd(m168class);
                Cdefault admob2 = loadAd2.admob(0, -1);
                admob2.getClass();
                Cdefault cdefault = C14004e.loadAd(admob2).f27736e;
                if (cdefault instanceof Ctry) {
                    Ctry m4669interface = Ctry.m4669interface(cdefault);
                    AbstractC4068e abstractC4068e = (AbstractC4068e) AbstractC11301e.metrica.get(m4669interface);
                    C9300e license = abstractC4068e != null ? abstractC4068e.license() : null;
                    if (license == null) {
                        license = AbstractC16377e.appmetrica(m4669interface);
                    }
                    c16833e = new C17494e(m4669interface, license);
                } else {
                    c16833e = new C16833e(C9300e.loadAd(cdefault));
                }
                abstractC9027e = new C6988e(loadAd2.Signature(), c16833e);
            }
        } else {
            ?? obj = new Object();
            int i4 = 0;
            obj.vip = 0;
            obj.ad = bArr;
            while (true) {
                byte[] bArr2 = ad;
                if (i4 == bArr2.length) {
                    obj.vip += bArr2.length;
                    if (!"none".equals(obj.appmetrica())) {
                        throw new IllegalStateException("encrypted keys not supported");
                    }
                    obj.billing();
                    obj.billing();
                    if (obj.purchase() != 1) {
                        throw new IllegalStateException("multiple keys not supported");
                    }
                    AbstractC9931e.appmetrica(obj.license());
                    int purchase = obj.purchase();
                    if (purchase == 0) {
                        admob = new byte[0];
                    } else {
                        int i5 = obj.vip;
                        if (i5 > bArr.length - purchase) {
                            throw new IllegalArgumentException("not enough data for block");
                        }
                        if (purchase % 8 != 0) {
                            throw new IllegalArgumentException("missing padding");
                        }
                        int i6 = i5 + purchase;
                        obj.vip = i6;
                        if (purchase > 0 && (i = bArr[i6 - 1] & 255) > 0 && i < 8) {
                            i6 -= i;
                            int i7 = 1;
                            int i8 = i6;
                            while (i7 <= i) {
                                if (i7 != (bArr[i8] & 255)) {
                                    throw new IllegalArgumentException("incorrect padding");
                                }
                                i7++;
                                i8++;
                            }
                        }
                        admob = AbstractC12442e.admob(i5, i6, bArr);
                    }
                    if (obj.vip < obj.ad.length) {
                        throw new IllegalArgumentException("decoded key has trailing data");
                    }
                    C17041e c17041e = new C17041e(admob);
                    if (c17041e.purchase() != c17041e.purchase()) {
                        throw new IllegalStateException("private key check values are not the same");
                    }
                    String appmetrica = c17041e.appmetrica();
                    if ("ssh-ed25519".equals(appmetrica)) {
                        c17041e.license();
                        byte[] license2 = c17041e.license();
                        if (license2.length != 64) {
                            throw new IllegalStateException("private key value of wrong length");
                        }
                        abstractC9027e = new C1694e(0, license2);
                    } else {
                        if (appmetrica.startsWith("ecdsa")) {
                            Ctry ctry = (Ctry) AbstractC9045e.vip.get(AbstractC1433e.ad(c17041e.license()));
                            if (ctry == null) {
                                throw new IllegalStateException("OID not found for: ".concat(appmetrica));
                            }
                            C9300e vip = AbstractC2208e.vip(ctry);
                            if (vip == null) {
                                throw new IllegalStateException(AbstractC4653e.inmobi("Curve not found for: ", ctry));
                            }
                            c17041e.license();
                            BigInteger bigInteger = new BigInteger(1, c17041e.license());
                            ?? c16833e2 = new C16833e(vip);
                            c16833e2.f34311e = ctry;
                            c16043e = new C6988e(bigInteger, c16833e2);
                        } else if (appmetrica.startsWith("ssh-rsa")) {
                            BigInteger bigInteger2 = new BigInteger(1, c17041e.license());
                            BigInteger bigInteger3 = new BigInteger(1, c17041e.license());
                            BigInteger bigInteger4 = new BigInteger(1, c17041e.license());
                            BigInteger bigInteger5 = new BigInteger(1, c17041e.license());
                            BigInteger bigInteger6 = new BigInteger(1, c17041e.license());
                            BigInteger bigInteger7 = new BigInteger(1, c17041e.license());
                            BigInteger bigInteger8 = AbstractC5907e.vip;
                            c16043e = new C16043e(bigInteger2, bigInteger3, bigInteger4, bigInteger6, bigInteger7, bigInteger4.remainder(bigInteger6.subtract(bigInteger8)), bigInteger4.remainder(bigInteger7.subtract(bigInteger8)), bigInteger5, false);
                        }
                        abstractC9027e = c16043e;
                    }
                    c17041e.billing();
                    if (c17041e.vip < admob.length) {
                        throw new IllegalArgumentException("private key block has trailing data");
                    }
                } else {
                    if (bArr2[i4] != bArr[i4]) {
                        throw new IllegalArgumentException("magic-number incorrect");
                    }
                    i4++;
                }
            }
        }
        if (abstractC9027e != null) {
            return abstractC9027e;
        }
        throw new IllegalArgumentException("unable to parse key");
    }
}
