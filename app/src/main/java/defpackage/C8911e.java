package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8911e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f17873e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f17874e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f17875e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Csuper f17876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8911e(Csuper csuper, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f17876e = csuper;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f17873e = obj;
        this.f17875e |= RecyclerView.UNDEFINED_DURATION;
        Serializable ads = this.f17876e.ads(this);
        return ads == EnumC2821e.f6782e ? ads : new C13523e(ads);
    }
}
