package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16170e {
    public final C12383e ad;
    public C18217e advert;
    public C2548e amazon;
    public boolean billing;
    public C8823e license;
    public C12332e loadAd;
    public C6510e smaato;
    public final InterfaceC11623e vip;
    public final Object metrica = new Object();
    public final C11498e appmetrica = AbstractC14430e.license(0);
    public final C12718e purchase = new C12718e();
    public final LinkedHashMap yandex = new LinkedHashMap();
    public final LinkedHashMap startapp = new LinkedHashMap();
    public final LinkedHashSet adcel = new LinkedHashSet();
    public final LinkedHashSet mopub = new LinkedHashSet();
    public final C17735e Signature = new C17735e(1, this);
    public final C11498e admob = AbstractC14430e.license(0);

    public C16170e(C12383e c12383e, InterfaceC11623e interfaceC11623e) {
        this.ad = c12383e;
        this.vip = interfaceC11623e;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r5v1, types: [eّؖٝ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.AbstractC10731e r17) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16170e.ad(eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r13v2, types: [eّؖٝ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(java.util.LinkedHashMap r8, java.util.Map r9, java.util.Set r10, defpackage.C18217e r11, java.util.Set r12, defpackage.AbstractC10731e r13) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16170e.metrica(java.util.LinkedHashMap, java.util.Map, java.util.Set, eٛۢ, java.util.Set, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vip(C15154e c15154e, Map map) {
        C6510e c6510e;
        C2548e c2548e;
        Object obj;
        C12332e c12332e = null;
        Object obj2 = map != null ? map.get(CaptureRequest.CONTROL_AE_MODE) : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num != null) {
            int intValue = num.intValue();
            List list = C6510e.vip;
            c6510e = AbstractC12797e.advert(intValue);
        } else {
            c6510e = null;
        }
        Object obj3 = map != null ? map.get(CaptureRequest.CONTROL_AF_MODE) : null;
        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            Iterator it = C2548e.vip.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((C2548e) obj).ad == intValue2) {
                        break;
                    }
                }
            }
            c2548e = (C2548e) obj;
        } else {
            c2548e = null;
        }
        Object obj4 = map != null ? map.get(CaptureRequest.CONTROL_AWB_MODE) : null;
        Integer num3 = obj4 instanceof Integer ? (Integer) obj4 : null;
        if (num3 != null) {
            int intValue3 = num3.intValue();
            Iterator it2 = C12332e.vip.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((C12332e) next).ad == intValue3) {
                    c12332e = next;
                    break;
                }
            }
            c12332e = c12332e;
        }
        C12332e c12332e2 = c12332e;
        boolean z = false;
        boolean z2 = (c6510e == null || c6510e.equals(this.smaato)) ? false : true;
        boolean z3 = (c2548e == null || c2548e.equals(this.amazon)) ? false : true;
        if (c12332e2 != null && !c12332e2.equals(this.loadAd)) {
            z = true;
        }
        if (z2 || z3 || z) {
            if (AbstractC9464e.smaato("CXCP")) {
                Log.d("CXCP", "UseCaseCameraState: Updating 3A modes: AE(" + c6510e + ", changed=" + z2 + "), AF(" + c2548e + ", changed=" + z3 + "), AWB(" + c12332e2 + ", changed=" + z + ')');
            }
            AbstractC17861e.firebase(c15154e, c6510e, c2548e, c12332e2, null, null, null, 56);
            if (c6510e != null) {
                this.smaato = c6510e;
            }
            if (c2548e != null) {
                this.amazon = c2548e;
            }
            if (c12332e2 != null) {
                this.loadAd = c12332e2;
            }
        }
    }
}
