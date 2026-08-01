package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4028e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f8954e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public List f8955e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f8956e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C5107e f8957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4028e(C5107e c5107e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f8957e = c5107e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f8954e = obj;
        this.f8956e |= RecyclerView.UNDEFINED_DURATION;
        return this.f8957e.adcel(null, this);
    }
}
