package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٌِۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8641e<T> {
    public static final C7783e Companion = new Object();
    public final Integer ad;
    public final List vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eًؙۜ] */
    static {
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.RootItemsResponseDto", null, 2);
        c4707e.advert("count", true);
        c4707e.advert("items", true);
    }

    public C8641e() {
        this.ad = null;
        this.vip = C13664e.f27089e;
    }

    public /* synthetic */ C8641e(int i, Integer num, List list) {
        this.ad = (i & 1) == 0 ? null : num;
        if ((i & 2) == 0) {
            this.vip = C13664e.f27089e;
        } else {
            this.vip = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8641e)) {
            return false;
        }
        C8641e c8641e = (C8641e) obj;
        return AbstractC7890e.billing(this.ad, c8641e.ad) && AbstractC7890e.billing(this.vip, c8641e.vip);
    }

    public final int hashCode() {
        Integer num = this.ad;
        return this.vip.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "RootItemsResponseDto(count=" + this.ad + ", items=" + this.vip + ")";
    }
}
