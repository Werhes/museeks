package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۘۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14197e extends AbstractC10347e implements InterfaceC18435e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C8419e f28048e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C12742e f28049e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f28050e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f28051e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C12742e f28052e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C1615e f28053e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C12742e f28054e;

    public C14197e() {
        super(0);
        this.f28050e = AbstractC9743e.vip();
        this.f28049e = new C12742e();
        this.f28052e = new C12742e();
        this.f28054e = new C12742e();
        this.f28051e = AbstractC14533e.startapp(Boolean.FALSE);
        this.f28053e = AbstractC9180e.metrica(BuildConfig.FLAVOR);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r6 == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r6 == r7) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: private, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3764private(defpackage.C14197e r6, defpackage.AbstractC10731e r7) {
        /*
            eؓؗ r0 = r6.f28053e
            eِّۛ r1 = r6.f28049e
            boolean r2 = r7 instanceof defpackage.C4230e
            if (r2 == 0) goto L17
            r2 = r7
            eِٜؖ r2 = (defpackage.C4230e) r2
            int r3 = r2.f9299e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f9299e = r3
            goto L1c
        L17:
            eِٜؖ r2 = new eِٜؖ
            r2.<init>(r6, r7)
        L1c:
            java.lang.Object r6 = r2.f9298e
            int r7 = r2.f9299e
            r3 = 2
            r4 = 1
            if (r7 == 0) goto L38
            if (r7 == r4) goto L34
            if (r7 != r3) goto L2c
            defpackage.AbstractC2003e.purchase(r6)
            goto L93
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.AbstractC2003e.purchase(r6)
            goto L7a
        L38:
            defpackage.AbstractC2003e.purchase(r6)
            r1.clear()
            java.lang.Object r6 = r0.getValue()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            eٟؔۙ r7 = defpackage.EnumC2821e.f6782e
            if (r6 <= 0) goto L7d
            eًۛ۠ r6 = defpackage.AbstractC1831e.vip()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r2.f9299e = r4
            eؘُٛ r3 = new eؘُٛ
            eُؗؒ r4 = defpackage.C4590e.f9883e
            java.lang.String r5 = "audio.searchArtists"
            r3.<init>(r5, r4)
            java.lang.String r4 = "q"
            r3.ad(r4, r0)
            java.lang.String r0 = "offset"
            r4 = 0
            r3.vip(r4, r0)
            java.lang.String r0 = "count"
            r4 = 100
            r3.vip(r4, r0)
            java.lang.Object r6 = r6.license(r3, r2)
            if (r6 != r7) goto L7a
            goto L92
        L7a:
            eٍؒۢ r6 = (defpackage.AbstractC9200e) r6
            goto L95
        L7d:
            eًۛ۠ r6 = defpackage.AbstractC1831e.vip()
            r2.f9299e = r3
            eؘُٛ r0 = new eؘُٛ
            eؘؒۢ r3 = defpackage.C1400e.f4197e
            java.lang.String r4 = "audio.recommendationsOnboarding"
            r0.<init>(r4, r3)
            java.lang.Object r6 = r6.license(r0, r2)
            if (r6 != r7) goto L93
        L92:
            return r7
        L93:
            eٍؒۢ r6 = (defpackage.AbstractC9200e) r6
        L95:
            java.lang.Object r6 = defpackage.AbstractC3425e.adcel(r6)
            eٌِۡ r6 = (defpackage.C8641e) r6
            if (r6 == 0) goto La0
            java.util.List r6 = r6.vip
            goto La1
        La0:
            r6 = 0
        La1:
            if (r6 != 0) goto La5
            eْۨٝ r6 = defpackage.C13664e.f27089e
        La5:
            r1.addAll(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14197e.m3764private(eٓۘۢ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f28050e.f29359e;
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(-1089695942);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            int startapp = AbstractC4533e.startapp(0.0f, c13770e, 0, 1);
            C5958e ad = AbstractC9083e.ad(c13770e);
            Unit unit = Unit.INSTANCE;
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C3523e(this, null, 1);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw);
            int i3 = 9;
            AbstractC13348e.ad(null, AbstractC16653e.license(-1822697986, new C15709e(ad, this, 3), c13770e), AbstractC16653e.license(-1559000961, new C13752e(this, startapp, i3), c13770e), null, null, 0, 0L, 0L, AbstractC3338e.ad, AbstractC16653e.license(-815274423, new C11828e(this, ad, i3), c13770e), c13770e, 905970096, 249);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6258e(this, i);
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m3765strictfp(C0004e c0004e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        long j;
        C0004e c0004e2 = c0004e;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(1266141414);
        int i2 = i | (c13770e2.yandex(c0004e2) ? 4 : 2) | (c13770e2.purchase(interfaceC12864e) ? 32 : 16) | (c13770e2.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            int startapp = AbstractC4533e.startapp(0.0f, c13770e2, 0, 1);
            String str = c0004e2.metrica;
            boolean ads = AbstractC13480e.ads(this.f28052e, str);
            boolean z = (!ads || this.f28048e == null || AbstractC13480e.ads(this.f28054e, str)) ? false : true;
            InterfaceC16132e vip = AbstractC16102e.vip(ads ? 0.5f : 0.0f, null, null, null, c13770e2, 0, 30);
            InterfaceC16132e vip2 = AbstractC16102e.vip(ads ? 1.0f : 0.0f, null, null, null, c13770e, 0, 30);
            if (z) {
                c13770e.m3676strictfp(1286175563);
                c13770e.Signature(false);
                j = C3618e.vip;
            } else {
                c13770e.m3676strictfp(1286176749);
                j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.ad;
                c13770e.Signature(false);
            }
            InterfaceC16132e ad = AbstractC3145e.ad(j, null, null, null, c13770e, 0, 14);
            boolean purchase = c13770e.purchase(str);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (purchase || m3681throw == c5170e) {
                List list = c0004e2.appmetrica;
                if (list == null) {
                    list = C13664e.f27089e;
                }
                C14762e c14762e = (C14762e) AbstractC13480e.m3604this(list);
                m3681throw = c14762e != null ? c14762e.ad : null;
                c13770e.m3682throws(m3681throw);
            }
            String str2 = (String) m3681throw;
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(12), C5438e.f11672e, c13770e, 6);
            long j2 = c13770e.f27286case;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            C3924e c3924e = AbstractC6549e.ad;
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e metrica = AbstractC10075e.metrica(AbstractC12447e.vip(c0115e, c3924e), false);
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j3 = c13770e.f27286case;
            int i4 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, metrica);
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
            InterfaceC12864e metrica2 = AbstractC10075e.metrica(AbstractC12447e.vip(c0115e, c3924e), false);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC8461e.vip(str2, null, metrica2, new C6159e(((C7019e) c13770e.adcel(c15492e)).ad.ads), new C6159e(((C7019e) c13770e.adcel(c15492e)).ad.ads), null, c13770e, 36912, 0, 32736);
            InterfaceC12864e metrica3 = AbstractC16136e.metrica(AbstractC1376e.ad(AbstractC18007e.metrica, ((Number) vip2.getValue()).floatValue()), C3618e.vip(((Number) vip.getValue()).floatValue(), ((C3618e) ad.getValue()).ad), AbstractC10432e.ad);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11700e, false);
            long j4 = c13770e.f27286case;
            int i5 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC3483e advert3 = c13770e.advert();
            InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e, metrica3);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license2, c14865e);
            AbstractC2270e.yandex(c13770e, advert3, c14865e2);
            AbstractC13501e.mopub(i5, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase4, c14865e4);
            Boolean valueOf2 = Boolean.valueOf(z);
            boolean license3 = c13770e.license(startapp);
            Object m3681throw2 = c13770e.m3681throw();
            if (license3 || m3681throw2 == c5170e) {
                m3681throw2 = new C17028e(startapp, 21);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC7572e.vip(valueOf2, null, (Function1) m3681throw2, null, null, null, AbstractC0181e.purchase, c13770e, 1572864, 58);
            c13770e.Signature(true);
            c13770e.Signature(true);
            c0004e2 = c0004e;
            AbstractC14489e.vip(c0004e2.ad, AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), 8, 0.0f, 2), ((C7019e) c13770e.adcel(c15492e)).ad.admob, AbstractC13362e.startapp(14), null, null, null, 0L, new C7975e(3), AbstractC13362e.startapp(18), 2, false, 1, 0, null, c13770e, 24624, 25008, 238568);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C4197e(this, c0004e2, interfaceC12864e, i, 24);
        }
    }
}
