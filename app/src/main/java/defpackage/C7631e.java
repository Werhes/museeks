package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7631e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC9093e f15502e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f15503e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f15504e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f15505e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public /* synthetic */ Object f15506e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final /* synthetic */ DedicatedCacheService f15507e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f15508e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C7631e f15509e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f15510e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public AbstractC3002e f15511e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f15512e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public AudioTrack f15513e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Iterator f15514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7631e(DedicatedCacheService dedicatedCacheService, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f15507e = dedicatedCacheService;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f15506e = obj;
        this.f15508e |= RecyclerView.UNDEFINED_DURATION;
        return this.f15507e.purchase(null, this);
    }
}
