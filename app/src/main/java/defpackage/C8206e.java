package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۚۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8206e implements InterfaceC6034e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C4246e f16695e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f16696e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16697e;

    public /* synthetic */ C8206e(Function2 function2, C4246e c4246e, int i) {
        this.f16697e = i;
        this.f16696e = function2;
        this.f16695e = c4246e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    @Override // defpackage.InterfaceC6034e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startapp(java.lang.Object r5, defpackage.InterfaceC5083e r6) {
        /*
            r4 = this;
            int r0 = r4.f16697e
            switch(r0) {
                case 0: goto L60;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof defpackage.C1130e
            if (r0 == 0) goto L18
            r0 = r6
            eؙؒٙ r0 = (defpackage.C1130e) r0
            int r1 = r0.f3684e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f3684e = r1
            goto L1d
        L18:
            eؙؒٙ r0 = new eؙؒٙ
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.f3680e
            int r1 = r0.f3684e
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.f3681e
            eًۚۨ r0 = r0.f3682e
            defpackage.AbstractC2003e.purchase(r6)
            goto L4b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            defpackage.AbstractC2003e.purchase(r6)
            r0.f3682e = r4
            r0.f3681e = r5
            r0.f3684e = r2
            kotlin.jvm.functions.Function2 r6 = r4.f16696e
            java.lang.Object r6 = r6.invoke(r5, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto L4a
            goto L55
        L4a:
            r0 = r4
        L4b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L56
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L55:
            return r0
        L56:
            eّؖٝ r6 = r0.f16695e
            r6.f9318e = r5
            static r5 = new static
            r5.<init>(r0)
            throw r5
        L60:
            boolean r0 = r6 instanceof defpackage.C15489e
            if (r0 == 0) goto L73
            r0 = r6
            eٕٕۛ r0 = (defpackage.C15489e) r0
            int r1 = r0.f30597e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L73
            int r1 = r1 - r2
            r0.f30597e = r1
            goto L78
        L73:
            eٕٕۛ r0 = new eٕٕۛ
            r0.<init>(r4, r6)
        L78:
            java.lang.Object r6 = r0.f30593e
            int r1 = r0.f30597e
            r2 = 1
            if (r1 == 0) goto L91
            if (r1 != r2) goto L89
            java.lang.Object r5 = r0.f30594e
            eًۚۨ r0 = r0.f30595e
            defpackage.AbstractC2003e.purchase(r6)
            goto La6
        L89:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L91:
            defpackage.AbstractC2003e.purchase(r6)
            r0.f30595e = r4
            r0.f30594e = r5
            r0.f30597e = r2
            kotlin.jvm.functions.Function2 r6 = r4.f16696e
            java.lang.Object r6 = r6.invoke(r5, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto La5
            goto Lb0
        La5:
            r0 = r4
        La6:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto Lb1
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        Lb0:
            return r0
        Lb1:
            eّؖٝ r6 = r0.f16695e
            r6.f9318e = r5
            static r5 = new static
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8206e.startapp(java.lang.Object, eًؗۖ):java.lang.Object");
    }
}
