package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5807e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C14137e f12257e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public /* synthetic */ Object f12258e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f12259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5807e(C14137e c14137e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f12257e = c14137e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f12258e = obj;
        this.f12259e |= RecyclerView.UNDEFINED_DURATION;
        Object m3754goto = C14137e.m3754goto(this.f12257e, this);
        return m3754goto == EnumC2821e.f6782e ? m3754goto : new C0183e(m3754goto);
    }
}
