package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16304e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C2691e f32050e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public /* synthetic */ Object f32051e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f32052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16304e(C2691e c2691e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f32050e = c2691e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f32051e = obj;
        this.f32052e |= RecyclerView.UNDEFINED_DURATION;
        return this.f32050e.ads(this);
    }
}
