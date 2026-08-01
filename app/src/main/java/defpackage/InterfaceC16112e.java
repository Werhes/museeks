package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC16112e extends InterfaceC2750e {
    void clear();

    boolean contains(Object obj);

    boolean crashlytics(Object obj, int i, LinkedHashMap linkedHashMap);

    Object get(int i);

    /* renamed from: goto */
    boolean mo2159goto(InterfaceC11775e interfaceC11775e, int i, Map map);

    InterfaceC16112e metrica(InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper);

    void purchase(int i);

    boolean remoteconfig(Collection collection, int i, Map map);

    boolean remove(Object obj);

    boolean removeAll(Collection collection);

    boolean signatures(Object obj, int i, Map map);

    int startapp();

    NativePointer vip();
}
