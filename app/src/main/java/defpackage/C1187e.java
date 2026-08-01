package defpackage;

import java.math.BigInteger;

/* renamed from: eٜؒؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1187e implements InterfaceC5168e {
    public C6988e ad;

    @Override // defpackage.InterfaceC5168e
    public final BigInteger ad(InterfaceC3894e interfaceC3894e) {
        C2964e c2964e = (C2964e) interfaceC3894e;
        C16833e c16833e = this.ad.f8719e;
        if (!c16833e.equals(c2964e.f8719e)) {
            throw new IllegalStateException("ECDHC public key has wrong domain parameters");
        }
        BigInteger mod = c16833e.f32971e.multiply(this.ad.f14315e).mod(c16833e.f32974e);
        AbstractC9932e ad = AbstractC0853e.ad(c16833e.f32975e, c2964e.f7010e);
        if (ad.advert()) {
            throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        AbstractC9932e Signature = ad.amazon(mod).Signature();
        if (Signature.advert()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECDHC");
        }
        Signature.vip();
        return Signature.vip.firebase();
    }

    @Override // defpackage.InterfaceC5168e
    public final int getFieldSize() {
        return this.ad.f8719e.f32975e.mopub();
    }

    @Override // defpackage.InterfaceC5168e
    public final void init(InterfaceC3894e interfaceC3894e) {
        C6988e c6988e = (C6988e) interfaceC3894e;
        this.ad = c6988e;
        AbstractC7595e.ad("ECCDH", c6988e);
        AbstractC9915e.ad();
    }
}
