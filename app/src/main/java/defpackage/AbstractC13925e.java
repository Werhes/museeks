package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٟٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13925e {
    public static final LinkedHashMap ad(List list) {
        if (list == null) {
            return new LinkedHashMap();
        }
        int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(list, 10));
        if (appmetrica < 16) {
            appmetrica = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica);
        for (Object obj : list) {
            linkedHashMap.put(((InterfaceC15377e) obj).getAd(), obj);
        }
        return new LinkedHashMap(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x006d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List, java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List vip(java.util.List r8) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13925e.vip(java.util.List):java.util.List");
    }
}
