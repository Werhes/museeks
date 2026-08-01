package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13490e extends AbstractC10415e implements InterfaceC1276e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC1276e f26758e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C6594e f26759e;

    public C13490e(InterfaceC1276e interfaceC1276e, C6594e c6594e) {
        interfaceC1276e.getClass();
        this.f26758e = interfaceC1276e;
        this.f26759e = c6594e;
    }

    @Override // defpackage.AbstractC10415e
    public final Set appmetrica() {
        return this.f26758e.keySet();
    }

    @Override // defpackage.InterfaceC3143e
    public final void clear() {
        this.f26758e.clear();
    }

    @Override // defpackage.InterfaceC3143e
    public final Collection get(Object obj) {
        return AbstractC10589e.purchase(new C11650e(this.f26759e, obj), (List) this.f26758e.get(obj));
    }

    @Override // defpackage.AbstractC10415e
    public final Collection license() {
        return new C17403e(0, this);
    }

    @Override // defpackage.AbstractC10415e
    public final Map metrica() {
        return new C14519e(this.f26758e.advert(), new C17687e(28, this));
    }

    @Override // defpackage.AbstractC10415e
    public final Iterator purchase() {
        return new C2538e(this.f26758e.mopub().iterator(), new C2713e(0, this.f26759e));
    }

    @Override // defpackage.AbstractC10415e, defpackage.InterfaceC3143e
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override // defpackage.InterfaceC3143e
    public final int size() {
        return this.f26758e.size();
    }
}
