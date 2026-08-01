package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۡۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16570e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C11046e f32514e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public /* synthetic */ Object f32515e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f32516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16570e(C11046e c11046e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f32514e = c11046e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f32515e = obj;
        this.f32516e |= RecyclerView.UNDEFINED_DURATION;
        return C11046e.isVip(this.f32514e, this);
    }
}
