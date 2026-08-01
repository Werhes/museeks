package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5143e implements Iterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f11022e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f11023e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f11024e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11025e;

    public C5143e(C1356e c1356e) {
        this.f11025e = 5;
        this.f11024e = ((InterfaceC9093e) c1356e.vip).iterator();
        this.f11023e = -1;
    }

    public C5143e(C4799e c4799e) {
        this.f11025e = 2;
        this.f11024e = c4799e;
        this.f11023e = -1;
        this.f11022e = AbstractC16342e.license(new C6984e(c4799e, this, null));
    }

    public C5143e(C6993e c6993e) {
        this.f11025e = 0;
        this.f11024e = c6993e;
        this.f11023e = -2;
    }

    public C5143e(C6993e c6993e, byte b) {
        this.f11025e = 6;
        this.f11024e = c6993e;
        this.f11022e = new C10649e((C8522e) c6993e.vip);
    }

    public C5143e(C14442e c14442e) {
        this.f11025e = 4;
        this.f11024e = c14442e;
        this.f11022e = c14442e.ad.iterator();
    }

    public C5143e(C15243e c15243e) {
        this.f11025e = 1;
        this.f11024e = c15243e;
        this.f11023e = -1;
        this.f11022e = AbstractC16342e.license(new C4386e(c15243e, this, null));
    }

    public C5143e(Object obj, Map map) {
        this.f11025e = 3;
        this.f11022e = obj;
        this.f11024e = map;
    }

    public void ad() {
        C6993e c6993e = (C6993e) this.f11024e;
        Object invoke = this.f11023e == -2 ? ((Function0) c6993e.vip).invoke() : ((Function1) c6993e.metrica).invoke(this.f11022e);
        this.f11022e = invoke;
        this.f11023e = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11025e) {
            case 0:
                if (this.f11023e < 0) {
                    ad();
                }
                return this.f11023e == 1;
            case 1:
                return ((C4300e) this.f11022e).hasNext();
            case 2:
                return ((C4300e) this.f11022e).hasNext();
            case 3:
                return this.f11023e < ((Map) this.f11024e).size();
            case 4:
                C14442e c14442e = (C14442e) this.f11024e;
                Iterator it = (Iterator) this.f11022e;
                while (this.f11023e < c14442e.vip && it.hasNext()) {
                    it.next();
                    this.f11023e++;
                }
                return this.f11023e < c14442e.metrica && it.hasNext();
            case 5:
                if (this.f11023e == -1) {
                    vip();
                }
                return this.f11023e == 1;
            default:
                return ((Iterator) this.f11022e).hasNext();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f11025e) {
            case 0:
                if (this.f11023e < 0) {
                    ad();
                }
                if (this.f11023e == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f11022e;
                this.f11023e = -1;
                return obj;
            case 1:
                return ((C4300e) this.f11022e).next();
            case 2:
                return ((C4300e) this.f11022e).next();
            case 3:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f11022e;
                this.f11023e++;
                Object obj3 = ((Map) this.f11024e).get(obj2);
                if (obj3 != null) {
                    this.f11022e = ((C7731e) obj3).vip;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
            case 4:
                C14442e c14442e = (C14442e) this.f11024e;
                Iterator it = (Iterator) this.f11022e;
                while (this.f11023e < c14442e.vip && it.hasNext()) {
                    it.next();
                    this.f11023e++;
                }
                int i = this.f11023e;
                if (i >= c14442e.metrica) {
                    throw new NoSuchElementException();
                }
                this.f11023e = i + 1;
                return it.next();
            case 5:
                if (this.f11023e == -1) {
                    vip();
                }
                if (this.f11023e == 0) {
                    throw new NoSuchElementException();
                }
                Object obj4 = this.f11022e;
                this.f11022e = null;
                this.f11023e = -1;
                return obj4;
            default:
                C9419e c9419e = (C9419e) ((C6993e) this.f11024e).metrica;
                int i2 = this.f11023e;
                this.f11023e = i2 + 1;
                if (i2 >= 0) {
                    return c9419e.invoke(Integer.valueOf(i2), ((Iterator) this.f11022e).next());
                }
                AbstractC6874e.Signature();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.f11025e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.f11023e;
                if (i != -1) {
                    ((C15243e) this.f11024e).f30161e.yandex(i);
                    this.f11023e = -1;
                    return;
                }
                return;
            case 2:
                int i2 = this.f11023e;
                if (i2 != -1) {
                    ((C4799e) this.f11024e).f10227e.amazon(i2);
                    this.f11023e = -1;
                    return;
                }
                return;
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void vip() {
        Iterator it = (Iterator) this.f11024e;
        if (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC15498e) next) instanceof InterfaceC6647e) {
                this.f11023e = 1;
                this.f11022e = next;
                return;
            }
        }
        this.f11023e = 0;
    }
}
