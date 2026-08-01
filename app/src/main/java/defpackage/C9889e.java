package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Collection;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۥّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9889e extends AbstractC14012e implements InterfaceC17101e, InterfaceC16772e, InterfaceC14666e, InterfaceC10798e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC12556e f19500e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final LongPointerWrapper f19501e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13655e f19502e;

    public C9889e(C13655e c13655e, LongPointerWrapper longPointerWrapper, InterfaceC12556e interfaceC12556e) {
        interfaceC12556e.getClass();
        this.f19502e = c13655e;
        this.f19501e = longPointerWrapper;
        this.f19500e = interfaceC12556e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f19500e.isVip(i, obj, 2, new LinkedHashMap());
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        boolean inmobi;
        int subs = subs();
        if (i < 0 || i > subs) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, subs, "index: ", ", size: "));
        }
        inmobi = this.f19500e.inmobi(i, collection, 2, new LinkedHashMap());
        return inmobi;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        boolean inmobi;
        inmobi = this.f19500e.inmobi(subs(), collection, 2, new LinkedHashMap());
        return inmobi;
    }

    @Override // defpackage.InterfaceC16772e
    public final void appmetrica() {
        long ptr$cinterop_release = this.f19501e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_list_remove_all(ptr$cinterop_release);
    }

    @Override // defpackage.InterfaceC16883e
    public final InterfaceC14666e billing(AbstractC14297e abstractC14297e) {
        C16981e yandex = abstractC14297e.yandex();
        NativePointer nativePointer = yandex.f33290e;
        long[] jArr = {0};
        long ptr$cinterop_release = this.f19501e.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_list_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new C9889e(this.f19502e, longPointerWrapper, this.f19500e.metrica(yandex, longPointerWrapper));
        }
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f19500e.yandex().mo3328goto();
        long ptr$cinterop_release = this.f19501e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_list_clear(ptr$cinterop_release);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f19500e.contains(obj);
    }

    @Override // defpackage.InterfaceC14666e
    /* renamed from: extends */
    public final InterfaceC14666e mo660extends(C12247e c12247e) {
        NativePointer nativePointer = c12247e.f24580e;
        long[] jArr = {0};
        long ptr$cinterop_release = this.f19501e.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_list_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new C9889e(this.f19502e, longPointerWrapper, this.f19500e.metrica(c12247e, longPointerWrapper));
        }
        return null;
    }

    @Override // defpackage.AbstractC14012e
    public final Object firebase(int i) {
        Object obj = get(i);
        this.f19500e.yandex().mo3328goto();
        long j = i;
        long ptr$cinterop_release = this.f19501e.getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_list_erase(ptr$cinterop_release, j);
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        InterfaceC12556e interfaceC12556e = this.f19500e;
        interfaceC12556e.yandex().mo3328goto();
        return interfaceC12556e.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return this.f19500e.indexOf(obj);
    }

    @Override // defpackage.InterfaceC14666e
    public final boolean isValid() {
        LongPointerWrapper longPointerWrapper = this.f19501e;
        if (longPointerWrapper.isReleased()) {
            return false;
        }
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return realmcJNI.realm_list_is_valid(ptr$cinterop_release);
    }

    @Override // defpackage.InterfaceC16883e
    public final AbstractC1984e loadAd(InterfaceC9543e interfaceC9543e) {
        return new C6353e(interfaceC9543e, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        return this.f19500e.remove(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        InterfaceC12556e interfaceC12556e = this.f19500e;
        interfaceC12556e.yandex().mo3328goto();
        return interfaceC12556e.firebase(i, obj, 2, new LinkedHashMap());
    }

    @Override // defpackage.AbstractC14012e
    public final int subs() {
        this.f19500e.yandex().mo3328goto();
        long[] jArr = new long[1];
        long ptr$cinterop_release = this.f19501e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_list_size(ptr$cinterop_release, jArr);
        return (int) jArr[0];
    }

    @Override // defpackage.InterfaceC8632e
    public final InterfaceC16883e subscription() {
        return this;
    }

    @Override // defpackage.InterfaceC14666e
    public final LongPointerWrapper tapsense(NativePointer nativePointer, C0912e c0912e) {
        long ptr$cinterop_release = this.f19501e.getPtr$cinterop_release();
        long ptr$cinterop_release2 = nativePointer != null ? ((LongPointerWrapper) nativePointer).getPtr$cinterop_release() : 0L;
        C6325e c6325e = new C6325e(23, c0912e);
        int i = AbstractC6026e.ad;
        return new LongPointerWrapper(realmcJNI.register_notification_cb(ptr$cinterop_release, 1, ptr$cinterop_release2, c6325e), false);
    }
}
