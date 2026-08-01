package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10200e implements InterfaceC2268e, InterfaceC11320e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final HashMap f20169e = new HashMap();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f20170e;

    public AbstractC10200e(String str) {
        this.f20170e = str;
    }

    public abstract InterfaceC2268e ad(C11467e c11467e, List list);

    @Override // defpackage.InterfaceC11320e
    public final void adcel(String str, InterfaceC2268e interfaceC2268e) {
        HashMap hashMap = this.f20169e;
        if (interfaceC2268e == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, interfaceC2268e);
        }
    }

    @Override // defpackage.InterfaceC11320e
    public final boolean advert(String str) {
        return this.f20169e.containsKey(str);
    }

    @Override // defpackage.InterfaceC2268e
    public final Iterator appmetrica() {
        return new C1685e(this.f20169e.keySet().iterator());
    }

    @Override // defpackage.InterfaceC11320e
    public final InterfaceC2268e billing(String str) {
        HashMap hashMap = this.f20169e;
        return hashMap.containsKey(str) ? (InterfaceC2268e) hashMap.get(str) : InterfaceC2268e.f5755e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC10200e)) {
            return false;
        }
        AbstractC10200e abstractC10200e = (AbstractC10200e) obj;
        String str = this.f20170e;
        if (str != null) {
            return str.equals(abstractC10200e.f20170e);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f20170e;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC2268e
    public final InterfaceC2268e remoteconfig(String str, C11467e c11467e, ArrayList arrayList) {
        return "toString".equals(str) ? new C15547e(this.f20170e) : AbstractC1414e.tapsense(this, new C15547e(str), c11467e, arrayList);
    }

    @Override // defpackage.InterfaceC2268e
    public final String startapp() {
        return this.f20170e;
    }

    @Override // defpackage.InterfaceC2268e
    public final Double subscription() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.InterfaceC2268e
    public InterfaceC2268e tapsense() {
        return this;
    }

    @Override // defpackage.InterfaceC2268e
    public final Boolean yandex() {
        return Boolean.TRUE;
    }
}
