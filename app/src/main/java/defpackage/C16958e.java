package defpackage;

import java.security.SecureRandom;

/* renamed from: eِٗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16958e implements InterfaceC6045e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final byte[] f33210e = new byte[0];

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C16253e f33211e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public SecureRandom f33212e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C13252e f33213e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C6831e f33214e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C15968e f33215e;

    public final byte[] ad(byte[] bArr) {
        if (bArr.length != 64) {
            throw new RuntimeException("mu value must be 64 bytes");
        }
        byte[] bArr2 = new byte[32];
        SecureRandom secureRandom = this.f33212e;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        }
        this.f33211e.reset();
        C6831e c6831e = this.f33214e;
        C16253e c16253e = this.f33211e;
        C13252e c13252e = this.f33213e;
        byte[] metrica = c6831e.metrica(bArr, c16253e, c13252e.f26288e, c13252e.f26292e, c13252e.f26290e, c13252e.f26295e, c13252e.f26294e, bArr2);
        metrica();
        return metrica;
    }

    @Override // defpackage.InterfaceC6045e
    public final byte[] adcel() {
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = this.f33212e;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
        }
        C6831e c6831e = this.f33214e;
        C16253e c16253e = this.f33211e;
        c6831e.getClass();
        byte[] bArr2 = new byte[64];
        c16253e.metrica(0, 64, bArr2);
        C6831e c6831e2 = this.f33214e;
        C16253e c16253e2 = this.f33211e;
        C13252e c13252e = this.f33213e;
        byte[] metrica = c6831e2.metrica(bArr2, c16253e2, c13252e.f26288e, c13252e.f26292e, c13252e.f26290e, c13252e.f26295e, c13252e.f26294e, bArr);
        metrica();
        return metrica;
    }

    @Override // defpackage.InterfaceC6045e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        byte[] bArr;
        C3456e c3456e;
        if (interfaceC3894e instanceof C15412e) {
            C15412e c15412e = (C15412e) interfaceC3894e;
            bArr = AbstractC12442e.license(c15412e.f30462e);
            interfaceC3894e = c15412e.f30463e;
            if (bArr.length > 255) {
                throw new IllegalArgumentException("context too long");
            }
        } else {
            bArr = f33210e;
        }
        if (z) {
            this.f33215e = null;
            if (interfaceC3894e instanceof C12219e) {
                C12219e c12219e = (C12219e) interfaceC3894e;
                this.f33213e = (C13252e) c12219e.f24537e;
                this.f33212e = c12219e.f24538e;
            } else {
                this.f33213e = (C13252e) interfaceC3894e;
                this.f33212e = null;
            }
            c3456e = (C3456e) this.f33213e.f3209e;
            C6831e ad = c3456e.ad(this.f33212e);
            this.f33214e = ad;
            byte[] bArr2 = this.f33213e.f26287e;
            C16253e c16253e = ad.vip;
            c16253e.purchase(0, 64, bArr2);
            c16253e.update((byte) 0);
            c16253e.update((byte) bArr.length);
            c16253e.purchase(0, bArr.length, bArr);
        } else {
            C15968e c15968e = (C15968e) interfaceC3894e;
            this.f33215e = c15968e;
            this.f33213e = null;
            this.f33212e = null;
            c3456e = (C3456e) c15968e.f3209e;
            C6831e ad2 = c3456e.ad(null);
            this.f33214e = ad2;
            C15968e c15968e2 = this.f33215e;
            byte[] bArr3 = c15968e2.f31482e;
            byte[] bArr4 = c15968e2.f31483e;
            byte[] bArr5 = new byte[64];
            C16253e c16253e2 = ad2.vip;
            c16253e2.purchase(0, bArr3.length, bArr3);
            c16253e2.purchase(0, bArr4.length, bArr4);
            c16253e2.metrica(0, 64, bArr5);
            c16253e2.purchase(0, 64, bArr5);
            c16253e2.update((byte) 0);
            c16253e2.update((byte) bArr.length);
            c16253e2.purchase(0, bArr.length, bArr);
        }
        if (c3456e.metrica != 0) {
            throw new IllegalArgumentException("\"pure\" ml-dsa must use non pre-hash parameters");
        }
        metrica();
    }

    public final boolean license(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 64) {
            throw new RuntimeException("mu value must be 64 bytes");
        }
        this.f33211e.reset();
        C6831e c6831e = this.f33214e;
        int length = bArr2.length;
        C16253e c16253e = this.f33211e;
        C15968e c15968e = this.f33215e;
        byte[] bArr3 = c15968e.f31482e;
        byte[] bArr4 = c15968e.f31483e;
        byte[] bArr5 = new byte[Math.max((c6831e.purchase * c6831e.license) + 64, c6831e.amazon)];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        boolean ad = c6831e.ad(bArr5, bArr2, length, c16253e, bArr3, bArr4);
        metrica();
        return ad;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eؘؐٔ, eٖٖۘ] */
    public final void metrica() {
        this.f33211e = new C5338e(this.f33214e.vip);
    }

    @Override // defpackage.InterfaceC6045e
    public final void update(byte b) {
        this.f33211e.update(b);
    }

    @Override // defpackage.InterfaceC6045e
    public final void update(byte[] bArr, int i, int i2) {
        this.f33211e.purchase(i, i2, bArr);
    }

    @Override // defpackage.InterfaceC6045e
    public final boolean vip(byte[] bArr) {
        C6831e c6831e = this.f33214e;
        int length = bArr.length;
        C16253e c16253e = this.f33211e;
        C15968e c15968e = this.f33215e;
        byte[] bArr2 = c15968e.f31482e;
        byte[] bArr3 = c15968e.f31483e;
        byte[] bArr4 = new byte[Math.max((c6831e.purchase * c6831e.license) + 64, c6831e.amazon)];
        c16253e.doFinal(bArr4, 0);
        boolean ad = c6831e.ad(bArr4, bArr, length, c16253e, bArr2, bArr3);
        metrica();
        return ad;
    }
}
