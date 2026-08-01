package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۢٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9061e {
    public final LinkedHashMap ad;

    public C9061e() {
        this.ad = new LinkedHashMap();
    }

    public C9061e(C14193e c14193e) {
        this.ad = new LinkedHashMap(c14193e.ad);
    }

    public final void ad(C12916e c12916e, Object obj) {
        LinkedHashMap linkedHashMap = this.ad;
        if (obj != null) {
            linkedHashMap.put(c12916e, obj);
        } else {
            linkedHashMap.remove(c12916e);
        }
    }
}
