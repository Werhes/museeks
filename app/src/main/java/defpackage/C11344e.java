package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۢٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11344e implements InterfaceC2334e, InterfaceC16772e, InterfaceC8632e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C17974e f22814e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f22815e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final NativePointer f22816e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC7227e f22817e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC15348e f22818e;

    public C11344e(long j, InterfaceC7227e interfaceC7227e, C17974e c17974e, InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper) {
        this.f22818e = interfaceC15348e;
        this.f22816e = longPointerWrapper;
        this.f22815e = j;
        this.f22817e = interfaceC7227e;
        this.f22814e = c17974e;
    }

    public final InterfaceC10518e ad() {
        C18506e ad;
        realm_value_t realm_value_tVar = new realm_value_t();
        boolean[] zArr = {false};
        long ptr$cinterop_release = ((LongPointerWrapper) this.f22816e).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_query_find_first(ptr$cinterop_release, realm_value_tVar.ad, realm_value_tVar, zArr);
        if (!zArr[0]) {
            ad = null;
        } else {
            if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) != 10) {
                throw new IllegalStateException(("Query did not return link but " + realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar)).toString());
            }
            ad = AbstractC15871e.ad(realm_value_tVar);
        }
        if (ad == null) {
            return null;
        }
        return AbstractC15792e.Signature(ad, this.f22817e, this.f22814e, this.f22818e);
    }

    @Override // defpackage.InterfaceC16772e
    public final void appmetrica() {
        C13655e f27457e;
        InterfaceC10518e ad = ad();
        if (ad == null || (f27457e = ad.getF27457e()) == null) {
            return;
        }
        f27457e.appmetrica();
    }

    @Override // defpackage.InterfaceC8632e
    public final InterfaceC16883e subscription() {
        long ptr$cinterop_release = ((LongPointerWrapper) this.f22816e).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return new C16389e(new LongPointerWrapper(realmcJNI.realm_query_find_all(ptr$cinterop_release), false, 2, null), this.f22815e, this.f22817e, this.f22814e);
    }
}
