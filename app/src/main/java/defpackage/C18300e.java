package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18300e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C18479e f35948e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f35949e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f35950e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Csuper f35951e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C12575e f35952e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f35953e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C17333e f35954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18300e(C12575e c12575e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f35952e = c12575e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f35950e = obj;
        this.f35949e |= RecyclerView.UNDEFINED_DURATION;
        Serializable isPro = this.f35952e.isPro(null, null, this);
        return isPro == EnumC2821e.f6782e ? isPro : new C13523e(isPro);
    }
}
