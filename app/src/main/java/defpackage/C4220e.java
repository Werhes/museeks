package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: eٜؖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4220e {
    public final InterfaceC1196e ad;
    public int appmetrica;
    public C16833e license;
    public AbstractC3903e metrica;
    public SecureRandom purchase;
    public boolean vip;

    public C4220e(InterfaceC1196e interfaceC1196e) {
        this.ad = interfaceC1196e;
    }

    public final void ad(InterfaceC1196e interfaceC1196e, AbstractC7861e abstractC7861e) {
        byte[] ad = AbstractC5907e.ad(this.appmetrica, abstractC7861e.firebase());
        interfaceC1196e.update(ad, 0, ad.length);
    }

    public final byte[] license(int i, byte[] bArr) {
        BigInteger metrica;
        if (i > bArr.length || i == 0) {
            throw new RuntimeException("input buffer too short");
        }
        boolean z = this.vip;
        InterfaceC1196e interfaceC1196e = this.ad;
        if (!z) {
            int i2 = (this.appmetrica * 2) + 1;
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            AbstractC9932e billing = this.license.f32975e.billing(bArr2);
            if (billing.amazon(this.license.f32971e).advert()) {
                throw new Exception("[h]C1 at infinity");
            }
            AbstractC9932e Signature = billing.amazon(((C6988e) this.metrica).f14315e).Signature();
            int digestSize = (i - i2) - interfaceC1196e.getDigestSize();
            byte[] bArr3 = new byte[digestSize];
            System.arraycopy(bArr, i2, bArr3, 0, digestSize);
            metrica(interfaceC1196e, Signature, bArr3);
            int digestSize2 = interfaceC1196e.getDigestSize();
            byte[] bArr4 = new byte[digestSize2];
            Signature.vip();
            ad(interfaceC1196e, Signature.vip);
            interfaceC1196e.update(bArr3, 0, digestSize);
            ad(interfaceC1196e, Signature.appmetrica());
            interfaceC1196e.doFinal(bArr4, 0);
            int i3 = 0;
            for (int i4 = 0; i4 != digestSize2; i4++) {
                i3 |= bArr4[i4] ^ bArr[(i2 + digestSize) + i4];
            }
            Arrays.fill(bArr2, (byte) 0);
            Arrays.fill(bArr4, (byte) 0);
            if (i3 == 0) {
                return bArr3;
            }
            Arrays.fill(bArr3, (byte) 0);
            throw new Exception("invalid cipher text");
        }
        byte[] bArr5 = new byte[i];
        System.arraycopy(bArr, 0, bArr5, 0, i);
        C4630e c4630e = new C4630e(0);
        while (true) {
            int bitLength = this.license.f32974e.bitLength();
            while (true) {
                metrica = AbstractC5907e.metrica(bitLength, this.purchase);
                if (!metrica.equals(AbstractC5907e.ad) && metrica.compareTo(this.license.f32974e) < 0) {
                    break;
                }
            }
            byte[] yandex = c4630e.license(this.license.f32972e, metrica).Signature().yandex(false);
            AbstractC9932e Signature2 = ((C2964e) this.metrica).f7010e.amazon(metrica).Signature();
            metrica(interfaceC1196e, Signature2, bArr5);
            for (int i5 = 0; i5 != i; i5++) {
                if (bArr5[i5] != bArr[i5]) {
                    byte[] bArr6 = new byte[interfaceC1196e.getDigestSize()];
                    Signature2.vip();
                    ad(interfaceC1196e, Signature2.vip);
                    interfaceC1196e.update(bArr, 0, i);
                    ad(interfaceC1196e, Signature2.appmetrica());
                    interfaceC1196e.doFinal(bArr6, 0);
                    return AbstractC12442e.mopub(yandex, bArr5, bArr6);
                }
            }
        }
    }

    public final void metrica(InterfaceC1196e interfaceC1196e, AbstractC9932e abstractC9932e, byte[] bArr) {
        InterfaceC0554e interfaceC0554e;
        InterfaceC0554e interfaceC0554e2;
        int digestSize = interfaceC1196e.getDigestSize();
        byte[] bArr2 = new byte[Math.max(4, digestSize)];
        if (interfaceC1196e instanceof InterfaceC0554e) {
            abstractC9932e.vip();
            ad(interfaceC1196e, abstractC9932e.vip);
            ad(interfaceC1196e, abstractC9932e.appmetrica());
            interfaceC0554e = (InterfaceC0554e) interfaceC1196e;
            interfaceC0554e2 = interfaceC0554e.ad();
        } else {
            interfaceC0554e = null;
            interfaceC0554e2 = null;
        }
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            if (interfaceC0554e != null) {
                interfaceC0554e.vip(interfaceC0554e2);
            } else {
                abstractC9932e.vip();
                ad(interfaceC1196e, abstractC9932e.vip);
                ad(interfaceC1196e, abstractC9932e.appmetrica());
            }
            i2++;
            AbstractC3628e.billing(i2, 0, bArr2);
            interfaceC1196e.update(bArr2, 0, 4);
            interfaceC1196e.doFinal(bArr2, 0);
            int min = Math.min(digestSize, bArr.length - i);
            AbstractC4340e.yandex(bArr2, min, 0, bArr, i);
            i += min;
        }
    }

    public final void vip(boolean z, InterfaceC3894e interfaceC3894e) {
        this.vip = z;
        if (z) {
            C12219e c12219e = (C12219e) interfaceC3894e;
            AbstractC3903e abstractC3903e = (AbstractC3903e) c12219e.f24537e;
            this.metrica = abstractC3903e;
            C16833e c16833e = abstractC3903e.f8719e;
            this.license = c16833e;
            if (((C2964e) abstractC3903e).f7010e.amazon(c16833e.f32971e).advert()) {
                throw new IllegalArgumentException("invalid key: [h]Q at infinity");
            }
            this.purchase = c12219e.f24538e;
        } else {
            AbstractC3903e abstractC3903e2 = (AbstractC3903e) interfaceC3894e;
            this.metrica = abstractC3903e2;
            this.license = abstractC3903e2.f8719e;
        }
        this.appmetrica = this.license.f32975e.mopub();
        AbstractC0259e.ad(this.license.f32975e);
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }
}
