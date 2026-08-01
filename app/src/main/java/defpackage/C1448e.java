package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۥؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1448e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f4282e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Long f4283e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f4284e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C17354e f4285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1448e(C17354e c17354e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f4285e = c17354e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f4282e = obj;
        this.f4284e |= RecyclerView.UNDEFINED_DURATION;
        return this.f4285e.subscription(null, this);
    }
}
