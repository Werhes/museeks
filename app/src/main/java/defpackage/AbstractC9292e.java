package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9292e extends AbstractC2832e implements InterfaceC6911e, InterfaceC13158e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public C17790e f18509e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C17712e f18510e = new C17712e(0, this);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f18511e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public C0583e f18512e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C0758e f18513e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public boolean f18514e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f18515e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Function1 f18516e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C3555e f18517e;

    /* renamed from: eّٔؖ, reason: contains not printable characters */
    public static void m2535e(AbstractC17732e abstractC17732e) {
        C10324e c10324e;
        AbstractC17732e abstractC17732e2 = abstractC17732e.f34777e;
        C13915e c13915e = abstractC17732e.f34782e;
        if (!AbstractC7890e.billing(abstractC17732e2 != null ? abstractC17732e2.f34782e : null, c13915e)) {
            c13915e.f27612e.Signature.f25208e.purchase();
            return;
        }
        InterfaceC1036e purchase = c13915e.f27612e.Signature.purchase();
        if (purchase == null || (c10324e = ((C12570e) purchase).f25208e) == null) {
            return;
        }
        c10324e.purchase();
    }

    @Override // defpackage.InterfaceC13158e
    public final InterfaceC17242e ads(int i, int i2, Map map, Function1 function1) {
        return mo500public(i, i2, map, null, function1);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: const */
    public final int mo491const(long j) {
        return Math.round(mo495e(j));
    }

    /* renamed from: continue */
    public abstract C13915e mo1461continue();

    @Override // defpackage.InterfaceC14388e
    /* renamed from: default */
    public final long mo492default(float f) {
        return AbstractC4653e.purchase(this, mo498new(f));
    }

    /* renamed from: else, reason: not valid java name */
    public final void m2536else(InterfaceC17242e interfaceC17242e) {
        long j;
        long j2;
        C0583e c0583e = this.f18512e;
        if (!this.f18514e) {
            Function1 license = interfaceC17242e.license();
            if (license != null) {
                boolean z = this.f18516e != license;
                if (z || !m2538e().f8014e) {
                    j = 0;
                    j2 = 9223372034707292159L;
                } else {
                    InterfaceC0043e mo1472volatile = mo1472volatile();
                    long purchase = AbstractC17324e.purchase(mo1472volatile.Signature(0L));
                    long advert = mo1472volatile.advert();
                    j2 = purchase;
                    j = advert;
                    z = (C11490e.vip(purchase, m2538e().f8012e) && C12729e.vip(advert, m2538e().f8011e)) ? false : true;
                }
                if (z) {
                    C0758e c0758e = this.f18513e;
                    if (c0758e != null) {
                        c0758e.f3051e = interfaceC17242e;
                    } else {
                        c0758e = new C0758e(interfaceC17242e, this);
                        this.f18513e = c0758e;
                    }
                    m2540return(c0758e, j2, j);
                    this.f18516e = interfaceC17242e.license();
                }
            } else if (c0583e != null) {
                Object[] objArr = c0583e.metrica;
                long[] jArr = c0583e.ad;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j3 = jArr[i];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j3) < 128) {
                                    m2537e((C12618e) objArr[(i << 3) + i3]);
                                }
                                j3 >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                c0583e.ad();
            }
        }
    }

    /* renamed from: eؒۖۗ */
    public abstract void mo1463e();

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘْؖ */
    public final /* synthetic */ int mo493e(float f) {
        return AbstractC4653e.ad(this, f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘؕۥ */
    public final /* synthetic */ long mo494e(long j) {
        return AbstractC4653e.appmetrica(j, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: eؘُٔ, reason: contains not printable characters */
    public final void m2537e(C12618e c12618e) {
        C13915e c13915e;
        Object[] objArr = c12618e.vip;
        long[] jArr = c12618e.ad;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (c13915e = (C13915e) ((C3913e) objArr[(i << 3) + i3]).get()) != null) {
                        if (mo398transient()) {
                            c13915e.m3709final(false);
                        } else {
                            c13915e.m3716new(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: eًًؓ */
    public abstract AbstractC9292e mo1466e();

    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public final C3555e m2538e() {
        C3555e c3555e = this.f18517e;
        if (c3555e != null) {
            return c3555e;
        }
        C3555e c3555e2 = new C3555e(this);
        this.f18517e = c3555e2;
        return c3555e2;
    }

    /* renamed from: eُؚٕ */
    public abstract long mo1467e();

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eٓٛۢ */
    public final /* synthetic */ float mo495e(long j) {
        return AbstractC4653e.license(j, this);
    }

    /* renamed from: eؙٟ٘ */
    public abstract InterfaceC17242e mo1469e();

    @Override // defpackage.InterfaceC14388e
    /* renamed from: final */
    public final float mo496final(int i) {
        return i / vip();
    }

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ float firebase(long j) {
        return AbstractC4653e.vip(j, this);
    }

    /* renamed from: for */
    public abstract boolean mo1470for();

    @Override // defpackage.InterfaceC14388e
    /* renamed from: instanceof */
    public final float mo497instanceof(float f) {
        return vip() * f;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new */
    public final float mo498new(float f) {
        return f / vip();
    }

    @Override // defpackage.InterfaceC6911e
    public final void premium(boolean z) {
        AbstractC9292e mo1466e = mo1466e();
        C13915e mo1461continue = mo1466e != null ? mo1466e.mo1461continue() : null;
        if (AbstractC7890e.billing(mo1461continue, mo1461continue())) {
            this.f18515e = z;
            return;
        }
        if ((mo1461continue != null ? mo1461continue.f27612e.license : 0) != 3) {
            if ((mo1461continue != null ? mo1461continue.f27612e.license : 0) != 4) {
                return;
            }
        }
        this.f18515e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /* renamed from: private, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2539private(defpackage.C13915e r32, defpackage.C9340e r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9292e.m2539private(eِٓؔ, eٌٍّ):void");
    }

    @Override // defpackage.InterfaceC13158e
    /* renamed from: public */
    public final InterfaceC17242e mo500public(int i, int i2, Map map, Function1 function1, Function1 function12) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC14070e.metrica("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C18104e(i, i2, map, function1, function12, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: return, reason: not valid java name */
    public final void m2540return(C0758e c0758e, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        C13915e c13915e;
        boolean z2;
        int i;
        char c2;
        long j6;
        C12618e c12618e;
        C15087e snapshotObserver;
        C0583e c0583e = this.f18512e;
        C17790e c17790e = this.f18509e;
        if (c17790e == null) {
            c17790e = new C17790e(6);
            this.f18509e = c17790e;
        }
        C17790e c17790e2 = c17790e;
        InterfaceC16590e interfaceC16590e = mo1461continue().f27599e;
        if (interfaceC16590e != null && (snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) interfaceC16590e).getSnapshotObserver()) != null) {
            snapshotObserver.ad.metrica(c0758e, C8082e.f16400e, new C14275e(this, j, j2, c0758e));
        }
        boolean mo398transient = mo398transient();
        C12618e c12618e2 = (C12618e) c17790e2.f34878e;
        C12618e c12618e3 = (C12618e) c17790e2.f34883e;
        int i2 = c17790e2.f34880e;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) c17790e2.f34884e)[i3];
            if (b == 3) {
                c12618e3.advert(((C9340e[]) c17790e2.f34879e)[i3]);
            } else if (b != 0 && c0583e != null && (c12618e = (C12618e) c0583e.advert(((C9340e[]) c17790e2.f34879e)[i3])) != null) {
                c12618e2.mopub(c12618e);
            }
        }
        int i4 = c17790e2.f34880e;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) c17790e2.f34884e;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                C9340e[] c9340eArr = (C9340e[]) c17790e2.f34879e;
                c9340eArr[i6 - i5] = c9340eArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = c17790e2.f34880e;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((C9340e[]) c17790e2.f34879e)[i8] = null;
        }
        c17790e2.f34880e -= i5;
        AbstractC9292e mo1466e = mo1466e();
        Object[] objArr = c12618e3.vip;
        long[] jArr = c12618e3.ad;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            C9340e c9340e = (C9340e) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            AbstractC9292e abstractC9292e = mo1466e == null ? this : mo1466e;
                            i = i9;
                            AbstractC9292e abstractC9292e2 = abstractC9292e;
                            while (true) {
                                C17790e c17790e3 = abstractC9292e2.f18509e;
                                if (c17790e3 != null) {
                                    z2 = mo398transient;
                                    if (AbstractC1660e.yandex(c9340e, (C9340e[]) c17790e3.f34879e)) {
                                        break;
                                    }
                                } else {
                                    z2 = mo398transient;
                                }
                                AbstractC9292e mo1466e2 = abstractC9292e2.mo1466e();
                                if (mo1466e2 == null) {
                                    break;
                                }
                                abstractC9292e2 = mo1466e2;
                                mo398transient = z2;
                            }
                            C0583e c0583e2 = abstractC9292e2.f18512e;
                            C12618e c12618e4 = c0583e2 != null ? (C12618e) c0583e2.advert(c9340e) : null;
                            if (c12618e4 != null) {
                                abstractC9292e.m2537e(c12618e4);
                            }
                        } else {
                            z2 = mo398transient;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        mo398transient = z2;
                    }
                    z = mo398transient;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = mo398transient;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                mo398transient = z;
                i9 = 8;
            }
        } else {
            z = mo398transient;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        c12618e3.vip();
        Object[] objArr2 = c12618e2.vip;
        long[] jArr2 = c12618e2.ad;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (c13915e = (C13915e) ((C3913e) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                c13915e.m3709final(false);
                            } else {
                                c13915e.m3716new(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        c12618e2.vip();
    }

    /* renamed from: static */
    public abstract int mo2528static(AbstractC17016e abstractC17016e);

    /* renamed from: switch */
    public abstract AbstractC9292e mo1471switch();

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ long tapsense(long j) {
        return AbstractC4653e.metrica(j, this);
    }

    /* renamed from: transient */
    public boolean mo398transient() {
        return false;
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: try */
    public final int mo393try(AbstractC17016e abstractC17016e) {
        int mo2528static;
        if (mo1470for() && (mo2528static = mo2528static(abstractC17016e)) != Integer.MIN_VALUE) {
            return mo2528static + ((int) (abstractC17016e instanceof C12800e ? this.f6802e >> 32 : this.f6802e & 4294967295L));
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: volatile */
    public abstract InterfaceC0043e mo1472volatile();
}
