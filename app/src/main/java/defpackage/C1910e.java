package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1910e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C7838e f5096e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public /* synthetic */ Object f5097e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f5098e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1910e(C7838e c7838e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f5096e = c7838e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f5097e = obj;
        this.f5098e |= RecyclerView.UNDEFINED_DURATION;
        return this.f5096e.admob(this);
    }
}
