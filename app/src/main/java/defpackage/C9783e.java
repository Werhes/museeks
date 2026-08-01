package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ۟ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9783e implements List, InterfaceC10519e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f19331e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f19332e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f19333e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19334e;

    public /* synthetic */ C9783e(int i, int i2, int i3, List list) {
        this.f19334e = i3;
        this.f19332e = list;
        this.f19331e = i;
        this.f19333e = i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        switch (this.f19334e) {
            case 0:
                this.f19332e.add(i + this.f19331e, obj);
                this.f19333e++;
                return;
            default:
                this.f19332e.add(i + this.f19331e, obj);
                this.f19333e++;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f19334e) {
            case 0:
                int i = this.f19333e;
                this.f19333e = i + 1;
                this.f19332e.add(i, obj);
                return true;
            default:
                int i2 = this.f19333e;
                this.f19333e = i2 + 1;
                this.f19332e.add(i2, obj);
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.f19334e) {
            case 0:
                this.f19332e.addAll(i + this.f19331e, collection);
                this.f19333e = collection.size() + this.f19333e;
                return collection.size() > 0;
            default:
                this.f19332e.addAll(i + this.f19331e, collection);
                int size = collection.size();
                this.f19333e += size;
                return size > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f19334e) {
            case 0:
                this.f19332e.addAll(this.f19333e, collection);
                this.f19333e = collection.size() + this.f19333e;
                return collection.size() > 0;
            default:
                this.f19332e.addAll(this.f19333e, collection);
                int size = collection.size();
                this.f19333e += size;
                return size > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f19334e) {
            case 0:
                int i = this.f19333e - 1;
                int i2 = this.f19331e;
                if (i2 <= i) {
                    while (true) {
                        this.f19332e.remove(i);
                        if (i != i2) {
                            i--;
                        }
                    }
                }
                this.f19333e = i2;
                return;
            default:
                int i3 = this.f19333e - 1;
                int i4 = this.f19331e;
                if (i4 <= i3) {
                    while (true) {
                        this.f19332e.remove(i3);
                        if (i3 != i4) {
                            i3--;
                        }
                    }
                }
                this.f19333e = i4;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f19334e) {
            case 0:
                int i = this.f19333e;
                for (int i2 = this.f19331e; i2 < i; i2++) {
                    if (AbstractC7890e.billing(this.f19332e.get(i2), obj)) {
                        return true;
                    }
                }
                return false;
            default:
                int i3 = this.f19333e;
                for (int i4 = this.f19331e; i4 < i3; i4++) {
                    if (AbstractC7890e.billing(this.f19332e.get(i4), obj)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f19334e) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object get(int i) {
        switch (this.f19334e) {
            case 0:
                AbstractC4180e.ad(i, this);
                return this.f19332e.get(i + this.f19331e);
            default:
                AbstractC16032e.ad(i, this);
                return this.f19332e.get(i + this.f19331e);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f19334e) {
            case 0:
                int i = this.f19333e;
                int i2 = this.f19331e;
                for (int i3 = i2; i3 < i; i3++) {
                    if (AbstractC7890e.billing(this.f19332e.get(i3), obj)) {
                        return i3 - i2;
                    }
                }
                return -1;
            default:
                int i4 = this.f19333e;
                int i5 = this.f19331e;
                for (int i6 = i5; i6 < i4; i6++) {
                    if (AbstractC7890e.billing(this.f19332e.get(i6), obj)) {
                        return i6 - i5;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f19334e) {
            case 0:
                return this.f19333e == this.f19331e;
            default:
                return this.f19333e == this.f19331e;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f19334e) {
            case 0:
                return new C15986e(0, 0, this);
            default:
                return new C15986e(0, 1, this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f19334e) {
            case 0:
                int i = this.f19333e - 1;
                int i2 = this.f19331e;
                if (i2 <= i) {
                    while (!AbstractC7890e.billing(this.f19332e.get(i), obj)) {
                        if (i != i2) {
                            i--;
                        }
                    }
                    return i - i2;
                }
                return -1;
            default:
                int i3 = this.f19333e - 1;
                int i4 = this.f19331e;
                if (i4 <= i3) {
                    while (!AbstractC7890e.billing(this.f19332e.get(i3), obj)) {
                        if (i3 != i4) {
                            i3--;
                        }
                    }
                    return i3 - i4;
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f19334e) {
            case 0:
                return new C15986e(0, 0, this);
            default:
                return new C15986e(0, 1, this);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f19334e) {
            case 0:
                return new C15986e(i, 0, this);
            default:
                return new C15986e(i, 1, this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.f19334e) {
            case 0:
                AbstractC4180e.ad(i, this);
                this.f19333e--;
                return this.f19332e.remove(i + this.f19331e);
            default:
                AbstractC16032e.ad(i, this);
                this.f19333e--;
                return this.f19332e.remove(i + this.f19331e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f19334e) {
            case 0:
                int i = this.f19333e;
                for (int i2 = this.f19331e; i2 < i; i2++) {
                    ?? r2 = this.f19332e;
                    if (AbstractC7890e.billing(r2.get(i2), obj)) {
                        r2.remove(i2);
                        this.f19333e--;
                        return true;
                    }
                }
                return false;
            default:
                int i3 = this.f19333e;
                for (int i4 = this.f19331e; i4 < i3; i4++) {
                    ?? r22 = this.f19332e;
                    if (AbstractC7890e.billing(r22.get(i4), obj)) {
                        r22.remove(i4);
                        this.f19333e--;
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f19334e) {
            case 0:
                int i = this.f19333e;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i != this.f19333e;
            default:
                int i2 = this.f19333e;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i2 != this.f19333e;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f19334e) {
            case 0:
                int i = this.f19333e;
                int i2 = i - 1;
                int i3 = this.f19331e;
                if (i3 <= i2) {
                    while (true) {
                        ?? r3 = this.f19332e;
                        if (!collection.contains(r3.get(i2))) {
                            r3.remove(i2);
                            this.f19333e--;
                        }
                        if (i2 != i3) {
                            i2--;
                        }
                    }
                }
                return i != this.f19333e;
            default:
                int i4 = this.f19333e;
                int i5 = i4 - 1;
                int i6 = this.f19331e;
                if (i6 <= i5) {
                    while (true) {
                        ?? r32 = this.f19332e;
                        if (!collection.contains(r32.get(i5))) {
                            r32.remove(i5);
                            this.f19333e--;
                        }
                        if (i5 != i6) {
                            i5--;
                        }
                    }
                }
                return i4 != this.f19333e;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.f19334e) {
            case 0:
                AbstractC4180e.ad(i, this);
                return this.f19332e.set(i + this.f19331e, obj);
            default:
                AbstractC16032e.ad(i, this);
                return this.f19332e.set(i + this.f19331e, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.f19334e) {
            case 0:
                i = this.f19333e;
                i2 = this.f19331e;
                break;
            default:
                i = this.f19333e;
                i2 = this.f19331e;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f19334e) {
            case 0:
                AbstractC4180e.vip(i, i2, this);
                return new C9783e(i, i2, 0, this);
            default:
                AbstractC16032e.vip(i, i2, this);
                return new C9783e(i, i2, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f19334e) {
            case 0:
                return AbstractC4533e.adcel(this);
            default:
                return AbstractC4533e.adcel(this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f19334e) {
            case 0:
                return AbstractC4533e.mopub(this, objArr);
            default:
                return AbstractC4533e.mopub(this, objArr);
        }
    }
}
