package defpackage;

import android.content.res.AssetManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: eؓۧ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2254e implements InterfaceC17128e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final byte[] f5731e = {74, -35, -94, 44, 121, -24, 33, 5};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f5732e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f5733e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f5734e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f5735e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f5736e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f5737e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f5738e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f5739e;

    public C2254e(InterfaceC11824e interfaceC11824e, C17221e c17221e, C5311e c5311e, boolean z, C2254e c2254e, List list) {
        this.f5736e = interfaceC11824e;
        this.f5732e = c17221e;
        this.f5739e = c5311e;
        this.f5734e = z;
        this.f5737e = c2254e;
        this.f5733e = list;
        this.f5738e = new LinkedHashMap();
        InterfaceC14256e.ad.getClass();
        this.f5735e = C12381e.ad();
    }

    public /* synthetic */ C2254e(InterfaceC11824e interfaceC11824e, C17221e c17221e, C5311e c5311e, boolean z, List list, int i) {
        this(interfaceC11824e, c17221e, c5311e, z, (C2254e) null, (i & 32) != 0 ? C13664e.f27089e : list);
    }

    public static int ad(int[] iArr) {
        int length = iArr.length;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                if (i == Integer.MAX_VALUE) {
                    break;
                }
                return i;
            }
            int i3 = iArr[i2];
            if (i3 <= 0) {
                break;
            }
            if (i > i3) {
                i = i3;
            }
            i2++;
        }
        return 0;
    }

    public static int vip(int[] iArr, int[] iArr2) {
        int ad = ad(iArr);
        int length = iArr2.length;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] == ad) {
                i = Math.min(i, iArr2[i2]);
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    public FileInputStream appmetrica(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((InterfaceC4732e) this.f5732e).startapp();
            return null;
        }
    }

    @Override // defpackage.InterfaceC17128e
    public byte[] billing(int i, byte[] bArr) {
        if (this.f5734e) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new Exception("Null pointer as ciphertext");
        }
        if (i % ((C8011e) this.f5736e).f16252e.isPro() != 0) {
            throw new Exception("Ciphertext not multiple of " + ((C8011e) this.f5736e).f16252e.isPro());
        }
        ((C8011e) this.f5736e).init(false, new C11494e((InterfaceC3894e) this.f5732e, f5731e, 0, 8));
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        for (int i2 = 0; i2 < i / ((C8011e) this.f5736e).f16252e.isPro(); i2++) {
            int isPro = ((C8011e) this.f5736e).f16252e.isPro() * i2;
            ((C8011e) this.f5736e).tapsense(isPro, isPro, bArr2, bArr2);
        }
        byte[] bArr3 = new byte[i];
        int i3 = 0;
        while (i3 < i) {
            int i4 = i3 + 1;
            bArr3[i3] = bArr2[i - i4];
            i3 = i4;
        }
        byte[] bArr4 = new byte[8];
        this.f5737e = bArr4;
        int i5 = i - 8;
        byte[] bArr5 = new byte[i5];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        System.arraycopy(bArr3, 8, bArr5, 0, i5);
        C11494e c11494e = new C11494e((InterfaceC3894e) this.f5732e, (byte[]) this.f5737e);
        this.f5739e = c11494e;
        ((C8011e) this.f5736e).init(false, c11494e);
        byte[] bArr6 = new byte[i5];
        System.arraycopy(bArr5, 0, bArr6, 0, i5);
        for (int i6 = 0; i6 < i5 / ((C8011e) this.f5736e).f16252e.isPro(); i6++) {
            int isPro2 = ((C8011e) this.f5736e).f16252e.isPro() * i6;
            ((C8011e) this.f5736e).tapsense(isPro2, isPro2, bArr6, bArr6);
        }
        int i7 = i - 16;
        byte[] bArr7 = new byte[i7];
        byte[] bArr8 = new byte[8];
        System.arraycopy(bArr6, 0, bArr7, 0, i7);
        System.arraycopy(bArr6, i7, bArr8, 0, 8);
        byte[] bArr9 = new byte[8];
        C12013e c12013e = (C12013e) this.f5735e;
        c12013e.update(bArr7, 0, i7);
        byte[] bArr10 = (byte[]) this.f5733e;
        c12013e.doFinal(bArr10, 0);
        System.arraycopy(bArr10, 0, bArr9, 0, 8);
        if (!AbstractC12442e.loadAd(bArr9, bArr8)) {
            throw new Exception("Checksum inside ciphertext is corrupted");
        }
        int i8 = bArr7[0];
        if (i7 - ((i8 & 255) + 1) <= 7) {
            byte[] bArr11 = new byte[i8];
            System.arraycopy(bArr7, 1, bArr11, 0, i8);
            return bArr11;
        }
        throw new Exception("too many pad bytes (" + (i7 - ((bArr7[0] & 255) + 1)) + ")");
    }

    @Override // defpackage.InterfaceC17128e
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // defpackage.InterfaceC17128e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        this.f5734e = z;
        this.f5736e = new C8011e(new C10107e(0, false));
        if (interfaceC3894e instanceof C12219e) {
            C12219e c12219e = (C12219e) interfaceC3894e;
            this.f5738e = c12219e.f24538e;
            interfaceC3894e = c12219e.f24537e;
        } else {
            this.f5738e = AbstractC9915e.vip();
        }
        if (!(interfaceC3894e instanceof C11494e)) {
            this.f5732e = interfaceC3894e;
            if (this.f5734e) {
                byte[] bArr = new byte[8];
                this.f5737e = bArr;
                ((SecureRandom) this.f5738e).nextBytes(bArr);
                this.f5739e = new C11494e((InterfaceC3894e) this.f5732e, (byte[]) this.f5737e);
                return;
            }
            return;
        }
        C11494e c11494e = (C11494e) interfaceC3894e;
        this.f5739e = c11494e;
        byte[] bArr2 = c11494e.f23095e;
        this.f5737e = bArr2;
        this.f5732e = c11494e.f23094e;
        if (!this.f5734e) {
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
        if (bArr2 == null || bArr2.length != 8) {
            throw new IllegalArgumentException("IV is not 8 octets");
        }
    }

    @Override // defpackage.InterfaceC17128e
    public byte[] license(int i, byte[] bArr) {
        if (!this.f5734e) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        int i2 = i + 1;
        int i3 = i2 % 8;
        int i4 = i3 != 0 ? (8 - i3) + i2 : i2;
        byte[] bArr2 = new byte[i4];
        bArr2[0] = (byte) i;
        System.arraycopy(bArr, 0, bArr2, 1, i);
        int i5 = (i4 - i) - 1;
        byte[] bArr3 = new byte[i5];
        if (i5 > 0) {
            ((SecureRandom) this.f5738e).nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i2, i5);
        }
        byte[] bArr4 = new byte[8];
        C12013e c12013e = (C12013e) this.f5735e;
        c12013e.update(bArr2, 0, i4);
        byte[] bArr5 = (byte[]) this.f5733e;
        c12013e.doFinal(bArr5, 0);
        System.arraycopy(bArr5, 0, bArr4, 0, 8);
        int i6 = i4 + 8;
        byte[] bArr6 = new byte[i6];
        System.arraycopy(bArr2, 0, bArr6, 0, i4);
        System.arraycopy(bArr4, 0, bArr6, i4, 8);
        byte[] bArr7 = new byte[i6];
        System.arraycopy(bArr6, 0, bArr7, 0, i6);
        int isPro = i6 / ((C8011e) this.f5736e).f16252e.isPro();
        if (i6 % ((C8011e) this.f5736e).f16252e.isPro() != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        ((C8011e) this.f5736e).init(true, (C11494e) this.f5739e);
        for (int i7 = 0; i7 < isPro; i7++) {
            int isPro2 = ((C8011e) this.f5736e).f16252e.isPro() * i7;
            ((C8011e) this.f5736e).tapsense(isPro2, isPro2, bArr7, bArr7);
        }
        byte[] bArr8 = (byte[]) this.f5737e;
        int length = bArr8.length + i6;
        byte[] bArr9 = new byte[length];
        System.arraycopy(bArr8, 0, bArr9, 0, bArr8.length);
        System.arraycopy(bArr7, 0, bArr9, ((byte[]) this.f5737e).length, i6);
        byte[] bArr10 = new byte[length];
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            bArr10[i8] = bArr9[length - i9];
            i8 = i9;
        }
        ((C8011e) this.f5736e).init(true, new C11494e((InterfaceC3894e) this.f5732e, f5731e, 0, 8));
        for (int i10 = 0; i10 < isPro + 1; i10++) {
            int isPro3 = ((C8011e) this.f5736e).f16252e.isPro() * i10;
            ((C8011e) this.f5736e).tapsense(isPro3, isPro3, bArr10, bArr10);
        }
        return bArr10;
    }

    public Integer metrica(int i) {
        Integer num = (Integer) ((LinkedHashMap) this.f5738e).get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        C2254e c2254e = (C2254e) this.f5737e;
        if (c2254e != null) {
            return c2254e.metrica(i);
        }
        return null;
    }

    public void purchase(int i, Serializable serializable) {
        ((Executor) this.f5736e).execute(new RunnableC16764e(this, i, serializable, 3));
    }

    public C2254e yandex(List list) {
        C2254e c2254e = new C2254e((InterfaceC11824e) this.f5736e, (C17221e) this.f5732e, (C5311e) this.f5739e, this.f5734e, this, (List) this.f5733e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8372e c8372e = (C8372e) it.next();
            ((LinkedHashMap) c2254e.f5738e).put(Integer.valueOf(c8372e.f17125e), Integer.valueOf(c8372e.f17133e));
        }
        return c2254e;
    }
}
