package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟ٘ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17910e extends AbstractC1075e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f35157e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f35158e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C3638e f35159e;

    public C17910e(C3638e c3638e, int i) {
        super(false, 0);
        this.f35159e = c3638e;
        Object obj = C3638e.f8187e;
        this.f35158e = c3638e.adcel()[i];
        this.f35157e = i;
    }

    public final void ad() {
        int i = this.f35157e;
        Object obj = this.f35158e;
        C3638e c3638e = this.f35159e;
        if (i != -1 && i < c3638e.size()) {
            if (AbstractC13328e.metrica(obj, c3638e.adcel()[this.f35157e])) {
                return;
            }
        }
        Object obj2 = C3638e.f8187e;
        this.f35157e = c3638e.appmetrica(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f35158e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C3638e c3638e = this.f35159e;
        Map metrica = c3638e.metrica();
        if (metrica != null) {
            return metrica.get(this.f35158e);
        }
        ad();
        int i = this.f35157e;
        if (i == -1) {
            return null;
        }
        return c3638e.mopub()[i];
    }

    @Override // defpackage.AbstractC1075e, java.util.Map.Entry
    public final Object setValue(Object obj) {
        C3638e c3638e = this.f35159e;
        Map metrica = c3638e.metrica();
        Object obj2 = this.f35158e;
        if (metrica != null) {
            return metrica.put(obj2, obj);
        }
        ad();
        int i = this.f35157e;
        if (i == -1) {
            c3638e.put(obj2, obj);
            return null;
        }
        Object obj3 = c3638e.mopub()[i];
        c3638e.mopub()[this.f35157e] = obj;
        return obj3;
    }
}
