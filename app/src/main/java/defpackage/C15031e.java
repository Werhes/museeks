package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٔۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15031e implements AutoCloseable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f29800e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14826e f29801e;

    public C15031e(C11467e c11467e, String str) {
        C14826e ad = AbstractC9743e.ad(AbstractC5797e.vip(((C17280e) c11467e.f23070e).license, new C6799e((InterfaceC10500e) c11467e.f23069e)));
        this.f29801e = ad;
        this.f29800e = new CopyOnWriteArrayList();
        AbstractC5336e.purchase(ad, null, 0, new C14869e(c11467e, str, this, null, 18), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(long r8, defpackage.AbstractC10731e r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.C3090e
            if (r0 == 0) goto L13
            r0 = r10
            eؕؒۡ r0 = (defpackage.C3090e) r0
            int r1 = r0.f7175e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7175e = r1
            goto L18
        L13:
            eؕؒۡ r0 = new eؕؒۡ
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f7173e
            int r1 = r0.f7175e
            java.util.concurrent.CopyOnWriteArrayList r2 = r7.f29800e
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 != r3) goto L29
            eٌٝؐ r8 = r0.f7174e
            defpackage.AbstractC2003e.purchase(r10)
            goto L53
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.AbstractC2003e.purchase(r10)
            eٌٝؐ r10 = new eٌٝؐ
            r10.<init>()
            r2.add(r10)
            eٍّؓ r1 = new eٍّؓ
            r4 = 0
            r5 = 0
            r1.<init>(r10, r5, r4)
            r0.f7174e = r10
            r0.f7175e = r3
            java.lang.Object r8 = defpackage.AbstractC8306e.mopub(r8, r1, r0)
            eٟؔۙ r9 = defpackage.EnumC2821e.f6782e
            if (r8 != r9) goto L50
            return r9
        L50:
            r6 = r10
            r10 = r8
            r8 = r6
        L53:
            if (r10 == 0) goto L56
            goto L57
        L56:
            r3 = 0
        L57:
            r2.remove(r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15031e.ad(long, eُؑ۠):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AbstractC9743e.license(this.f29801e, null);
    }
}
