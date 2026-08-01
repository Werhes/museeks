package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2818e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C6759e f6769e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public /* synthetic */ Object f6770e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f6771e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2818e(C6759e c6759e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f6769e = c6759e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f6770e = obj;
        this.f6771e |= RecyclerView.UNDEFINED_DURATION;
        return C6759e.isVip(this.f6769e, this);
    }
}
