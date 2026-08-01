package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18284e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C11800e f35739e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public /* synthetic */ Object f35740e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f35741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18284e(C11800e c11800e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f35739e = c11800e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f35740e = obj;
        this.f35741e |= RecyclerView.UNDEFINED_DURATION;
        return this.f35739e.advert(null, this);
    }
}
