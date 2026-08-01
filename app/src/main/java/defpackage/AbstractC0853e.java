package defpackage;

import java.math.BigInteger;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0853e {
    public static final C2892e ad = new C2892e(636288403, false, new C14028e(0));
    public static final C2892e vip = new C2892e(-1357803046, false, new C14028e(1));

    public static AbstractC9932e ad(AbstractC0362e abstractC0362e, AbstractC9932e abstractC9932e) {
        if (abstractC0362e.startapp(abstractC9932e.ad)) {
            return abstractC0362e.billing(abstractC9932e.yandex(false));
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC9932e adcel(AbstractC9932e abstractC9932e, BigInteger bigInteger, AbstractC9932e abstractC9932e2, BigInteger bigInteger2) {
        AbstractC9932e license;
        AbstractC9932e ad2;
        AbstractC9932e abstractC9932e3;
        int[] iArr = AbstractC0903e.metrica;
        AbstractC0362e abstractC0362e = abstractC9932e.ad;
        if (!abstractC0362e.startapp(abstractC9932e2.ad)) {
            throw new IllegalArgumentException("Point must be on the same curve");
        }
        AbstractC9932e amazon = abstractC0362e.amazon(abstractC9932e2);
        if ((abstractC0362e instanceof AbstractC5490e) && ((AbstractC5490e) abstractC0362e).signatures()) {
            AbstractC9932e ad3 = abstractC9932e.amazon(bigInteger).ad(amazon.amazon(bigInteger2));
            metrica(ad3);
            return ad3;
        }
        C0961e c0961e = abstractC0362e.billing;
        int i = 8;
        boolean z = true;
        boolean z2 = false;
        Object[] objArr = 0;
        if (!(c0961e instanceof C0961e)) {
            Object[] objArr2 = bigInteger.signum() < 0;
            Object[] objArr3 = bigInteger2.signum() < 0;
            BigInteger abs = bigInteger.abs();
            BigInteger abs2 = bigInteger2.abs();
            int yandex = AbstractC0903e.yandex(abs.bitLength(), 8, iArr);
            int yandex2 = AbstractC0903e.yandex(abs2.bitLength(), 8, iArr);
            C15664e startapp = AbstractC0903e.startapp(abstractC9932e, yandex);
            AbstractC0362e abstractC0362e2 = abstractC9932e.ad;
            C15664e startapp2 = AbstractC0903e.startapp(amazon, yandex2);
            int appmetrica = AbstractC12246e.appmetrica(abstractC0362e2);
            if (objArr2 == true || objArr3 == true || bigInteger.bitLength() > appmetrica || bigInteger2.bitLength() > appmetrica || startapp.ad > 0 || startapp2.ad > 0) {
                license = license(objArr2 != false ? startapp.license : startapp.metrica, objArr2 != false ? startapp.metrica : startapp.license, AbstractC0903e.metrica(Math.min(8, startapp.purchase), abs), objArr3 != false ? startapp2.license : startapp2.metrica, objArr3 != false ? startapp2.metrica : startapp2.license, AbstractC0903e.metrica(Math.min(8, startapp2.purchase), abs2));
            } else {
                int appmetrica2 = AbstractC12246e.appmetrica(abstractC0362e2);
                if (bigInteger.bitLength() > appmetrica2 || bigInteger2.bitLength() > appmetrica2) {
                    throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
                }
                AbstractC0362e abstractC0362e3 = abstractC9932e.ad;
                int i2 = 21;
                C4412e c4412e = (C4412e) abstractC0362e3.admob(abstractC9932e, "bc_fixed_point", new C18540e(abstractC0362e3, abstractC9932e, i2));
                AbstractC0362e abstractC0362e4 = amazon.ad;
                C4412e c4412e2 = (C4412e) abstractC0362e4.admob(amazon, "bc_fixed_point", new C18540e(abstractC0362e4, amazon, i2));
                AbstractC2413e abstractC2413e = c4412e.vip;
                AbstractC2413e abstractC2413e2 = c4412e2.vip;
                int i3 = c4412e.metrica;
                if (i3 != c4412e2.metrica) {
                    C4630e c4630e = new C4630e(objArr == true ? 1 : 0);
                    ad2 = c4630e.license(abstractC9932e, bigInteger);
                    abstractC9932e3 = c4630e.license(amazon, bigInteger2);
                } else {
                    int i4 = ((appmetrica2 + i3) - 1) / i3;
                    AbstractC9932e smaato = abstractC0362e2.smaato();
                    int i5 = i3 * i4;
                    int[] adcel = AbstractC12797e.adcel(i5, bigInteger);
                    int[] adcel2 = AbstractC12797e.adcel(i5, bigInteger2);
                    int i6 = i5 - 1;
                    for (int i7 = 0; i7 < i4; i7++) {
                        int i8 = 0;
                        int i9 = 0;
                        for (int i10 = i6 - i7; i10 >= 0; i10 -= i4) {
                            int i11 = i10 >>> 5;
                            int i12 = i10 & 31;
                            int i13 = adcel[i11] >>> i12;
                            i8 = ((i8 ^ (i13 >>> 1)) << 1) ^ i13;
                            int i14 = adcel2[i11] >>> i12;
                            i9 = ((i9 ^ (i14 >>> 1)) << 1) ^ i14;
                        }
                        smaato = smaato.applovin(abstractC2413e.yandex(i8).ad(abstractC2413e2.yandex(i9)));
                    }
                    ad2 = smaato.ad(c4412e.ad);
                    abstractC9932e3 = c4412e2.ad;
                }
                license = ad2.ad(abstractC9932e3);
            }
            metrica(license);
            return license;
        }
        int i15 = 2;
        AbstractC9932e[] abstractC9932eArr = {abstractC9932e, amazon};
        BigInteger[] bigIntegerArr = {bigInteger, bigInteger2};
        BigInteger bigInteger3 = abstractC9932eArr[0].ad.license;
        int i16 = 4;
        BigInteger[] bigIntegerArr2 = new BigInteger[4];
        int i17 = 0;
        for (int i18 = 0; i18 < 2; i18++) {
            BigInteger[] ad4 = c0961e.ad(bigIntegerArr[i18].mod(bigInteger3));
            int i19 = i17 + 1;
            bigIntegerArr2[i17] = ad4[0];
            i17 += 2;
            bigIntegerArr2[i19] = ad4[1];
        }
        boolean[] zArr = new boolean[4];
        C15664e[] c15664eArr = new C15664e[4];
        byte[][] bArr = new byte[4];
        C6594e c6594e = c0961e.vip;
        int i20 = 0;
        while (i20 < i15) {
            int i21 = i20 << 1;
            int i22 = i21 + 1;
            BigInteger bigInteger4 = bigIntegerArr2[i21];
            zArr[i21] = bigInteger4.signum() < 0 ? z : z2;
            BigInteger abs3 = bigInteger4.abs();
            BigInteger bigInteger5 = bigIntegerArr2[i22];
            zArr[i22] = bigInteger5.signum() < 0 ? z : z2;
            boolean z3 = z;
            BigInteger abs4 = bigInteger5.abs();
            boolean z4 = z2;
            int yandex3 = AbstractC0903e.yandex(Math.max(abs3.bitLength(), abs4.bitLength()), i, iArr);
            AbstractC9932e abstractC9932e4 = abstractC9932eArr[i20];
            C15664e startapp3 = AbstractC0903e.startapp(abstractC9932e4, yandex3);
            boolean[] zArr2 = zArr;
            C15664e[] c15664eArr2 = c15664eArr;
            AbstractC9932e abstractC9932e5 = ((C10421e) abstractC9932e4.ad.admob(abstractC9932e4, "bc_endo", new C13391e(c0961e, abstractC9932e4, 19))).vip;
            C15664e c15664e = (C15664e) abstractC9932e5.ad.admob(abstractC9932e5, "bc_wnaf", new C11883e(startapp3, c6594e, 27));
            int min = Math.min(8, startapp3.purchase);
            int min2 = Math.min(8, c15664e.purchase);
            c15664eArr2[i21] = startapp3;
            c15664eArr2[i22] = c15664e;
            bArr[i21] = AbstractC0903e.metrica(min, abs3);
            bArr[i22] = AbstractC0903e.metrica(min2, abs4);
            i20++;
            zArr = zArr2;
            c15664eArr = c15664eArr2;
            z2 = z4;
            z = z3;
            i16 = 4;
            i15 = 2;
            i = 8;
        }
        boolean[] zArr3 = zArr;
        C15664e[] c15664eArr3 = c15664eArr;
        boolean z5 = z;
        boolean z6 = z2;
        int i23 = z6 ? 1 : 0;
        int i24 = i23;
        while (i23 < i16) {
            i24 = Math.max(i24, bArr[i23].length);
            i23++;
            i16 = 4;
        }
        AbstractC9932e smaato2 = c15664eArr3[z6 ? 1 : 0].metrica[z6 ? 1 : 0].ad.smaato();
        int i25 = i24 - 1;
        AbstractC9932e abstractC9932e6 = smaato2;
        int i26 = z6 ? 1 : 0;
        while (i25 >= 0) {
            AbstractC9932e abstractC9932e7 = smaato2;
            for (int i27 = z6 ? 1 : 0; i27 < 4; i27++) {
                byte[] bArr2 = bArr[i27];
                byte b = i25 < bArr2.length ? bArr2[i25] : z6 ? 1 : 0;
                if (b != 0) {
                    int abs5 = Math.abs((int) b);
                    C15664e c15664e2 = c15664eArr3[i27];
                    abstractC9932e7 = abstractC9932e7.ad(((b < 0 ? z5 : z6 ? 1 : 0) == zArr3[i27] ? c15664e2.metrica : c15664e2.license)[abs5 >>> 1]);
                }
            }
            if (abstractC9932e7 == smaato2) {
                i26++;
            } else {
                if (i26 > 0) {
                    abstractC9932e6 = abstractC9932e6.inmobi(i26);
                    i26 = z6 ? 1 : 0;
                }
                abstractC9932e6 = abstractC9932e6.applovin(abstractC9932e7);
            }
            i25--;
        }
        if (i26 > 0) {
            abstractC9932e6 = abstractC9932e6.inmobi(i26);
        }
        metrica(abstractC9932e6);
        return abstractC9932e6;
    }

    public static boolean appmetrica(InterfaceC13441e interfaceC13441e) {
        return interfaceC13441e.ad() == 1;
    }

    public static AbstractC9932e billing(AbstractC9932e abstractC9932e, BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        AbstractC9932e smaato = abstractC9932e.ad.smaato();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                smaato = abstractC9932e;
            }
            for (int i = 1; i < bitLength; i++) {
                abstractC9932e = abstractC9932e.isPro();
                if (abs.testBit(i)) {
                    smaato = smaato.ad(abstractC9932e);
                }
            }
        }
        return bigInteger.signum() < 0 ? smaato.loadAd() : smaato;
    }

    public static AbstractC9932e license(AbstractC9932e[] abstractC9932eArr, AbstractC9932e[] abstractC9932eArr2, byte[] bArr, AbstractC9932e[] abstractC9932eArr3, AbstractC9932e[] abstractC9932eArr4, byte[] bArr2) {
        AbstractC9932e abstractC9932e;
        int max = Math.max(bArr.length, bArr2.length);
        AbstractC9932e smaato = abstractC9932eArr[0].ad.smaato();
        int i = max - 1;
        int i2 = 0;
        AbstractC9932e abstractC9932e2 = smaato;
        while (i >= 0) {
            byte b = i < bArr.length ? bArr[i] : (byte) 0;
            byte b2 = i < bArr2.length ? bArr2[i] : (byte) 0;
            if ((b | b2) == 0) {
                i2++;
            } else {
                if (b != 0) {
                    abstractC9932e = smaato.ad((b < 0 ? abstractC9932eArr2 : abstractC9932eArr)[Math.abs((int) b) >>> 1]);
                } else {
                    abstractC9932e = smaato;
                }
                if (b2 != 0) {
                    abstractC9932e = abstractC9932e.ad((b2 < 0 ? abstractC9932eArr4 : abstractC9932eArr3)[Math.abs((int) b2) >>> 1]);
                }
                if (i2 > 0) {
                    abstractC9932e2 = abstractC9932e2.inmobi(i2);
                    i2 = 0;
                }
                abstractC9932e2 = abstractC9932e2.applovin(abstractC9932e);
            }
            i--;
        }
        return i2 > 0 ? abstractC9932e2.inmobi(i2) : abstractC9932e2;
    }

    public static void metrica(AbstractC9932e abstractC9932e) {
        if (!abstractC9932e.mopub(false, false)) {
            throw new IllegalStateException("Invalid result");
        }
    }

    public static final void mopub(InterfaceC7227e interfaceC7227e, String str) {
        String sb;
        String str2 = "in the polymorphic scope of '" + interfaceC7227e.mopub() + '\'';
        if (str == null) {
            sb = AbstractC17861e.advert('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder tapsense = AbstractC17861e.tapsense("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            AbstractC13501e.Signature(tapsense, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            tapsense.append(interfaceC7227e.mopub());
            tapsense.append("' has to be sealed and '@Serializable'.");
            sb = tapsense.toString();
        }
        throw new IllegalArgumentException(sb);
    }

    public static int purchase(C2125e c2125e, int i, int i2, int i3) {
        AbstractC2301e.billing(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        AbstractC17673e.metrica(AbstractC17673e.metrica(i4, i5), 1 << i3);
        if (c2125e.vip() < i) {
            return -1;
        }
        int billing = c2125e.billing(i);
        if (billing == i4) {
            if (c2125e.vip() < i2) {
                return -1;
            }
            int billing2 = c2125e.billing(i2);
            billing += billing2;
            if (billing2 == i5) {
                if (c2125e.vip() < i3) {
                    return -1;
                }
                return c2125e.billing(i3) + billing;
            }
        }
        return billing;
    }

    public static void startapp(C2125e c2125e) {
        int billing;
        int billing2 = c2125e.billing(2);
        if (billing2 == 0) {
            c2125e.loadAd(6);
            return;
        }
        int purchase = purchase(c2125e, 5, 8, 16) + 1;
        if (billing2 == 1) {
            c2125e.loadAd(purchase * 7);
            return;
        }
        if (billing2 == 2) {
            boolean purchase2 = c2125e.purchase();
            int i = purchase2 ? 1 : 5;
            int i2 = purchase2 ? 7 : 5;
            int i3 = purchase2 ? 8 : 6;
            int i4 = 0;
            while (i4 < purchase) {
                if (c2125e.purchase()) {
                    c2125e.loadAd(7);
                    billing = 0;
                } else {
                    if (c2125e.billing(2) == 3 && c2125e.billing(i2) * i != 0) {
                        c2125e.amazon();
                    }
                    billing = c2125e.billing(i3) * i;
                    if (billing != 0 && billing != 180) {
                        c2125e.amazon();
                    }
                    c2125e.amazon();
                }
                if (billing != 0 && billing != 180 && c2125e.purchase()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    public static final C17828e vip(InterfaceC5077e interfaceC5077e) {
        C10892e c10892e;
        C0765e c0765e = new C0765e();
        AbstractC14114e.yandex(interfaceC5077e, C5890e.ad, new C17955e(new C17955e(9, c0765e), new C10981e(1, c0765e, C0765e.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 10)));
        C12328e c12328e = new C12328e();
        C12328e c12328e2 = c0765e.ad;
        Object[] objArr = c12328e2.ad;
        int i = c12328e2.vip;
        int i2 = 0;
        boolean z = true;
        AbstractC14299e abstractC14299e = null;
        while (true) {
            c10892e = C10892e.vip;
            if (i2 >= i) {
                break;
            }
            AbstractC14299e abstractC14299e2 = (AbstractC14299e) objArr[i2];
            if (!z || abstractC14299e2 != c10892e) {
                if (abstractC14299e2 != c10892e || abstractC14299e != c10892e) {
                    if (abstractC14299e2 != c10892e) {
                        C12328e c12328e3 = c0765e.vip;
                        Object[] objArr2 = c12328e3.ad;
                        int i3 = c12328e3.vip;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (((Boolean) ((Function1) objArr2[i4]).invoke(abstractC14299e2)).booleanValue()) {
                            }
                        }
                    }
                    c12328e.ad(abstractC14299e2);
                    z = false;
                    abstractC14299e = abstractC14299e2;
                }
                z = false;
                break;
            }
            i2++;
        }
        if (((AbstractC14299e) (c12328e.adcel() ? null : c12328e.ad[c12328e.vip - 1])) == c10892e) {
            c12328e.smaato(c12328e.vip - 1);
        }
        return new C17828e(c12328e.appmetrica());
    }

    public static void yandex(C2125e c2125e) {
        c2125e.loadAd(3);
        c2125e.loadAd(8);
        boolean purchase = c2125e.purchase();
        boolean purchase2 = c2125e.purchase();
        if (purchase) {
            c2125e.loadAd(5);
        }
        if (purchase2) {
            c2125e.loadAd(6);
        }
    }
}
