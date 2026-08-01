package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C18357e implements InterfaceC2268e, InterfaceC11320e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final HashMap f36035e = new HashMap();

    @Override // defpackage.InterfaceC11320e
    public final void adcel(String str, InterfaceC2268e interfaceC2268e) {
        HashMap hashMap = this.f36035e;
        if (interfaceC2268e == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, interfaceC2268e);
        }
    }

    @Override // defpackage.InterfaceC11320e
    public final boolean advert(String str) {
        return this.f36035e.containsKey(str);
    }

    @Override // defpackage.InterfaceC2268e
    public final Iterator appmetrica() {
        return new C1685e(this.f36035e.keySet().iterator());
    }

    @Override // defpackage.InterfaceC11320e
    public final InterfaceC2268e billing(String str) {
        HashMap hashMap = this.f36035e;
        return hashMap.containsKey(str) ? (InterfaceC2268e) hashMap.get(str) : InterfaceC2268e.f5755e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18357e) {
            return this.f36035e.equals(((C18357e) obj).f36035e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36035e.hashCode();
    }

    @Override // defpackage.InterfaceC2268e
    public InterfaceC2268e remoteconfig(String str, C11467e c11467e, ArrayList arrayList) {
        return "toString".equals(str) ? new C15547e(toString()) : AbstractC1414e.tapsense(this, new C15547e(str), c11467e, arrayList);
    }

    @Override // defpackage.InterfaceC2268e
    public final String startapp() {
        return "[object Object]";
    }

    @Override // defpackage.InterfaceC2268e
    public final Double subscription() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.InterfaceC2268e
    public final InterfaceC2268e tapsense() {
        C18357e c18357e = new C18357e();
        for (Map.Entry entry : this.f36035e.entrySet()) {
            boolean z = entry.getValue() instanceof InterfaceC11320e;
            HashMap hashMap = c18357e.f36035e;
            if (z) {
                hashMap.put((String) entry.getKey(), (InterfaceC2268e) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((InterfaceC2268e) entry.getValue()).tapsense());
            }
        }
        return c18357e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap hashMap = this.f36035e;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.InterfaceC2268e
    public final Boolean yandex() {
        return Boolean.TRUE;
    }
}
