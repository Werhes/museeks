package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12247e implements InterfaceC15348e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C17900e f24579e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final NativePointer f24580e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC11130e f24581e;

    public C12247e(AbstractC11130e abstractC11130e, NativePointer nativePointer, C17900e c17900e) {
        this.f24581e = abstractC11130e;
        this.f24580e = nativePointer;
        this.f24579e = c17900e;
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_begin_read(ptr$cinterop_release);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, io.realm.kotlin.internal.interop.realm_version_id_t] */
    public final C17621e ad() {
        NativePointer remoteconfig = remoteconfig();
        long new_realm_version_id_t = realmcJNI.new_realm_version_id_t();
        ?? obj = new Object();
        obj.vip = true;
        obj.ad = new_realm_version_id_t;
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) remoteconfig).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_version_id(ptr$cinterop_release, zArr, obj.ad, obj);
        if (zArr[0]) {
            return new C17621e(realmcJNI.realm_version_id_t_version_get(obj.ad, obj));
        }
        throw new IllegalStateException("No VersionId was available. Reading the VersionId requires a valid read transaction.");
    }

    @Override // defpackage.InterfaceC15348e
    public final C17900e advert() {
        return this.f24579e;
    }

    @Override // defpackage.InterfaceC15348e
    public final C16981e crashlytics() {
        throw new IllegalStateException("Cannot modify managed objects outside of a write transaction");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12247e)) {
            return false;
        }
        C12247e c12247e = (C12247e) obj;
        return AbstractC7890e.billing(this.f24581e, c12247e.f24581e) && AbstractC7890e.billing(this.f24580e, c12247e.f24580e) && AbstractC7890e.billing(this.f24579e, c12247e.f24579e);
    }

    @Override // defpackage.InterfaceC15348e
    /* renamed from: goto, reason: not valid java name */
    public final void mo3328goto() {
        AbstractC0054e.metrica(this);
    }

    public final int hashCode() {
        return this.f24579e.hashCode() + ((this.f24580e.hashCode() + (this.f24581e.hashCode() * 31)) * 31);
    }

    @Override // defpackage.InterfaceC15348e
    public final AbstractC11130e inmobi() {
        return this.f24581e;
    }

    @Override // defpackage.InterfaceC4654e
    public final boolean isClosed() {
        return AbstractC0054e.adcel(this);
    }

    @Override // defpackage.InterfaceC4654e
    public final boolean isFrozen() {
        mo3328goto();
        long ptr$cinterop_release = ((LongPointerWrapper) remoteconfig()).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return realmcJNI.realm_is_frozen(ptr$cinterop_release);
    }

    @Override // defpackage.InterfaceC15348e
    public final NativePointer remoteconfig() {
        return this.f24580e;
    }

    @Override // defpackage.InterfaceC10798e
    /* renamed from: throw */
    public final C17621e mo661throw() {
        return AbstractC0054e.subscription(this);
    }

    public final String toString() {
        return "FrozenRealmReferenceImpl(owner=" + this.f24581e + ", dbPointer=" + this.f24580e + ", schemaMetadata=" + this.f24579e + ")";
    }
}
