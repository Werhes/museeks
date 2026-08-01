package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10060e extends AbstractMap implements Map, InterfaceC6770e {
    public abstract Set ad();

    public abstract /* bridge */ Collection appmetrica();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return ad();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return vip();
    }

    public abstract /* bridge */ int metrica();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return metrica();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return appmetrica();
    }

    public abstract /* bridge */ Set vip();
}
