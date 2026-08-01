package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5149e extends AbstractC11069e {
    public final /* synthetic */ int signatures;
    public final AbstractC11069e tapsense;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5149e(AbstractC11069e abstractC11069e, int i) {
        super(3, AbstractC3820e.ad.vip(int[].class), abstractC11069e.appmetrica, new int[0], 32);
        this.signatures = i;
        switch (i) {
            case 1:
                super(3, AbstractC3820e.ad.vip(long[].class), abstractC11069e.appmetrica, new long[0], 32);
                this.tapsense = abstractC11069e;
                return;
            default:
                this.tapsense = abstractC11069e;
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5149e(AbstractC11069e abstractC11069e, InterfaceC7227e interfaceC7227e, Object obj) {
        super(3, interfaceC7227e, 2, obj, 32);
        this.signatures = 2;
        this.tapsense = abstractC11069e;
    }

    @Override // defpackage.AbstractC11069e
    public void adcel(C17790e c17790e, int i, Object obj) {
        switch (this.signatures) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr == null || iArr.length == 0) {
                    return;
                }
                super.adcel(c17790e, i, iArr);
                return;
            case 1:
                long[] jArr = (long[]) obj;
                if (jArr == null || jArr.length == 0) {
                    return;
                }
                super.adcel(c17790e, i, jArr);
                return;
            default:
                super.adcel(c17790e, i, obj);
                return;
        }
    }

    @Override // defpackage.AbstractC11069e
    public int advert(int i, Object obj) {
        switch (this.signatures) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr == null || iArr.length == 0) {
                    return 0;
                }
                return super.advert(i, iArr);
            case 1:
                long[] jArr = (long[]) obj;
                if (jArr == null || jArr.length == 0) {
                    return 0;
                }
                return super.advert(i, jArr);
            default:
                return super.advert(i, obj);
        }
    }

    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        switch (this.signatures) {
            case 0:
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (true) {
                    length--;
                    if (-1 >= length) {
                        return;
                    }
                    this.tapsense.billing(c17790e, Integer.valueOf(iArr[length]));
                }
            case 1:
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (true) {
                    length2--;
                    if (-1 >= length2) {
                        return;
                    }
                    this.tapsense.billing(c17790e, Long.valueOf(jArr[length2]));
                }
            default:
                if (obj != null) {
                    AbstractC11069e abstractC11069e = this.tapsense;
                    if (obj.equals(abstractC11069e.vip)) {
                        return;
                    }
                    abstractC11069e.adcel(c17790e, 1, obj);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        int i = this.signatures;
        AbstractC11069e abstractC11069e = this.tapsense;
        switch (i) {
            case 0:
                return new int[]{((Number) abstractC11069e.metrica(c17546e)).intValue()};
            case 1:
                return new long[]{((Number) abstractC11069e.metrica(c17546e)).longValue()};
            default:
                Object obj = abstractC11069e.vip;
                long license = c17546e.license();
                while (true) {
                    int billing = c17546e.billing();
                    if (billing == -1) {
                        c17546e.appmetrica(license);
                        return obj;
                    }
                    if (billing == 1) {
                        obj = abstractC11069e.metrica(c17546e);
                    } else {
                        c17546e.smaato(billing);
                    }
                }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        switch (this.signatures) {
            case 0:
                int i = 0;
                for (int i2 : (int[]) obj) {
                    i += this.tapsense.mopub(Integer.valueOf(i2));
                }
                return i;
            case 1:
                int i3 = 0;
                for (long j : (long[]) obj) {
                    i3 += this.tapsense.mopub(Long.valueOf(j));
                }
                return i3;
            default:
                if (obj != null) {
                    AbstractC11069e abstractC11069e = this.tapsense;
                    if (!obj.equals(abstractC11069e.vip)) {
                        return abstractC11069e.advert(1, obj);
                    }
                }
                return 0;
        }
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        switch (this.signatures) {
            case 0:
                for (int i : (int[]) obj) {
                    this.tapsense.purchase(c0444e, Integer.valueOf(i));
                }
                return;
            case 1:
                for (long j : (long[]) obj) {
                    this.tapsense.purchase(c0444e, Long.valueOf(j));
                }
                return;
            default:
                if (obj != null) {
                    AbstractC11069e abstractC11069e = this.tapsense;
                    if (obj.equals(abstractC11069e.vip)) {
                        return;
                    }
                    abstractC11069e.startapp(c0444e, 1, obj);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.AbstractC11069e
    public void startapp(C0444e c0444e, int i, Object obj) {
        switch (this.signatures) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr == null || iArr.length == 0) {
                    return;
                }
                super.startapp(c0444e, i, iArr);
                return;
            case 1:
                long[] jArr = (long[]) obj;
                if (jArr == null || jArr.length == 0) {
                    return;
                }
                super.startapp(c0444e, i, jArr);
                return;
            default:
                super.startapp(c0444e, i, obj);
                return;
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object vip(C17582e c17582e) {
        int i = this.signatures;
        AbstractC11069e abstractC11069e = this.tapsense;
        switch (i) {
            case 0:
                return new int[]{((Number) abstractC11069e.vip(c17582e)).intValue()};
            case 1:
                return new long[]{((Number) abstractC11069e.vip(c17582e)).longValue()};
            default:
                Object obj = abstractC11069e.vip;
                int metrica = c17582e.metrica();
                while (true) {
                    int purchase = c17582e.purchase();
                    if (purchase == -1) {
                        c17582e.license(metrica);
                        return obj;
                    }
                    if (purchase == 1) {
                        obj = abstractC11069e.vip(c17582e);
                    } else {
                        c17582e.advert(purchase);
                    }
                }
        }
    }
}
