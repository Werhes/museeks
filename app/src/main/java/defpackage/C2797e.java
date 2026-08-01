package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2797e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f6750e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f6751e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f6752e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Csuper f6753e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2797e(Csuper csuper, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f6753e = csuper;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f6750e = obj;
        this.f6752e |= RecyclerView.UNDEFINED_DURATION;
        Serializable signatures = this.f6753e.signatures(null, this);
        return signatures == EnumC2821e.f6782e ? signatures : new C13523e(signatures);
    }
}
