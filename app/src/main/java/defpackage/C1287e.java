package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۙٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1287e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC9093e f3992e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f3993e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C0389e f3994e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ DedicatedCacheService f3995e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f3996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1287e(DedicatedCacheService dedicatedCacheService, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f3995e = dedicatedCacheService;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f3996e = obj;
        this.f3993e |= RecyclerView.UNDEFINED_DURATION;
        int i = DedicatedCacheService.f36730e;
        return this.f3995e.advert(null, null, this);
    }
}
