package defpackage;

import java.util.AbstractCollection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1761e extends AbstractC3386e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4800e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractCollection f4801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1761e(AbstractCollection abstractCollection, InterfaceC3529e interfaceC3529e, int i) {
        super(interfaceC3529e);
        this.f4800e = i;
        this.f4801e = abstractCollection;
    }

    @Override // defpackage.AbstractC3386e
    public final Object vip(int i) {
        switch (this.f4800e) {
            case 0:
                return this.f7582e.subscription(((C16300e) this.f4801e).f32047e, i);
            default:
                return this.f7582e.premium(((C16922e) this.f4801e).f33148e, i);
        }
    }
}
