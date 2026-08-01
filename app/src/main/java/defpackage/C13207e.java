package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13207e {
    public final LinkedHashMap ad;

    public C13207e(int i) {
        switch (i) {
            case 1:
                this.ad = new LinkedHashMap(0, 0.75f, true);
                return;
            default:
                this.ad = new LinkedHashMap();
                return;
        }
    }

    public void ad(C13000e c13000e) {
        long[] jArr = c13000e.appmetrica;
        if (jArr.length > 0) {
            Long valueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.ad;
            if (linkedHashMap.containsKey(valueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(c13000e.appmetrica[0]), c13000e);
        }
    }
}
