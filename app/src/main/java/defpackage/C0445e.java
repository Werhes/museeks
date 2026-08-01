package defpackage;

import java.security.SecureRandom;

/* renamed from: eؑٝۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0445e extends AbstractC9027e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f2492e;

    public C0445e(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.f2492e = bArr;
        if (bArr.length != 32) {
            throw new IllegalArgumentException("k");
        }
        secureRandom.nextBytes(bArr);
        if (bArr.length != 32) {
            throw new IllegalArgumentException("k");
        }
        bArr[0] = (byte) (bArr[0] & 248);
        byte b = (byte) (bArr[31] & Byte.MAX_VALUE);
        bArr[31] = b;
        bArr[31] = (byte) (b | 64);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0445e(byte[] bArr) {
        super(true);
        if (bArr.length != 32) {
            throw new IllegalArgumentException("'buf' must have length 32");
        }
        byte[] bArr2 = new byte[32];
        this.f2492e = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 32);
    }

    public final C11963e ad() {
        byte[] bArr = new byte[32];
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        byte[] bArr2 = new byte[32];
        AbstractC6286e.pro(this.f2492e, bArr2);
        C18464e c18464e = new C18464e(10);
        AbstractC6286e.signatures(bArr2, c18464e);
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        AbstractC13482e.m3611class((int[]) c18464e.f36191e, iArr4);
        AbstractC13482e.m3611class((int[]) c18464e.f36190e, iArr5);
        AbstractC13482e.m3611class((int[]) c18464e.f36192e, iArr6);
        AbstractC13482e.isPro(iArr4, iArr5, iArr3);
        AbstractC13482e.m3612interface(iArr4, iArr5, iArr4);
        AbstractC13482e.isPro(iArr4, iArr6, iArr4);
        AbstractC13482e.m3611class(iArr6, iArr6);
        AbstractC13482e.isPro(iArr3, AbstractC6286e.yandex, iArr3);
        AbstractC13482e.yandex(iArr3, iArr6, iArr3);
        AbstractC13482e.yandex(iArr3, iArr4, iArr3);
        AbstractC13482e.ads(iArr3);
        AbstractC13482e.ads(iArr5);
        AbstractC13482e.ads(iArr6);
        if ((AbstractC13482e.isVip(iArr3) & (~AbstractC13482e.isVip(iArr5)) & (~AbstractC13482e.isVip(iArr6))) == 0) {
            throw new IllegalStateException();
        }
        AbstractC13482e.amazon(0, 0, (int[]) c18464e.f36190e, iArr);
        AbstractC13482e.amazon(0, 0, (int[]) c18464e.f36192e, iArr2);
        AbstractC13482e.startapp(iArr2, iArr, iArr, iArr2);
        AbstractC13482e.tapsense(iArr2, iArr2);
        AbstractC13482e.isPro(iArr, iArr2, iArr);
        AbstractC13482e.ads(iArr);
        AbstractC13482e.remoteconfig(0, 0, bArr, iArr);
        AbstractC13482e.remoteconfig(5, 16, bArr, iArr);
        return new C11963e(0, bArr);
    }
}
