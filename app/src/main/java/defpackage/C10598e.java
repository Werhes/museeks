package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۢؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10598e extends AbstractC17258e {
    public final Map vip;

    public C10598e(AbstractC9743e abstractC9743e, AbstractC9743e abstractC9743e2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        license(linkedHashMap, abstractC9743e);
        license(linkedHashMap, abstractC9743e2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((C9492e) entry.getKey()).metrica) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.vip = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static void license(LinkedHashMap linkedHashMap, AbstractC9743e abstractC9743e) {
        for (int i = 0; i < abstractC9743e.adcel(); i++) {
            C9492e mopub = abstractC9743e.mopub(i);
            Object obj = linkedHashMap.get(mopub);
            boolean z = mopub.metrica;
            Class cls = mopub.vip;
            if (z) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    linkedHashMap.put(mopub, list);
                }
                list.add(cls.cast(abstractC9743e.advert(i)));
            } else {
                linkedHashMap.put(mopub, cls.cast(abstractC9743e.advert(i)));
            }
        }
    }

    @Override // defpackage.AbstractC17258e
    public final void ad(C11467e c11467e, C16212e c16212e) {
        for (Map.Entry entry : this.vip.entrySet()) {
            C9492e c9492e = (C9492e) entry.getKey();
            Object value = entry.getValue();
            if (c9492e.metrica) {
                c11467e.m3220try(c9492e, ((List) value).iterator(), c16212e);
            } else {
                c11467e.m3219throw(c9492e, value, c16212e);
            }
        }
    }

    @Override // defpackage.AbstractC17258e
    public final Set metrica() {
        return this.vip.keySet();
    }

    @Override // defpackage.AbstractC17258e
    public final int vip() {
        return this.vip.size();
    }
}
