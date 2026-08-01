package defpackage;

import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۣٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16922e extends AbstractC12606e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13655e f33146e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC3529e f33147e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final NativePointer f33148e;

    public C16922e(NativePointer nativePointer, InterfaceC3529e interfaceC3529e, C13655e c13655e) {
        this.f33148e = nativePointer;
        this.f33147e = interfaceC3529e;
        this.f33146e = c13655e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Adding values to a dictionary through 'dictionary.values' is not allowed.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Adding values to a dictionary through 'dictionary.values' is not allowed.");
    }

    @Override // defpackage.AbstractC12606e
    public final int appmetrica() {
        return this.f33147e.appmetrica();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f33147e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1761e(this, this.f33147e, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
    
        r2 = (defpackage.AbstractC3386e) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r2.hasNext() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r5.f33147e.mo1370class(r6, r2.next()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        r2.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0005, code lost:
    
        if (r6 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r6 = (defpackage.AbstractC3386e) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r6.hasNext() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r6.next() != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r6.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        return true;
     */
    @Override // java.util.AbstractCollection, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            java.util.Iterator r0 = r5.iterator()
            r1 = 1
            if (r6 != 0) goto L1a
        L7:
            r6 = r0
            eٕؕ۟ r6 = (defpackage.AbstractC3386e) r6
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r6.next()
            if (r2 != 0) goto L7
            r6.remove()
            return r1
        L1a:
            r2 = r0
            eٕؕ۟ r2 = (defpackage.AbstractC3386e) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L33
            eؕٞۥ r3 = r5.f33147e
            java.lang.Object r4 = r2.next()
            boolean r3 = r3.mo1370class(r6, r4)
            if (r3 == 0) goto L1a
            r2.remove()
            return r1
        L33:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16922e.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = iterator();
        boolean z = false;
        while (true) {
            AbstractC3386e abstractC3386e = (AbstractC3386e) it;
            if (!abstractC3386e.hasNext()) {
                return z;
            }
            Object next = abstractC3386e.next();
            if (next instanceof byte[]) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!Arrays.equals((byte[]) next, (byte[]) it2.next())) {
                        abstractC3386e.remove();
                        z = true;
                    }
                }
            } else if (!collection.contains(next)) {
                abstractC3386e.remove();
                z = true;
            }
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        C10985e c10985e;
        InterfaceC3529e interfaceC3529e = this.f33147e;
        C13655e c13655e = this.f33146e;
        if (c13655e != null) {
            String str = c13655e.f27075e;
            Long valueOf = Long.valueOf(c13655e.f27072e.mo661throw().f34534e);
            long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            c10985e = new C10985e(str, valueOf, Long.valueOf(realmcJNI.realm_object_get_key(ptr$cinterop_release)));
        } else {
            AbstractC11130e inmobi = interfaceC3529e.yandex().inmobi();
            inmobi.getClass();
            c10985e = new C10985e("null", inmobi.adcel().mo661throw(), "null");
        }
        String str2 = (String) c10985e.f21742e;
        Comparable comparable = (Comparable) c10985e.f21741e;
        return "RealmDictionary.values{size=" + interfaceC3529e.appmetrica() + ",owner=" + str2 + ",objKey=" + c10985e.f21740e + ",version=" + comparable + "}";
    }
}
