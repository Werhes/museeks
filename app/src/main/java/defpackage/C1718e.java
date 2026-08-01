package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1718e extends AbstractC10347e implements InterfaceC13086e, InterfaceC18435e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C3168e f4664e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final AbstractC7185e f4665e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public final C5363e f4666e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f4667e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public final C10250e f4668e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final C0576e f4669e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final C0576e f4670e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final C0576e f4671e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C16330e f4672e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final C0576e f4673e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C12742e f4674e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C16330e f4675e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C0576e f4676e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C12742e f4677e;

    public C1718e() {
        this(new C12559e(2, 5, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1718e(Function2 function2) {
        super(0);
        this.f4667e = AbstractC9743e.vip();
        this.f4665e = (AbstractC7185e) function2;
        this.f4674e = new C12742e();
        this.f4677e = new C12742e();
        this.f4664e = new C3168e(new C0609e(8, this));
        this.f4672e = new C16330e(-1);
        this.f4675e = new C16330e(-1);
        Boolean bool = Boolean.FALSE;
        this.f4676e = AbstractC14533e.startapp(bool);
        this.f4671e = AbstractC14533e.startapp(bool);
        this.f4669e = AbstractC14533e.startapp(bool);
        this.f4670e = AbstractC14533e.startapp(bool);
        this.f4673e = AbstractC14533e.startapp(bool);
        this.f4668e = new C10250e(new C1853e(this, null));
        this.f4666e = new C5363e(new C17892e(this, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v1, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    /* renamed from: package, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m679package(defpackage.C1718e r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C15536e
            if (r0 == 0) goto L13
            r0 = r7
            eٕٜ٘ r0 = (defpackage.C15536e) r0
            int r1 = r0.f30682e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30682e = r1
            goto L18
        L13:
            eٕٜ٘ r0 = new eٕٜ٘
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f30680e
            int r1 = r0.f30682e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            eِّۛ r0 = r0.f30681e
            defpackage.AbstractC2003e.purchase(r7)     // Catch: java.lang.Throwable -> L27
            goto L51
        L27:
            r7 = move-exception
            goto L58
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.AbstractC2003e.purchase(r7)
            eِّۛ r7 = r6.f4674e
            eؚٖؓ r1 = r6.f4665e     // Catch: java.lang.Throwable -> L54
            int r3 = r7.size()     // Catch: java.lang.Throwable -> L54
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> L54
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L54
            r0.f30681e = r7     // Catch: java.lang.Throwable -> L54
            r0.f30682e = r2     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r1.invoke(r4, r0)     // Catch: java.lang.Throwable -> L54
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r5 = r0
            r0 = r7
            r7 = r5
        L51:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L27
            goto L5e
        L54:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L58:
            eّۜۖ r1 = new eّۜۖ
            r1.<init>(r7)
            r7 = r1
        L5e:
            boolean r1 = r7 instanceof defpackage.C12763e
            if (r1 == 0) goto L64
            r7 = 0
        L64:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L6a
            eْۨٝ r7 = defpackage.C13664e.f27089e
        L6a:
            boolean r1 = r7.isEmpty()
            r1 = r1 ^ r2
            eؑۜٝ r6 = r6.f4673e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r6.setValue(r1)
            defpackage.AbstractC13480e.inmobi(r0, r7)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1718e.m679package(eٌَؓ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC13086e
    public final void adcel() {
        m680import();
    }

    @Override // defpackage.AbstractC10347e, defpackage.AbstractC13859e
    public final void ads() {
        super.ads();
        m680import();
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f4667e.f29359e;
    }

    @Override // defpackage.AbstractC10347e, defpackage.AbstractC10716e, defpackage.AbstractC13859e
    public final void applovin() {
        super.applovin();
        m680import();
        ((C17148e) m681instanceof()).release();
        AbstractC9743e.license(this, null);
    }

    @Override // defpackage.AbstractC10347e, defpackage.AbstractC13859e
    public final void crashlytics() {
        super.crashlytics();
        m684transient();
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(-413058088);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (yandex || m3681throw == obj) {
                m3681throw = new C17892e(this, 3);
                c13770e.m3682throws(m3681throw);
            }
            C16349e vip = AbstractC1742e.vip(0, (Function0) m3681throw, c13770e, 0, 3);
            AbstractC15946e.vip(c13770e, 6);
            if (((Boolean) this.f4671e.getValue()).booleanValue()) {
                c13770e.m3676strictfp(-331747996);
                AbstractC15946e.ad(c13770e, 0);
            } else {
                c13770e.m3676strictfp(-340363702);
            }
            c13770e.Signature(false);
            Unit unit = Unit.INSTANCE;
            boolean yandex2 = c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            InterfaceC5083e interfaceC5083e = null;
            if (yandex2 || m3681throw2 == obj) {
                m3681throw2 = new C0618e(this, interfaceC5083e, 0);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw2);
            Boolean bool = (Boolean) this.f4669e.getValue();
            bool.getClass();
            boolean yandex3 = c13770e.yandex(this) | c13770e.purchase(vip);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex3 || m3681throw3 == obj) {
                m3681throw3 = new C1853e(this, vip, interfaceC5083e, 0);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC17680e.license(c13770e, bool, (Function2) m3681throw3);
            Integer valueOf = Integer.valueOf(vip.loadAd());
            boolean purchase = c13770e.purchase(vip) | c13770e.yandex(this);
            Object m3681throw4 = c13770e.m3681throw();
            if (purchase || m3681throw4 == obj) {
                m3681throw4 = new C1853e(vip, this, (InterfaceC5083e) null);
                c13770e.m3682throws(m3681throw4);
            }
            AbstractC17680e.license(c13770e, valueOf, (Function2) m3681throw4);
            AbstractC13348e.ad(null, AbstractC16653e.license(-120537708, new C7734e(this, 0, (byte) 0), c13770e), null, null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(-1257747799, new C8937e(this, vip, 29), c13770e), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7734e(this, i);
        }
    }

    /* renamed from: import, reason: not valid java name */
    public final void m680import() {
        ((Cpackage) m681instanceof()).loadAd();
        VKXApplication.Companion companion = VKXApplication.f36531e;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        this.f4664e.isVip(vKXApplication.getApplicationContext());
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final InterfaceC12406e m681instanceof() {
        return (InterfaceC12406e) this.f4666e.getValue();
    }

    /* renamed from: private, reason: not valid java name */
    public final void m682private(final AudioTrack audioTrack, final C16349e c16349e, final int i, final boolean z, final InterfaceC12864e interfaceC12864e, C13770e c13770e, final int i2) {
        int i3;
        C7309e c7309e;
        int i4;
        boolean z2;
        C13770e c13770e2 = c13770e;
        C8331e c8331e = c16349e.license;
        c13770e2.m3671package(-1154194600);
        if ((i2 & 6) == 0) {
            i3 = (c13770e2.purchase(audioTrack) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c13770e2.purchase(c16349e) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c13770e2.license(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c13770e2.billing(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c13770e2.purchase(interfaceC12864e) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= c13770e2.yandex(this) ? 131072 : 65536;
        }
        int i5 = i3;
        if (c13770e2.m3673protected(i5 & 1, (i5 & 74899) != 74898)) {
            C5944e c5944e = new C5944e((Context) c13770e2.adcel(AbstractC2676e.vip));
            c5944e.metrica = audioTrack;
            AbstractC15659e.ad(c5944e, true);
            c5944e.license(600);
            C14542e ad = c5944e.ad();
            float purchase = ((C2616e) c8331e.f17053e).purchase() + (((C16330e) c8331e.f17056e).purchase() - i);
            float vip = 1.0f - AbstractC3062e.vip(Math.abs(purchase), 0.0f, 1.0f);
            boolean contains = this.f4677e.contains(AbstractC6914e.billing(audioTrack));
            C10156e c10156e = C5438e.f11700e;
            InterfaceC2747e license = AbstractC17074e.license(c10156e, false);
            long j = c13770e2.f27286case;
            int i6 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e2 = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e2);
            } else {
                c13770e2.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e2, license, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e2, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i6);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e2, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e2, purchase2, c14865e4);
            boolean metrica = c13770e2.metrica(purchase);
            Object m3681throw = c13770e2.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (metrica || m3681throw == c5170e) {
                m3681throw = new C11499e(0, purchase);
                c13770e2.m3682throws(m3681throw);
            }
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e billing = AbstractC17113e.billing(AbstractC12546e.yandex(c0115e, (Function1) m3681throw), 1);
            C9616e c9616e = AbstractC16497e.metrica;
            C9577e c9577e = C5438e.f11672e;
            C4789e ad2 = AbstractC14801e.ad(c9616e, c9577e, c13770e2, 0);
            long j2 = c13770e2.f27286case;
            int i7 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e2.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e2, billing);
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e2);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, c14865e);
            AbstractC2270e.yandex(c13770e2, advert2, c14865e2);
            AbstractC13501e.mopub(i7, c13770e2, c14865e3, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase3, c14865e4);
            InterfaceC12864e metrica2 = AbstractC10075e.metrica(AbstractC12447e.vip(c0115e, AbstractC0903e.purchase(c13770e2).metrica), false);
            double d = 1.0f;
            if (d <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            InterfaceC12864e premium = metrica2.premium(new C5228e(1.0f, true));
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            long j3 = c13770e2.f27286case;
            int i8 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC3483e advert3 = c13770e2.advert();
            InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e2, premium);
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e2);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, license2, c14865e);
            AbstractC2270e.yandex(c13770e2, advert3, c14865e2);
            AbstractC13501e.mopub(i8, c13770e2, c14865e3, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase4, c14865e4);
            float f = 8;
            AbstractC8461e.vip(ad, null, AbstractC16398e.license(AbstractC18007e.metrica, f, AbstractC0903e.purchase(c13770e2).metrica, false, 28), new C6159e(AbstractC0903e.license(c13770e2).Signature), new C6159e(AbstractC0903e.license(c13770e2).Signature), null, c13770e2, 36912, 0, 32736);
            boolean booleanValue = z ? ((Boolean) this.f4676e.getValue()).booleanValue() : false;
            boolean booleanValue2 = z ? ((Boolean) this.f4671e.getValue()).booleanValue() : false;
            long vip2 = C3618e.vip(0.5f, C3618e.vip);
            InterfaceC12864e ad3 = AbstractC1376e.ad(C14486e.ad.ad(c0115e, c10156e), vip);
            boolean yandex = c13770e2.yandex(this);
            Object m3681throw2 = c13770e2.m3681throw();
            if (yandex || m3681throw2 == c5170e) {
                m3681throw2 = new C17892e(this, 0);
                c13770e2.m3682throws(m3681throw2);
            }
            AbstractC15710e.ad((Function0) m3681throw2, booleanValue, booleanValue2, ad3, vip2, 0L, 0.0f, c13770e, 24576);
            c13770e.Signature(true);
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
            InterfaceC12864e ad4 = AbstractC1376e.ad(AbstractC18007e.metrica(c0115e, 1.0f), vip);
            C14544e c14544e = C5438e.f11668e;
            C17354e c17354e = AbstractC16497e.ad;
            C8587e ad5 = AbstractC6451e.ad(c17354e, c14544e, c13770e, 48);
            long j4 = c13770e.f27286case;
            int i9 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC3483e advert4 = c13770e.advert();
            InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e, ad4);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c7309e = c7309e2;
                c13770e.mopub(c7309e);
            } else {
                c7309e = c7309e2;
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad5, c14865e);
            AbstractC2270e.yandex(c13770e, advert4, c14865e2);
            AbstractC13501e.mopub(i9, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase5, c14865e4);
            if (d <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            InterfaceC12864e loadAd = AbstractC12220e.loadAd(new C5228e(1.0f, true), 0.0f, 0.0f, f, 0.0f, 11);
            C4789e ad6 = AbstractC14801e.ad(c9616e, c9577e, c13770e, 0);
            long j5 = c13770e.f27286case;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            InterfaceC3483e advert5 = c13770e.advert();
            InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e, loadAd);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad6, c14865e);
            AbstractC2270e.yandex(c13770e, advert5, c14865e2);
            AbstractC13501e.mopub(i10, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase6, c14865e4);
            boolean yandex2 = c13770e.yandex(this);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex2 || m3681throw3 == c5170e) {
                m3681throw3 = new C17892e(this, 1);
                c13770e.m3682throws(m3681throw3);
            }
            InterfaceC12864e license3 = AbstractC9546e.license(c0115e, false, null, (Function0) m3681throw3, 15);
            C8587e ad7 = AbstractC6451e.ad(c17354e, c14544e, c13770e, 48);
            long j6 = c13770e.f27286case;
            int i11 = (int) (j6 ^ (j6 >>> 32));
            InterfaceC3483e advert6 = c13770e.advert();
            InterfaceC12864e purchase7 = AbstractC5679e.purchase(c13770e, license3);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad7, c14865e);
            AbstractC2270e.yandex(c13770e, advert6, c14865e2);
            AbstractC13501e.mopub(i11, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase7, c14865e4);
            String str = audioTrack.license;
            long j7 = C3618e.appmetrica;
            AbstractC14489e.vip(str, null, j7, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, AbstractC0903e.billing(c13770e).mopub, c13770e, 384, 24960, 110586);
            if (audioTrack.billing) {
                c13770e.m3676strictfp(252805637);
                i4 = 4;
                AbstractC12534e.ad(c13770e, AbstractC18007e.smaato(c0115e, 4));
                AbstractC1328e.vip(AbstractC18007e.startapp(c0115e, 16), 0L, c13770e, 6, 2);
                z2 = false;
            } else {
                i4 = 4;
                z2 = false;
                c13770e.m3676strictfp(230711844);
            }
            c13770e.Signature(z2);
            AbstractC5647e.ad(AbstractC11261e.metrica(), null, null, 0L, c13770e, 48, 12);
            c13770e.Signature(true);
            AbstractC14489e.vip(audioTrack.ad, null, C3618e.vip(0.75f, j7), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, AbstractC0903e.billing(c13770e).advert, c13770e, 384, 24960, 110586);
            c13770e.Signature(true);
            int i12 = C12563e.ad;
            long vip3 = C3618e.vip(0.25f, j7);
            long j8 = C3618e.adcel;
            C14602e ad8 = C12563e.appmetrica(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad).ad(vip3, j7, j8, j8);
            InterfaceC12864e license4 = AbstractC6762e.license(0.9f);
            boolean billing2 = c13770e.billing(contains) | c13770e.yandex(this) | ((i5 & 14) == i4);
            Object m3681throw4 = c13770e.m3681throw();
            if (billing2 || m3681throw4 == c5170e) {
                m3681throw4 = new C8610e(contains, this, audioTrack, 0);
                c13770e.m3682throws(m3681throw4);
            }
            c13770e2 = c13770e;
            AbstractC0014e.ad((Function0) m3681throw4, license4, false, null, ad8, AbstractC16653e.license(-200916094, new C16027e(contains, 1), c13770e), c13770e2, 1572912);
            AbstractC1786e.isPro(c13770e2, true, true, true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eؙٗۙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C1718e.this.m682private(audioTrack, c16349e, i, z, interfaceC12864e, (C13770e) obj, AbstractC5190e.advert(i2 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m683strictfp(boolean z, AudioSnippetEntry audioSnippetEntry, C13770e c13770e, int i) {
        int i2;
        C16349e c16349e;
        C1718e c1718e = this;
        boolean z2 = z;
        c13770e.m3671package(1257735730);
        int i3 = i | (c13770e.billing(z2) ? 4 : 2) | (c13770e.yandex(audioSnippetEntry) ? 32 : 16) | (c13770e.yandex(c1718e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            boolean yandex = c13770e.yandex(audioSnippetEntry);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (yandex || m3681throw == obj) {
                m3681throw = new C14515e(11, audioSnippetEntry);
                c13770e.m3682throws(m3681throw);
            }
            C16349e vip = AbstractC1742e.vip(0, (Function0) m3681throw, c13770e, 0, 3);
            AudioTrack audioTrack = (AudioTrack) audioSnippetEntry.billing.get(((C16330e) vip.license.f17056e).purchase());
            InterfaceC3314e metrica = AbstractC4628e.metrica(c1718e.f4668e, Float.valueOf(0.0f), c1718e.f27449e, c13770e, 48, 12);
            Boolean valueOf = Boolean.valueOf(z2);
            Integer valueOf2 = Integer.valueOf(vip.loadAd());
            int i4 = i3 & 14;
            boolean yandex2 = (i4 == 4) | c13770e.yandex(c1718e) | c13770e.yandex(audioSnippetEntry) | c13770e.purchase(vip);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == obj) {
                i2 = i4;
                c16349e = vip;
                Object c13721e = new C13721e(z2, c1718e, audioSnippetEntry, c16349e, (InterfaceC5083e) null);
                z2 = z2;
                c1718e = c1718e;
                c13770e.m3682throws(c13721e);
                m3681throw2 = c13721e;
            } else {
                c16349e = vip;
                i2 = i4;
            }
            AbstractC17680e.appmetrica(valueOf, valueOf2, (Function2) m3681throw2, c13770e);
            Boolean valueOf3 = Boolean.valueOf(z2);
            Boolean bool = (Boolean) c1718e.f4670e.getValue();
            bool.getClass();
            boolean yandex3 = c13770e.yandex(c1718e) | (i2 == 4) | c13770e.purchase(c16349e);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex3 || m3681throw3 == obj) {
                m3681throw3 = new C6896e(z2, c1718e, c16349e, (InterfaceC5083e) null);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC17680e.appmetrica(valueOf3, bool, (Function2) m3681throw3, c13770e);
            AbstractC0865e.ad(AbstractC18007e.metrica, null, null, null, null, AbstractC16653e.license(-1886681216, new C10353e(audioTrack, c16349e, audioSnippetEntry, c1718e, z2, metrica), c13770e), c13770e, 196614, 30);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15545e(this, z, audioSnippetEntry, i, 1);
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public final void m684transient() {
        if (((AppActivity) pro()).f34700e.m461getCurrentFragment() instanceof C1718e) {
            ((Cpackage) m681instanceof()).pro();
            VKXApplication.Companion companion = VKXApplication.f36531e;
            VKXApplication vKXApplication = VKXApplication.f36528e;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            this.f4664e.m1250e(vKXApplication.getApplicationContext());
        }
    }
}
