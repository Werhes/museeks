package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13817e implements InterfaceC7224e, InterfaceC7860e {
    public final /* synthetic */ InterfaceC7224e ad;
    public int appmetrica;
    public final C5609e license;
    public final C14826e metrica;
    public final C5609e purchase;
    public final C10345e vip;

    public C13817e(InterfaceC7224e interfaceC7224e, C18464e c18464e, C10345e c10345e) {
        this.ad = interfaceC7224e;
        this.vip = c10345e;
        C14826e license = AbstractC8461e.license(this);
        this.metrica = license;
        this.license = new C5609e(BuildConfig.FLAVOR);
        this.purchase = new C5609e(BuildConfig.FLAVOR);
        AbstractC7535e.Signature(new C11318e(AbstractC12442e.m3350this((C14688e) c18464e.f36194e, interfaceC7224e.vip(), 4), new C7195e(this, (InterfaceC5083e) null, 2), 3), license);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mopub(defpackage.C13817e r5, defpackage.C6571e r6, defpackage.AbstractC10731e r7) {
        /*
            eؘْؗ r0 = r5.license
            boolean r1 = r7 instanceof defpackage.C15507e
            if (r1 == 0) goto L15
            r1 = r7
            eٕٖۙ r1 = (defpackage.C15507e) r1
            int r2 = r1.f30643e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f30643e = r2
            goto L1a
        L15:
            eٕٖۙ r1 = new eٕٖۙ
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r5 = r1.f30641e
            int r7 = r1.f30643e
            r2 = 1
            if (r7 == 0) goto L31
            if (r7 != r2) goto L29
            eؘْؗ r0 = r1.f30642e
            defpackage.AbstractC2003e.purchase(r5)
            goto L69
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.AbstractC2003e.purchase(r5)
            java.lang.Object r5 = r6.f13544e
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != 0) goto L50
            java.lang.Object r5 = r6.f13543e
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != 0) goto L50
            java.lang.String r5 = ""
            r0.subscription(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L50:
            eّٕٓ r5 = defpackage.AbstractC6731e.ad
            eؕۙۜ r5 = defpackage.ExecutorC3603e.f8134e
            eّۤ r7 = new eّۤ
            r3 = 21
            r4 = 0
            r7.<init>(r6, r4, r3)
            r1.f30642e = r0
            r1.f30643e = r2
            java.lang.Object r5 = defpackage.AbstractC5336e.advert(r5, r7, r1)
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r5 != r6) goto L69
            return r6
        L69:
            r0.subscription(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13817e.mopub(eؘؙٓ, eؙۖؕ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC7860e
    public final void ad(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        boolean z;
        C13817e c13817e = this;
        c13770e.m3671package(-589611579);
        int i2 = i | (c13770e.yandex(c13817e) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new C16330e(0);
                c13770e.m3682throws(m3681throw);
            }
            C16330e c16330e = (C16330e) m3681throw;
            InterfaceC12864e mopub = AbstractC12220e.mopub(interfaceC12864e, 48);
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11685e, c13770e, 0);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, mopub);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, ad, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            int purchase2 = c16330e.purchase();
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C3814e(c16330e, 1);
                c13770e.m3682throws(m3681throw2);
            }
            Function1 function1 = (Function1) m3681throw2;
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            C5228e c5228e = new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C7913e c7913e = AbstractC18007e.vip;
            InterfaceC12864e premium = c5228e.premium(c7913e);
            c13817e = this;
            c13817e.billing(purchase2, ((i2 << 6) & 7168) | 48, c13770e, premium, function1);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            InterfaceC12864e premium2 = new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).premium(c7913e);
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11700e, false);
            long j2 = c13770e.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, premium2);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i4, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
            int purchase4 = c16330e.purchase();
            if (purchase4 == 0) {
                c13770e.m3676strictfp(-815159726);
                c13817e.adcel(c13770e, (i2 >> 3) & 14);
                c13770e.Signature(false);
            } else if (purchase4 != 1) {
                if (purchase4 != 2) {
                    c13770e.m3676strictfp(-820794317);
                    z = false;
                } else {
                    z = false;
                    c13770e.m3676strictfp(-814976020);
                    c13817e.yandex(c13770e, (i2 >> 3) & 14);
                }
                c13770e.Signature(z);
            } else {
                c13770e.m3676strictfp(-815068431);
                c13817e.startapp(c13770e, (i2 >> 3) & 14);
                c13770e.Signature(false);
            }
            c13770e.Signature(true);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2173e(c13817e, interfaceC12864e, i, 16);
        }
    }

    public final void adcel(C13770e c13770e, int i) {
        int i2;
        int i3;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1302254320);
        if ((i & 6) == 0) {
            i2 = i | (c13770e2.yandex(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (c13770e2.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC3314e vip = AbstractC3265e.vip(this.license, c13770e2, 0);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(16), C5438e.f11678e, c13770e2, 54);
            long j = c13770e2.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, c0115e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e2, ad, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e2, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i4);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e2, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e2, purchase, c14865e4);
            if (((String) vip.getValue()).length() > 0) {
                c13770e2.m3676strictfp(516683994);
                C15492e c15492e = AbstractC10984e.ad;
                InterfaceC12864e metrica = AbstractC16136e.metrica(AbstractC12447e.vip(AbstractC16398e.license(AbstractC18007e.startapp(c0115e, 300), 2, ((C16305e) c13770e2.adcel(c15492e)).license, false, 28), ((C16305e) c13770e2.adcel(c15492e)).license), C3618e.appmetrica, AbstractC10432e.ad);
                InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                long j2 = c13770e2.f27286case;
                int i5 = (int) (j2 ^ (j2 >>> 32));
                InterfaceC3483e advert2 = c13770e2.advert();
                InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, metrica);
                c13770e2.m3666import();
                if (c13770e2.f27292implements) {
                    c13770e2.mopub(c7309e);
                } else {
                    c13770e2.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e2, license, c14865e);
                AbstractC2270e.yandex(c13770e2, advert2, c14865e2);
                AbstractC13501e.mopub(i5, c13770e2, c14865e3, c13770e2, c5430e);
                AbstractC2270e.yandex(c13770e2, purchase2, c14865e4);
                String str = (String) vip.getValue();
                Object[] objArr = new Object[0];
                Object m3681throw = c13770e2.m3681throw();
                if (m3681throw == C2987e.ad) {
                    m3681throw = new C13887e(3);
                    c13770e2.m3682throws(m3681throw);
                }
                AbstractC16268e.ad(AbstractC7291e.yandex(str, objArr, (Function1) m3681throw, c13770e2), AbstractC12220e.mopub(AbstractC18007e.metrica, 32), null, null, 0.0f, c13770e2, 432, 120);
                c13770e2.Signature(true);
                c13770e2.m3676strictfp(-1645864803);
                C9122e c9122e = new C9122e();
                c9122e.metrica(AbstractC5297e.appmetrica(c13770e2, R.string.tv_auth_way_qr_hint));
                c9122e.metrica(" ");
                c13770e2.m3676strictfp(-1645859834);
                int appmetrica = c9122e.appmetrica(new C4282e(0L, 0L, C1812e.f4891e, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                try {
                    c9122e.metrica(AbstractC5297e.appmetrica(c13770e2, R.string.tv_auth_way_qr_hint2));
                    Unit unit = Unit.INSTANCE;
                    c9122e.license(appmetrica);
                    c13770e2.Signature(false);
                    C10566e purchase3 = c9122e.purchase();
                    c13770e2.Signature(false);
                    C15492e c15492e2 = AbstractC17878e.ad;
                    AbstractC10600e.metrica(purchase3, null, 0L, 0L, 0L, new C7975e(3), 0L, 0, false, 0, 0, null, null, ((C10375e) c13770e2.adcel(c15492e2)).adcel, c13770e, 0);
                    AbstractC10600e.vip(AbstractC5297e.appmetrica(c13770e, R.string.tv_auth_way_qr_hint3), null, 0L, 0L, 0L, new C7975e(3), 0L, 0, false, 0, 0, null, ((C10375e) c13770e.adcel(c15492e2)).mopub, c13770e, 0, 0, 65022);
                    c13770e2 = c13770e;
                    c13770e2.Signature(false);
                } catch (Throwable th) {
                    c9122e.license(appmetrica);
                    throw th;
                }
            } else {
                c13770e2.m3676strictfp(518508065);
                AbstractC6574e.ad(null, 0L, 0.0f, 0L, 0, 0.0f, c13770e, 0, 63);
                c13770e2 = c13770e;
                c13770e2.Signature(false);
            }
            i3 = 1;
            c13770e2.Signature(true);
        } else {
            i3 = 1;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C6749e(this, i, i3);
        }
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC1722e appmetrica() {
        return this.ad.appmetrica();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0232, code lost:
    
        if (r9 == r8) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void billing(int r53, int r54, defpackage.C13770e r55, defpackage.InterfaceC12864e r56, kotlin.jvm.functions.Function1 r57) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13817e.billing(int, int, eٓؕۥ, eّۤۧ, kotlin.jvm.functions.Function1):void");
    }

    @Override // defpackage.InterfaceC7224e
    public final C13391e license() {
        return this.ad.license();
    }

    @Override // defpackage.InterfaceC7224e
    public final C16722e metrica() {
        return this.ad.metrica();
    }

    @Override // defpackage.InterfaceC7224e
    public final C15723e purchase() {
        return this.ad.purchase();
    }

    public final void startapp(C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-118951360);
        int i2 = i & 1;
        if (c13770e2.m3673protected(i2, i2 != 0)) {
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(16), C5438e.f11678e, c13770e2, 54);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
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
            AbstractC2270e.yandex(c13770e2, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            String appmetrica = AbstractC5297e.appmetrica(c13770e2, R.string.tv_auth_way_pwd_eta);
            C15492e c15492e = AbstractC17878e.ad;
            AbstractC10600e.vip(appmetrica, null, 0L, 0L, 0L, new C7975e(3), 0L, 0, false, 0, 0, null, ((C10375e) c13770e2.adcel(c15492e)).appmetrica, c13770e, 0, 0, 65022);
            AbstractC10600e.vip(AbstractC5297e.appmetrica(c13770e, R.string.tv_auth_way_pwd_eta_desc), null, 0L, 0L, 0L, new C7975e(3), 0L, 0, false, 0, 0, null, ((C10375e) c13770e.adcel(c15492e)).mopub, c13770e, 0, 0, 65022);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C6749e(this, i, 0);
        }
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC10540e vip() {
        return this.ad.vip();
    }

    public final void yandex(C13770e c13770e, int i) {
        int i2;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(1414933631);
        if ((i & 6) == 0) {
            i2 = i | (c13770e2.yandex(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (c13770e2.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC3314e vip = AbstractC3265e.vip(this.purchase, c13770e2, 0);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(16), C5438e.f11678e, c13770e2, 54);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
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
            AbstractC2270e.yandex(c13770e2, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            String str = (String) vip.getValue();
            boolean yandex = c13770e2.yandex(this);
            Object m3681throw = c13770e2.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new C17955e(18, this);
                c13770e2.m3682throws(m3681throw);
            }
            C8094e c8094e = C8094e.ad;
            AbstractC11257e.metrica(str, (Function1) m3681throw, null, false, null, null, C17138e.billing, null, null, false, null, null, null, true, 0, 0, null, C8094e.license(((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad, (C15331e) c13770e2.adcel(AbstractC8389e.ad)), c13770e, 12582912, 12582912, 4063100);
            c13770e2 = c13770e;
            boolean yandex2 = c13770e2.yandex(this);
            Object m3681throw2 = c13770e2.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C5671e(23, this);
                c13770e2.m3682throws(m3681throw2);
            }
            AbstractC11138e.ad((Function0) m3681throw2, null, null, null, C17138e.yandex, c13770e2, 0, 4094);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C6749e(this, i, 2);
        }
    }
}
