package defpackage;

import java.io.IOException;

/* renamed from: eًٚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8032e implements InterfaceC10630e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte[] f16319e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f16320e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Ctry f16321e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public byte[] f16322e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C12013e f16323e;

    public C8032e(C12013e c12013e) {
        this.f16323e = c12013e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [extends, catch, eًٌَ] */
    /* JADX WARN: Type inference failed for: r6v4, types: [subs, catch, eًٌَ] */
    @Override // defpackage.InterfaceC10630e
    public final int generateBytes(byte[] bArr, int i, int i2) {
        int i3 = i2;
        if (bArr.length - i3 < 0) {
            throw new RuntimeException("output buffer too small");
        }
        long j = i3;
        if (j > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j2 = 20;
        int i4 = (int) (((j + j2) - 1) / j2);
        byte[] bArr2 = new byte[20];
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (true) {
            C12013e c12013e = this.f16323e;
            if (i5 >= i4) {
                c12013e.reset();
                return (int) j;
            }
            byte[] bArr3 = this.f16322e;
            c12013e.update(bArr3, 0, bArr3.length);
            crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
            crashlytics crashlyticsVar2 = new crashlytics((byte) 0, 0);
            crashlyticsVar2.appmetrica(this.f16321e);
            int i8 = i4;
            byte[] bArr4 = new byte[4];
            AbstractC3628e.billing(i7, 0, bArr4);
            crashlyticsVar2.appmetrica(new Cprotected(bArr4));
            ?? ccatch = new Ccatch(crashlyticsVar2);
            ccatch.f20096e = -1;
            crashlyticsVar.appmetrica(ccatch);
            byte[] bArr5 = this.f16319e;
            if (bArr5 != null) {
                crashlyticsVar.appmetrica(new Cstrictfp(true, 0, new Cprotected(bArr5)));
            }
            byte[] bArr6 = new byte[4];
            AbstractC3628e.billing(this.f16320e, 0, bArr6);
            crashlyticsVar.appmetrica(new Cstrictfp(true, 2, new Cprotected(bArr6)));
            try {
                ?? ccatch2 = new Ccatch(crashlyticsVar);
                ccatch2.f20096e = -1;
                byte[] smaato = ccatch2.smaato();
                c12013e.update(smaato, 0, smaato.length);
                c12013e.doFinal(bArr2, 0);
                if (i3 > 20) {
                    System.arraycopy(bArr2, 0, bArr, i6, 20);
                    i6 += 20;
                    i3 -= 20;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i6, i3);
                }
                i7++;
                i5++;
                i4 = i8;
            } catch (IOException e) {
                throw new IllegalArgumentException(AbstractC8703e.admob(e, new StringBuilder("unable to encode parameter info: ")));
            }
        }
    }

    @Override // defpackage.InterfaceC10630e
    public final void init(InterfaceC13829e interfaceC13829e) {
        C14063e c14063e = (C14063e) interfaceC13829e;
        this.f16321e = c14063e.ad;
        this.f16320e = c14063e.vip;
        this.f16322e = c14063e.metrica;
        this.f16319e = c14063e.license;
    }
}
