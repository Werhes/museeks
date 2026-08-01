package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٝؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2727e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public AbstractC16696e f6616e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f6617e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public /* synthetic */ Object f6618e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C10675e f6619e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ DedicatedCacheMigrationService f6620e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public AbstractC16696e f6621e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C10675e f6622e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C10675e f6623e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C10675e f6624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2727e(DedicatedCacheMigrationService dedicatedCacheMigrationService, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f6620e = dedicatedCacheMigrationService;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f6618e = obj;
        this.f6617e |= RecyclerView.UNDEFINED_DURATION;
        return DedicatedCacheMigrationService.metrica(this.f6620e, null, null, this);
    }
}
