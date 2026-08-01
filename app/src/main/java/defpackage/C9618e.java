package defpackage;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۣٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9618e extends AbstractSet {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3638e f19084e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19085e;

    public /* synthetic */ C9618e(C3638e c3638e, int i) {
        this.f19085e = i;
        this.f19084e = c3638e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f19085e) {
            case 0:
                this.f19084e.clear();
                return;
            default:
                this.f19084e.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f19085e) {
            case 0:
                C3638e c3638e = this.f19084e;
                Map metrica = c3638e.metrica();
                if (metrica != null) {
                    return metrica.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int appmetrica = c3638e.appmetrica(entry.getKey());
                    if (appmetrica != -1 && AbstractC13328e.metrica(c3638e.mopub()[appmetrica], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f19084e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f19085e) {
            case 0:
                C3638e c3638e = this.f19084e;
                Map metrica = c3638e.metrica();
                return metrica != null ? metrica.entrySet().iterator() : new C3038e(c3638e, 1);
            default:
                C3638e c3638e2 = this.f19084e;
                Map metrica2 = c3638e2.metrica();
                return metrica2 != null ? metrica2.keySet().iterator() : new C3038e(c3638e2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f19085e) {
            case 0:
                C3638e c3638e = this.f19084e;
                Map metrica = c3638e.metrica();
                if (metrica != null) {
                    return metrica.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c3638e.billing()) {
                        int license = c3638e.license();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c3638e.f8192e;
                        Objects.requireNonNull(obj2);
                        int startapp = AbstractC4520e.startapp(key, value, license, obj2, c3638e.startapp(), c3638e.adcel(), c3638e.mopub());
                        if (startapp != -1) {
                            c3638e.purchase(startapp, license);
                            c3638e.f8197e--;
                            c3638e.f8198e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C3638e c3638e2 = this.f19084e;
                Map metrica2 = c3638e2.metrica();
                return metrica2 != null ? metrica2.keySet().remove(obj) : c3638e2.yandex(obj) != C3638e.f8188e;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f19085e) {
            case 0:
                return this.f19084e.size();
            default:
                return this.f19084e.size();
        }
    }
}
