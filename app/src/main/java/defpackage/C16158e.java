package defpackage;

import j$.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16158e extends C9780e implements InterfaceC3483e, Map {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C16158e f31735e = new C9780e(C9709e.appmetrica, 0);

    /* JADX WARN: Type inference failed for: r5v1, types: [eُّٖ, eٍِ۟] */
    public final C16158e appmetrica(AbstractC4455e abstractC4455e, InterfaceC6502e interfaceC6502e) {
        C13572e signatures = this.f19326e.signatures(abstractC4455e.hashCode(), abstractC4455e, interfaceC6502e, 0);
        return signatures == null ? this : new C9780e((C9709e) signatures.f26878e, this.f19325e + signatures.f26879e);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // defpackage.C9780e, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC4455e) {
            return super.containsKey((AbstractC4455e) obj);
        }
        return false;
    }

    @Override // defpackage.AbstractC15582e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC6502e) {
            return super.containsValue((InterfaceC6502e) obj);
        }
        return false;
    }

    @Override // defpackage.InterfaceC14927e
    /* renamed from: else */
    public final Object mo2377else(AbstractC4455e abstractC4455e) {
        return AbstractC3167e.vip(this, abstractC4455e);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // defpackage.C9780e, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC4455e) {
            return (InterfaceC6502e) super.get((AbstractC4455e) obj);
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC4455e) ? obj2 : (InterfaceC6502e) Map.CC.$default$getOrDefault(this, (AbstractC4455e) obj, (InterfaceC6502e) obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙؚٟ, eًؗۚ] */
    @Override // defpackage.C9780e, defpackage.InterfaceC12449e
    /* renamed from: metrica, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C7748e builder() {
        ?? c6556e = new C6556e(this);
        c6556e.f15716e = this;
        return c6556e;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }
}
