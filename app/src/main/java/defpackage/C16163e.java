package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eّٖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16163e implements InterfaceC16256e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final BigInteger f31759e = BigInteger.valueOf(1);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public SecureRandom f31760e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public AbstractC3903e f31761e;

    @Override // defpackage.InterfaceC16256e
    public final BigInteger getOrder() {
        return this.f31761e.f8719e.f32974e;
    }

    @Override // defpackage.InterfaceC16256e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        AbstractC3903e abstractC3903e;
        if (z) {
            if (interfaceC3894e instanceof C12219e) {
                C12219e c12219e = (C12219e) interfaceC3894e;
                this.f31760e = c12219e.f24538e;
                interfaceC3894e = c12219e.f24537e;
            } else {
                this.f31760e = AbstractC9915e.vip();
            }
            abstractC3903e = (C6988e) interfaceC3894e;
        } else {
            abstractC3903e = (C2964e) interfaceC3894e;
        }
        this.f31761e = abstractC3903e;
        AbstractC7711e.vip("DSTU4145", this.f31761e, z);
        AbstractC9915e.ad();
    }

    @Override // defpackage.InterfaceC16256e
    public final boolean mopub(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        if (bigInteger.signum() <= 0 || bigInteger2.signum() <= 0) {
            return false;
        }
        C16833e c16833e = this.f31761e.f8719e;
        BigInteger bigInteger3 = c16833e.f32974e;
        if (bigInteger.compareTo(bigInteger3) >= 0 || bigInteger2.compareTo(bigInteger3) >= 0) {
            return false;
        }
        AbstractC0362e abstractC0362e = c16833e.f32975e;
        BigInteger bigInteger4 = new BigInteger(1, AbstractC12442e.subs(bArr));
        int advert = abstractC0362e.advert();
        int bitLength = bigInteger4.bitLength();
        BigInteger bigInteger5 = f31759e;
        if (bitLength > advert) {
            bigInteger4 = bigInteger4.mod(bigInteger5.shiftLeft(advert));
        }
        AbstractC7861e adcel = abstractC0362e.adcel(bigInteger4);
        if (adcel.subscription()) {
            adcel = abstractC0362e.adcel(bigInteger5);
        }
        AbstractC9932e Signature = AbstractC0853e.adcel(c16833e.f32972e, bigInteger2, ((C2964e) this.f31761e).f7010e, bigInteger).Signature();
        if (Signature.advert()) {
            return false;
        }
        Signature.vip();
        BigInteger firebase = adcel.remoteconfig(Signature.vip).firebase();
        int bitLength2 = bigInteger3.bitLength() - 1;
        if (firebase.bitLength() > bitLength2) {
            firebase = firebase.mod(bigInteger5.shiftLeft(bitLength2));
        }
        return firebase.compareTo(bigInteger) == 0;
    }

    @Override // defpackage.InterfaceC16256e
    public final BigInteger[] purchase(byte[] bArr) {
        C16833e c16833e = this.f31761e.f8719e;
        AbstractC0362e abstractC0362e = c16833e.f32975e;
        BigInteger bigInteger = new BigInteger(1, AbstractC12442e.subs(bArr));
        int advert = abstractC0362e.advert();
        int bitLength = bigInteger.bitLength();
        BigInteger bigInteger2 = f31759e;
        if (bitLength > advert) {
            bigInteger = bigInteger.mod(bigInteger2.shiftLeft(advert));
        }
        AbstractC7861e adcel = abstractC0362e.adcel(bigInteger);
        if (adcel.subscription()) {
            adcel = abstractC0362e.adcel(bigInteger2);
        }
        BigInteger bigInteger3 = c16833e.f32974e;
        BigInteger bigInteger4 = ((C6988e) this.f31761e).f14315e;
        C4630e c4630e = new C4630e(0);
        while (true) {
            BigInteger metrica = AbstractC5907e.metrica(bigInteger3.bitLength() - 1, this.f31760e);
            AbstractC9932e Signature = c4630e.license(c16833e.f32972e, metrica).Signature();
            Signature.vip();
            AbstractC7861e abstractC7861e = Signature.vip;
            if (!abstractC7861e.subscription()) {
                BigInteger firebase = adcel.remoteconfig(abstractC7861e).firebase();
                int bitLength2 = bigInteger3.bitLength() - 1;
                if (firebase.bitLength() > bitLength2) {
                    firebase = firebase.mod(bigInteger2.shiftLeft(bitLength2));
                }
                if (firebase.signum() != 0) {
                    BigInteger mod = firebase.multiply(bigInteger4).add(metrica).mod(bigInteger3);
                    if (mod.signum() != 0) {
                        return new BigInteger[]{firebase, mod};
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
