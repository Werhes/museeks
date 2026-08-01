package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌٍ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8585e implements Map.Entry, InterfaceC6514e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC3529e f17408e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f17409e;

    public C8585e(InterfaceC3529e interfaceC3529e, Object obj) {
        this.f17409e = obj;
        this.f17408e = interfaceC3529e;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        boolean z = getValue() instanceof byte[];
        Object obj2 = this.f17409e;
        if (z) {
            Map.Entry entry = (Map.Entry) obj;
            if (entry.getValue() instanceof byte[]) {
                return AbstractC7890e.billing(obj2, entry.getKey()) && Arrays.equals((byte[]) getValue(), (byte[]) entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) obj;
        return AbstractC7890e.billing(obj2, entry2.getKey()) && AbstractC7890e.billing(getValue(), entry2.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f17409e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f17408e.get(this.f17409e);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f17409e;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return (value != null ? value.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        InterfaceC3529e interfaceC3529e = this.f17408e;
        Object obj2 = this.f17409e;
        Object obj3 = interfaceC3529e.get(obj2);
        interfaceC3529e.ads(obj2, obj, new LinkedHashMap());
        return obj3;
    }

    public final String toString() {
        return "ManagedRealmMapEntry{" + this.f17409e + "," + getValue() + "}";
    }
}
