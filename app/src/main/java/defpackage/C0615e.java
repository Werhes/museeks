package defpackage;

import java.math.BigInteger;

/* renamed from: eؑ۠ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0615e implements InterfaceC5168e {
    public static final BigInteger metrica = BigInteger.valueOf(1);
    public C4025e ad;
    public C3236e vip;

    @Override // defpackage.InterfaceC5168e
    public final BigInteger ad(InterfaceC3894e interfaceC3894e) {
        C2149e c2149e = (C2149e) interfaceC3894e;
        if (!c2149e.f30113e.equals(this.vip)) {
            throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
        }
        BigInteger bigInteger = this.vip.f7367e;
        BigInteger bigInteger2 = c2149e.f5526e;
        if (bigInteger2 != null) {
            BigInteger bigInteger3 = metrica;
            if (bigInteger2.compareTo(bigInteger3) > 0 && bigInteger2.compareTo(bigInteger.subtract(bigInteger3)) < 0) {
                BigInteger modPow = bigInteger2.modPow(this.ad.f8950e, bigInteger);
                if (modPow.equals(bigInteger3)) {
                    throw new IllegalStateException("Shared key can't be 1");
                }
                return modPow;
            }
        }
        throw new IllegalArgumentException("Diffie-Hellman public key is weak");
    }

    @Override // defpackage.InterfaceC5168e
    public final int getFieldSize() {
        return (this.ad.f30113e.f7367e.bitLength() + 7) / 8;
    }

    @Override // defpackage.InterfaceC5168e
    public final void init(InterfaceC3894e interfaceC3894e) {
        if (interfaceC3894e instanceof C12219e) {
            interfaceC3894e = ((C12219e) interfaceC3894e).f24537e;
        }
        AbstractC9027e abstractC9027e = (AbstractC9027e) interfaceC3894e;
        if (!(abstractC9027e instanceof C4025e)) {
            throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        }
        C4025e c4025e = (C4025e) abstractC9027e;
        this.ad = c4025e;
        C3236e c3236e = c4025e.f30113e;
        this.vip = c3236e;
        AbstractC0259e.vip(c3236e.f7367e);
        AbstractC9915e.ad();
    }
}
