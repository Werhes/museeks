package defpackage;

import androidx.glance.session.SessionWorker;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٟؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3538e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f7979e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f7980e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f7981e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ SessionWorker f7982e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f7983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3538e(SessionWorker sessionWorker, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f7982e = sessionWorker;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f7983e = obj;
        this.f7980e |= RecyclerView.UNDEFINED_DURATION;
        return this.f7982e.yandex(this);
    }
}
