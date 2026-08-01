package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15439e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC18406e f30514e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public /* synthetic */ Object f30515e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f30516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15439e(AbstractC18406e abstractC18406e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f30514e = abstractC18406e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f30515e = obj;
        this.f30516e |= RecyclerView.UNDEFINED_DURATION;
        return this.f30514e.admob(this);
    }
}
