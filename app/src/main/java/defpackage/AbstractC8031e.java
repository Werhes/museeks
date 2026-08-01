package defpackage;

import android.accounts.Account;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8031e extends AbstractC6785e implements InterfaceC2367e {
    public static volatile ExecutorC8172e premium;
    public final Set ads;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC8031e(android.content.Context r11, android.os.Looper r12, int r13, defpackage.C2532e r14, defpackage.InterfaceC11335e r15, defpackage.InterfaceC11914e r16) {
        /*
            r10 = this;
            eٔٞٓ r4 = defpackage.C14864e.ad(r11)
            eؘؑؐ r5 = defpackage.C0002e.appmetrica
            defpackage.AbstractC9528e.startapp(r15)
            defpackage.AbstractC9528e.startapp(r16)
            eََٜ r7 = new eََٜ
            r7.<init>(r15)
            eؑؓؐ r8 = new eؑؓؐ
            r15 = r16
            r8.<init>(r15)
            java.lang.Object r15 = r14.f6387e
            r9 = r15
            java.lang.String r9 = (java.lang.String) r9
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r12 = r14.f6386e
            java.util.Set r12 = (java.util.Set) r12
            java.util.Iterator r13 = r12.iterator()
        L2c:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L47
            java.lang.Object r14 = r13.next()
            com.google.android.gms.common.api.Scope r14 = (com.google.android.gms.common.api.Scope) r14
            boolean r14 = r12.contains(r14)
            if (r14 == 0) goto L3f
            goto L2c
        L3f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Expanding scopes is not permitted, use implied scopes instead"
            r11.<init>(r12)
            throw r11
        L47:
            r10.ads = r12
            eًۘٝ r12 = defpackage.AbstractC8031e.premium
            if (r12 != 0) goto L65
            java.lang.Class<eًٚٔ> r12 = defpackage.AbstractC8031e.class
            monitor-enter(r12)
            eًۘٝ r13 = defpackage.AbstractC8031e.premium     // Catch: java.lang.Throwable -> L5e
            if (r13 != 0) goto L61
            r11.getPackageName()     // Catch: java.lang.Throwable -> L5e
            eًۘٝ r11 = defpackage.ExecutorC8172e.ad(r11)     // Catch: java.lang.Throwable -> L5e
            defpackage.AbstractC8031e.premium = r11     // Catch: java.lang.Throwable -> L5e
            goto L61
        L5e:
            r0 = move-exception
            r11 = r0
            goto L63
        L61:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L5e
            return
        L63:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L5e
            throw r11
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8031e.<init>(android.content.Context, android.os.Looper, int, eِّؔ, eُۡۡ, eِۖٚ):void");
    }

    @Override // defpackage.AbstractC6785e
    public final Executor adcel() {
        return premium;
    }

    @Override // defpackage.AbstractC6785e
    public final Set amazon() {
        return this.ads;
    }

    @Override // defpackage.AbstractC6785e
    public final Account yandex() {
        return null;
    }
}
