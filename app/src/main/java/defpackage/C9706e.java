package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۘۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9706e extends AbstractC1614e implements InterfaceC1276e, Serializable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final transient C0409e f19207e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient int f19208e;

    public C9706e(C0409e c0409e, int i) {
        this.f19207e = c0409e;
        this.f19208e = i;
    }

    @Override // defpackage.AbstractC10415e
    public final Set appmetrica() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.AbstractC10415e, defpackage.InterfaceC3143e
    /* renamed from: billing, reason: merged with bridge method [inline-methods] */
    public AbstractC8507e advert() {
        return this.f19207e;
    }

    @Override // defpackage.InterfaceC3143e
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC3143e
    public final Collection get(Object obj) {
        AbstractC17475e abstractC17475e = (AbstractC17475e) this.f19207e.get(obj);
        if (abstractC17475e != null) {
            return abstractC17475e;
        }
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    @Override // defpackage.AbstractC10415e, defpackage.InterfaceC3143e
    public final Set keySet() {
        return this.f19207e.keySet();
    }

    @Override // defpackage.AbstractC10415e
    public final Collection license() {
        return new C16791e(this);
    }

    @Override // defpackage.AbstractC10415e
    public final Map metrica() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.AbstractC10415e, defpackage.InterfaceC3143e
    public final Collection mopub() {
        return (AbstractC0281e) super.mopub();
    }

    @Override // defpackage.AbstractC10415e
    public final Iterator purchase() {
        return new C3746e(this);
    }

    @Override // defpackage.AbstractC10415e, defpackage.InterfaceC3143e
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC3143e
    public final int size() {
        return this.f19208e;
    }

    @Override // defpackage.AbstractC10415e
    public final boolean vip(Object obj) {
        return obj != null && super.vip(obj);
    }
}
