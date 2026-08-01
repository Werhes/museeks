package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٞۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3529e extends InterfaceC2750e {
    C6571e Signature(int i);

    C6571e admob(Object obj);

    C6571e ads(Object obj, Object obj2, LinkedHashMap linkedHashMap);

    C6571e advert(Object obj, Object obj2, int i, Map map);

    int appmetrica();

    /* renamed from: class, reason: not valid java name */
    boolean mo1370class(Object obj, Object obj2);

    void clear();

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Object get(Object obj);

    Object loadAd(Object obj, Object obj2, int i, Map map);

    InterfaceC3529e metrica(InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper);

    /* renamed from: native, reason: not valid java name */
    void mo1371native(InterfaceC6128e interfaceC6128e, int i, Map map);

    Object premium(NativePointer nativePointer, int i);

    void purchase(int i);

    Object remove(Object obj);

    C6571e smaato(Object obj);

    int startapp();

    Object subscription(NativePointer nativePointer, int i);

    /* renamed from: throw, reason: not valid java name */
    AbstractC8441e mo1372throw();

    NativePointer vip();
}
