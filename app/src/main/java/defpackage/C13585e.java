package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۢۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13585e {
    public final C7744e ad = AbstractC14430e.appmetrica(new C15952e(null, null, null, null, null, null, null, null, null, null));

    /* JADX WARN: Code restructure failed: missing block: B:53:0x009a, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed A[LOOP:0: B:33:0x0057->B:70:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vip(defpackage.C13585e r18, defpackage.C6510e r19, defpackage.C2548e r20, defpackage.C12332e r21, defpackage.C13743e r22, java.util.List r23, java.util.List r24, java.util.List r25, java.lang.Boolean r26, java.lang.Boolean r27, java.lang.Boolean r28, int r29) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13585e.vip(eْۢۦ, eؙؙٜ, eٍْؔ, eؚّٜ, eّٓؔ, java.util.List, java.util.List, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int):void");
    }

    public final LinkedHashMap ad() {
        C15952e c15952e = (C15952e) this.ad.ad;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C6510e c6510e = c15952e.ad;
        if (c6510e != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(c6510e.ad));
        }
        C2548e c2548e = c15952e.vip;
        if (c2548e != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(c2548e.ad));
        }
        C12332e c12332e = c15952e.metrica;
        if (c12332e != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(c12332e.ad));
        }
        C13743e c13743e = c15952e.license;
        if (c13743e != null) {
            linkedHashMap.put(CaptureRequest.FLASH_MODE, Integer.valueOf(c13743e.ad));
        }
        List list = c15952e.appmetrica;
        if (list != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_REGIONS, list.toArray(new MeteringRectangle[0]));
        }
        List list2 = c15952e.purchase;
        if (list2 != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AF_REGIONS, list2.toArray(new MeteringRectangle[0]));
        }
        List list3 = c15952e.billing;
        if (list3 != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_REGIONS, list3.toArray(new MeteringRectangle[0]));
        }
        Boolean bool = c15952e.yandex;
        if (bool != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_LOCK, bool);
        }
        Boolean bool2 = c15952e.adcel;
        if (bool2 != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_LOCK, bool2);
        }
        return linkedHashMap;
    }
}
