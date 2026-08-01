package defpackage;

import j$.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7748e extends C6556e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C16158e f15716e;

    @Override // defpackage.C6556e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC4455e) {
            return super.containsKey((AbstractC4455e) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC6502e) {
            return super.containsValue((InterfaceC6502e) obj);
        }
        return false;
    }

    @Override // defpackage.C6556e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC4455e) {
            return (InterfaceC6502e) super.get((AbstractC4455e) obj);
        }
        return null;
    }

    @Override // defpackage.C6556e, java.util.Map, j$.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC4455e) ? obj2 : (InterfaceC6502e) Map.CC.$default$getOrDefault(this, (AbstractC4455e) obj, (InterfaceC6502e) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [eٍِ۟] */
    @Override // defpackage.C6556e
    /* renamed from: mopub, reason: merged with bridge method [inline-methods] */
    public final C16158e build() {
        C9709e c9709e = this.f13486e;
        C16158e c16158e = this.f15716e;
        C9709e c9709e2 = c16158e.f19326e;
        C16158e c16158e2 = c16158e;
        if (c9709e != c9709e2) {
            this.f13487e = new C10914e(5);
            c16158e2 = new C9780e(this.f13486e, metrica());
        }
        this.f15716e = c16158e2;
        return c16158e2;
    }

    @Override // defpackage.C6556e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC4455e) {
            return (InterfaceC6502e) super.remove((AbstractC4455e) obj);
        }
        return null;
    }
}
