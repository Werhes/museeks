package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۤ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8321e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C7249e f17019e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public /* synthetic */ Object f17020e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f17021e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8321e(C7249e c7249e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f17019e = c7249e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f17020e = obj;
        this.f17021e |= RecyclerView.UNDEFINED_DURATION;
        return this.f17019e.billing(null, this);
    }
}
