package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_query_arg_t;
import io.realm.kotlin.internal.interop.realmcJNI;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٛۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14097e implements InterfaceC2334e, InterfaceC16772e, InterfaceC8632e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final LongPointerWrapper f27878e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC7227e f27879e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f27880e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C17974e f27881e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC15348e f27882e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C5363e f27883e;

    public C14097e(long j, InterfaceC7227e interfaceC7227e, C17974e c17974e, InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper) {
        this.f27882e = interfaceC15348e;
        this.f27880e = j;
        this.f27879e = interfaceC7227e;
        this.f27881e = c17974e;
        this.f27878e = longPointerWrapper;
        this.f27883e = new C5363e(new C13465e(6, this));
        interfaceC15348e.advert().vip(j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14097e(defpackage.InterfaceC15348e r21, long r22, defpackage.InterfaceC7227e r24, defpackage.C17974e r25, java.lang.String r26, java.lang.Object[] r27) {
        /*
            r20 = this;
            eٕۣۣ r0 = new eٕۣۣ
            r1 = 15
            r0.<init>(r1)
            r1 = r27
            eٌُ۟ r1 = defpackage.AbstractC12546e.license(r0, r1)
            io.realm.kotlin.internal.interop.NativePointer r2 = r21.remoteconfig()     // Catch: java.lang.IndexOutOfBoundsException -> L46
            io.realm.kotlin.internal.interop.LongPointerWrapper r9 = new io.realm.kotlin.internal.interop.LongPointerWrapper     // Catch: java.lang.IndexOutOfBoundsException -> L46
            io.realm.kotlin.internal.interop.LongPointerWrapper r2 = (io.realm.kotlin.internal.interop.LongPointerWrapper) r2     // Catch: java.lang.IndexOutOfBoundsException -> L46
            long r10 = r2.getPtr$cinterop_release()     // Catch: java.lang.IndexOutOfBoundsException -> L46
            long r2 = r1.ad     // Catch: java.lang.IndexOutOfBoundsException -> L46
            io.realm.kotlin.internal.interop.realm_query_arg_t r1 = r1.vip     // Catch: java.lang.IndexOutOfBoundsException -> L46
            int r4 = defpackage.AbstractC6026e.ad     // Catch: java.lang.IndexOutOfBoundsException -> L46
            long r17 = io.realm.kotlin.internal.interop.realm_query_arg_t.ad(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L46
            r12 = r22
            r14 = r26
            r19 = r1
            r15 = r2
            long r4 = io.realm.kotlin.internal.interop.realmcJNI.realm_query_parse(r10, r12, r14, r15, r17, r19)     // Catch: java.lang.IndexOutOfBoundsException -> L46
            r7 = 2
            r8 = 0
            r6 = 0
            r3 = r9
            r3.<init>(r4, r6, r7, r8)     // Catch: java.lang.IndexOutOfBoundsException -> L46
            r0.m4020interface()
            r3 = r20
            r8 = r21
            r4 = r22
            r6 = r24
            r7 = r25
            r3.<init>(r4, r6, r7, r8, r9)
            return
        L46:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r0.getMessage()
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14097e.<init>(eٌٕۥ, long, eؚ٘ٚ, e٘ۙؒ, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍؐؗ, java.lang.Object] */
    public final C9156e ad() {
        ?? obj = new Object();
        obj.f18316e = this.f27882e;
        obj.f18315e = this.f27878e;
        obj.f18317e = this.f27881e;
        obj.f18318e = this.f27880e;
        obj.f18314e = this.f27879e;
        return obj;
    }

    @Override // defpackage.InterfaceC16772e
    public final void appmetrica() {
        AbstractC12322e.ad(metrica()).appmetrica();
    }

    public final C11344e license() {
        return new C11344e(this.f27880e, this.f27879e, this.f27881e, this.f27882e, this.f27878e);
    }

    public final C1649e metrica() {
        return new C1649e(this.f27882e, (NativePointer) this.f27883e.getValue(), this.f27880e, this.f27879e, this.f27881e);
    }

    @Override // defpackage.InterfaceC8632e
    public final InterfaceC16883e subscription() {
        return new C16389e((NativePointer) this.f27883e.getValue(), this.f27880e, this.f27879e, this.f27881e);
    }

    public final C14097e vip(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("TRUEPREDICATE DISTINCT(".concat(str));
        for (String str2 : strArr) {
            sb.append(", " + str2);
        }
        sb.append(")");
        String sb2 = sb.toString();
        C15816e c15816e = new C15816e(15);
        C10896e license = AbstractC12546e.license(c15816e, new Object[0]);
        long ptr$cinterop_release = this.f27878e.getPtr$cinterop_release();
        long j = license.ad;
        realm_query_arg_t realm_query_arg_tVar = license.vip;
        int i = AbstractC6026e.ad;
        C14097e c14097e = new C14097e(this.f27880e, this.f27879e, this.f27881e, this.f27882e, new LongPointerWrapper(realmcJNI.realm_query_append_query(ptr$cinterop_release, sb2, j, realm_query_arg_t.ad(realm_query_arg_tVar), realm_query_arg_tVar), false, 2, null));
        c15816e.m4020interface();
        return c14097e;
    }
}
