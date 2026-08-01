package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12977e extends AbstractC9359e implements InterfaceC11775e, InterfaceC16772e, InterfaceC14666e, InterfaceC10798e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC16112e f25863e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final LongPointerWrapper f25864e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13655e f25865e;

    public C12977e(C13655e c13655e, LongPointerWrapper longPointerWrapper, InterfaceC16112e interfaceC16112e) {
        interfaceC16112e.getClass();
        this.f25865e = c13655e;
        this.f25864e = longPointerWrapper;
        this.f25863e = interfaceC16112e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f25863e.crashlytics(obj, 2, new LinkedHashMap());
    }

    @Override // defpackage.InterfaceC16772e
    public final void appmetrica() {
        long ptr$cinterop_release = this.f25864e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_remove_all(ptr$cinterop_release);
    }

    @Override // defpackage.InterfaceC16883e
    public final InterfaceC14666e billing(AbstractC14297e abstractC14297e) {
        C16981e yandex = abstractC14297e.yandex();
        NativePointer nativePointer = yandex.f33290e;
        long[] jArr = {0};
        long ptr$cinterop_release = this.f25864e.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new C12977e(this.f25865e, longPointerWrapper, this.f25863e.metrica(yandex, longPointerWrapper));
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f25863e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f25863e.contains(obj);
    }

    @Override // defpackage.InterfaceC14666e
    /* renamed from: extends */
    public final InterfaceC14666e mo660extends(C12247e c12247e) {
        NativePointer nativePointer = c12247e.f24580e;
        long[] jArr = {0};
        long ptr$cinterop_release = this.f25864e.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new C12977e(this.f25865e, longPointerWrapper, this.f25863e.metrica(c12247e, longPointerWrapper));
        }
        return null;
    }

    @Override // defpackage.InterfaceC14666e
    public final boolean isValid() {
        LongPointerWrapper longPointerWrapper = this.f25864e;
        if (longPointerWrapper.isReleased()) {
            return false;
        }
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return realmcJNI.realm_set_is_valid(ptr$cinterop_release);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C16343e(this);
    }

    @Override // defpackage.InterfaceC16883e
    public final AbstractC1984e loadAd(InterfaceC9543e interfaceC9543e) {
        return new C6353e(interfaceC9543e, 3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f25863e.remove(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        return this.f25863e.removeAll(collection);
    }

    @Override // defpackage.AbstractC9359e
    public final int subs() {
        this.f25863e.yandex().mo3328goto();
        long[] jArr = new long[1];
        long ptr$cinterop_release = this.f25864e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_size(ptr$cinterop_release, jArr);
        return (int) jArr[0];
    }

    @Override // defpackage.InterfaceC8632e
    public final InterfaceC16883e subscription() {
        return this;
    }

    @Override // defpackage.InterfaceC14666e
    public final LongPointerWrapper tapsense(NativePointer nativePointer, C0912e c0912e) {
        long ptr$cinterop_release = this.f25864e.getPtr$cinterop_release();
        long ptr$cinterop_release2 = nativePointer != null ? ((LongPointerWrapper) nativePointer).getPtr$cinterop_release() : 0L;
        C5389e c5389e = new C5389e(22, c0912e);
        int i = AbstractC6026e.ad;
        return new LongPointerWrapper(realmcJNI.register_notification_cb(ptr$cinterop_release, 2, ptr$cinterop_release2, c5389e), false);
    }
}
