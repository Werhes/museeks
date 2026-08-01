package defpackage;

import org.conscrypt.PSKKeyManager;

/* renamed from: eَؓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1725e implements InterfaceC10630e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f4682e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public byte[] f4683e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC0293e f4684e;

    public C1725e(InterfaceC0293e interfaceC0293e) {
        this.f4684e = interfaceC0293e;
    }

    @Override // defpackage.InterfaceC10630e
    public final int generateBytes(byte[] bArr, int i, int i2) {
        int i3 = i2;
        if (bArr.length - i3 < 0) {
            throw new RuntimeException("output buffer too small");
        }
        long j = i3;
        InterfaceC0293e interfaceC0293e = this.f4684e;
        int digestSize = interfaceC0293e.getDigestSize();
        if (j > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j2 = digestSize;
        int i4 = (int) (((j + j2) - 1) / j2);
        byte[] bArr2 = new byte[interfaceC0293e.getDigestSize()];
        byte[] bArr3 = new byte[4];
        boolean z = true;
        AbstractC3628e.billing(1, 0, bArr3);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < i4) {
            boolean z2 = z;
            byte[] bArr4 = this.f4683e;
            int i8 = i4;
            interfaceC0293e.update(bArr4, 0, bArr4.length);
            interfaceC0293e.update(bArr3, 0, 4);
            byte[] bArr5 = this.f4682e;
            if (bArr5 != null) {
                interfaceC0293e.update(bArr5, 0, bArr5.length);
            }
            interfaceC0293e.doFinal(bArr2, 0);
            if (i3 > digestSize) {
                System.arraycopy(bArr2, 0, bArr, i6, digestSize);
                i6 += digestSize;
                i3 -= digestSize;
            } else {
                System.arraycopy(bArr2, 0, bArr, i6, i3);
            }
            byte b = (byte) (bArr3[3] + 1);
            bArr3[3] = b;
            if (b == 0) {
                i7 += PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                AbstractC3628e.billing(i7, 0, bArr3);
            }
            i5++;
            z = z2;
            i4 = i8;
        }
        interfaceC0293e.reset();
        return (int) j;
    }

    @Override // defpackage.InterfaceC10630e
    public final void init(InterfaceC13829e interfaceC13829e) {
        if (!(interfaceC13829e instanceof C0369e)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
        C0369e c0369e = (C0369e) interfaceC13829e;
        this.f4683e = c0369e.vip;
        this.f4682e = c0369e.ad;
    }
}
