package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٜٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9597e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public List f19038e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f19039e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f19040e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C1400e f19041e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f19042e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9597e(C1400e c1400e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f19041e = c1400e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f19042e = obj;
        this.f19039e |= RecyclerView.UNDEFINED_DURATION;
        Serializable subs = this.f19041e.subs(false, this);
        return subs == EnumC2821e.f6782e ? subs : new C17055e((C6571e) subs);
    }
}
