package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ۠ؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9021e {
    public final List ad;
    public final C18217e appmetrica;
    public final List license;
    public final Map metrica;
    public final Map vip;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [eٌۧۘ] */
    public C9021e(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ArrayList arrayList, C18217e c18217e, int i) {
        int i2 = i & 2;
        ?? r1 = C9139e.f18290e;
        linkedHashMap = i2 != 0 ? r1 : linkedHashMap;
        linkedHashMap2 = (i & 4) != 0 ? r1 : linkedHashMap2;
        List list2 = (i & 8) != 0 ? C13664e.f27089e : arrayList;
        c18217e = (i & 16) != 0 ? null : c18217e;
        this.ad = list;
        this.vip = linkedHashMap;
        this.metrica = linkedHashMap2;
        this.license = list2;
        this.appmetrica = c18217e;
    }

    public final String toString() {
        String str;
        C18217e c18217e = this.appmetrica;
        if (c18217e == null) {
            str = BuildConfig.FLAVOR;
        } else {
            str = ", template=" + ((Object) C18217e.vip(c18217e.ad));
        }
        return "Request(streams=" + this.ad + str + BuildConfig.FLAVOR + BuildConfig.FLAVOR + ")@" + Integer.toHexString(hashCode());
    }
}
