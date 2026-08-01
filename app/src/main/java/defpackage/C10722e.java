package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10722e {
    public final List ad;
    public boolean appmetrica;
    public int license;
    public int metrica;
    public final /* synthetic */ C5492e purchase;
    public final List[] vip;

    public C10722e(C5492e c5492e, List list) {
        this.purchase = c5492e;
        this.ad = list;
        this.vip = new List[list.size()];
        if (list.isEmpty()) {
            AbstractC8889e.ad("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
