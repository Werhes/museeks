package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۚؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1299e {
    public static final C1299e ad = new Object();
    public static final float license;
    public static final float metrica;
    public static final float vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؒۚؒ, java.lang.Object] */
    static {
        float f = AbstractC18359e.ad;
        vip = f;
        metrica = f;
        license = AbstractC17572e.ad;
        AbstractC12220e.ad(0);
    }

    public static C17085e vip(C13770e c13770e, int i) {
        int i2 = AbstractC17572e.metrica;
        long appmetrica = AbstractC7893e.appmetrica(c13770e, i2);
        long appmetrica2 = AbstractC7893e.appmetrica(c13770e, i2);
        long vip2 = C3618e.vip(0.38f, AbstractC7893e.appmetrica(c13770e, 18));
        long appmetrica3 = AbstractC7893e.appmetrica(c13770e, 26);
        C15331e c15331e = (C15331e) c13770e.adcel(AbstractC8389e.ad);
        int i3 = AbstractC17572e.license;
        long appmetrica4 = AbstractC7893e.appmetrica(c13770e, i3);
        long appmetrica5 = AbstractC7893e.appmetrica(c13770e, i3);
        long vip3 = C3618e.vip(0.38f, AbstractC7893e.appmetrica(c13770e, 18));
        int i4 = AbstractC17572e.purchase;
        long appmetrica6 = AbstractC7893e.appmetrica(c13770e, i4);
        long appmetrica7 = AbstractC7893e.appmetrica(c13770e, i4);
        long vip4 = C3618e.vip(0.38f, AbstractC7893e.appmetrica(c13770e, 18));
        int i5 = AbstractC17572e.appmetrica;
        long appmetrica8 = AbstractC7893e.appmetrica(c13770e, i5);
        long appmetrica9 = AbstractC7893e.appmetrica(c13770e, i5);
        long vip5 = C3618e.vip(0.38f, AbstractC7893e.appmetrica(c13770e, 18));
        long appmetrica10 = AbstractC7893e.appmetrica(c13770e, 19);
        long appmetrica11 = AbstractC7893e.appmetrica(c13770e, 19);
        long vip6 = C3618e.vip(0.38f, AbstractC7893e.appmetrica(c13770e, 19));
        long appmetrica12 = AbstractC7893e.appmetrica(c13770e, 19);
        long appmetrica13 = AbstractC7893e.appmetrica(c13770e, 19);
        long vip7 = C3618e.vip(0.38f, AbstractC7893e.appmetrica(c13770e, 19));
        long j = C3618e.startapp;
        C8094e c8094e = C8094e.ad;
        return C8094e.vip(appmetrica, appmetrica2, vip2, j, j, j, appmetrica3, c15331e, appmetrica4, appmetrica5, vip3, appmetrica6, appmetrica7, vip4, appmetrica8, appmetrica9, vip5, appmetrica10, appmetrica11, vip6, appmetrica12, appmetrica13, vip7, c13770e, 1204058760, 2191);
    }

    public final void ad(final Function1 function1, final Function1 function12, final Function1 function13, InterfaceC12864e interfaceC12864e, boolean z, C17085e c17085e, C13770e c13770e, final int i) {
        final InterfaceC12864e interfaceC12864e2;
        final boolean z2;
        final C17085e c17085e2;
        C17085e vip2;
        InterfaceC12864e interfaceC12864e3;
        c13770e.m3671package(748018311);
        int i2 = i | 920322048;
        int i3 = (c13770e.purchase(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 50;
        boolean z3 = true;
        if (c13770e.m3673protected(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 147) == 146) ? false : true)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                vip2 = vip(c13770e, (i3 << 3) & 7168);
                interfaceC12864e3 = C0115e.f1276e;
            } else {
                c13770e.m3659default();
                interfaceC12864e3 = interfaceC12864e;
                z3 = z;
                vip2 = c17085e;
            }
            c13770e.admob();
            c13770e.m3676strictfp(1923805460);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                m3681throw = AbstractC17861e.adcel(c13770e);
            }
            C15274e c15274e = (C15274e) m3681throw;
            c13770e.Signature(false);
            boolean booleanValue = ((Boolean) AbstractC13281e.metrica(c15274e, c13770e, 0).getValue()).booleanValue();
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == obj) {
                m3681throw2 = new C6260e();
                c13770e.m3682throws(m3681throw2);
            }
            C6260e c6260e = (C6260e) m3681throw2;
            Object obj2 = (InterfaceC16054e) c13770e.adcel(AbstractC11473e.startapp);
            String vip3 = AbstractC9408e.vip(c13770e, R.string.m3c_search_bar_search);
            String vip4 = AbstractC9408e.vip(c13770e, R.string.m3c_suggestions_available);
            AbstractC4455e abstractC4455e = AbstractC14489e.ad;
            long metrica2 = ((C1839e) c13770e.adcel(abstractC4455e)).metrica();
            if (metrica2 == 16) {
                metrica2 = vip2.appmetrica(z3, false, booleanValue);
            }
            long j = metrica2;
            InterfaceC12864e interfaceC12864e4 = interfaceC12864e3;
            InterfaceC12864e license2 = AbstractC18366e.license(AbstractC18007e.advert(interfaceC12864e3, AbstractC6251e.vip, license, AbstractC6251e.metrica, 0.0f, 8), c6260e);
            Object m3681throw3 = c13770e.m3681throw();
            if (m3681throw3 == obj) {
                m3681throw3 = new C2046e(8, function13);
                c13770e.m3682throws(m3681throw3);
            }
            InterfaceC12864e license3 = AbstractC17324e.license(license2, (Function1) m3681throw3);
            boolean purchase = c13770e.purchase(vip3) | c13770e.purchase(vip4);
            Object m3681throw4 = c13770e.m3681throw();
            if (purchase || m3681throw4 == obj) {
                m3681throw4 = new C18513e(vip3, vip4);
                c13770e.m3682throws(m3681throw4);
            }
            InterfaceC12864e ad2 = AbstractC1147e.ad(license3, false, (Function1) m3681throw4);
            C1839e appmetrica = ((C1839e) c13770e.adcel(abstractC4455e)).appmetrica(new C1839e(j, 0L, null, null, 0L, 0L, 0, 0, 0L, 16777214));
            C18466e c18466e = new C18466e(vip2.startapp);
            C4988e c4988e = new C4988e(0, 3, 119);
            Object m3681throw5 = c13770e.m3681throw();
            if (m3681throw5 == obj) {
                m3681throw5 = new C2046e(9, function12);
                c13770e.m3682throws(m3681throw5);
            }
            C17085e c17085e3 = vip2;
            boolean z4 = z3;
            AbstractC0483e.license(BuildConfig.FLAVOR, function1, ad2, z4, appmetrica, c4988e, new C16636e(null, (Function1) m3681throw5, 47), true, 0, 0, null, null, c15274e, c18466e, AbstractC16653e.license(-813926844, new C0941e(z3, c15274e, vip2, booleanValue), c13770e), c13770e, 102239286, 196608, 7696);
            Boolean bool = Boolean.FALSE;
            boolean billing = c13770e.billing(booleanValue) | c13770e.yandex(obj2);
            Object m3681throw6 = c13770e.m3681throw();
            if (billing || m3681throw6 == obj) {
                m3681throw6 = new C13575e(booleanValue, obj2, (InterfaceC5083e) null, 5);
                c13770e.m3682throws(m3681throw6);
            }
            AbstractC17680e.license(c13770e, bool, (Function2) m3681throw6);
            z2 = z4;
            c17085e2 = c17085e3;
            interfaceC12864e2 = interfaceC12864e4;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            z2 = z;
            c17085e2 = c17085e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(function1, function12, function13, interfaceC12864e2, z2, c17085e2, i) { // from class: eٖۣٗ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f31964e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f31965e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f31966e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f31967e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ C17085e f31969e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ boolean f31970e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int advert = AbstractC5190e.advert(28087);
                    C1299e.this.ad(this.f31966e, this.f31965e, this.f31967e, this.f31964e, this.f31970e, this.f31969e, (C13770e) obj3, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
