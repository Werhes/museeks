package defpackage;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: public, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cpublic extends AbstractC10347e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final List f36450e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final List f36451e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final List f36452e;

    public Cpublic() {
        super(0);
        this.f36451e = AbstractC6874e.startapp(new Cconst(new C10985e(Integer.valueOf(R.string.pref_about_tg), Integer.valueOf(R.string.pref_about_tg_desc), new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))), new Cconst(new C10985e(Integer.valueOf(R.string.pref_about_chat), Integer.valueOf(R.string.pref_about_chat_desc), "chat")), new Cconst(new C10985e(Integer.valueOf(R.string.pref_about_faq), Integer.valueOf(R.string.pref_about_faq_desc), "https://t.me/vkxfaq")), new Cconst(new C10985e(Integer.valueOf(R.string.fc_usagepolicy), 0, "https://vkx.app/license")));
        this.f36450e = AbstractC6874e.startapp(new Cconst(new C10985e(Integer.valueOf(R.string.pref_about_3dcp), 0, "https://4pda.to/forum/index.php?showtopic=945974")), new Cconst(new C10985e(Integer.valueOf(R.string.fc_smarts), 0, "https://smartsworld.ru/view/vk-x.2573/")));
        this.f36452e = AbstractC6874e.startapp(new Cconst(new C10985e(Integer.valueOf(R.string.fc_hawk), Integer.valueOf(R.string.fc_hawk_desc), "https://t.me/hawk_vk")), new Cconst(new C10985e(Integer.valueOf(R.string.fc_ea), 0, "https://t.me/easyapk")), new Cconst(new C10985e(Integer.valueOf(R.string.fc_vl), 0, "https://t.me/vk_leaks")), new Cconst(new C10985e(Integer.valueOf(R.string.fc_pa), 0, "https://t.me/powerapk")), new Cconst(new C10985e(Integer.valueOf(R.string.fc_av), 0, "https://t.me/altervk")));
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(-390585665);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                C1630e c1630e = new C1630e(0, EnumC6916e.f14170e);
                while (true) {
                    if (!c1630e.hasNext()) {
                        m3681throw = EnumC6916e.f14174e;
                        break;
                    }
                    EnumC6916e enumC6916e = (EnumC6916e) c1630e.next();
                    VKXApplication vKXApplication = VKXApplication.f36528e;
                    if (vKXApplication == null) {
                        vKXApplication = null;
                    }
                    if (AbstractC1535e.ad(vKXApplication, enumC6916e)) {
                        m3681throw = enumC6916e;
                        break;
                    }
                }
                c13770e.m3682throws(m3681throw);
            }
            EnumC6916e enumC6916e2 = (EnumC6916e) m3681throw;
            C5958e ad = AbstractC9083e.ad(c13770e);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C16330e(0);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC13348e.ad(null, AbstractC16653e.license(1213520507, new C6949e(ad, this, 1), c13770e), null, null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(-1783364592, new C12050e(ad, this, (C16330e) m3681throw2, enumC6916e2, 16), c13770e), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Cswitch(this, i);
        }
    }

    /* renamed from: private, reason: not valid java name */
    public final void m4632private(C10985e c10985e, C13770e c13770e, int i) {
        C2892e c2892e;
        c13770e.m3671package(-754148374);
        int i2 = (c13770e.purchase(c10985e) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            C1774e c1774e = (C1774e) c13770e.adcel(AbstractC11473e.remoteconfig);
            if (((Number) c10985e.f21741e).intValue() != 0) {
                c13770e.m3676strictfp(1112894253);
                c2892e = AbstractC16653e.license(-2011995543, new Creturn(c10985e, 1), c13770e);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(140054931);
                c13770e.Signature(false);
                c2892e = null;
            }
            boolean yandex = c13770e.yandex(this) | ((i2 & 14) == 4) | c13770e.yandex(c1774e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new Csynchronized(0, c10985e, this, c1774e);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC16653e.license(215225928, new Creturn(c10985e, 0), c13770e), AbstractC18007e.metrica(AbstractC9546e.license(C0115e.f1276e, false, null, (Function0) m3681throw, 15), 1.0f), null, c2892e, null, null, null, 0.0f, 0.0f, c13770e, 6, 500);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6949e(this, c10985e, i, 2);
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m4633strictfp(int i, int i2, C13770e c13770e, boolean z, boolean z2) {
        C13770e c13770e2;
        boolean z3;
        c13770e.m3671package(-1791798323);
        int i3 = i2 | (c13770e.license(i) ? 4 : 2);
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
            long j = c13770e.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c0115e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            C5100e c5100e = AbstractC10432e.ad;
            if (z) {
                c13770e.m3676strictfp(1053429047);
                float f = 16;
                AbstractC17074e.ad(AbstractC16136e.metrica(AbstractC18007e.metrica(AbstractC18007e.license(AbstractC12447e.vip(c0115e, AbstractC6549e.vip(0.0f, 0.0f, f, f, 3)), 8), 1.0f), ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.subscription, c5100e), c13770e, 0);
            } else {
                c13770e.m3676strictfp(1043846699);
            }
            c13770e.Signature(false);
            String appmetrica = AbstractC5297e.appmetrica(c13770e, i);
            C15492e c15492e = AbstractC11785e.ad;
            float f2 = 16;
            AbstractC14489e.vip(appmetrica, AbstractC12220e.advert(c0115e, f2, 12), C3618e.vip(0.7f, ((C7019e) c13770e.adcel(c15492e)).ad.admob), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 48, 0, 262136);
            c13770e2 = c13770e;
            if (z2) {
                c13770e2.m3676strictfp(1054039933);
                InterfaceC12864e metrica = AbstractC16136e.metrica(AbstractC18007e.metrica(AbstractC18007e.license(AbstractC12447e.vip(c0115e, AbstractC6549e.vip(f2, f2, 0.0f, 0.0f, 12)), 8), 1.0f), ((C7019e) c13770e2.adcel(c15492e)).ad.subscription, c5100e);
                z3 = false;
                AbstractC17074e.ad(metrica, c13770e2, 0);
            } else {
                z3 = false;
                c13770e2.m3676strictfp(1043846699);
            }
            c13770e2.Signature(z3);
            c13770e2.Signature(true);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C8622e(this, i, z, z2, i2);
        }
    }
}
