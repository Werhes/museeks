package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5420e extends AbstractC1075e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f11604e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f11605e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C3638e f11606e;

    public C5420e(C3638e c3638e, int i) {
        super(false, 1);
        this.f11606e = c3638e;
        Object obj = C3638e.f8187e;
        this.f11605e = c3638e.amazon()[i];
        this.f11604e = i;
    }

    public final void ad() {
        int i = this.f11604e;
        Object obj = this.f11605e;
        C3638e c3638e = this.f11606e;
        if (i != -1 && i < c3638e.size()) {
            if (AbstractC6437e.license(obj, c3638e.amazon()[this.f11604e])) {
                return;
            }
        }
        Object obj2 = C3638e.f8187e;
        this.f11604e = c3638e.pro(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11605e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C3638e c3638e = this.f11606e;
        Map Signature = c3638e.Signature();
        if (Signature != null) {
            return Signature.get(this.f11605e);
        }
        ad();
        int i = this.f11604e;
        if (i == -1) {
            return null;
        }
        return c3638e.loadAd()[i];
    }

    @Override // defpackage.AbstractC1075e, java.util.Map.Entry
    public final Object setValue(Object obj) {
        C3638e c3638e = this.f11606e;
        Map Signature = c3638e.Signature();
        Object obj2 = this.f11605e;
        if (Signature != null) {
            return Signature.put(obj2, obj);
        }
        ad();
        int i = this.f11604e;
        if (i == -1) {
            c3638e.put(obj2, obj);
            return null;
        }
        Object obj3 = c3638e.loadAd()[i];
        c3638e.loadAd()[this.f11604e] = obj;
        return obj3;
    }
}
