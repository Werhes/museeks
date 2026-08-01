package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17636e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f34558e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Csuper f34559e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f34560e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C5107e f34561e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17636e(C5107e c5107e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f34561e = c5107e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f34558e = obj;
        this.f34560e |= RecyclerView.UNDEFINED_DURATION;
        Object metrica = this.f34561e.metrica(null, this);
        return metrica == EnumC2821e.f6782e ? metrica : new C13523e(metrica);
    }
}
