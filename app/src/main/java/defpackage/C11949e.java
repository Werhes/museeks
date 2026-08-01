package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eِۘۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11949e implements InterfaceC6610e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final BigInteger f23930e = BigInteger.valueOf(1);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C13623e f23931e;

    @Override // defpackage.InterfaceC6610e
    /* renamed from: appmetrica */
    public final C17424e mo3419appmetrica() {
        BigInteger license;
        C13623e c13623e = this.f23931e;
        C6818e c6818e = c13623e.f27027e;
        BigInteger bigInteger = c6818e.f14047e;
        SecureRandom secureRandom = (SecureRandom) c13623e.f26878e;
        int bitLength = bigInteger.bitLength() >>> 2;
        do {
            BigInteger bigInteger2 = f23930e;
            license = AbstractC5907e.license(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
        } while (AbstractC0903e.appmetrica(license) < bitLength);
        return new C17424e(new C5574e(c6818e.f14049e.modPow(license, c6818e.f14046e), c6818e), new C3592e(license, c6818e), false, 5);
    }

    @Override // defpackage.InterfaceC6610e
    public final void loadAd(C13572e c13572e) {
        C13623e c13623e = (C13623e) c13572e;
        this.f23931e = c13623e;
        AbstractC0259e.vip(c13623e.f27027e.f14046e);
        C6818e c6818e = this.f23931e.f27027e;
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }
}
