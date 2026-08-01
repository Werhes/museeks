package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ٘ۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17079e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f33412e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ DedicatedCacheService f33413e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public AudioTrack f33414e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f33415e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f33416e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public CachedTrack f33417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17079e(DedicatedCacheService dedicatedCacheService, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f33413e = dedicatedCacheService;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f33416e = obj;
        this.f33415e |= RecyclerView.UNDEFINED_DURATION;
        return DedicatedCacheService.mopub(this.f33413e, null, null, this);
    }
}
