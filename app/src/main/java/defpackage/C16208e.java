package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16208e extends AbstractC8618e {
    public static final Object yandex = new Object();
    public C17866e appmetrica;
    public int billing;
    public int license;
    public long metrica;
    public Object purchase;

    public C16208e(long j) {
        super(j);
        this.appmetrica = AbstractC8809e.ad;
        this.purchase = yandex;
    }

    @Override // defpackage.AbstractC8618e
    public final void ad(AbstractC8618e abstractC8618e) {
        C16208e c16208e = (C16208e) abstractC8618e;
        this.appmetrica = c16208e.appmetrica;
        this.purchase = c16208e.purchase;
        this.billing = c16208e.billing;
    }

    public final int appmetrica(C6656e c6656e, AbstractC13717e abstractC13717e) {
        C17866e c17866e;
        int i;
        long[] jArr;
        int i2;
        Object[] objArr;
        int[] iArr;
        long[] jArr2;
        int i3;
        Object[] objArr2;
        int[] iArr2;
        long j;
        int i4;
        AbstractC8618e startapp;
        C16208e c16208e;
        synchronized (AbstractC12909e.metrica) {
            c17866e = this.appmetrica;
        }
        int i5 = 7;
        if (c17866e.appmetrica == 0) {
            return 7;
        }
        C12431e license = AbstractC14533e.license();
        Object[] objArr3 = license.f24870e;
        int i6 = license.f24868e;
        for (int i7 = 0; i7 < i6; i7++) {
            ((C2336e) objArr3[i7]).vip();
        }
        try {
            Object[] objArr4 = c17866e.vip;
            int[] iArr3 = c17866e.metrica;
            long[] jArr3 = c17866e.ad;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i8 = 0;
                while (true) {
                    long j2 = jArr3[i8];
                    long j3 = -9187201950435737472L;
                    if ((((~j2) << i5) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i2 = i5;
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j2 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                j = j3;
                                int i13 = i9;
                                InterfaceC17335e interfaceC17335e = (InterfaceC17335e) objArr4[i12];
                                if (iArr3[i12] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i11;
                                    objArr2 = objArr4;
                                    iArr2 = iArr3;
                                } else {
                                    if (interfaceC17335e instanceof C6656e) {
                                        C6656e c6656e2 = (C6656e) interfaceC17335e;
                                        C16208e purchase = c6656e2.purchase((C16208e) AbstractC12909e.startapp(c6656e2.f13736e, abstractC13717e), abstractC13717e, false, c6656e2.f13735e);
                                        C17866e c17866e2 = purchase.appmetrica;
                                        Object[] objArr5 = c17866e2.vip;
                                        long[] jArr4 = c17866e2.ad;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i14 = 0;
                                            while (true) {
                                                long j4 = jArr4[i14];
                                                iArr2 = iArr3;
                                                c16208e = purchase;
                                                if ((((~j4) << i2) & j4 & j) != j) {
                                                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                    for (int i16 = 0; i16 < i15; i16++) {
                                                        if ((j4 & 255) < 128) {
                                                            i = (i * 31) + System.identityHashCode((InterfaceC17335e) objArr5[(i14 << 3) + i16]);
                                                        }
                                                        j4 >>= i13;
                                                    }
                                                    if (i15 != i13) {
                                                        break;
                                                    }
                                                }
                                                if (i14 == length2) {
                                                    break;
                                                }
                                                i14++;
                                                iArr3 = iArr2;
                                                purchase = c16208e;
                                                i13 = 8;
                                            }
                                        } else {
                                            iArr2 = iArr3;
                                            c16208e = purchase;
                                        }
                                        startapp = c16208e;
                                    } else {
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        iArr2 = iArr3;
                                        startapp = AbstractC12909e.startapp(interfaceC17335e.appmetrica(), abstractC13717e);
                                    }
                                    int identityHashCode = ((i * 31) + System.identityHashCode(startapp)) * 31;
                                    long j5 = startapp.ad;
                                    i = identityHashCode + ((int) (j5 ^ (j5 >>> 32)));
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                i3 = i11;
                                objArr2 = objArr4;
                                iArr2 = iArr3;
                                j = j3;
                                i4 = i9;
                            }
                            j2 >>= i4;
                            i9 = i4;
                            jArr3 = jArr2;
                            j3 = j;
                            objArr4 = objArr2;
                            iArr3 = iArr2;
                            i11 = i3 + 1;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        iArr = iArr3;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i5;
                        objArr = objArr4;
                        iArr = iArr3;
                    }
                    if (i8 == length) {
                        i5 = i;
                        break;
                    }
                    i8++;
                    i5 = i2;
                    jArr3 = jArr;
                    objArr4 = objArr;
                    iArr3 = iArr;
                }
            }
            i = i5;
            Unit unit = Unit.INSTANCE;
            Object[] objArr6 = license.f24870e;
            int i17 = license.f24868e;
            for (int i18 = 0; i18 < i17; i18++) {
                ((C2336e) objArr6[i18]).ad();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr7 = license.f24870e;
            int i19 = license.f24868e;
            for (int i20 = 0; i20 < i19; i20++) {
                ((C2336e) objArr7[i20]).ad();
            }
            throw th;
        }
    }

    public final boolean license(C6656e c6656e, AbstractC13717e abstractC13717e) {
        boolean z;
        boolean z2;
        Object obj = AbstractC12909e.metrica;
        synchronized (obj) {
            z = true;
            if (this.metrica == abstractC13717e.billing()) {
                if (this.license == abstractC13717e.yandex()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.purchase == yandex || (z2 && this.billing != appmetrica(c6656e, abstractC13717e))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.metrica = abstractC13717e.billing();
            this.license = abstractC13717e.yandex();
            Unit unit = Unit.INSTANCE;
        }
        return z;
    }

    @Override // defpackage.AbstractC8618e
    public final AbstractC8618e metrica(long j) {
        return new C16208e(j);
    }

    @Override // defpackage.AbstractC8618e
    public final AbstractC8618e vip() {
        return new C16208e(AbstractC12909e.adcel().billing());
    }
}
