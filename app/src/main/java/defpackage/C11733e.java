package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eِٓ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11733e implements InterfaceC6045e, InterfaceC4563e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C16833e f23582e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C15802e f23583e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC2040e f23584e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public byte[] f23585e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f23586e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C16410e f23587e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public AbstractC3903e f23588e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public AbstractC9932e f23589e;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, eٖٟۧ] */
    public C11733e(AbstractC2040e abstractC2040e) {
        C15802e c15802e = C15802e.f31129e;
        this.f23587e = new Object();
        this.f23586e = 0;
        this.f23583e = c15802e;
        this.f23584e = abstractC2040e;
    }

    public static void ad(InterfaceC0293e interfaceC0293e, AbstractC7861e abstractC7861e) {
        byte[] smaato = abstractC7861e.smaato();
        interfaceC0293e.update(smaato, 0, smaato.length);
    }

    @Override // defpackage.InterfaceC6045e
    public final byte[] adcel() {
        metrica();
        AbstractC2040e abstractC2040e = this.f23584e;
        byte[] bArr = new byte[abstractC2040e.getDigestSize()];
        abstractC2040e.doFinal(bArr, 0);
        BigInteger bigInteger = this.f23582e.f32974e;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        BigInteger bigInteger3 = ((C6988e) this.f23588e).f14315e;
        C4630e c4630e = new C4630e(0);
        while (true) {
            BigInteger billing = this.f23587e.billing();
            AbstractC9932e Signature = c4630e.license(this.f23582e.f32972e, billing).Signature();
            Signature.vip();
            BigInteger mod = bigInteger2.add(Signature.vip.firebase()).mod(bigInteger);
            BigInteger bigInteger4 = InterfaceC4563e.loadAd;
            if (!mod.equals(bigInteger4) && !mod.add(billing).equals(bigInteger)) {
                BigInteger mod2 = AbstractC5907e.startapp(bigInteger, bigInteger3.add(InterfaceC4563e.Signature)).multiply(billing.subtract(mod.multiply(bigInteger3)).mod(bigInteger)).mod(bigInteger);
                if (!mod2.equals(bigInteger4)) {
                    try {
                        try {
                            return this.f23583e.adcel(this.f23582e.f32974e, mod, mod2);
                        } catch (Exception e) {
                            throw new C15651e("unable to encode signature: " + e.getMessage(), e);
                        }
                    } finally {
                        license();
                    }
                }
            }
        }
    }

    public final boolean appmetrica(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = this.f23582e.f32974e;
        BigInteger bigInteger4 = InterfaceC4563e.Signature;
        if (bigInteger.compareTo(bigInteger4) >= 0 && bigInteger.compareTo(bigInteger3) < 0 && bigInteger2.compareTo(bigInteger4) >= 0 && bigInteger2.compareTo(bigInteger3) < 0) {
            AbstractC2040e abstractC2040e = this.f23584e;
            byte[] bArr = new byte[abstractC2040e.getDigestSize()];
            abstractC2040e.doFinal(bArr, 0);
            BigInteger bigInteger5 = new BigInteger(1, bArr);
            BigInteger mod = bigInteger.add(bigInteger2).mod(bigInteger3);
            if (!mod.equals(InterfaceC4563e.loadAd)) {
                AbstractC9932e Signature = AbstractC0853e.adcel(this.f23582e.f32972e, bigInteger2, ((C2964e) this.f23588e).f7010e, mod).Signature();
                if (!Signature.advert()) {
                    Signature.vip();
                    return bigInteger5.add(Signature.vip.firebase()).mod(bigInteger3).equals(bigInteger);
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC6045e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        AbstractC9932e abstractC9932e;
        SecureRandom secureRandom;
        byte[] metrica = AbstractC7240e.metrica("31323334353637383132333435363738");
        int i = 0;
        if (z) {
            if (interfaceC3894e instanceof C12219e) {
                C12219e c12219e = (C12219e) interfaceC3894e;
                InterfaceC3894e interfaceC3894e2 = c12219e.f24537e;
                secureRandom = c12219e.f24538e;
                interfaceC3894e = interfaceC3894e2;
            } else {
                secureRandom = null;
            }
            C6988e c6988e = (C6988e) interfaceC3894e;
            this.f23588e = c6988e;
            C16833e c16833e = c6988e.f8719e;
            this.f23582e = c16833e;
            BigInteger bigInteger = c6988e.f14315e;
            BigInteger bigInteger2 = c16833e.f32974e;
            BigInteger bigInteger3 = InterfaceC4563e.Signature;
            if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(bigInteger2.subtract(bigInteger3)) >= 0) {
                throw new IllegalArgumentException("SM2 private key out of range");
            }
            if (secureRandom == null) {
                secureRandom = AbstractC9915e.vip();
            } else {
                ThreadLocal threadLocal = AbstractC9915e.ad;
            }
            C16410e c16410e = this.f23587e;
            c16410e.f32226e = bigInteger2;
            c16410e.f32225e = secureRandom;
            abstractC9932e = new C4630e(i).license(this.f23582e.f32972e, bigInteger).Signature();
        } else {
            C2964e c2964e = (C2964e) interfaceC3894e;
            this.f23588e = c2964e;
            this.f23582e = c2964e.f8719e;
            abstractC9932e = c2964e.f7010e;
        }
        this.f23589e = abstractC9932e;
        AbstractC7711e.vip("ECNR", this.f23588e, z);
        AbstractC9915e.ad();
        AbstractC2040e abstractC2040e = this.f23584e;
        abstractC2040e.reset();
        int length = metrica.length * 8;
        abstractC2040e.update((byte) (length >>> 8));
        abstractC2040e.update((byte) length);
        abstractC2040e.update(metrica, 0, metrica.length);
        ad(abstractC2040e, this.f23582e.f32975e.vip);
        ad(abstractC2040e, this.f23582e.f32975e.metrica);
        AbstractC9932e abstractC9932e2 = this.f23582e.f32972e;
        abstractC9932e2.vip();
        ad(abstractC2040e, abstractC9932e2.vip);
        ad(abstractC2040e, this.f23582e.f32972e.appmetrica());
        AbstractC9932e abstractC9932e3 = this.f23589e;
        abstractC9932e3.vip();
        ad(abstractC2040e, abstractC9932e3.vip);
        ad(abstractC2040e, this.f23589e.appmetrica());
        byte[] bArr = new byte[abstractC2040e.getDigestSize()];
        abstractC2040e.doFinal(bArr, 0);
        this.f23585e = bArr;
        this.f23586e = 1;
    }

    public final void license() {
        int i = this.f23586e;
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("SM2Signer needs to be initialized");
            }
            this.f23584e.reset();
            this.f23586e = 1;
        }
    }

    public final void metrica() {
        int i = this.f23586e;
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("SM2Signer needs to be initialized");
            }
        } else {
            byte[] bArr = this.f23585e;
            this.f23584e.update(bArr, 0, bArr.length);
            this.f23586e = 2;
        }
    }

    @Override // defpackage.InterfaceC6045e
    public final void update(byte b) {
        metrica();
        this.f23584e.update(b);
    }

    @Override // defpackage.InterfaceC6045e
    public final void update(byte[] bArr, int i, int i2) {
        metrica();
        this.f23584e.update(bArr, i, i2);
    }

    @Override // defpackage.InterfaceC6045e
    public final boolean vip(byte[] bArr) {
        metrica();
        try {
            BigInteger[] vip = this.f23583e.vip(this.f23582e.f32974e, bArr);
            return appmetrica(vip[0], vip[1]);
        } catch (Exception unused) {
            return false;
        } finally {
            license();
        }
    }
}
