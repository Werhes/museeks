package defpackage;

import ua.itaysonlab.catalogkit.objects.Catalog2Response;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4227e extends AbstractC18406e {
    public final String billing;
    public final String purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4227e() {
        super(Catalog2Response.class);
        C14027e.ad.getClass();
        long metrica = C14027e.metrica();
        this.purchase = "catalog";
        this.billing = "getAudio";
        loadAd("need_blocks", true);
        amazon("url", AbstractC5087e.m1750native(metrica, "?section=all", new StringBuilder("https://vk.com/audios")));
    }

    @Override // defpackage.AbstractC18406e
    public final String adcel() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC18406e
    public final String mopub() {
        return this.billing;
    }
}
