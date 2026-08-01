package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Stack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5414e implements Iterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f11596e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f11597e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11598e;

    public C5414e(AbstractC6732e abstractC6732e) {
        this.f11598e = 1;
        this.f11597e = new Stack();
        while (abstractC6732e instanceof C1152e) {
            C1152e c1152e = (C1152e) abstractC6732e;
            ((Stack) this.f11597e).push(c1152e);
            abstractC6732e = c1152e.f3731e;
        }
        this.f11596e = (C1884e) abstractC6732e;
    }

    public C5414e(AbstractC13532e abstractC13532e) {
        this.f11598e = 2;
        if (!(abstractC13532e instanceof C3431e)) {
            this.f11597e = null;
            this.f11596e = (C2655e) abstractC13532e;
            return;
        }
        C3431e c3431e = (C3431e) abstractC13532e;
        ArrayDeque arrayDeque = new ArrayDeque(c3431e.f7687e);
        this.f11597e = arrayDeque;
        arrayDeque.push(c3431e);
        AbstractC13532e abstractC13532e2 = c3431e.f7686e;
        while (abstractC13532e2 instanceof C3431e) {
            C3431e c3431e2 = (C3431e) abstractC13532e2;
            ((ArrayDeque) this.f11597e).push(c3431e2);
            abstractC13532e2 = c3431e2.f7686e;
        }
        this.f11596e = (C2655e) abstractC13532e2;
    }

    public C5414e(Iterator it) {
        this.f11598e = 0;
        this.f11596e = it;
    }

    public C1884e ad() {
        C1884e c1884e;
        Stack stack = (Stack) this.f11597e;
        C1884e c1884e2 = (C1884e) this.f11596e;
        if (c1884e2 == null) {
            throw new NoSuchElementException();
        }
        while (true) {
            if (!stack.isEmpty()) {
                AbstractC6732e abstractC6732e = ((C1152e) stack.pop()).f3733e;
                while (abstractC6732e instanceof C1152e) {
                    C1152e c1152e = (C1152e) abstractC6732e;
                    stack.push(c1152e);
                    abstractC6732e = c1152e.f3731e;
                }
                C1884e c1884e3 = (C1884e) abstractC6732e;
                if (c1884e3.f5020e.length != 0) {
                    c1884e = c1884e3;
                    break;
                }
            } else {
                c1884e = null;
                break;
            }
        }
        this.f11596e = c1884e;
        return c1884e2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f11598e) {
            case 0:
                Iterator it2 = (Iterator) this.f11596e;
                if (((Iterator) this.f11597e) == null && it2.hasNext()) {
                    this.f11597e = ((List) ((Map.Entry) it2.next()).getValue()).iterator();
                }
                return it2.hasNext() || ((it = (Iterator) this.f11597e) != null && it.hasNext());
            case 1:
                return ((C1884e) this.f11596e) != null;
            default:
                return ((C2655e) this.f11596e) != null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11598e) {
            case 0:
                if (!((Iterator) this.f11597e).hasNext()) {
                    Iterator it = (Iterator) this.f11596e;
                    if (it.hasNext()) {
                        this.f11597e = ((List) ((Map.Entry) it.next()).getValue()).iterator();
                    }
                }
                return (InterfaceC3589e) ((Iterator) this.f11597e).next();
            case 1:
                return ad();
            default:
                return vip();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11598e) {
            case 0:
                ((Iterator) this.f11597e).remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C2655e vip() {
        C2655e c2655e;
        ArrayDeque arrayDeque = (ArrayDeque) this.f11597e;
        C2655e c2655e2 = (C2655e) this.f11596e;
        if (c2655e2 == null) {
            throw new NoSuchElementException();
        }
        do {
            c2655e = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            AbstractC13532e abstractC13532e = ((C3431e) arrayDeque.pop()).f7684e;
            while (abstractC13532e instanceof C3431e) {
                C3431e c3431e = (C3431e) abstractC13532e;
                arrayDeque.push(c3431e);
                abstractC13532e = c3431e.f7686e;
            }
            c2655e = (C2655e) abstractC13532e;
        } while (c2655e.startapp() == 0);
        this.f11596e = c2655e;
        return c2655e2;
    }
}
