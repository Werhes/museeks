package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۦؘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14376e implements InterfaceC5021e, InterfaceC10269e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f28430e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final LinkedHashSet f28431e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public AbstractC1186e f28432e;

    public C14376e(AbstractCollection abstractCollection) {
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.f28431e = linkedHashSet;
        this.f28430e = linkedHashSet.hashCode();
    }

    @Override // defpackage.InterfaceC5021e
    public final Collection ad() {
        return this.f28431e;
    }

    @Override // defpackage.InterfaceC5021e
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.InterfaceC5021e
    public final InterfaceC4077e advert() {
        return null;
    }

    @Override // defpackage.InterfaceC5021e
    public final AbstractC13270e amazon() {
        return ((AbstractC1186e) this.f28431e.iterator().next()).loadAd().amazon();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14376e)) {
            return false;
        }
        return AbstractC7890e.billing(this.f28431e, ((C14376e) obj).f28431e);
    }

    @Override // defpackage.InterfaceC5021e
    public final List getParameters() {
        return C13664e.f27089e;
    }

    public final int hashCode() {
        return this.f28430e;
    }

    public final String metrica(Function1 function1) {
        return AbstractC13480e.m3608try(AbstractC13480e.m3577else(this.f28431e, new C3751e(0, function1)), " & ", "{", "}", new C7267e(1, function1), 24);
    }

    public final String toString() {
        return metrica(C7247e.f14824e);
    }

    public final AbstractC10226e vip() {
        C6557e.f13492e.getClass();
        return AbstractC1596e.purchase(C6557e.f13491e, this, C13664e.f27089e, false, AbstractC3628e.appmetrica("member scope for intersection type", this.f28431e), new C17877e(17, this));
    }
}
