package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٝٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16376e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f32175e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f32176e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f32177e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Csuper f32178e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16376e(Csuper csuper, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f32178e = csuper;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f32175e = obj;
        this.f32177e |= RecyclerView.UNDEFINED_DURATION;
        Serializable m4645import = this.f32178e.m4645import(null, this);
        return m4645import == EnumC2821e.f6782e ? m4645import : new C13523e(m4645import);
    }
}
