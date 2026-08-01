package defpackage;

import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioFollowingsUpdateInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۥٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10653e {
    public static final C2892e ad = new C2892e(-564535719, false, new C0972e(13));
    public static final C2892e vip = new C2892e(-1096466280, false, new C0972e(14));

    public static final void ad(AudioFollowingsUpdateInfo audioFollowingsUpdateInfo, Function0 function0, C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(-627387990);
        int i2 = (c13770e.yandex(audioFollowingsUpdateInfo) ? 4 : 2) | i | (c13770e.yandex(function0) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            AbstractC0865e.metrica(AbstractC18007e.metrica(AbstractC12220e.smaato(C0115e.f1276e, 16, 0.0f, 2), 1.0f), null, AbstractC12322e.yandex(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.subscription, 0L, c13770e, 0, 14), null, null, AbstractC16653e.license(-877443146, new C8937e(audioFollowingsUpdateInfo, function0, 28), c13770e), c13770e, 196614, 26);
            c13770e2 = c13770e;
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C6949e(audioFollowingsUpdateInfo, function0, i, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC15728e appmetrica(AbstractC15728e abstractC15728e, AbstractC1186e abstractC1186e) {
        if (abstractC15728e instanceof InterfaceC0875e) {
            return appmetrica(((InterfaceC0875e) abstractC15728e).startapp(), abstractC1186e);
        }
        if (abstractC1186e == null || abstractC1186e.equals(abstractC15728e)) {
            return abstractC15728e;
        }
        if (abstractC15728e instanceof AbstractC10226e) {
            return new C15050e((AbstractC10226e) abstractC15728e, abstractC1186e);
        }
        if (abstractC15728e instanceof AbstractC14773e) {
            return new C1466e((AbstractC14773e) abstractC15728e, abstractC1186e);
        }
        throw new C14803e(10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object license(int r6, java.lang.Object r7, defpackage.C10761e r8, defpackage.C1812e r9, int r10) {
        /*
            boolean r0 = r7 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r7
        L5:
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            eٌؓٔ r0 = r8.vip
            boolean r0 = defpackage.AbstractC7890e.billing(r0, r9)
            if (r0 != 0) goto L29
            eٌؓٔ r0 = defpackage.C1812e.f4890e
            int r3 = r9.compareTo(r0)
            if (r3 < 0) goto L29
            eٌؓٔ r3 = r8.vip
            int r3 = r3.f4894e
            int r0 = r0.f4894e
            int r0 = defpackage.AbstractC7890e.yandex(r3, r0)
            if (r0 >= 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            r3 = 2
            r6 = r6 & r3
            if (r6 == 0) goto L36
            r8.getClass()
            if (r10 != 0) goto L34
            goto L36
        L34:
            r6 = r2
            goto L37
        L36:
            r6 = r1
        L37:
            if (r6 != 0) goto L3c
            if (r0 != 0) goto L3c
            return r7
        L3c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L5d
            if (r6 == 0) goto L48
            if (r10 != r2) goto L48
            r6 = r2
            goto L49
        L48:
            r6 = r1
        L49:
            if (r6 == 0) goto L4f
            if (r0 == 0) goto L4f
            r1 = 3
            goto L56
        L4f:
            if (r0 == 0) goto L53
            r1 = r2
            goto L56
        L53:
            if (r6 == 0) goto L56
            r1 = r3
        L56:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r7, r1)
            return r6
        L5d:
            if (r0 == 0) goto L62
            int r9 = r9.f4894e
            goto L66
        L62:
            eٌؓٔ r9 = r8.vip
            int r9 = r9.f4894e
        L66:
            if (r6 == 0) goto L6c
            if (r10 != r2) goto L6f
            r1 = r2
            goto L6f
        L6c:
            r8.getClass()
        L6f:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = defpackage.AbstractC17305e.billing(r7, r9, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10653e.license(int, java.lang.Object, eُؓۛ, eٌؓٔ, int):java.lang.Object");
    }

    public static final int metrica(C14870e c14870e) {
        return (int) (c14870e.appmetrica == EnumC17426e.f34146e ? c14870e.purchase() & 4294967295L : c14870e.purchase() >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC1186e vip(AbstractC1186e abstractC1186e) {
        if (abstractC1186e instanceof InterfaceC0875e) {
            return ((InterfaceC0875e) abstractC1186e).license();
        }
        return null;
    }
}
