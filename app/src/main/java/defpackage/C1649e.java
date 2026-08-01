package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1649e extends AbstractC17557e implements InterfaceC6912e, InterfaceC16772e, InterfaceC14666e, InterfaceC15034e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C17974e f4575e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f4576e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final NativePointer f4577e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC7227e f4578e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC15348e f4579e;

    public C1649e(InterfaceC15348e interfaceC15348e, NativePointer nativePointer, long j, InterfaceC7227e interfaceC7227e, C17974e c17974e) {
        this.f4579e = interfaceC15348e;
        this.f4577e = nativePointer;
        this.f4576e = j;
        this.f4578e = interfaceC7227e;
        this.f4575e = c17974e;
    }

    @Override // defpackage.InterfaceC15034e
    public final InterfaceC15348e adcel() {
        return this.f4579e;
    }

    @Override // defpackage.InterfaceC16772e
    public final void appmetrica() {
        long ptr$cinterop_release = ((LongPointerWrapper) this.f4577e).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_results_delete_all(ptr$cinterop_release);
    }

    @Override // defpackage.InterfaceC16883e
    public final InterfaceC14666e billing(AbstractC14297e abstractC14297e) {
        C16981e yandex = abstractC14297e.yandex();
        NativePointer nativePointer = yandex.f33290e;
        long ptr$cinterop_release = ((LongPointerWrapper) this.f4577e).getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return new C1649e(yandex, new LongPointerWrapper(realmcJNI.realm_results_resolve_in(ptr$cinterop_release, ptr$cinterop_release2), false, 2, null), this.f4576e, this.f4578e, this.f4575e);
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC14287e) {
            return super.contains((InterfaceC14287e) obj);
        }
        return false;
    }

    @Override // defpackage.InterfaceC14666e
    /* renamed from: extends, reason: not valid java name */
    public final InterfaceC14666e mo660extends(C12247e c12247e) {
        NativePointer nativePointer = c12247e.f24580e;
        long ptr$cinterop_release = ((LongPointerWrapper) this.f4577e).getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return new C1649e(c12247e, new LongPointerWrapper(realmcJNI.realm_results_resolve_in(ptr$cinterop_release, ptr$cinterop_release2), false, 2, null), this.f4576e, this.f4578e, this.f4575e);
    }

    @Override // java.util.List
    public final Object get(int i) {
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = ((LongPointerWrapper) this.f4577e).getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_results_get(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
            return null;
        }
        return AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), this.f4578e, this.f4575e, this.f4579e);
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC14287e) {
            return super.indexOf((InterfaceC14287e) obj);
        }
        return -1;
    }

    @Override // defpackage.InterfaceC4654e
    public final boolean isClosed() {
        return AbstractC0054e.mopub(this);
    }

    @Override // defpackage.InterfaceC4654e
    public final boolean isFrozen() {
        return AbstractC0054e.advert(this);
    }

    @Override // defpackage.InterfaceC14666e
    public final boolean isValid() {
        return (this.f4577e.isReleased() || this.f4579e.isClosed()) ? false : true;
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC14287e) {
            return super.lastIndexOf((InterfaceC14287e) obj);
        }
        return -1;
    }

    @Override // defpackage.InterfaceC16883e
    public final AbstractC1984e loadAd(InterfaceC9543e interfaceC9543e) {
        return new C6353e(interfaceC9543e, 4);
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        long[] jArr = new long[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f4577e).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_results_count(ptr$cinterop_release, jArr);
        return (int) jArr[0];
    }

    @Override // defpackage.InterfaceC8632e
    public final InterfaceC16883e subscription() {
        return this;
    }

    @Override // defpackage.InterfaceC14666e
    public final LongPointerWrapper tapsense(NativePointer nativePointer, C0912e c0912e) {
        long ptr$cinterop_release = ((LongPointerWrapper) this.f4577e).getPtr$cinterop_release();
        long ptr$cinterop_release2 = nativePointer != null ? ((LongPointerWrapper) nativePointer).getPtr$cinterop_release() : 0L;
        C15816e c15816e = new C15816e(23, c0912e);
        int i = AbstractC6026e.ad;
        return new LongPointerWrapper(realmcJNI.register_results_notification_cb(ptr$cinterop_release, ptr$cinterop_release2, c15816e), false);
    }

    @Override // defpackage.InterfaceC10798e
    /* renamed from: throw, reason: not valid java name */
    public final C17621e mo661throw() {
        return AbstractC0054e.remoteconfig(this);
    }
}
