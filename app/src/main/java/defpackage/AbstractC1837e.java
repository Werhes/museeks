package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؓۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1837e extends AbstractC10415e implements Serializable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final transient Map f4930e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public transient int f4931e;

    public AbstractC1837e(Map map) {
        AbstractC2301e.billing(map.isEmpty());
        this.f4930e = map;
    }

    @Override // defpackage.AbstractC10415e
    public Set appmetrica() {
        return new C5708e(this, this.f4930e);
    }

    public abstract Collection billing();

    @Override // defpackage.InterfaceC3143e
    public final void clear() {
        Map map = this.f4930e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f4931e = 0;
    }

    @Override // defpackage.InterfaceC3143e
    public Collection get(Object obj) {
        Collection collection = (Collection) this.f4930e.get(obj);
        if (collection == null) {
            collection = billing();
        }
        return startapp(obj, collection);
    }

    @Override // defpackage.AbstractC10415e
    public final Collection license() {
        return this instanceof C17249e ? new C17403e(0, this) : new C17403e(0, this);
    }

    @Override // defpackage.AbstractC10415e
    public Map metrica() {
        return new C16166e(this, this.f4930e, 0);
    }

    @Override // defpackage.AbstractC10415e
    public final Iterator purchase() {
        return new C1090e(this, 1);
    }

    @Override // defpackage.InterfaceC3143e
    public final int size() {
        return this.f4931e;
    }

    public abstract Collection startapp(Object obj, Collection collection);

    public boolean yandex(Object obj, Object obj2) {
        Map map = this.f4930e;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f4931e++;
            return true;
        }
        Collection billing = billing();
        if (!billing.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f4931e++;
        map.put(obj, billing);
        return true;
    }
}
