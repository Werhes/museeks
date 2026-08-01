package defpackage;

import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17046e extends AbstractC16997e {

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final /* synthetic */ int f33386e = 0;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final CatalogArtist f33387e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final boolean f33388e;

    public C17046e(CatalogArtist catalogArtist, boolean z) {
        super(false, 3);
        this.f33387e = catalogArtist;
        this.f33388e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0064 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object isVip(defpackage.C17046e r9, java.lang.String r10, defpackage.AbstractC10731e r11) {
        /*
            boolean r0 = r11 instanceof defpackage.C4500e
            if (r0 == 0) goto L13
            r0 = r11
            eؖۦؗ r0 = (defpackage.C4500e) r0
            int r1 = r0.f9766e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9766e = r1
            goto L18
        L13:
            eؖۦؗ r0 = new eؖۦؗ
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f9767e
            int r1 = r0.f9766e
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            eؚؖٞ r10 = r0.f9768e
            java.util.List r1 = r0.f9763e
            java.lang.String r3 = r0.f9765e
            defpackage.AbstractC2003e.purchase(r11)     // Catch: java.lang.Exception -> L2e
            r4 = r9
            r6 = r10
            r5 = r3
            goto L67
        L2e:
            r0 = move-exception
            r9 = r0
            goto L80
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.AbstractC2003e.purchase(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            eؚؖٞ r1 = new eؚؖٞ
            r1.<init>()
            r5 = r10
            r6 = r1
            r1 = r11
        L49:
            eّٕٓ r10 = defpackage.AbstractC6731e.ad     // Catch: java.lang.Exception -> L2e
            eؕۙۜ r10 = defpackage.ExecutorC3603e.f8134e     // Catch: java.lang.Exception -> L2e
            eٔٞۢ r3 = new eٔٞۢ     // Catch: java.lang.Exception -> L2e
            r7 = 0
            r8 = 10
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L2e
            r0.f9765e = r5     // Catch: java.lang.Exception -> L2e
            r0.f9763e = r1     // Catch: java.lang.Exception -> L2e
            r0.f9768e = r6     // Catch: java.lang.Exception -> L2e
            r0.f9766e = r2     // Catch: java.lang.Exception -> L2e
            java.lang.Object r11 = defpackage.AbstractC5336e.advert(r10, r3, r0)     // Catch: java.lang.Exception -> L2e
            eٟؔۙ r9 = defpackage.EnumC2821e.f6782e
            if (r11 != r9) goto L67
            return r9
        L67:
            ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems r11 = (ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems) r11     // Catch: java.lang.Exception -> L2e
            java.lang.Object r9 = r11.ad     // Catch: java.lang.Exception -> L2e
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L2e
            r1.addAll(r9)     // Catch: java.lang.Exception -> L2e
            int r10 = r6.f8852e     // Catch: java.lang.Exception -> L2e
            r11 = 100
            int r10 = r10 + r11
            r6.f8852e = r10     // Catch: java.lang.Exception -> L2e
            int r9 = r9.size()     // Catch: java.lang.Exception -> L2e
            if (r9 >= r11) goto L7e
            return r1
        L7e:
            r9 = r4
            goto L49
        L80:
            r9.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17046e.isVip(eٖٗۚ, java.lang.String, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(-613588687);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(-2022598708, new C15640e(this), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15640e(this, i);
        }
    }
}
