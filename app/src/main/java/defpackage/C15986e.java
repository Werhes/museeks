package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؕٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15986e implements ListIterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f31509e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f31510e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31511e;

    public C15986e(int i, int i2, List list) {
        this.f31511e = i2;
        switch (i2) {
            case 1:
                this.f31510e = list;
                this.f31509e = i;
                return;
            default:
                this.f31510e = list;
                this.f31509e = i - 1;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f31511e) {
            case 0:
                int i = this.f31509e + 1;
                this.f31509e = i;
                this.f31510e.add(i, obj);
                return;
            default:
                this.f31510e.add(this.f31509e, obj);
                this.f31509e++;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f31511e) {
            case 0:
                return this.f31509e < this.f31510e.size() - 1;
            default:
                return this.f31509e < this.f31510e.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f31511e) {
            case 0:
                return this.f31509e >= 0;
            default:
                return this.f31509e > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f31511e) {
            case 0:
                int i = this.f31509e + 1;
                this.f31509e = i;
                return this.f31510e.get(i);
            default:
                int i2 = this.f31509e;
                this.f31509e = i2 + 1;
                return this.f31510e.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f31511e) {
            case 0:
                return this.f31509e + 1;
            default:
                return this.f31509e;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f31511e) {
            case 0:
                int i = this.f31509e;
                this.f31509e = i - 1;
                return this.f31510e.get(i);
            default:
                int i2 = this.f31509e - 1;
                this.f31509e = i2;
                return this.f31510e.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f31511e) {
            case 0:
                return this.f31509e;
            default:
                return this.f31509e - 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f31511e) {
            case 0:
                this.f31510e.remove(this.f31509e);
                this.f31509e--;
                return;
            default:
                int i = this.f31509e - 1;
                this.f31509e = i;
                this.f31510e.remove(i);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f31511e) {
            case 0:
                this.f31510e.set(this.f31509e, obj);
                return;
            default:
                this.f31510e.set(this.f31509e, obj);
                return;
        }
    }
}
