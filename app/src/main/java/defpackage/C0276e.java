package defpackage;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؑۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0276e extends AbstractSet {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3638e f2275e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2276e;

    public /* synthetic */ C0276e(C3638e c3638e, int i) {
        this.f2276e = i;
        this.f2275e = c3638e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2276e) {
            case 0:
                this.f2275e.clear();
                return;
            default:
                this.f2275e.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f2276e) {
            case 0:
                C3638e c3638e = this.f2275e;
                Map Signature = c3638e.Signature();
                if (Signature != null) {
                    return Signature.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int pro = c3638e.pro(entry.getKey());
                    if (pro != -1 && AbstractC6437e.license(c3638e.loadAd()[pro], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f2275e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2276e) {
            case 0:
                C3638e c3638e = this.f2275e;
                Map Signature = c3638e.Signature();
                return Signature != null ? Signature.entrySet().iterator() : new C7196e(c3638e, 1);
            default:
                C3638e c3638e2 = this.f2275e;
                Map Signature2 = c3638e2.Signature();
                return Signature2 != null ? Signature2.keySet().iterator() : new C7196e(c3638e2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f2276e) {
            case 0:
                C3638e c3638e = this.f2275e;
                Map Signature = c3638e.Signature();
                if (Signature != null) {
                    return Signature.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c3638e.subscription()) {
                        int remoteconfig = c3638e.remoteconfig();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c3638e.f8192e;
                        Objects.requireNonNull(obj2);
                        int startapp = AbstractC14161e.startapp(key, value, remoteconfig, obj2, c3638e.smaato(), c3638e.amazon(), c3638e.loadAd());
                        if (startapp != -1) {
                            c3638e.admob(startapp, remoteconfig);
                            c3638e.f8197e--;
                            c3638e.f8198e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C3638e c3638e2 = this.f2275e;
                Map Signature2 = c3638e2.Signature();
                return Signature2 != null ? Signature2.keySet().remove(obj) : c3638e2.tapsense(obj) != C3638e.f8187e;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2276e) {
            case 0:
                return this.f2275e.size();
            default:
                return this.f2275e.size();
        }
    }
}
