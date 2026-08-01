package defpackage;

import java.io.IOException;
import java.security.SecureRandom;

/* renamed from: eؗٚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4985e implements InterfaceC6045e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final byte[] f10557e = new byte[0];

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C15708e f10558e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public SecureRandom f10559e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C13252e f10560e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C6831e f10561e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C15968e f10562e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public byte[] f10563e;

    /* JADX WARN: Type inference failed for: r4v0, types: [eؘؐٔ, eٖٖۘ] */
    public final C16253e ad() {
        this.f10558e.getClass();
        byte[] bArr = new byte[64];
        this.f10558e.doFinal(bArr, 0);
        ?? c5338e = new C5338e(this.f10561e.vip);
        byte[] bArr2 = this.f10563e;
        c5338e.purchase(0, bArr2.length, bArr2);
        c5338e.purchase(0, 64, bArr);
        return c5338e;
    }

    @Override // defpackage.InterfaceC6045e
    public final byte[] adcel() {
        C16253e ad = ad();
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = this.f10559e;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
        }
        this.f10561e.getClass();
        byte[] bArr2 = new byte[64];
        ad.metrica(0, 64, bArr2);
        C6831e c6831e = this.f10561e;
        C13252e c13252e = this.f10560e;
        return c6831e.metrica(bArr2, ad, c13252e.f26288e, c13252e.f26292e, c13252e.f26290e, c13252e.f26295e, c13252e.f26294e, bArr);
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
            bArr = f10557e;
        }
        if (z) {
            this.f10562e = null;
            if (interfaceC3894e instanceof C12219e) {
                C12219e c12219e = (C12219e) interfaceC3894e;
                this.f10560e = (C13252e) c12219e.f24537e;
                this.f10559e = c12219e.f24538e;
            } else {
                this.f10560e = (C13252e) interfaceC3894e;
                this.f10559e = null;
            }
            c3456e = (C3456e) this.f10560e.f3209e;
            C6831e ad = c3456e.ad(this.f10559e);
            this.f10561e = ad;
            byte[] bArr2 = this.f10560e.f26287e;
            C16253e c16253e = ad.vip;
            c16253e.purchase(0, 64, bArr2);
            c16253e.update((byte) 1);
            c16253e.update((byte) bArr.length);
            c16253e.purchase(0, bArr.length, bArr);
        } else {
            C15968e c15968e = (C15968e) interfaceC3894e;
            this.f10562e = c15968e;
            this.f10560e = null;
            this.f10559e = null;
            c3456e = (C3456e) c15968e.f3209e;
            C6831e ad2 = c3456e.ad(null);
            this.f10561e = ad2;
            C15968e c15968e2 = this.f10562e;
            byte[] bArr3 = c15968e2.f31482e;
            byte[] bArr4 = c15968e2.f31483e;
            byte[] bArr5 = new byte[64];
            C16253e c16253e2 = ad2.vip;
            c16253e2.purchase(0, bArr3.length, bArr3);
            c16253e2.purchase(0, bArr4.length, bArr4);
            c16253e2.metrica(0, 64, bArr5);
            c16253e2.purchase(0, 64, bArr5);
            c16253e2.update((byte) 1);
            c16253e2.update((byte) bArr.length);
            c16253e2.purchase(0, bArr.length, bArr);
        }
        int i = c3456e.metrica;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("unknown parameters type");
        }
        this.f10558e = new C15708e();
        try {
            this.f10563e = AbstractC14846e.ad("SHA-512").smaato();
        } catch (IOException e) {
            throw new IllegalStateException(AbstractC8703e.admob(e, new StringBuilder("oid encoding failed: ")));
        }
    }

    @Override // defpackage.InterfaceC6045e
    public final void update(byte b) {
        this.f10558e.update(b);
    }

    @Override // defpackage.InterfaceC6045e
    public final void update(byte[] bArr, int i, int i2) {
        this.f10558e.update(bArr, i, i2);
    }

    @Override // defpackage.InterfaceC6045e
    public final boolean vip(byte[] bArr) {
        C16253e ad = ad();
        C6831e c6831e = this.f10561e;
        int length = bArr.length;
        C15968e c15968e = this.f10562e;
        byte[] bArr2 = c15968e.f31482e;
        byte[] bArr3 = c15968e.f31483e;
        byte[] bArr4 = new byte[Math.max((c6831e.purchase * c6831e.license) + 64, c6831e.amazon)];
        ad.doFinal(bArr4, 0);
        return c6831e.ad(bArr4, bArr, length, ad, bArr2, bArr3);
    }
}
