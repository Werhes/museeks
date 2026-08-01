package defpackage;

import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17787e implements InterfaceC1108e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7185e f34870e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1108e f34871e;

    /* JADX WARN: Multi-variable type inference failed */
    public C17787e(InterfaceC1108e interfaceC1108e, Function3 function3) {
        this.f34871e = interfaceC1108e;
        this.f34870e = (AbstractC7185e) function3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r1v4, types: [eؚٖؓ, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r9v6, types: [eؚٖؓ, kotlin.jvm.functions.Function3] */
    @Override // defpackage.InterfaceC1108e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.InterfaceC6034e r9, defpackage.InterfaceC5083e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.C4154e
            if (r0 == 0) goto L13
            r0 = r10
            eؙؖٗ r0 = (defpackage.C4154e) r0
            int r1 = r0.f9162e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9162e = r1
            goto L18
        L13:
            eؙؖٗ r0 = new eؙؖٗ
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f9164e
            int r1 = r0.f9162e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L50
            if (r1 == r4) goto L44
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r9 = r0.f9165e
            eؗۦؙ r9 = (defpackage.C5280e) r9
            defpackage.AbstractC2003e.purchase(r10)     // Catch: java.lang.Throwable -> L32
            goto L7a
        L32:
            r10 = move-exception
            goto L84
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f9165e
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            defpackage.AbstractC2003e.purchase(r10)
            goto L9e
        L44:
            eؘۥؒ r9 = r0.f9163e
            java.lang.Object r1 = r0.f9165e
            eٕ٘ۙ r1 = (defpackage.C17787e) r1
            defpackage.AbstractC2003e.purchase(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8a
        L50:
            defpackage.AbstractC2003e.purchase(r10)
            eؒٗۡ r10 = r8.f34871e     // Catch: java.lang.Throwable -> L88
            r0.f9165e = r8     // Catch: java.lang.Throwable -> L88
            r0.f9163e = r9     // Catch: java.lang.Throwable -> L88
            r0.f9162e = r4     // Catch: java.lang.Throwable -> L88
            java.lang.Object r10 = r10.ad(r9, r0)     // Catch: java.lang.Throwable -> L88
            if (r10 != r6) goto L62
            goto L9d
        L62:
            r1 = r8
        L63:
            eؗۦؙ r10 = new eؗۦؙ
            eٌِٞ r3 = r0.f21135e
            r10.<init>(r9, r3)
            eؚٖؓ r9 = r1.f34870e     // Catch: java.lang.Throwable -> L80
            r0.f9165e = r10     // Catch: java.lang.Throwable -> L80
            r0.f9163e = r5     // Catch: java.lang.Throwable -> L80
            r0.f9162e = r2     // Catch: java.lang.Throwable -> L80
            java.lang.Object r9 = r9.invoke(r10, r5, r0)     // Catch: java.lang.Throwable -> L80
            if (r9 != r6) goto L79
            goto L9d
        L79:
            r9 = r10
        L7a:
            r9.Signature()
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L80:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L84:
            r9.Signature()
            throw r10
        L88:
            r9 = move-exception
            r1 = r8
        L8a:
            eؕۢۗ r10 = new eؕۢۗ
            r10.<init>(r9)
            eؚٖؓ r1 = r1.f34870e
            r0.f9165e = r9
            r0.f9163e = r5
            r0.f9162e = r3
            java.lang.Object r10 = defpackage.AbstractC13461e.ad(r10, r1, r9, r0)
            if (r10 != r6) goto L9e
        L9d:
            return r6
        L9e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17787e.ad(eؘۥؒ, eًؗۖ):java.lang.Object");
    }
}
