package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۢۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12832e extends AbstractC11069e {
    public final C5363e signatures;

    public C12832e(InterfaceC7227e interfaceC7227e) {
        super(3, interfaceC7227e, 2, null);
        this.signatures = new C5363e(new C18420e(0));
    }

    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C3487e c3487e = (C3487e) obj;
        c17790e.m4424case(c3487e.ad());
        boolean z = c3487e.f7757e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.adcel(c17790e, 13, Boolean.valueOf(z));
        }
        int i = c3487e.f7756e;
        C14808e c14808e2 = AbstractC11069e.billing;
        if (i != 0) {
            c14808e2.adcel(c17790e, 12, Integer.valueOf(i));
        }
        ((AbstractC11069e) this.signatures.getValue()).adcel(c17790e, 11, c3487e.f7758e);
        boolean z2 = c3487e.f7753e;
        if (z2) {
            c14808e.adcel(c17790e, 10, Boolean.valueOf(z2));
        }
        boolean z3 = c3487e.f7754e;
        if (z3) {
            c14808e.adcel(c17790e, 9, Boolean.valueOf(z3));
        }
        boolean z4 = c3487e.f7760e;
        if (z4) {
            c14808e.adcel(c17790e, 8, Boolean.valueOf(z4));
        }
        boolean z5 = c3487e.f7755e;
        if (z5) {
            c14808e.adcel(c17790e, 7, Boolean.valueOf(z5));
        }
        int i2 = c3487e.f7762e;
        if (i2 != 0) {
            c14808e2.adcel(c17790e, 6, Integer.valueOf(i2));
        }
        int i3 = c3487e.f7759e;
        if (i3 != 0) {
            c14808e2.adcel(c17790e, 5, Integer.valueOf(i3));
        }
        int i4 = c3487e.f7763e;
        if (i4 != 0) {
            c14808e2.adcel(c17790e, 4, Integer.valueOf(i4));
        }
        int i5 = c3487e.f7764e;
        if (i5 != 0) {
            c14808e2.adcel(c17790e, 3, Integer.valueOf(i5));
        }
        int i6 = c3487e.f7752e;
        if (i6 != 0) {
            c14808e2.adcel(c17790e, 2, Integer.valueOf(i6));
        }
        int i7 = c3487e.f7761e;
        if (i7 != 0) {
            c14808e2.adcel(c17790e, 1, Integer.valueOf(i7));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0026. Please report as an issue. */
    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long license = c17546e.license();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i6 = 0;
        boolean z5 = false;
        int i7 = 0;
        while (true) {
            int billing = c17546e.billing();
            int i8 = i;
            if (billing == -1) {
                return new C3487e(i7, i8, i2, i3, i4, i5, z, z2, z3, z4, linkedHashMap, i6, z5, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.purchase;
            C14808e c14808e2 = AbstractC11069e.billing;
            switch (billing) {
                case 1:
                    c14808e2.getClass();
                    i7 = c17546e.amazon();
                    i = i8;
                    break;
                case 2:
                    c14808e2.getClass();
                    i = c17546e.amazon();
                    break;
                case 3:
                    c14808e2.getClass();
                    i2 = c17546e.amazon();
                    i = i8;
                    break;
                case 4:
                    c14808e2.getClass();
                    i3 = c17546e.amazon();
                    i = i8;
                    break;
                case 5:
                    c14808e2.getClass();
                    i4 = c17546e.amazon();
                    i = i8;
                    break;
                case 6:
                    c14808e2.getClass();
                    i5 = c17546e.amazon();
                    i = i8;
                    break;
                case 7:
                    z = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    i = i8;
                    break;
                case 8:
                    z2 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    i = i8;
                    break;
                case 9:
                    z3 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    i = i8;
                    break;
                case 10:
                    z4 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    i = i8;
                    break;
                case 11:
                    linkedHashMap.putAll((Map) ((AbstractC11069e) this.signatures.getValue()).metrica(c17546e));
                    i = i8;
                    break;
                case 12:
                    c14808e2.getClass();
                    i6 = c17546e.amazon();
                    i = i8;
                    break;
                case 13:
                    z5 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    i = i8;
                    break;
                default:
                    c17546e.smaato(billing);
                    i = i8;
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C3487e c3487e = (C3487e) obj;
        int license = c3487e.ad().license();
        int i = c3487e.f7761e;
        C14808e c14808e = AbstractC11069e.billing;
        if (i != 0) {
            license = AbstractC8647e.signatures(i, c14808e, 1, license);
        }
        int i2 = c3487e.f7752e;
        if (i2 != 0) {
            license = AbstractC8647e.signatures(i2, c14808e, 2, license);
        }
        int i3 = c3487e.f7764e;
        if (i3 != 0) {
            license = AbstractC8647e.signatures(i3, c14808e, 3, license);
        }
        int i4 = c3487e.f7763e;
        if (i4 != 0) {
            license = AbstractC8647e.signatures(i4, c14808e, 4, license);
        }
        int i5 = c3487e.f7759e;
        if (i5 != 0) {
            license = AbstractC8647e.signatures(i5, c14808e, 5, license);
        }
        int i6 = c3487e.f7762e;
        if (i6 != 0) {
            license = AbstractC8647e.signatures(i6, c14808e, 6, license);
        }
        boolean z = c3487e.f7755e;
        C14808e c14808e2 = AbstractC11069e.purchase;
        if (z) {
            license = AbstractC8647e.tapsense(z, c14808e2, 7, license);
        }
        boolean z2 = c3487e.f7760e;
        if (z2) {
            license = AbstractC8647e.tapsense(z2, c14808e2, 8, license);
        }
        boolean z3 = c3487e.f7754e;
        if (z3) {
            license = AbstractC8647e.tapsense(z3, c14808e2, 9, license);
        }
        boolean z4 = c3487e.f7753e;
        if (z4) {
            license = AbstractC8647e.tapsense(z4, c14808e2, 10, license);
        }
        int advert = ((AbstractC11069e) this.signatures.getValue()).advert(11, c3487e.f7758e) + license;
        int i7 = c3487e.f7756e;
        if (i7 != 0) {
            advert = AbstractC8647e.signatures(i7, c14808e, 12, advert);
        }
        boolean z5 = c3487e.f7757e;
        return z5 ? AbstractC8647e.tapsense(z5, c14808e2, 13, advert) : advert;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C3487e c3487e = (C3487e) obj;
        int i = c3487e.f7761e;
        C14808e c14808e = AbstractC11069e.billing;
        if (i != 0) {
            c14808e.startapp(c0444e, 1, Integer.valueOf(i));
        }
        int i2 = c3487e.f7752e;
        if (i2 != 0) {
            c14808e.startapp(c0444e, 2, Integer.valueOf(i2));
        }
        int i3 = c3487e.f7764e;
        if (i3 != 0) {
            c14808e.startapp(c0444e, 3, Integer.valueOf(i3));
        }
        int i4 = c3487e.f7763e;
        if (i4 != 0) {
            c14808e.startapp(c0444e, 4, Integer.valueOf(i4));
        }
        int i5 = c3487e.f7759e;
        if (i5 != 0) {
            c14808e.startapp(c0444e, 5, Integer.valueOf(i5));
        }
        int i6 = c3487e.f7762e;
        if (i6 != 0) {
            c14808e.startapp(c0444e, 6, Integer.valueOf(i6));
        }
        boolean z = c3487e.f7755e;
        C14808e c14808e2 = AbstractC11069e.purchase;
        if (z) {
            c14808e2.startapp(c0444e, 7, Boolean.valueOf(z));
        }
        boolean z2 = c3487e.f7760e;
        if (z2) {
            c14808e2.startapp(c0444e, 8, Boolean.valueOf(z2));
        }
        boolean z3 = c3487e.f7754e;
        if (z3) {
            c14808e2.startapp(c0444e, 9, Boolean.valueOf(z3));
        }
        boolean z4 = c3487e.f7753e;
        if (z4) {
            c14808e2.startapp(c0444e, 10, Boolean.valueOf(z4));
        }
        ((AbstractC11069e) this.signatures.getValue()).startapp(c0444e, 11, c3487e.f7758e);
        int i7 = c3487e.f7756e;
        if (i7 != 0) {
            c14808e.startapp(c0444e, 12, Integer.valueOf(i7));
        }
        boolean z5 = c3487e.f7757e;
        if (z5) {
            c14808e2.startapp(c0444e, 13, Boolean.valueOf(z5));
        }
        c0444e.m356try(c3487e.ad());
    }
}
