package defpackage;

import android.graphics.ImageDecoder;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؕۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3716e implements InterfaceC5355e {
    public final ImageDecoder.Source ad;
    public final C12708e license;
    public final C6302e metrica;
    public final AutoCloseable vip;

    public C3716e(ImageDecoder.Source source, AutoCloseable autoCloseable, C6302e c6302e, C12708e c12708e) {
        this.ad = source;
        this.vip = autoCloseable;
        this.metrica = c6302e;
        this.license = c12708e;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r1v3, types: [eٍؚؔ, java.lang.Object] */
    @Override // defpackage.InterfaceC5355e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.InterfaceC5083e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C18443e
            if (r0 == 0) goto L13
            r0 = r6
            eۢٞ r0 = (defpackage.C18443e) r0
            int r1 = r0.f36149e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36149e = r1
            goto L1a
        L13:
            eۢٞ r0 = new eۢٞ
            eُؑ۠ r6 = (defpackage.AbstractC10731e) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.f36147e
            int r1 = r0.f36149e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            eّۘۥ r0 = r0.f36148e
            defpackage.AbstractC2003e.purchase(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.AbstractC2003e.purchase(r6)
            eّۘۥ r6 = r5.license
            r0.f36148e = r6
            r0.f36149e = r2
            java.lang.Object r0 = r6.ad(r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L43
            return r1
        L43:
            r0 = r6
        L44:
            java.lang.AutoCloseable r6 = r5.vip     // Catch: java.lang.Throwable -> L6b
            eٍؚؔ r1 = new eٍؚؔ     // Catch: java.lang.Throwable -> L6d
            r1.<init>()     // Catch: java.lang.Throwable -> L6d
            android.graphics.ImageDecoder$Source r2 = r5.ad     // Catch: java.lang.Throwable -> L6d
            eًؚؚ r3 = new eًؚؚ     // Catch: java.lang.Throwable -> L6d
            r4 = 1
            r3.<init>(r5, r1, r4)     // Catch: java.lang.Throwable -> L6d
            android.graphics.Bitmap r2 = android.graphics.ImageDecoder.decodeBitmap(r2, r3)     // Catch: java.lang.Throwable -> L6d
            eؚْٛ r3 = new eؚْٛ     // Catch: java.lang.Throwable -> L6d
            eٍۡؖ r4 = new eٍۡؖ     // Catch: java.lang.Throwable -> L6d
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.f18534e     // Catch: java.lang.Throwable -> L6d
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L6d
            r1 = 0
            defpackage.AbstractC18453e.ad(r6, r1)     // Catch: java.lang.Throwable -> L6b
            r0.metrica()
            return r3
        L6b:
            r6 = move-exception
            goto L74
        L6d:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L6f
        L6f:
            r2 = move-exception
            defpackage.AbstractC18453e.ad(r6, r1)     // Catch: java.lang.Throwable -> L6b
            throw r2     // Catch: java.lang.Throwable -> L6b
        L74:
            r0.metrica()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3716e.ad(eًؗۖ):java.lang.Object");
    }
}
