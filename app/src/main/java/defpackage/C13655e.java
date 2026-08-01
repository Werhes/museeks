package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۧ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13655e implements InterfaceC15034e, InterfaceC16772e, InterfaceC14666e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final LongPointerWrapper f27071e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC15348e f27072e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC7227e f27073e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C17974e f27074e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f27075e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C18085e f27076e;

    public C13655e(String str, InterfaceC7227e interfaceC7227e, InterfaceC15348e interfaceC15348e, C17974e c17974e, LongPointerWrapper longPointerWrapper) {
        this.f27075e = str;
        this.f27073e = interfaceC7227e;
        this.f27072e = interfaceC15348e;
        this.f27074e = c17974e;
        this.f27071e = longPointerWrapper;
        this.f27076e = interfaceC15348e.advert().ad(str);
    }

    public final void ad() {
        if (!isValid()) {
            throw new IllegalStateException("Cannot perform this operation on an invalid/deleted object");
        }
    }

    @Override // defpackage.InterfaceC15034e
    public final InterfaceC15348e adcel() {
        return this.f27072e;
    }

    @Override // defpackage.InterfaceC16772e
    public final void appmetrica() {
        if (this.f27072e.isFrozen()) {
            throw new IllegalArgumentException("Frozen objects cannot be deleted. They must be converted to live objects first by using `MutableRealm/DynamicMutableRealm.findLatest(frozenObject)`.");
        }
        if (!isValid()) {
            throw new IllegalArgumentException("Cannot perform this operation on an invalid/deleted object");
        }
        long ptr$cinterop_release = this.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_object_delete(ptr$cinterop_release);
    }

    @Override // defpackage.InterfaceC16883e
    public final InterfaceC14666e billing(AbstractC14297e abstractC14297e) {
        return license(abstractC14297e.yandex(), this.f27073e);
    }

    @Override // defpackage.InterfaceC4654e
    public final boolean isClosed() {
        return AbstractC0054e.mopub(this);
    }

    @Override // defpackage.InterfaceC4654e
    public final boolean isFrozen() {
        return this.f27072e.isFrozen();
    }

    @Override // defpackage.InterfaceC14666e
    public final boolean isValid() {
        LongPointerWrapper longPointerWrapper = this.f27071e;
        if (longPointerWrapper.isReleased()) {
            return false;
        }
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return realmcJNI.realm_object_is_valid(ptr$cinterop_release);
    }

    public final C13655e license(InterfaceC15348e interfaceC15348e, InterfaceC7227e interfaceC7227e) {
        NativePointer remoteconfig = interfaceC15348e.remoteconfig();
        long[] jArr = {0};
        long ptr$cinterop_release = this.f27071e.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) remoteconfig).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_object_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new C13655e(this.f27075e, interfaceC7227e, interfaceC15348e, this.f27074e, longPointerWrapper);
        }
        return null;
    }

    @Override // defpackage.InterfaceC16883e
    public final AbstractC1984e loadAd(InterfaceC9543e interfaceC9543e) {
        return new C6353e(interfaceC9543e, 0);
    }

    public final C16406e metrica(String str) {
        return this.f27076e.vip(str);
    }

    @Override // defpackage.InterfaceC8632e
    public final InterfaceC16883e subscription() {
        return this;
    }

    @Override // defpackage.InterfaceC14666e
    public final LongPointerWrapper tapsense(NativePointer nativePointer, C0912e c0912e) {
        long ptr$cinterop_release = this.f27071e.getPtr$cinterop_release();
        long ptr$cinterop_release2 = nativePointer != null ? ((LongPointerWrapper) nativePointer).getPtr$cinterop_release() : 0L;
        C0444e c0444e = new C0444e(c0912e);
        int i = AbstractC6026e.ad;
        return new LongPointerWrapper(realmcJNI.register_notification_cb(ptr$cinterop_release, 0, ptr$cinterop_release2, c0444e), false);
    }

    @Override // defpackage.InterfaceC10798e
    /* renamed from: throw */
    public final C17621e mo661throw() {
        return this.f27072e.mo661throw();
    }

    @Override // defpackage.InterfaceC14666e
    /* renamed from: vip, reason: merged with bridge method [inline-methods] */
    public final C13655e mo660extends(InterfaceC15348e interfaceC15348e) {
        NativePointer remoteconfig = interfaceC15348e.remoteconfig();
        long[] jArr = {0};
        long ptr$cinterop_release = this.f27071e.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) remoteconfig).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_object_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new C13655e(this.f27075e, this.f27073e, interfaceC15348e, this.f27074e, longPointerWrapper);
        }
        return null;
    }
}
