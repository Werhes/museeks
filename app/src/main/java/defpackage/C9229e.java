package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9229e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C12916e f18426e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f18427e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f18428e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C6582e f18429e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f18430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9229e(C6582e c6582e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f18429e = c6582e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f18430e = obj;
        this.f18427e |= RecyclerView.UNDEFINED_DURATION;
        return this.f18429e.subscription(false, this);
    }
}
