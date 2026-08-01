package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13713e implements InterfaceC10481e {
    public static final C11883e inmobi = AbstractC9743e.startapp(new C17187e(19), new C8436e(0, 27));
    public int Signature;
    public boolean ad;
    public final C0571e adcel;
    public final C3123e admob;
    public final boolean advert;
    public final C18237e amazon;
    public final Csuper appmetrica;
    public final C0576e billing;
    public final C10312e isVip;
    public final C0576e license;
    public float loadAd;
    public final C2254e metrica;
    public final C6594e mopub;
    public final C2245e pro;
    public final C0576e purchase;
    public final C4695e remoteconfig;
    public final InterfaceC3314e signatures;
    public final C7513e smaato;
    public final C6827e startapp;
    public final C15274e subscription;
    public final InterfaceC3314e tapsense;
    public C8076e vip;
    public C13915e yandex;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؓۧ۠, java.lang.Object] */
    public C13713e(int[] iArr, int[] iArr2) {
        Integer valueOf;
        C14874e c14874e = new C14874e(2, this, C13713e.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0, 0, 7);
        ?? obj = new Object();
        obj.f5736e = c14874e;
        obj.f5732e = iArr;
        obj.f5739e = new C16330e(C2254e.ad(iArr));
        obj.f5737e = iArr2;
        obj.f5733e = new C16330e(C2254e.vip(iArr, iArr2));
        if (iArr.length == 0) {
            valueOf = null;
        } else {
            int i = iArr[0];
            int length = iArr.length - 1;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    int i3 = iArr[i2];
                    i = i > i3 ? i3 : i;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            valueOf = Integer.valueOf(i);
        }
        obj.f5735e = new C0705e(valueOf != null ? valueOf.intValue() : 0, 90, 200);
        this.metrica = obj;
        this.license = new C0576e(AbstractC3725e.ad, C10990e.f21771e);
        this.appmetrica = new Csuper((byte) 0, 15);
        Boolean bool = Boolean.FALSE;
        this.purchase = AbstractC14533e.startapp(bool);
        this.billing = AbstractC14533e.startapp(bool);
        this.startapp = new C6827e(this, 2);
        this.adcel = new C0571e();
        this.mopub = new C6594e(17);
        this.advert = true;
        this.smaato = new C7513e(null);
        this.amazon = new C18237e(new C2109e(27, this));
        this.Signature = -1;
        C3123e c3123e = AbstractC12146e.ad;
        this.admob = new C3123e();
        this.subscription = new C15274e();
        this.remoteconfig = new C4695e();
        this.pro = new C2245e();
        this.signatures = AbstractC8508e.vip();
        this.tapsense = AbstractC8508e.vip();
        this.isVip = new C10312e(1);
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean ad() {
        return this.amazon.ad();
    }

    @Override // defpackage.InterfaceC10481e
    public final float appmetrica(float f) {
        return this.amazon.appmetrica(f);
    }

    public final C8076e billing() {
        return (C8076e) this.license.getValue();
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean license() {
        return ((Boolean) this.purchase.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean metrica() {
        return ((Boolean) this.billing.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final void purchase(C8076e c8076e, boolean z, boolean z2) {
        Object obj;
        AbstractC13717e adcel;
        Function1 appmetrica;
        AbstractC13717e smaato;
        C10312e c10312e = this.isVip;
        C2254e c2254e = this.metrica;
        if (!z && this.ad) {
            this.vip = c8076e;
            adcel = AbstractC12640e.adcel();
            appmetrica = adcel != null ? adcel.appmetrica() : null;
            smaato = AbstractC12640e.smaato(adcel);
            try {
                if (c10312e.isVip() && Arrays.equals(c8076e.ad, (int[]) c2254e.f5732e) && Arrays.equals(c8076e.vip, (int[]) c2254e.f5737e)) {
                    c10312e.firebase();
                }
                Unit unit = Unit.INSTANCE;
                return;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.ad = true;
        }
        float f = this.loadAd;
        float f2 = c8076e.metrica;
        ?? r8 = c8076e.smaato;
        int[] iArr = c8076e.ad;
        int[] iArr2 = c8076e.vip;
        this.loadAd = f - f2;
        this.license.setValue(c8076e);
        if (z2) {
            c2254e.f5737e = iArr2;
            ((C16330e) c2254e.f5733e).startapp(C2254e.vip((int[]) c2254e.f5732e, iArr2));
        } else {
            c2254e.getClass();
            int ad = C2254e.ad(iArr);
            int size = r8.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = r8.get(i);
                if (((C13668e) obj).ad == ad) {
                    break;
                } else {
                    i++;
                }
            }
            C13668e c13668e = (C13668e) obj;
            c2254e.f5738e = c13668e != null ? c13668e.vip : null;
            ((C0705e) c2254e.f5735e).metrica(ad);
            if (c2254e.f5734e || c8076e.advert > 0) {
                c2254e.f5734e = true;
                adcel = AbstractC12640e.adcel();
                appmetrica = adcel != null ? adcel.appmetrica() : null;
                smaato = AbstractC12640e.smaato(adcel);
                try {
                    c2254e.f5732e = iArr;
                    ((C16330e) c2254e.f5739e).startapp(C2254e.ad(iArr));
                    c2254e.f5737e = iArr2;
                    ((C16330e) c2254e.f5733e).startapp(C2254e.vip(iArr, iArr2));
                    Unit unit2 = Unit.INSTANCE;
                } finally {
                    AbstractC12640e.Signature(adcel, smaato, appmetrica);
                }
            }
            if (this.Signature != -1 && !r8.isEmpty()) {
                int i2 = ((C13668e) AbstractC13480e.m3591interface(r8)).ad;
                int i3 = ((C13668e) AbstractC13480e.m3570break(r8)).ad;
                int i4 = this.Signature;
                if (i2 > i4 || i4 > i3) {
                    this.Signature = -1;
                    C3123e c3123e = this.admob;
                    Object[] objArr = c3123e.metrica;
                    long[] jArr = c3123e.ad;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((j & 255) < 128) {
                                        ((InterfaceC5066e) objArr[(i5 << 3) + i7]).cancel();
                                    }
                                    j >>= 8;
                                }
                                if (i6 != 8) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    c3123e.metrica();
                }
            }
        }
        this.billing.setValue(Boolean.valueOf(iArr[0] != 0 || iArr2[0] > 0));
        this.purchase.setValue(Boolean.valueOf(c8076e.purchase));
        if (z) {
            c10312e.m2794class(c8076e.appmetrica, c8076e.mopub, c8076e.pro);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r5.amazon.vip(r6, r7, r0) != r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r5.adcel.adcel(r0) == r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.InterfaceC10481e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(defpackage.EnumC6955e r6, kotlin.jvm.functions.Function2 r7, defpackage.InterfaceC5083e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.C11543e
            if (r0 == 0) goto L13
            r0 = r8
            eِؗٗ r0 = (defpackage.C11543e) r0
            int r1 = r0.f23181e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23181e = r1
            goto L18
        L13:
            eِؗٗ r0 = new eِؗٗ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f23184e
            int r1 = r0.f23181e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r8)
            goto L6c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            eؚٖؓ r6 = r0.f23180e
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            eؚؗۨ r6 = r0.f23182e
            defpackage.AbstractC2003e.purchase(r8)
            goto L5c
        L3d:
            defpackage.AbstractC2003e.purchase(r8)
            eؑۜٝ r8 = r5.license
            java.lang.Object r8 = r8.getValue()
            eًًٝ r1 = defpackage.AbstractC3725e.ad
            if (r8 != r1) goto L5c
            r0.f23182e = r6
            r8 = r7
            eؚٖؓ r8 = (defpackage.AbstractC7185e) r8
            r0.f23180e = r8
            r0.f23181e = r3
            eّؑۜ r8 = r5.adcel
            java.lang.Object r8 = r8.adcel(r0)
            if (r8 != r4) goto L5c
            goto L6b
        L5c:
            r8 = 0
            r0.f23182e = r8
            r0.f23180e = r8
            r0.f23181e = r2
            eٝؒ r8 = r5.amazon
            java.lang.Object r6 = r8.vip(r6, r7, r0)
            if (r6 != r4) goto L6c
        L6b:
            return r4
        L6c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13713e.vip(eؚؗۨ, kotlin.jvm.functions.Function2, eًؗۖ):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final void yandex(float f, C8076e c8076e) {
        C3123e c3123e;
        int pro;
        int i;
        long yandex;
        if (!this.advert) {
            return;
        }
        ?? r2 = c8076e.smaato;
        if (r2.isEmpty()) {
            return;
        }
        boolean z = f < 0.0f;
        int i2 = z ? ((C13668e) AbstractC13480e.m3570break(r2)).ad : ((C13668e) AbstractC13480e.m3591interface(r2)).ad;
        if (i2 == this.Signature) {
            return;
        }
        this.Signature = i2;
        int[] iArr = AbstractC3864e.ad;
        C16399e c16399e = new C16399e();
        C0085e c0085e = c8076e.startapp;
        int[] iArr2 = c0085e.vip;
        int length = iArr2.length;
        int i3 = 0;
        while (true) {
            c3123e = this.admob;
            if (i3 >= length) {
                break;
            }
            Csuper csuper = this.appmetrica;
            if (z) {
                pro = i2 + 1;
                int length2 = csuper.f36470e + ((int[]) csuper.f36469e).length;
                while (true) {
                    if (pro >= length2) {
                        pro = csuper.f36470e + ((int[]) csuper.f36469e).length;
                        break;
                    } else if (csuper.startapp(pro, i3)) {
                        break;
                    } else {
                        pro++;
                    }
                }
            } else {
                pro = csuper.pro(i2, i3);
            }
            int i4 = pro;
            if (i4 < 0 || i4 >= c8076e.advert || c16399e.metrica(i4)) {
                break;
            }
            c16399e.vip[c16399e.license(i4)] = i4;
            if (!c3123e.ad(i4)) {
                boolean m351interface = c8076e.adcel.m351interface(i4);
                int i5 = m351interface ? 0 : i3;
                int i6 = m351interface ? length : 1;
                if (i6 == 1) {
                    i = iArr2[i5];
                } else {
                    int[] iArr3 = c0085e.ad;
                    int i7 = iArr3[i5];
                    int i8 = (i5 + i6) - 1;
                    i = (iArr3[i8] + iArr2[i8]) - i7;
                }
                if (c8076e.signatures == EnumC17426e.f34146e) {
                    if (i < 0) {
                        AbstractC15805e.ad("width must be >= 0");
                    }
                    yandex = AbstractC2278e.yandex(i, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
                } else {
                    if (i < 0) {
                        AbstractC15805e.ad("height must be >= 0");
                    }
                    yandex = AbstractC2278e.yandex(0, Alert.DURATION_SHOW_INDEFINITELY, i, i);
                }
                c3123e.startapp(i4, this.smaato.ad(i4, yandex, true, null));
            }
            i3++;
            i2 = i4;
        }
        long[] jArr = c3123e.ad;
        int length3 = jArr.length - 2;
        if (length3 < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j = jArr[i9];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length3)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i9 << 3) + i11;
                        int i13 = c3123e.vip[i12];
                        InterfaceC5066e interfaceC5066e = (InterfaceC5066e) c3123e.metrica[i12];
                        boolean metrica = c16399e.metrica(i13);
                        if (!metrica) {
                            interfaceC5066e.cancel();
                        }
                        if (!metrica) {
                            c3123e.yandex(i12);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length3) {
                return;
            } else {
                i9++;
            }
        }
    }
}
