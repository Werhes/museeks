package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eؚؚۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7005e implements InterfaceC6610e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C6314e f14342e;

    @Override // defpackage.InterfaceC6610e
    /* renamed from: appmetrica */
    public final C17424e mo3419appmetrica() {
        BigInteger license;
        BigInteger bigInteger;
        BigInteger bigInteger2 = AbstractC3211e.ad;
        C1559e c1559e = this.f14342e.f13143e;
        BigInteger bigInteger3 = c1559e.f4438e;
        BigInteger bigInteger4 = c1559e.f4439e;
        int i = c1559e.f4437e;
        int i2 = 160;
        if (i != 0 && i < 160) {
            i2 = i;
        }
        if (i != 0) {
            if (i > bigInteger3.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i < i2) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i2 > bigInteger3.bitLength() && !AbstractC0361e.metrica("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        SecureRandom secureRandom = (SecureRandom) this.f14342e.f26878e;
        if (i != 0) {
            int i3 = i >>> 2;
            do {
                bigInteger = AbstractC5907e.metrica(i, secureRandom).setBit(i - 1);
            } while (AbstractC0903e.appmetrica(bigInteger) < i3);
        } else {
            BigInteger bigInteger5 = AbstractC3211e.vip;
            BigInteger shiftLeft = i2 != 0 ? AbstractC3211e.ad.shiftLeft(i2 - 1) : bigInteger5;
            BigInteger subtract = bigInteger3.subtract(bigInteger5);
            int bitLength = subtract.bitLength() >>> 2;
            do {
                license = AbstractC5907e.license(shiftLeft, subtract, secureRandom);
            } while (AbstractC0903e.appmetrica(license) < bitLength);
            bigInteger = license;
        }
        return new C17424e(new C1348e(bigInteger4.modPow(bigInteger, bigInteger3), c1559e), new C1457e(bigInteger, c1559e), false, 5);
    }

    @Override // defpackage.InterfaceC6610e
    public final void loadAd(C13572e c13572e) {
        C6314e c6314e = (C6314e) c13572e;
        this.f14342e = c6314e;
        AbstractC0259e.vip(c6314e.f13143e.f4438e);
        C1559e c1559e = this.f14342e.f13143e;
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }
}
