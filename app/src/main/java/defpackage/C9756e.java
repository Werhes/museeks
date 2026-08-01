package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۛۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9756e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f19303e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f19304e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f19305e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C15802e f19306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9756e(C15802e c15802e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f19306e = c15802e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f19303e = obj;
        this.f19305e |= RecyclerView.UNDEFINED_DURATION;
        return this.f19306e.admob(null, this);
    }
}
