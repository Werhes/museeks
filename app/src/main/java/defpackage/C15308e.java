package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15308e {
    public final boolean ad;
    public final Long appmetrica;
    public final Long billing;
    public final Long license;
    public final C10675e metrica;
    public final Long purchase;
    public final boolean vip;
    public final Map yandex;

    public /* synthetic */ C15308e(boolean z, boolean z2, C10675e c10675e, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, c10675e, l, l2, l3, l4, C9139e.f18290e);
    }

    public C15308e(boolean z, boolean z2, C10675e c10675e, Long l, Long l2, Long l3, Long l4, Map map) {
        this.ad = z;
        this.vip = z2;
        this.metrica = c10675e;
        this.license = l;
        this.appmetrica = l2;
        this.purchase = l3;
        this.billing = l4;
        this.yandex = AbstractC10064e.advert(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.ad) {
            arrayList.add("isRegularFile");
        }
        if (this.vip) {
            arrayList.add("isDirectory");
        }
        Long l = this.license;
        if (l != null) {
            arrayList.add("byteCount=" + l.longValue());
        }
        Long l2 = this.appmetrica;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2.longValue());
        }
        Long l3 = this.purchase;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3.longValue());
        }
        Long l4 = this.billing;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4.longValue());
        }
        Map map = this.yandex;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
