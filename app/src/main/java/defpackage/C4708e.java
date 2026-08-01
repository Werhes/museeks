package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4708e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f10095e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C1208e f10096e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f10097e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C1208e f10098e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4708e(C1208e c1208e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f10098e = c1208e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f10095e = obj;
        this.f10097e |= RecyclerView.UNDEFINED_DURATION;
        return C1208e.isVip(this.f10098e, this);
    }
}
