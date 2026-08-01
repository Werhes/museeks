package defpackage;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7890e {
    public static final StringBuilder ad = new StringBuilder(48);

    /* JADX WARN: Type inference failed for: r12v1, types: [eَؚۘ, eۜ۟] */
    /* JADX WARN: Type inference failed for: r1v0, types: [eؙّؓ, java.lang.Object] */
    public static C18382e ad(Function1 function1) {
        C2915e c2915e = AbstractC10129e.metrica;
        ?? obj = new Object();
        C10836e c10836e = c2915e.ad;
        obj.ad = c10836e.ad;
        obj.vip = c10836e.vip;
        obj.metrica = c10836e.metrica;
        obj.license = c10836e.license;
        obj.appmetrica = c10836e.appmetrica;
        obj.purchase = c10836e.purchase;
        obj.billing = c10836e.billing;
        obj.yandex = c10836e.yandex;
        obj.startapp = c10836e.startapp;
        obj.adcel = c2915e.vip;
        function1.invoke(obj);
        return new AbstractC10129e(new C10836e(obj.ad, obj.vip, obj.metrica, obj.license, obj.appmetrica, obj.purchase, obj.billing, obj.yandex, obj.startapp), obj.adcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean adcel() {
        /*
            r0 = 0
            java.lang.String r1 = "ro.miui.ui.version.name"
            java.lang.String r1 = defpackage.AbstractC0882e.appmetrica(r1)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L10
            goto L1a
        L10:
            boolean r1 = defpackage.AbstractC0882e.purchase()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            r1 = 1
            goto L1b
        L18:
            r1 = move-exception
            goto L20
        L1a:
            r1 = r0
        L1b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L18
            goto L26
        L20:
            eّۜۖ r2 = new eّۜۖ
            r2.<init>(r1)
            r1 = r2
        L26:
            boolean r2 = r1 instanceof defpackage.C12763e
            if (r2 == 0) goto L2c
            r1 = 0
        L2c:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L34
            boolean r0 = r1.booleanValue()
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7890e.adcel():boolean");
    }

    public static void advert(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final void appmetrica(C13770e c13770e, int i) {
        c13770e.m3671package(-1413442675);
        if (c13770e.m3673protected(i & 1, i != 0)) {
            String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.ota_card_failed);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(C0115e.f1276e, 1.0f), ((C7019e) c13770e.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.appmetrica, c13770e, 48, 0, 130040);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15584e(i, 3);
        }
    }

    public static boolean billing(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final void license(C16101e c16101e, Function0 function0, C13770e c13770e, int i) {
        c13770e.m3671package(-1560328396);
        int i2 = (c13770e.purchase(c16101e) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (c13770e.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC0865e.vip(function0, metrica, false, null, AbstractC12322e.vip(AbstractC6532e.billing(C3618e.vip(0.05f, ((C7019e) c13770e.adcel(c15492e)).ad.ad), ((C7019e) c13770e.adcel(c15492e)).ad.subscription), 0L, 0L, 0L, c13770e, 0, 14), null, null, AbstractC16653e.license(-2066587031, new C17871e(27, c16101e), c13770e), c13770e, ((i3 >> 3) & 14) | 100663344, 236);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(c16101e, function0, i, 27);
        }
    }

    public static final void metrica(Function0 function0, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(159208144);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            AbstractC0865e.vip(function0, AbstractC18007e.metrica(C0115e.f1276e, 1.0f), false, null, AbstractC12322e.appmetrica(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad), null, null, AbstractC13083e.ad, c13770e, (i2 & 14) | 100663344, 236);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C8573e(i, function0);
        }
    }

    public static short mopub(int i) {
        return (short) ((i - (((short) (62209 * i)) * 3329)) >> 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static final void purchase(final C16101e c16101e, boolean z, final boolean z2, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, C13770e c13770e, final int i) {
        int i2;
        ?? r3;
        C0115e c0115e;
        float f;
        final boolean z3 = z;
        c13770e.m3671package(1677166610);
        int i3 = i | (c13770e.purchase(c16101e) ? 4 : 2) | (c13770e.billing(z3) ? 32 : 16) | (c13770e.billing(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.yandex(function0) ? 2048 : 1024) | (c13770e.yandex(function02) ? 16384 : 8192) | (c13770e.yandex(function03) ? 131072 : 65536) | (c13770e.yandex(function04) ? 1048576 : 524288);
        if (c13770e.m3673protected(i3 & 1, (599187 & i3) != 599186)) {
            float f2 = 16;
            float ad2 = ((C0916e) c13770e.adcel(AbstractC12450e.ad)).ad(c13770e) + f2;
            C0115e c0115e2 = C0115e.f1276e;
            InterfaceC12864e loadAd = AbstractC12220e.loadAd(c0115e2, f2, 0.0f, f2, ad2, 2);
            C4789e ad3 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11678e, c13770e, 48);
            long j = c13770e.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, loadAd);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad3, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            if (z3) {
                c13770e.m3676strictfp(1925746594);
                i2 = i3;
                f = f2;
                r3 = 0;
                c0115e = c0115e2;
                C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e, 196608, 31);
                c13770e.Signature(false);
            } else {
                i2 = i3;
                r3 = 0;
                c0115e = c0115e2;
                f = f2;
                c13770e.m3676strictfp(1925808377);
                AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
                c13770e.Signature(false);
            }
            appmetrica(c13770e, r3);
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
            int i5 = i2 >> 6;
            license(c16101e, function0, c13770e, (i2 & 14) | (i5 & 112));
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
            if (z2) {
                c13770e.m3676strictfp(1926074636);
                metrica(function04, c13770e, (i2 >> 18) & 14);
                AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
            } else {
                c13770e.m3676strictfp(1923787642);
            }
            c13770e.Signature(r3);
            z3 = z;
            vip(z3, function03, function02, c13770e, ((i2 >> 3) & 14) | ((i2 >> 12) & 112) | (i5 & 896));
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(z3, z2, function0, function02, function03, function04, i) { // from class: eٍؚٓ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f27388e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ boolean f27389e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ boolean f27390e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f27391e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f27393e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f27394e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert2 = AbstractC5190e.advert(1);
                    AbstractC7890e.purchase(C16101e.this, this.f27390e, this.f27389e, this.f27391e, this.f27388e, this.f27394e, this.f27393e, (C13770e) obj, advert2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static int startapp(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static final void vip(boolean z, Function0 function0, Function0 function02, C13770e c13770e, int i) {
        int i2;
        Function0 function03;
        Function0 function04 = function02;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-427363472);
        if ((i & 6) == 0) {
            i2 = (c13770e2.billing(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e2.yandex(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e2.yandex(function04) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = i2;
        if (c13770e2.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11685e, c13770e2, 0);
            long j = c13770e2.f27286case;
            int i4 = (int) ((j >>> 32) ^ j);
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, C0115e.f1276e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            if (z) {
                c13770e2.m3676strictfp(-847560202);
                AbstractC1513e.license(function0, null, false, null, null, null, AbstractC13083e.vip, c13770e2, ((i3 >> 3) & 14) | 805306368, 510);
            } else {
                c13770e2.m3676strictfp(-852782834);
            }
            c13770e2.Signature(false);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            AbstractC12534e.ad(c13770e2, new C5228e(1.0f, true));
            function03 = function0;
            AbstractC1513e.ad(function04, null, false, null, null, null, null, null, AbstractC13083e.metrica, c13770e, ((i3 >> 6) & 14) | 805306368, 510);
            function04 = function04;
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            function03 = function0;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C11935e(z, function03, function04, i);
        }
    }

    public static int yandex(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
