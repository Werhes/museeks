package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475e extends AbstractC9359e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C6556e f2543e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2544e;

    public /* synthetic */ C0475e(int i, C6556e c6556e) {
        this.f2544e = i;
        this.f2543e = c6556e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f2544e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2544e) {
            case 0:
                this.f2543e.clear();
                return;
            default:
                this.f2543e.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f2544e) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    C6556e c6556e = this.f2543e;
                    Object obj2 = c6556e.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && c6556e.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f2543e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2544e) {
            case 0:
                return new C11927e(this.f2543e);
            default:
                AbstractC13502e[] abstractC13502eArr = new AbstractC13502e[8];
                for (int i = 0; i < 8; i++) {
                    abstractC13502eArr[i] = new C6783e(1);
                }
                return new C3792e(this.f2543e, abstractC13502eArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f2544e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f2543e.remove(entry.getKey(), entry.getValue());
            default:
                C6556e c6556e = this.f2543e;
                if (!c6556e.containsKey(obj)) {
                    return false;
                }
                c6556e.remove(obj);
                return true;
        }
    }

    @Override // defpackage.AbstractC9359e
    public final int subs() {
        switch (this.f2544e) {
            case 0:
                return this.f2543e.metrica();
            default:
                return this.f2543e.metrica();
        }
    }
}
