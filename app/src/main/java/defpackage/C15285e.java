package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15285e implements Iterator, Map.Entry {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f30207e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f30208e = -1;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C2271e f30209e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f30210e;

    public C15285e(C2271e c2271e) {
        this.f30209e = c2271e;
        this.f30210e = c2271e.f34352e - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f30207e) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f30208e;
        C2271e c2271e = this.f30209e;
        return AbstractC7890e.billing(key, c2271e.purchase(i)) && AbstractC7890e.billing(entry.getValue(), c2271e.startapp(this.f30208e));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f30207e) {
            return this.f30209e.purchase(this.f30208e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f30207e) {
            return this.f30209e.startapp(this.f30208e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30208e < this.f30210e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f30207e) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f30208e;
        C2271e c2271e = this.f30209e;
        Object purchase = c2271e.purchase(i);
        Object startapp = c2271e.startapp(this.f30208e);
        return (purchase == null ? 0 : purchase.hashCode()) ^ (startapp != null ? startapp.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f30208e++;
        this.f30207e = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f30207e) {
            throw new IllegalStateException();
        }
        this.f30209e.billing(this.f30208e);
        this.f30208e--;
        this.f30210e--;
        this.f30207e = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f30207e) {
            return this.f30209e.yandex(this.f30208e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
