package defpackage;

import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1064e extends AbstractList implements RandomAccess, InterfaceC12326e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C10968e f3589e = new C10968e(new C1064e());

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayList f3590e;

    public C1064e() {
        this.f3590e = new ArrayList();
    }

    public C1064e(InterfaceC12326e interfaceC12326e) {
        this.f3590e = new ArrayList(interfaceC12326e.size());
        addAll(interfaceC12326e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f3590e.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC12326e) {
            collection = ((InterfaceC12326e) collection).purchase();
        }
        boolean addAll = this.f3590e.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f3590e.size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f3590e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f3590e;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC6732e) {
            AbstractC6732e abstractC6732e = (AbstractC6732e) obj;
            String tapsense = abstractC6732e.tapsense();
            if (abstractC6732e.smaato()) {
                arrayList.set(i, tapsense);
            }
            return tapsense;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC6172e.ad;
        try {
            String str = new String(bArr, "UTF-8");
            if (AbstractC6537e.purchase(0, bArr.length, bArr) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // defpackage.InterfaceC12326e
    public final void isPro(C1884e c1884e) {
        this.f3590e.add(c1884e);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.InterfaceC12326e
    public final AbstractC6732e pro(int i) {
        AbstractC6732e c1884e;
        ArrayList arrayList = this.f3590e;
        Object obj = arrayList.get(i);
        if (obj instanceof AbstractC6732e) {
            c1884e = (AbstractC6732e) obj;
        } else if (obj instanceof String) {
            try {
                c1884e = new C1884e(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            c1884e = new C1884e(bArr2);
        }
        if (c1884e != obj) {
            arrayList.set(i, c1884e);
        }
        return c1884e;
    }

    @Override // defpackage.InterfaceC12326e
    public final List purchase() {
        return DesugarCollections.unmodifiableList(this.f3590e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object remove = this.f3590e.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC6732e) {
            return ((AbstractC6732e) remove).tapsense();
        }
        byte[] bArr = (byte[]) remove;
        byte[] bArr2 = AbstractC6172e.ad;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.f3590e.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC6732e) {
            return ((AbstractC6732e) obj2).tapsense();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = AbstractC6172e.ad;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // defpackage.InterfaceC12326e
    public final C10968e signatures() {
        return new C10968e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3590e.size();
    }
}
