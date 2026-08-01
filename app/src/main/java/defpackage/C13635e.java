package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۦؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13635e extends AbstractC11069e {
    public final C5363e signatures;

    public C13635e(InterfaceC7227e interfaceC7227e) {
        super(3, interfaceC7227e, 2, null);
        this.signatures = new C5363e(new C8462e(23));
    }

    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C6442e c6442e = (C6442e) obj;
        c17790e.m4424case(c6442e.ad());
        ((AbstractC11069e) this.signatures.getValue()).adcel(c17790e, 15, c6442e.f13346e);
        AbstractC11069e.Signature.adcel(c17790e, 14, c6442e.f13340e);
        boolean z = c6442e.f13341e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.adcel(c17790e, 13, Boolean.valueOf(z));
        }
        C8169e c8169e = c6442e.f13343e;
        if (c8169e != null) {
            C8169e.f16630e.adcel(c17790e, 12, c8169e);
        }
        boolean z2 = c6442e.f13342e;
        if (z2) {
            c14808e.adcel(c17790e, 11, Boolean.valueOf(z2));
        }
        C6019e c6019e = c6442e.f13339e;
        if (c6019e != null) {
            C6019e.f12675e.adcel(c17790e, 16, c6019e);
        }
        C6019e c6019e2 = c6442e.f13336e;
        if (c6019e2 != null) {
            C6019e.f12675e.adcel(c17790e, 8, c6019e2);
        }
        C6019e c6019e3 = c6442e.f13337e;
        if (c6019e3 != null) {
            C6019e.f12675e.adcel(c17790e, 7, c6019e3);
        }
        C6019e c6019e4 = c6442e.f13345e;
        if (c6019e4 != null) {
            C6019e.f12675e.adcel(c17790e, 6, c6019e4);
        }
        C10033e.f19834e.adcel(c17790e, 5, c6442e.f13338e);
        C16074e c16074e = c6442e.f13348e;
        if (c16074e != null) {
            C16074e.f31665e.adcel(c17790e, 4, c16074e);
        }
        C7190e c7190e = c6442e.f13344e;
        if (c7190e != null) {
            C7190e.f14693e.adcel(c17790e, 3, c7190e);
        }
        C5267e c5267e = c6442e.f13349e;
        if (c5267e != null) {
            C5267e.f11344e.adcel(c17790e, 2, c5267e);
        }
        boolean z3 = c6442e.f13350e;
        if (z3) {
            c14808e.adcel(c17790e, 10, Boolean.valueOf(z3));
        }
        C16801e c16801e = c6442e.f13335e;
        if (c16801e != null) {
            C16801e.f32936e.adcel(c17790e, 9, c16801e);
        }
        C16801e c16801e2 = c6442e.f13347e;
        if (c16801e2 != null) {
            C16801e.f32936e.adcel(c17790e, 1, c16801e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long license = c17546e.license();
        C5267e c5267e = null;
        C7190e c7190e = null;
        C16074e c16074e = null;
        C10033e c10033e = null;
        C6019e c6019e = null;
        C6019e c6019e2 = null;
        C6019e c6019e3 = null;
        C6019e c6019e4 = null;
        C8169e c8169e = null;
        String str = null;
        C16801e c16801e = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ?? r5 = 0;
        while (true) {
            int billing = c17546e.billing();
            C16801e c16801e2 = r5;
            if (billing == -1) {
                return new C6442e(c16801e, c16801e2, z, c5267e, c7190e, c16074e, c10033e, c6019e, c6019e2, c6019e3, c6019e4, z2, c8169e, z3, str, linkedHashMap, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.purchase;
            switch (billing) {
                case 1:
                    c16801e = C16801e.f32936e.metrica(c17546e);
                    break;
                case 2:
                    c5267e = C5267e.f11344e.metrica(c17546e);
                    break;
                case 3:
                    c7190e = C7190e.f14693e.metrica(c17546e);
                    break;
                case 4:
                    c16074e = C16074e.f31665e.metrica(c17546e);
                    break;
                case 5:
                    c10033e = C10033e.f19834e.metrica(c17546e);
                    break;
                case 6:
                    c6019e = C6019e.f12675e.metrica(c17546e);
                    break;
                case 7:
                    c6019e2 = C6019e.f12675e.metrica(c17546e);
                    break;
                case 8:
                    c6019e3 = C6019e.f12675e.metrica(c17546e);
                    break;
                case 9:
                    r5 = C16801e.f32936e.metrica(c17546e);
                    continue;
                case 10:
                    z = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 11:
                    z2 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 12:
                    c8169e = C8169e.f16630e.metrica(c17546e);
                    break;
                case 13:
                    z3 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 14:
                    AbstractC11069e.Signature.getClass();
                    str = c17546e.advert();
                    break;
                case 15:
                    linkedHashMap.putAll((Map) ((AbstractC11069e) this.signatures.getValue()).metrica(c17546e));
                    break;
                case 16:
                    c6019e4 = C6019e.f12675e.metrica(c17546e);
                    r5 = c16801e2;
                    continue;
                default:
                    c17546e.smaato(billing);
                    break;
            }
            r5 = c16801e2;
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C6442e c6442e = (C6442e) obj;
        int license = c6442e.ad().license();
        C16801e c16801e = c6442e.f13347e;
        if (c16801e != null) {
            license += C16801e.f32936e.advert(1, c16801e);
        }
        C16801e c16801e2 = c6442e.f13335e;
        if (c16801e2 != null) {
            license += C16801e.f32936e.advert(9, c16801e2);
        }
        boolean z = c6442e.f13350e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            license = AbstractC8647e.tapsense(z, c14808e, 10, license);
        }
        C5267e c5267e = c6442e.f13349e;
        if (c5267e != null) {
            license += C5267e.f11344e.advert(2, c5267e);
        }
        C7190e c7190e = c6442e.f13344e;
        if (c7190e != null) {
            license += C7190e.f14693e.advert(3, c7190e);
        }
        C16074e c16074e = c6442e.f13348e;
        if (c16074e != null) {
            license += C16074e.f31665e.advert(4, c16074e);
        }
        int advert = C10033e.f19834e.advert(5, c6442e.f13338e) + license;
        C6019e c6019e = c6442e.f13345e;
        if (c6019e != null) {
            advert += C6019e.f12675e.advert(6, c6019e);
        }
        C6019e c6019e2 = c6442e.f13337e;
        if (c6019e2 != null) {
            advert += C6019e.f12675e.advert(7, c6019e2);
        }
        C6019e c6019e3 = c6442e.f13336e;
        if (c6019e3 != null) {
            advert += C6019e.f12675e.advert(8, c6019e3);
        }
        C6019e c6019e4 = c6442e.f13339e;
        if (c6019e4 != null) {
            advert += C6019e.f12675e.advert(16, c6019e4);
        }
        boolean z2 = c6442e.f13342e;
        if (z2) {
            advert = AbstractC8647e.tapsense(z2, c14808e, 11, advert);
        }
        C8169e c8169e = c6442e.f13343e;
        if (c8169e != null) {
            advert += C8169e.f16630e.advert(12, c8169e);
        }
        boolean z3 = c6442e.f13341e;
        if (z3) {
            advert = AbstractC8647e.tapsense(z3, c14808e, 13, advert);
        }
        return ((AbstractC11069e) this.signatures.getValue()).advert(15, c6442e.f13346e) + AbstractC11069e.Signature.advert(14, c6442e.f13340e) + advert;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C6442e c6442e = (C6442e) obj;
        C16801e c16801e = c6442e.f13347e;
        if (c16801e != null) {
            C16801e.f32936e.startapp(c0444e, 1, c16801e);
        }
        C16801e c16801e2 = c6442e.f13335e;
        if (c16801e2 != null) {
            C16801e.f32936e.startapp(c0444e, 9, c16801e2);
        }
        boolean z = c6442e.f13350e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.startapp(c0444e, 10, Boolean.valueOf(z));
        }
        C5267e c5267e = c6442e.f13349e;
        if (c5267e != null) {
            C5267e.f11344e.startapp(c0444e, 2, c5267e);
        }
        C7190e c7190e = c6442e.f13344e;
        if (c7190e != null) {
            C7190e.f14693e.startapp(c0444e, 3, c7190e);
        }
        C16074e c16074e = c6442e.f13348e;
        if (c16074e != null) {
            C16074e.f31665e.startapp(c0444e, 4, c16074e);
        }
        C10033e.f19834e.startapp(c0444e, 5, c6442e.f13338e);
        C6019e c6019e = c6442e.f13345e;
        if (c6019e != null) {
            C6019e.f12675e.startapp(c0444e, 6, c6019e);
        }
        C6019e c6019e2 = c6442e.f13337e;
        if (c6019e2 != null) {
            C6019e.f12675e.startapp(c0444e, 7, c6019e2);
        }
        C6019e c6019e3 = c6442e.f13336e;
        if (c6019e3 != null) {
            C6019e.f12675e.startapp(c0444e, 8, c6019e3);
        }
        C6019e c6019e4 = c6442e.f13339e;
        if (c6019e4 != null) {
            C6019e.f12675e.startapp(c0444e, 16, c6019e4);
        }
        boolean z2 = c6442e.f13342e;
        if (z2) {
            c14808e.startapp(c0444e, 11, Boolean.valueOf(z2));
        }
        C8169e c8169e = c6442e.f13343e;
        if (c8169e != null) {
            C8169e.f16630e.startapp(c0444e, 12, c8169e);
        }
        boolean z3 = c6442e.f13341e;
        if (z3) {
            c14808e.startapp(c0444e, 13, Boolean.valueOf(z3));
        }
        AbstractC11069e.Signature.startapp(c0444e, 14, c6442e.f13340e);
        ((AbstractC11069e) this.signatures.getValue()).startapp(c0444e, 15, c6442e.f13346e);
        c0444e.m356try(c6442e.ad());
    }
}
