package defpackage;

import java.util.List;
import java.util.Map;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4772e extends Catalog2Block {
    public static final C4772e ad = new Catalog2Block(0);
    public static final String vip = "unknown";
    public static final C13664e metrica = C13664e.f27089e;

    @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
    /* renamed from: ad */
    public final List getMetrica() {
        return metrica;
    }

    @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
    public final List appmetrica() {
        return C13664e.f27089e;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C4772e);
    }

    public final int hashCode() {
        return -908423822;
    }

    @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
    /* renamed from: license */
    public final Catalog2Layout getVip() {
        return C7510e.ad;
    }

    @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
    public final Map metrica(C3675e c3675e) {
        throw new IllegalStateException("UnknownBlock can't have data");
    }

    public final String toString() {
        return "UnknownBlock";
    }

    @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
    /* renamed from: vip */
    public final String getAd() {
        return vip;
    }
}
