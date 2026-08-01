package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٝؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15598e implements InterfaceC16132e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f30773e = true;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Function1 f30774e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C6522e f30775e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0576e f30776e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f30777e;

    public C15598e(List list, Object obj, C6522e c6522e, C0909e c0909e, Function1 function1, C17214e c17214e) {
        this.f30777e = list;
        this.f30775e = c6522e;
        this.f30774e = function1;
        this.f30776e = AbstractC14533e.startapp(obj);
    }

    @Override // defpackage.InterfaceC16132e
    public final Object getValue() {
        return this.f30776e.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0095 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:16:0x0095, B:23:0x0046, B:25:0x004b, B:28:0x0071, B:34:0x008b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0095 -> B:14:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.AbstractC10731e r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.C7104e
            if (r0 == 0) goto L13
            r0 = r11
            eَؚّ r0 = (defpackage.C7104e) r0
            int r1 = r0.f14571e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14571e = r1
            goto L18
        L13:
            eَؚّ r0 = new eَؚّ
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f14572e
            int r1 = r0.f14571e
            kotlin.jvm.functions.Function1 r2 = r10.f30774e
            eؑۜٝ r3 = r10.f30776e
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L88
            r6 = 2
            if (r1 == r4) goto L3e
            if (r1 != r6) goto L36
            int r1 = r0.f14575e
            int r6 = r0.f14576e
            java.util.List r7 = r0.f14573e
            defpackage.AbstractC2003e.purchase(r11)     // Catch: java.lang.Throwable -> L33
            goto L9e
        L33:
            r11 = move-exception
            goto Lb7
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3e:
            int r1 = r0.f14575e
            int r7 = r0.f14576e
            eُؓۛ r8 = r0.f14570e
            java.util.List r9 = r0.f14573e
            defpackage.AbstractC2003e.purchase(r11)     // Catch: java.lang.Throwable -> L33
            if (r11 == 0) goto L71
            eؙٜۨ r1 = r10.f30775e     // Catch: java.lang.Throwable -> L33
            int r4 = r1.license     // Catch: java.lang.Throwable -> L33
            eٌؓٔ r6 = r1.vip     // Catch: java.lang.Throwable -> L33
            int r1 = r1.metrica     // Catch: java.lang.Throwable -> L33
            java.lang.Object r11 = defpackage.AbstractC10653e.license(r4, r11, r8, r6, r1)     // Catch: java.lang.Throwable -> L33
            r3.setValue(r11)     // Catch: java.lang.Throwable -> L33
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L33
            eٌِٞ r0 = r0.f21135e
            boolean r0 = defpackage.AbstractC6629e.amazon(r0)
            r10.f30773e = r5
            eؚؗ۟ r1 = new eؚؗ۟
            java.lang.Object r3 = r3.getValue()
            r1.<init>(r3, r0)
            r2.invoke(r1)
            return r11
        L71:
            r0.f14573e = r9     // Catch: java.lang.Throwable -> L33
            r11 = 0
            r0.f14570e = r11     // Catch: java.lang.Throwable -> L33
            r0.f14576e = r7     // Catch: java.lang.Throwable -> L33
            r0.f14575e = r1     // Catch: java.lang.Throwable -> L33
            r0.f14571e = r6     // Catch: java.lang.Throwable -> L33
            java.lang.Object r11 = defpackage.AbstractC2803e.loadAd(r0)     // Catch: java.lang.Throwable -> L33
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r11 != r6) goto L85
            return r6
        L85:
            r6 = r7
            r7 = r9
            goto L9e
        L88:
            defpackage.AbstractC2003e.purchase(r11)
            java.util.List r11 = r10.f30777e     // Catch: java.lang.Throwable -> L33
            int r1 = r11.size()     // Catch: java.lang.Throwable -> L33
            r7 = r11
            r6 = r5
        L93:
            if (r6 >= r1) goto La0
            java.lang.Object r11 = r7.get(r6)     // Catch: java.lang.Throwable -> L33
            eُؓۛ r11 = (defpackage.C10761e) r11     // Catch: java.lang.Throwable -> L33
            r11.getClass()     // Catch: java.lang.Throwable -> L33
        L9e:
            int r6 = r6 + r4
            goto L93
        La0:
            eٌِٞ r11 = r0.f21135e
            boolean r11 = defpackage.AbstractC6629e.amazon(r11)
            r10.f30773e = r5
            eؚؗ۟ r0 = new eؚؗ۟
            java.lang.Object r1 = r3.getValue()
            r0.<init>(r1, r11)
            r2.invoke(r0)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        Lb7:
            eٌِٞ r0 = r0.f21135e
            boolean r0 = defpackage.AbstractC6629e.amazon(r0)
            r10.f30773e = r5
            eؚؗ۟ r1 = new eؚؗ۟
            java.lang.Object r3 = r3.getValue()
            r1.<init>(r3, r0)
            r2.invoke(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15598e.metrica(eُؑ۠):java.lang.Object");
    }
}
