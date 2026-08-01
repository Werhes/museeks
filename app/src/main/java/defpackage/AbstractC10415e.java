package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10415e implements InterfaceC3143e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient Collection f20586e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient Set f20587e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public transient Map f20588e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient Collection f20589e;

    public final boolean ad(Object obj, Object obj2) {
        Collection collection = (Collection) advert().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // defpackage.InterfaceC3143e
    public Map advert() {
        Map map = this.f20588e;
        if (map != null) {
            return map;
        }
        Map metrica = metrica();
        this.f20588e = metrica;
        return metrica;
    }

    public abstract Set appmetrica();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC3143e) {
            return advert().equals(((InterfaceC3143e) obj).advert());
        }
        return false;
    }

    public final int hashCode() {
        return advert().hashCode();
    }

    @Override // defpackage.InterfaceC3143e
    public Set keySet() {
        Set set = this.f20587e;
        if (set != null) {
            return set;
        }
        Set appmetrica = appmetrica();
        this.f20587e = appmetrica;
        return appmetrica;
    }

    public abstract Collection license();

    public abstract Map metrica();

    @Override // defpackage.InterfaceC3143e
    public Collection mopub() {
        Collection collection = this.f20589e;
        if (collection != null) {
            return collection;
        }
        Collection license = license();
        this.f20589e = license;
        return license;
    }

    public abstract Iterator purchase();

    @Override // defpackage.InterfaceC3143e
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) advert().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return advert().toString();
    }

    public boolean vip(Object obj) {
        Iterator it = advert().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
