package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۛۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6656e extends AbstractC6329e implements InterfaceC16132e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC1589e f13734e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function0 f13735e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C16208e f13736e = new C16208e(AbstractC12909e.adcel().billing());

    public C6656e(InterfaceC1589e interfaceC1589e, Function0 function0) {
        this.f13735e = function0;
        this.f13734e = interfaceC1589e;
    }

    @Override // defpackage.InterfaceC17335e
    public final AbstractC8618e appmetrica() {
        return this.f13736e;
    }

    @Override // defpackage.InterfaceC16132e
    public final Object getValue() {
        Function1 appmetrica = AbstractC12909e.adcel().appmetrica();
        if (appmetrica != null) {
            appmetrica.invoke(this);
        }
        AbstractC13717e adcel = AbstractC12909e.adcel();
        return purchase((C16208e) AbstractC12909e.startapp(this.f13736e, adcel), adcel, true, this.f13735e).purchase;
    }

    public final C16208e purchase(C16208e c16208e, AbstractC13717e abstractC13717e, boolean z, Function0 function0) {
        C12431e license;
        C16208e c16208e2;
        InterfaceC1589e interfaceC1589e;
        int i;
        if (c16208e.license(this, abstractC13717e)) {
            if (z) {
                license = AbstractC14533e.license();
                Object[] objArr = license.f24870e;
                int i2 = license.f24868e;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((C2336e) objArr[i3]).vip();
                }
                try {
                    C17866e c17866e = c16208e.appmetrica;
                    C0912e c0912e = AbstractC4984e.ad;
                    C9898e c9898e = (C9898e) c0912e.get();
                    if (c9898e == null) {
                        c9898e = new C9898e();
                        c0912e.Signature(c9898e);
                    }
                    int i4 = c9898e.ad;
                    Object[] objArr2 = c17866e.vip;
                    int[] iArr = c17866e.metrica;
                    long[] jArr = c17866e.ad;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        i = i6;
                                        InterfaceC17335e interfaceC17335e = (InterfaceC17335e) objArr2[i9];
                                        c9898e.ad = i4 + iArr[i9];
                                        Function1 appmetrica = abstractC13717e.appmetrica();
                                        if (appmetrica != null) {
                                            appmetrica.invoke(interfaceC17335e);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    c9898e.ad = i4;
                    Unit unit = Unit.INSTANCE;
                    Object[] objArr3 = license.f24870e;
                    int i10 = license.f24868e;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((C2336e) objArr3[i11]).ad();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c16208e;
        }
        C17866e c17866e2 = new C17866e();
        C0912e c0912e2 = AbstractC4984e.ad;
        C9898e c9898e2 = (C9898e) c0912e2.get();
        if (c9898e2 == null) {
            c9898e2 = new C9898e();
            c0912e2.Signature(c9898e2);
        }
        C9898e c9898e3 = c9898e2;
        int i12 = c9898e3.ad;
        license = AbstractC14533e.license();
        Object[] objArr4 = license.f24870e;
        int i13 = license.f24868e;
        for (int i14 = 0; i14 < i13; i14++) {
            ((C2336e) objArr4[i14]).vip();
        }
        try {
            c9898e3.ad = i12 + 1;
            Object amazon = AbstractC12640e.amazon(new C5888e(i12, 0, this, c9898e3, c17866e2), function0);
            c9898e3.ad = i12;
            Object[] objArr5 = license.f24870e;
            int i15 = license.f24868e;
            for (int i16 = 0; i16 < i15; i16++) {
                ((C2336e) objArr5[i16]).ad();
            }
            Object obj = AbstractC12909e.metrica;
            synchronized (obj) {
                try {
                    AbstractC13717e adcel = AbstractC12909e.adcel();
                    Object obj2 = c16208e.purchase;
                    if (obj2 == C16208e.yandex || (interfaceC1589e = this.f13734e) == null || !interfaceC1589e.license(amazon, obj2)) {
                        c16208e2 = (C16208e) AbstractC12909e.amazon(this.f13736e, this, adcel);
                        c16208e2.appmetrica = c17866e2;
                        c16208e2.billing = c16208e2.appmetrica(this, adcel);
                        c16208e2.purchase = amazon;
                    } else {
                        c16208e.appmetrica = c17866e2;
                        c16208e.billing = c16208e.appmetrica(this, adcel);
                        c16208e2 = c16208e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C9898e c9898e4 = (C9898e) AbstractC4984e.ad.get();
            if (c9898e4 == null || c9898e4.ad != 0) {
                return c16208e2;
            }
            AbstractC12909e.adcel().smaato();
            synchronized (obj) {
                AbstractC13717e adcel2 = AbstractC12909e.adcel();
                c16208e2.metrica = adcel2.billing();
                c16208e2.license = adcel2.yandex();
                Unit unit2 = Unit.INSTANCE;
            }
            return c16208e2;
        } finally {
            Object[] objArr6 = license.f24870e;
            int i17 = license.f24868e;
            for (int i18 = 0; i18 < i17; i18++) {
                ((C2336e) objArr6[i18]).ad();
            }
        }
    }

    public final C16208e startapp() {
        AbstractC13717e adcel = AbstractC12909e.adcel();
        return purchase((C16208e) AbstractC12909e.startapp(this.f13736e, adcel), adcel, false, this.f13735e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        C16208e c16208e = (C16208e) AbstractC12909e.yandex(this.f13736e);
        sb.append(c16208e.license(this, AbstractC12909e.adcel()) ? String.valueOf(c16208e.purchase) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @Override // defpackage.InterfaceC17335e
    public final void yandex(AbstractC8618e abstractC8618e) {
        this.f13736e = (C16208e) abstractC8618e;
    }
}
