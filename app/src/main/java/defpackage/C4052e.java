package defpackage;

import android.graphics.Rect;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4052e implements InterfaceC15169e, InterfaceC11306e, InterfaceC3811e, InterfaceC8668e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f8999e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f9000e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f9001e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f9002e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f9003e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f9004e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f9005e;

    public C4052e(int i) {
        int i2 = 1;
        switch (i) {
            case 2:
                this.f9003e = true;
                this.f8999e = null;
                this.f9005e = null;
                this.f9004e = new byte[]{9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
                this.f9002e = new byte[8];
                this.f9000e = new byte[8];
                this.f9001e = 0;
                return;
            default:
                this.f9000e = new Rect();
                C9684e c9684e = C5701e.metrica;
                this.f9002e = (C5701e) c9684e.yandex();
                this.f8999e = (C5701e) c9684e.yandex();
                this.f9005e = new C9375e(i2);
                this.f9004e = new C9375e(2);
                this.f9001e = -1;
                return;
        }
    }

    public C4052e(InterfaceC8668e interfaceC8668e) {
        this.f9000e = new Object();
        this.f9001e = 0;
        this.f9003e = false;
        this.f9004e = new C11535e(1, this);
        this.f9002e = interfaceC8668e;
        this.f8999e = interfaceC8668e.getSurface();
    }

    public static void license(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr3[i2] = (byte) (bArr[i + i2] ^ bArr2[i2]);
        }
    }

    public boolean adcel(float f, int i, C0348e c0348e) {
        if (((C5701e) this.f9002e).vip.isEmpty()) {
            return false;
        }
        int size = ((C5701e) this.f9002e).vip.size();
        int i2 = (((int) (f * size)) + i) % size;
        if (this.f9001e == i2) {
            return false;
        }
        this.f9001e = i2;
        C1244e c1244e = c0348e.license;
        C16465e c16465e = (C16465e) ((C5701e) this.f9002e).vip.get(i2);
        c1244e.license(c16465e.ad.x);
        c1244e.appmetrica(c16465e.ad.y);
        c1244e.adcel.appmetrica(255);
        C1244e c1244e2 = c0348e.appmetrica;
        C16465e c16465e2 = (C16465e) ((C5701e) this.f8999e).vip.get(i2);
        c1244e2.license(c16465e2.ad.x);
        c1244e2.appmetrica(c16465e2.ad.y);
        c1244e2.adcel.appmetrica(255);
        return true;
    }

    public void advert() {
        synchronized (this.f9000e) {
            try {
                this.f9003e = true;
                ((InterfaceC8668e) this.f9002e).billing();
                if (this.f9001e == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC8668e
    public int appmetrica() {
        int appmetrica;
        synchronized (this.f9000e) {
            appmetrica = ((InterfaceC8668e) this.f9002e).appmetrica();
        }
        return appmetrica;
    }

    @Override // defpackage.InterfaceC8668e
    public void billing() {
        synchronized (this.f9000e) {
            ((InterfaceC8668e) this.f9002e).billing();
        }
    }

    @Override // defpackage.InterfaceC8668e
    public void close() {
        synchronized (this.f9000e) {
            try {
                Surface surface = (Surface) this.f8999e;
                if (surface != null) {
                    surface.release();
                }
                ((InterfaceC8668e) this.f9002e).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC11306e
    public int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = (byte[]) this.f9002e;
        while (true) {
            int i2 = this.f9001e;
            if (i2 >= 8) {
                break;
            }
            ((byte[]) this.f9000e)[i2] = 0;
            this.f9001e = i2 + 1;
        }
        byte[] bArr3 = (byte[]) this.f9000e;
        byte[] bArr4 = new byte[bArr3.length];
        if (this.f9003e) {
            this.f9003e = false;
            System.arraycopy(bArr3, 0, bArr4, 0, bArr2.length);
        } else {
            license(0, bArr3, bArr2, bArr4);
        }
        yandex((int[]) this.f8999e, bArr4, bArr2);
        System.arraycopy(bArr2, (bArr2.length / 2) - 4, bArr, i, 4);
        reset();
        return 4;
    }

    @Override // defpackage.InterfaceC11306e
    public String getAlgorithmName() {
        return "GOST28147Mac";
    }

    @Override // defpackage.InterfaceC11306e
    public int getMacSize() {
        return 4;
    }

    @Override // defpackage.InterfaceC8668e
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f9000e) {
            surface = ((InterfaceC8668e) this.f9002e).getSurface();
        }
        return surface;
    }

    @Override // defpackage.InterfaceC8668e
    public int getWidth() {
        int width;
        synchronized (this.f9000e) {
            width = ((InterfaceC8668e) this.f9002e).getWidth();
        }
        return width;
    }

    @Override // defpackage.InterfaceC11306e
    public void init(InterfaceC3894e interfaceC3894e) {
        reset();
        this.f9000e = new byte[8];
        this.f9005e = null;
        mopub(interfaceC3894e);
        if (interfaceC3894e instanceof EnumC0300e) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC8668e
    public InterfaceC12385e inmobi() {
        C12997e c12997e;
        synchronized (this.f9000e) {
            InterfaceC12385e inmobi = ((InterfaceC8668e) this.f9002e).inmobi();
            if (inmobi != null) {
                this.f9001e++;
                c12997e = new C12997e(inmobi);
                c12997e.ad((C11535e) this.f9004e);
            } else {
                c12997e = null;
            }
        }
        return c12997e;
    }

    @Override // defpackage.InterfaceC8668e
    public int isVip() {
        int isVip;
        synchronized (this.f9000e) {
            isVip = ((InterfaceC8668e) this.f9002e).isVip();
        }
        return isVip;
    }

    @Override // defpackage.InterfaceC8668e
    public InterfaceC12385e metrica() {
        C12997e c12997e;
        synchronized (this.f9000e) {
            InterfaceC12385e metrica = ((InterfaceC8668e) this.f9002e).metrica();
            if (metrica != null) {
                this.f9001e++;
                c12997e = new C12997e(metrica);
                c12997e.ad((C11535e) this.f9004e);
            } else {
                c12997e = null;
            }
        }
        return c12997e;
    }

    public void mopub(InterfaceC3894e interfaceC3894e) {
        InterfaceC3894e interfaceC3894e2;
        if (interfaceC3894e == null) {
            return;
        }
        if (interfaceC3894e instanceof C1794e) {
            C1794e c1794e = (C1794e) interfaceC3894e;
            byte[] bArr = c1794e.f4853e;
            System.arraycopy(bArr, 0, (byte[]) this.f9004e, 0, bArr.length);
            interfaceC3894e2 = c1794e.f4854e;
        } else if (interfaceC3894e instanceof C14915e) {
            byte[] bArr2 = ((C14915e) interfaceC3894e).f29591e;
            if (bArr2.length != 32) {
                throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
            }
            int[] iArr = new int[8];
            for (int i = 0; i != 8; i++) {
                iArr[i] = AbstractC3628e.advert(i * 4, bArr2);
            }
            this.f8999e = iArr;
            interfaceC3894e2 = null;
        } else {
            if (!(interfaceC3894e instanceof C11494e)) {
                throw new IllegalArgumentException(AbstractC8703e.remoteconfig("invalid parameter passed to GOST28147 init - ", interfaceC3894e));
            }
            C11494e c11494e = (C11494e) interfaceC3894e;
            byte[] bArr3 = c11494e.f23095e;
            byte[] bArr4 = (byte[]) this.f9002e;
            System.arraycopy(bArr3, 0, bArr4, 0, bArr4.length);
            this.f9005e = bArr3;
            interfaceC3894e2 = c11494e.f23094e;
        }
        mopub(interfaceC3894e2);
    }

    @Override // defpackage.InterfaceC8668e
    public void pro(InterfaceC14599e interfaceC14599e, Executor executor) {
        synchronized (this.f9000e) {
            ((InterfaceC8668e) this.f9002e).pro(new C18070e(this, interfaceC14599e, 25), executor);
        }
    }

    public C11154e purchase() {
        C2697e c2697e;
        boolean z;
        ArrayList arrayList = (ArrayList) this.f9002e;
        C14341e c14341e = (C14341e) this.f8999e;
        C4541e c4541e = null;
        if (c14341e != null) {
            c14341e.f28367e = arrayList;
            c14341e.f28370e = (C1828e) this.f9004e;
            c4541e = (C4541e) c14341e.ad();
            c2697e = null;
            z = true;
        } else {
            C14518e c14518e = (C14518e) this.f9005e;
            if (c14518e == null) {
                throw new C15608e(36, null);
            }
            c14518e.f28712e = arrayList;
            c14518e.f28707e = (C1828e) this.f9004e;
            c2697e = (C2697e) c14518e.ad();
            z = this.f9003e;
        }
        int i = this.f9001e;
        return new C11154e(c4541e, c2697e, z, i != -1 ? i : 1);
    }

    @Override // defpackage.InterfaceC15169e
    public InterfaceC9660e remoteconfig() {
        C10312e c10312e = (C10312e) this.f9004e;
        C1705e c1705e = null;
        InterfaceC9660e remoteconfig = c10312e != null ? c10312e.remoteconfig() : null;
        int i = this.f9001e;
        InterfaceC5482e interfaceC5482e = (InterfaceC5482e) this.f9000e;
        interfaceC5482e.getClass();
        if (!this.f9003e && remoteconfig != null) {
            C3318e c3318e = (C3318e) this.f8999e;
            if (c3318e != null) {
                InterfaceC5482e interfaceC5482e2 = (InterfaceC5482e) c3318e.f7485e;
                interfaceC5482e2.getClass();
                c1705e = new C1705e(interfaceC5482e2, c3318e.f7486e);
            } else {
                c1705e = new C1705e(interfaceC5482e, 5242880L);
            }
        }
        return new C12978e(interfaceC5482e, remoteconfig, ((C6173e) this.f9002e).remoteconfig(), c1705e, i, (C12582e) this.f9005e);
    }

    @Override // defpackage.InterfaceC11306e
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = (byte[]) this.f9000e;
            if (i >= bArr.length) {
                this.f9001e = 0;
                this.f9003e = true;
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    public boolean startapp() {
        return this.f9001e < ((List) this.f8999e).size() || !((ArrayList) this.f9004e).isEmpty();
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte b) {
        byte[] bArr = (byte[]) this.f9002e;
        int i = this.f9001e;
        byte[] bArr2 = (byte[]) this.f9000e;
        if (i == bArr2.length) {
            byte[] bArr3 = new byte[bArr2.length];
            if (this.f9003e) {
                this.f9003e = false;
                byte[] bArr4 = (byte[]) this.f9005e;
                if (bArr4 != null) {
                    license(0, bArr2, bArr4, bArr3);
                } else {
                    System.arraycopy(bArr2, 0, bArr3, 0, bArr.length);
                }
            } else {
                license(0, bArr2, bArr, bArr3);
            }
            yandex((int[]) this.f8999e, bArr3, bArr);
            this.f9001e = 0;
        }
        byte[] bArr5 = (byte[]) this.f9000e;
        int i2 = this.f9001e;
        this.f9001e = i2 + 1;
        bArr5[i2] = b;
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = (byte[]) this.f9002e;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i3 = this.f9001e;
        int i4 = 8 - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, (byte[]) this.f9000e, i3, i4);
            byte[] bArr3 = (byte[]) this.f9000e;
            byte[] bArr4 = new byte[bArr3.length];
            if (this.f9003e) {
                this.f9003e = false;
                byte[] bArr5 = (byte[]) this.f9005e;
                if (bArr5 != null) {
                    license(0, bArr3, bArr5, bArr4);
                } else {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr2.length);
                }
            } else {
                license(0, bArr3, bArr2, bArr4);
            }
            yandex((int[]) this.f8999e, bArr4, bArr2);
            this.f9001e = 0;
            i2 -= i4;
            i += i4;
            while (i2 > 8) {
                license(i, bArr, bArr2, bArr4);
                yandex((int[]) this.f8999e, bArr4, bArr2);
                i2 -= 8;
                i += 8;
            }
        }
        System.arraycopy(bArr, i, (byte[]) this.f9000e, this.f9001e, i2);
        this.f9001e += i2;
    }

    @Override // defpackage.InterfaceC8668e
    public int vip() {
        int vip;
        synchronized (this.f9000e) {
            vip = ((InterfaceC8668e) this.f9002e).vip();
        }
        return vip;
    }

    public void yandex(int[] iArr, byte[] bArr, byte[] bArr2) {
        int advert = AbstractC3628e.advert(0, bArr);
        int advert2 = AbstractC3628e.advert(4, bArr);
        for (int i = 0; i < 2; i++) {
            int i2 = 0;
            while (i2 < 8) {
                int i3 = iArr[i2] + advert;
                byte[] bArr3 = (byte[]) this.f9004e;
                int i4 = bArr3[i3 & 15] + (bArr3[((i3 >> 4) & 15) + 16] << 4) + (bArr3[((i3 >> 8) & 15) + 32] << 8) + (bArr3[((i3 >> 12) & 15) + 48] << 12) + (bArr3[((i3 >> 16) & 15) + 64] << 16) + (bArr3[((i3 >> 20) & 15) + 80] << 20) + (bArr3[((i3 >> 24) & 15) + 96] << 24) + (bArr3[((i3 >> 28) & 15) + 112] << 28);
                i2++;
                int i5 = advert;
                advert = advert2 ^ ((i4 << 11) | (i4 >>> 21));
                advert2 = i5;
            }
        }
        AbstractC3628e.yandex(advert, 0, bArr2);
        AbstractC3628e.yandex(advert2, 4, bArr2);
    }
}
