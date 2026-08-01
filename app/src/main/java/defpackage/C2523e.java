package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eِؔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2523e {
    public static final BigInteger license = BigInteger.valueOf(2);
    public int ad;
    public SecureRandom metrica;
    public int vip;

    public final C3236e ad() {
        BigInteger[] ad = AbstractC14103e.ad(this.ad, this.vip, this.metrica);
        BigInteger bigInteger = ad[0];
        return new C3236e(bigInteger, AbstractC14103e.vip(bigInteger, this.metrica), ad[1], 160, 0, license, null);
    }
}
