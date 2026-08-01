package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؐٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3050e extends AbstractC8807e implements InterfaceC6128e, InterfaceC10798e, Map {
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

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f17714e.containsKey((String) obj);
    }

    @Override // defpackage.InterfaceC14666e
    /* renamed from: extends */
    public final InterfaceC14666e mo660extends(C12247e c12247e) {
        NativePointer nativePointer = c12247e.f24580e;
        long[] jArr = {0};
        long ptr$cinterop_release = this.f17715e.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new AbstractC8807e(this.f17718e, longPointerWrapper, this.f17714e.metrica(c12247e, longPointerWrapper));
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f17714e.get((String) obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : Map.CC.$default$getOrDefault(this, (String) obj, obj2);
    }

    @Override // defpackage.InterfaceC16883e
    public final AbstractC1984e loadAd(InterfaceC9543e interfaceC9543e) {
        return new C6353e(interfaceC9543e, 1);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f17714e.remove((String) obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj instanceof String) {
            return Map.CC.$default$remove(this, (String) obj, obj2);
        }
        return false;
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

    @Override // java.util.AbstractMap
    public final String toString() {
        C10985e c10985e;
        InterfaceC3529e interfaceC3529e = this.f17714e;
        C13655e c13655e = this.f17718e;
        if (c13655e != null) {
            String str = c13655e.f27075e;
            Long valueOf = Long.valueOf(c13655e.f27072e.mo661throw().f34534e);
            long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            c10985e = new C10985e(str, valueOf, Long.valueOf(realmcJNI.realm_object_get_key(ptr$cinterop_release)));
        } else {
            c10985e = new C10985e("null", Long.valueOf(interfaceC3529e.yandex().mo661throw().f34534e), "null");
        }
        String str2 = (String) c10985e.f21742e;
        long longValue = ((Number) c10985e.f21741e).longValue();
        return "RealmDictionary{size=" + interfaceC3529e.appmetrica() + ",owner=" + str2 + ",objKey=" + c10985e.f21740e + ",version=" + longValue + "}";
    }
}
