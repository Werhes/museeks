package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10442e extends AbstractSet {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f20619e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20620e;

    public /* synthetic */ C10442e(int i, Object obj) {
        this.f20620e = i;
        this.f20619e = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f20620e) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C15497e) this.f20619e).appmetrica((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((C9062e) this.f20619e).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((C12745e) this.f20619e).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    return false;
                }
                ((C15620e) this.f20619e).vip((Comparable) entry4.getKey(), entry4.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f20620e) {
            case 1:
                ((C15497e) this.f20619e).clear();
                return;
            case 2:
                ((C9062e) this.f20619e).clear();
                return;
            case 3:
                ((C12745e) this.f20619e).clear();
                return;
            case 4:
                ((C15620e) this.f20619e).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f20620e) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((C15497e) this.f20619e).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((C9062e) this.f20619e).get(entry2.getKey());
                Object value2 = entry2.getValue();
                return obj3 == value2 || (obj3 != null && obj3.equals(value2));
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((C12745e) this.f20619e).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj4 != value3) {
                    return obj4 != null && obj4.equals(value3);
                }
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj5 = ((C15620e) this.f20619e).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj5 != value4) {
                    return obj5 != null && obj5.equals(value4);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f20620e) {
            case 0:
                return new C15285e((C2271e) this.f20619e);
            case 1:
                return new C10715e((C15497e) this.f20619e, 0);
            case 2:
                return new C10715e((C9062e) this.f20619e, 1);
            case 3:
                return new C10715e((C12745e) this.f20619e);
            case 4:
                return new C10715e((C15620e) this.f20619e, 3);
            default:
                return new C10661e(3, this);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f20620e) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C15497e) this.f20619e).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((C9062e) this.f20619e).remove(entry2.getKey());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((C12745e) this.f20619e).remove(entry3.getKey());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                ((C15620e) this.f20619e).remove(entry4.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f20620e) {
            case 0:
                return ((C2271e) this.f20619e).f34352e;
            case 1:
                return ((C15497e) this.f20619e).size();
            case 2:
                return ((C9062e) this.f20619e).size();
            case 3:
                return ((C12745e) this.f20619e).size();
            case 4:
                return ((C15620e) this.f20619e).size();
            default:
                return ((C2246e) this.f20619e).appmetrica;
        }
    }
}
