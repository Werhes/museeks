package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12507e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f25050e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f25051e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f25052e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C17354e f25053e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12507e(C17354e c17354e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f25053e = c17354e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f25050e = obj;
        this.f25052e |= RecyclerView.UNDEFINED_DURATION;
        return this.f25053e.loadAd(null, this);
    }
}
