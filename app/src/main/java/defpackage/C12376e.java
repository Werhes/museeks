package defpackage;

import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: eٍؘّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12376e {
    public static final byte[] appmetrica = {0, 0};
    public byte[] ad;
    public SecureRandom license;
    public C12222e metrica;
    public C1061e vip;

    public final byte[] ad(byte[] bArr) {
        AbstractC7629e vip = ((C4577e) this.metrica.f3209e).vip.vip();
        vip.billing((byte[]) this.metrica.f24541e.f23815e);
        int i = vip.ad;
        byte[] bArr2 = new byte[i];
        SecureRandom secureRandom = this.license;
        int i2 = 0;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        } else {
            System.arraycopy((byte[]) this.metrica.f24541e.f23815e, 0, bArr2, 0, i);
        }
        C12222e c12222e = this.metrica;
        byte[] bArr3 = this.ad;
        C4577e c4577e = (C4577e) c12222e.f3209e;
        C7358e c7358e = c12222e.f24540e;
        C11883e c11883e = c12222e.f24541e;
        AbstractC7629e vip2 = c4577e.vip.vip();
        byte[] bArr4 = (byte[]) c11883e.f23815e;
        vip2.billing(bArr4);
        C13935e c13935e = new C13935e(vip2);
        byte[] appmetrica2 = vip2.appmetrica(c7358e.vip, bArr2, bArr3, bArr);
        C15475e metrica = vip2.metrica(appmetrica2, (byte[]) c11883e.f23815e, (byte[]) c11883e.f23814e, bArr3, bArr);
        byte[] bArr5 = (byte[]) metrica.metrica;
        long j = metrica.vip;
        int i3 = metrica.ad;
        C13935e c13935e2 = new C13935e(1);
        c13935e2.m3736import(3);
        c13935e2.m3741private(j);
        c13935e2.m3745super(i3);
        C11883e[] m3737instanceof = c13935e.m3737instanceof(c13935e2, bArr5, c7358e.ad, bArr4);
        C13935e c13935e3 = new C13935e(1);
        c13935e3.m3736import(3);
        c13935e3.m3741private(j);
        c13935e3.m3745super(i3);
        byte[] m3750try = c13935e.m3750try(m3737instanceof, bArr5, bArr4, c13935e3);
        byte[] bArr6 = new byte[32];
        AbstractC3628e.billing(2, 16, bArr6);
        Arrays.fill(bArr6, 20, 32, (byte) 0);
        byte[] m4513e = new C18464e(vip2, AbstractC12442e.license(c7358e.ad), AbstractC12442e.license((byte[]) c11883e.f23815e)).m4513e(i3, j, m3750try);
        int length = m3737instanceof.length;
        byte[][] bArr7 = new byte[length + 2];
        bArr7[0] = appmetrica2;
        while (i2 != m3737instanceof.length) {
            int i4 = i2 + 1;
            C11883e c11883e2 = m3737instanceof[i2];
            bArr7[i4] = AbstractC12442e.adcel((byte[]) c11883e2.f23814e, AbstractC12442e.smaato((byte[][]) c11883e2.f23815e));
            i2 = i4;
        }
        bArr7[length + 1] = m4513e;
        return AbstractC12442e.smaato(bArr7);
    }

    public final boolean vip(byte[] bArr, byte[] bArr2) {
        C1061e c1061e = this.vip;
        byte[] bArr3 = this.ad;
        C4577e c4577e = (C4577e) c1061e.f3209e;
        C11883e c11883e = c1061e.f3588e;
        AbstractC7629e vip = c4577e.vip.vip();
        vip.billing(c1061e.metrica());
        C13935e c13935e = new C13935e(1);
        int i = vip.yandex;
        int i2 = vip.billing;
        int i3 = ((i2 + 1) * i) + 1 + vip.startapp;
        int i4 = vip.purchase;
        int i5 = vip.metrica;
        int i6 = vip.ad;
        if (((i4 * i5) + i3) * i6 != bArr2.length) {
            return false;
        }
        C0912e c0912e = new C0912e(i6, i, i2, i4, vip.adcel, i5, bArr2);
        byte[] bArr4 = (byte[]) c0912e.f3332e;
        C11883e[] c11883eArr = (C11883e[]) c0912e.f3331e;
        C10312e[] c10312eArr = (C10312e[]) c0912e.f3333e;
        C15475e metrica = vip.metrica(bArr4, c1061e.metrica(), AbstractC12442e.license((byte[]) c11883e.f23814e), bArr3, bArr);
        byte[] bArr5 = (byte[]) metrica.metrica;
        long j = metrica.vip;
        int i7 = metrica.ad;
        c13935e.m3736import(3);
        c13935e.m3739new(0);
        c13935e.m3741private(j);
        c13935e.m3745super(i7);
        byte[] m3750try = new C13935e(vip).m3750try(c11883eArr, bArr5, c1061e.metrica(), c13935e);
        c13935e.m3736import(2);
        c13935e.m3739new(0);
        c13935e.m3741private(j);
        c13935e.m3745super(i7);
        return new C18464e(vip, (byte[]) null, c1061e.metrica()).m4498e(m3750try, c10312eArr, c1061e.metrica(), j, i7, AbstractC12442e.license((byte[]) c11883e.f23814e));
    }
}
