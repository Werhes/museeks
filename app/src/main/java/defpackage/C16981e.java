package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16981e implements InterfaceC15348e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C7744e f33289e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final NativePointer f33290e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC11130e f33291e;

    public C16981e(AbstractC11130e abstractC11130e, NativePointer nativePointer) {
        this.f33291e = abstractC11130e;
        this.f33290e = nativePointer;
        this.f33289e = AbstractC14430e.appmetrica(new C17900e(nativePointer, ((C14918e) abstractC11130e.f22047e).appmetrica.values()));
    }

    public final C12247e ad(AbstractC11130e abstractC11130e) {
        long ptr$cinterop_release = ((LongPointerWrapper) this.f33290e).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return new C12247e(abstractC11130e, new LongPointerWrapper(realmcJNI.realm_freeze(ptr$cinterop_release), false, 2, null), advert());
    }

    @Override // defpackage.InterfaceC15348e
    public final C17900e advert() {
        return (C17900e) this.f33289e.ad;
    }

    @Override // defpackage.InterfaceC15348e
    public final C16981e crashlytics() {
        AbstractC0054e.metrica(this);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16981e)) {
            return false;
        }
        C16981e c16981e = (C16981e) obj;
        return AbstractC7890e.billing(this.f33291e, c16981e.f33291e) && AbstractC7890e.billing(this.f33290e, c16981e.f33290e);
    }

    @Override // defpackage.InterfaceC15348e
    /* renamed from: goto */
    public final void mo3328goto() {
        AbstractC0054e.metrica(this);
    }

    public final int hashCode() {
        return this.f33290e.hashCode() + (this.f33291e.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC15348e
    public final AbstractC11130e inmobi() {
        return this.f33291e;
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
        return this.f33290e;
    }

    @Override // defpackage.InterfaceC10798e
    /* renamed from: throw */
    public final C17621e mo661throw() {
        return AbstractC0054e.subscription(this);
    }

    public final String toString() {
        return "LiveRealmReference(owner=" + this.f33291e + ", dbPointer=" + this.f33290e + ")";
    }
}
