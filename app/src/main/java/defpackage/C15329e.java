package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15329e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C15802e f30248e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public /* synthetic */ Object f30249e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f30250e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15329e(C15802e c15802e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f30248e = c15802e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f30249e = obj;
        this.f30250e |= RecyclerView.UNDEFINED_DURATION;
        return this.f30248e.loadAd(this);
    }
}
