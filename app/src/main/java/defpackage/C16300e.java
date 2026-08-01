package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16300e extends AbstractC9359e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC3529e f32046e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final NativePointer f32047e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C13655e f32048e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32049e;

    public /* synthetic */ C16300e(NativePointer nativePointer, InterfaceC3529e interfaceC3529e, C13655e c13655e, int i) {
        this.f32049e = i;
        this.f32047e = nativePointer;
        this.f32046e = interfaceC3529e;
        this.f32048e = c13655e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        C6571e ads;
        switch (this.f32049e) {
            case 0:
                throw new UnsupportedOperationException("Adding keys to a dictionary through 'dictionary.keys' is not allowed.");
            default:
                Map.Entry entry = (Map.Entry) obj;
                ads = this.f32046e.ads(entry.getKey(), entry.getValue(), new LinkedHashMap());
                return ((Boolean) ads.f13543e).booleanValue();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        C6571e ads;
        switch (this.f32049e) {
            case 1:
                Iterator it = collection.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ads = this.f32046e.ads(entry.getKey(), entry.getValue(), new LinkedHashMap());
                    z |= ((Boolean) ads.f13543e).booleanValue();
                }
                return z;
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f32049e) {
            case 1:
                this.f32046e.clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f32049e) {
            case 1:
                if (AbstractC9476e.mopub(obj)) {
                    return super.contains((Map.Entry) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f32049e) {
            case 0:
                return new C1761e(this, this.f32046e, 0);
            default:
                return new AbstractC3386e(this.f32046e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f32049e) {
            case 1:
                if (AbstractC9476e.mopub(obj)) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    InterfaceC3529e interfaceC3529e = this.f32046e;
                    boolean mo1370class = interfaceC3529e.mo1370class(interfaceC3529e.get(key), entry.getValue());
                    if (mo1370class) {
                        return ((Boolean) interfaceC3529e.admob(entry.getKey()).f13543e).booleanValue();
                    }
                    if (mo1370class) {
                        throw new C14803e(10);
                    }
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f32049e) {
            case 1:
                Iterator it = collection.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    z |= remove((Map.Entry) it.next());
                }
                return z;
            default:
                return super.removeAll(collection);
        }
    }

    @Override // defpackage.AbstractC9359e
    public final int subs() {
        long j;
        int i = this.f32049e;
        NativePointer nativePointer = this.f32047e;
        switch (i) {
            case 0:
                long[] jArr = new long[1];
                long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
                int i2 = AbstractC6026e.ad;
                realmcJNI.realm_results_count(ptr$cinterop_release, jArr);
                j = jArr[0];
                break;
            default:
                long[] jArr2 = new long[1];
                long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
                int i3 = AbstractC6026e.ad;
                realmcJNI.realm_dictionary_size(ptr$cinterop_release2, jArr2);
                j = jArr2[0];
                break;
        }
        return (int) j;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        C10985e c10985e;
        C10985e c10985e2;
        int i = this.f32049e;
        InterfaceC3529e interfaceC3529e = this.f32046e;
        C13655e c13655e = this.f32048e;
        switch (i) {
            case 0:
                if (c13655e != null) {
                    String str = c13655e.f27075e;
                    Long valueOf = Long.valueOf(c13655e.f27072e.mo661throw().f34534e);
                    long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
                    int i2 = AbstractC6026e.ad;
                    c10985e = new C10985e(str, valueOf, Long.valueOf(realmcJNI.realm_object_get_key(ptr$cinterop_release)));
                } else {
                    c10985e = new C10985e("null", Long.valueOf(interfaceC3529e.yandex().mo661throw().f34534e), "null");
                }
                String str2 = (String) c10985e.f21742e;
                long longValue = ((Number) c10985e.f21741e).longValue();
                return "RealmDictionary.keys{size=" + subs() + ",owner=" + str2 + ",objKey=" + c10985e.f21740e + ",version=" + longValue + "}";
            default:
                if (c13655e != null) {
                    String str3 = c13655e.f27075e;
                    Long valueOf2 = Long.valueOf(c13655e.f27072e.mo661throw().f34534e);
                    long ptr$cinterop_release2 = c13655e.f27071e.getPtr$cinterop_release();
                    int i3 = AbstractC6026e.ad;
                    c10985e2 = new C10985e(str3, valueOf2, Long.valueOf(realmcJNI.realm_object_get_key(ptr$cinterop_release2)));
                } else {
                    AbstractC11130e inmobi = interfaceC3529e.yandex().inmobi();
                    inmobi.getClass();
                    c10985e2 = new C10985e("null", inmobi.adcel().mo661throw(), "null");
                }
                String str4 = (String) c10985e2.f21742e;
                Comparable comparable = (Comparable) c10985e2.f21741e;
                return "RealmDictionary.entries{size=" + subs() + ",owner=" + str4 + ",objKey=" + c10985e2.f21740e + ",version=" + comparable + "}";
        }
    }
}
