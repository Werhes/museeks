package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14798e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C18221e f29318e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f29319e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C16399e f29320e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC2004e f29321e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f29322e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14798e(ViewOnAttachStateChangeListenerC2004e viewOnAttachStateChangeListenerC2004e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f29321e = viewOnAttachStateChangeListenerC2004e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f29322e = obj;
        this.f29319e |= RecyclerView.UNDEFINED_DURATION;
        return this.f29321e.advert(this);
    }
}
