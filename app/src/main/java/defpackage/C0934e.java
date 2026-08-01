package defpackage;

import java.math.BigInteger;

/* renamed from: eًؒۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0934e implements InterfaceC5168e {
    public InterfaceC13838e ad;
    public int vip = 0;

    @Override // defpackage.InterfaceC5168e
    public final BigInteger ad(InterfaceC3894e interfaceC3894e) {
        byte[] bArr = new byte[this.vip];
        this.ad.isVip(interfaceC3894e, bArr, 0);
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.InterfaceC5168e
    public final int getFieldSize() {
        return this.vip;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5168e
    public final void init(InterfaceC3894e interfaceC3894e) {
        C7850e c7850e;
        if (interfaceC3894e instanceof C0445e) {
            this.vip = 32;
            c7850e = new Object();
        } else {
            if (!(interfaceC3894e instanceof C14061e)) {
                throw new IllegalArgumentException("key is neither X25519 nor X448");
            }
            this.vip = 56;
            c7850e = new C7850e(26, false);
        }
        this.ad = c7850e;
        this.ad.init(interfaceC3894e);
    }
}
