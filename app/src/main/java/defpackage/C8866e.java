package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٞۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8866e {
    public static final C15768e vip = C15768e.ad(new byte[0]);
    public final HashMap ad;

    public C8866e(HashMap hashMap) {
        this.ad = hashMap;
    }

    public final Iterable ad(byte[] bArr) {
        List list;
        C15768e c15768e = vip;
        HashMap hashMap = this.ad;
        List list2 = (List) hashMap.get(c15768e);
        if (bArr.length >= 5) {
            list = (List) hashMap.get(new C15768e(5 > bArr.length ? bArr.length : 5, bArr));
        } else {
            list = null;
        }
        return (list2 == null && list == null) ? new ArrayList() : list2 == null ? list : list == null ? list2 : new C10829e(list, list2);
    }
}
