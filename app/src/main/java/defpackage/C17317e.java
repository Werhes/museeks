package defpackage;

import java.security.SecureRandom;

/* renamed from: eٗ۠۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17317e {
    public final SecureRandom ad;

    public C17317e(SecureRandom secureRandom) {
        this.ad = secureRandom;
    }

    public final C16198e ad(C0957e c0957e) {
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = this.ad;
        secureRandom.nextBytes(bArr);
        C14154e ad = ((C12532e) c0957e.f3209e).ad();
        ad.ad = secureRandom;
        byte[] adcel = AbstractC12442e.adcel(c0957e.f3395e, c0957e.f3396e);
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        C11467e c11467e = ad.Signature;
        C9147e c9147e = (C9147e) c11467e.f23069e;
        c9147e.purchase(0, adcel.length, adcel);
        c9147e.doFinal(bArr2, 32);
        C9147e c9147e2 = (C9147e) c11467e.f23070e;
        c9147e2.purchase(0, 64, bArr2);
        c9147e2.doFinal(bArr3, 0);
        byte[] metrica = ad.vip.metrica(adcel, AbstractC12442e.admob(0, 32, bArr2), AbstractC12442e.admob(32, 64, bArr3));
        int i = ad.loadAd;
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr3, 0, bArr4, 0, i);
        byte[][] bArr5 = {bArr4, metrica};
        return new C16198e(bArr5[0], bArr5[1]);
    }
}
