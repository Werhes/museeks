package defpackage;

import j$.util.Collection;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13294e extends AbstractC0281e implements InterfaceC8902e, Collection {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ int f26365e = 0;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient AbstractC12614e f26366e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient C1410e f26367e;

    public final AbstractC12614e Signature() {
        AbstractC12614e abstractC12614e = this.f26366e;
        if (abstractC12614e == null) {
            abstractC12614e = isEmpty() ? C4477e.f9679e : new C4947e(this, 0);
            this.f26366e = abstractC12614e;
        }
        return abstractC12614e;
    }

    @Override // defpackage.AbstractC0281e
    public final AbstractC17475e appmetrica() {
        C1410e c1410e = this.f26367e;
        if (c1410e != null) {
            return c1410e;
        }
        AbstractC17475e appmetrica = super.appmetrica();
        this.f26367e = (C1410e) appmetrica;
        return appmetrica;
    }

    @Override // defpackage.AbstractC0281e
    public final int billing(int i, Object[] objArr) {
        AbstractC7014e it = Signature().iterator();
        while (it.hasNext()) {
            C15079e c15079e = (C15079e) it.next();
            Arrays.fill(objArr, i, c15079e.ad() + i, c15079e.ad);
            i += c15079e.ad();
        }
        return i;
    }

    @Override // defpackage.AbstractC0281e, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((C11994e) this).f23974e.vip(obj) > 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC8902e)) {
            return false;
        }
        InterfaceC8902e interfaceC8902e = (InterfaceC8902e) obj;
        C11994e c11994e = (C11994e) this;
        if (c11994e.size() != interfaceC8902e.size()) {
            return false;
        }
        AbstractC13294e abstractC13294e = (AbstractC13294e) interfaceC8902e;
        if (Signature().size() != abstractC13294e.Signature().size()) {
            return false;
        }
        for (C15079e c15079e : abstractC13294e.Signature()) {
            if (c11994e.f23974e.vip(c15079e.ad) != c15079e.ad()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return AbstractC6100e.purchase(Signature());
    }

    public abstract AbstractC12614e loadAd();

    @Override // defpackage.AbstractC0281e
    /* renamed from: smaato */
    public final AbstractC7014e iterator() {
        return new C3789e(Signature().iterator());
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return Signature().toString();
    }
}
