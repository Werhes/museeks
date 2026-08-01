package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؒٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11463e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C2892e f23067e = new C2892e(-2034349453, false, new C13060e(27));

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C2892e f23066e = new C2892e(1602071985, false, new C14123e(25));

    public static final void admob(CustomCatalogBlockItem customCatalogBlockItem, Function0 function0, C13770e c13770e, int i) {
        CustomCatalogBlockItem customCatalogBlockItem2 = customCatalogBlockItem;
        C13770e c13770e2 = c13770e;
        List list = customCatalogBlockItem2.metrica;
        c13770e2.m3671package(1713628547);
        int i2 = i | (c13770e2.yandex(customCatalogBlockItem2) ? 4 : 2) | (c13770e2.yandex(function0) ? 32 : 16);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            C0115e c0115e = C0115e.f1276e;
            float f = 16;
            InterfaceC12864e license = AbstractC9546e.license(AbstractC12220e.mopub(AbstractC18007e.metrica(c0115e, 1.0f), f), false, null, function0, 15);
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e2, 48);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, license);
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
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e2, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e2, purchase, c14865e4);
            boolean purchase2 = c13770e2.purchase(list);
            Object m3681throw = c13770e2.m3681throw();
            if (purchase2 || m3681throw == C2987e.ad) {
                String license2 = list != null ? AbstractC8769e.license(list) : null;
                c13770e2.m3682throws(license2);
                m3681throw = license2;
            }
            String str = (String) m3681throw;
            InterfaceC12864e startapp = AbstractC18007e.startapp(AbstractC12447e.vip(c0115e, AbstractC6549e.ad), 48);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC8461e.vip(str, null, startapp, new C6159e(((C7019e) c13770e2.adcel(c15492e)).ad.ads), null, C16477e.ad, c13770e2, 4144, 6, 31728);
            AbstractC12534e.ad(c13770e2, AbstractC18007e.smaato(c0115e, f));
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e2, 0);
            long j2 = c13770e2.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e2.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e2, c0115e);
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, c14865e);
            AbstractC2270e.yandex(c13770e2, advert2, c14865e2);
            AbstractC13501e.mopub(i4, c13770e2, c14865e3, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase3, c14865e4);
            customCatalogBlockItem2 = customCatalogBlockItem;
            AbstractC14489e.vip(customCatalogBlockItem2.ad, null, ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262138);
            AbstractC14489e.vip(customCatalogBlockItem2.vip, null, ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262138);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C9130e(customCatalogBlockItem2, function0, i, 4);
        }
    }

    public static void remoteconfig(C0398e c0398e, C1979e c1979e, C12476e c12476e, InterfaceC0043e interfaceC0043e, C11410e c11410e, boolean z, InterfaceC6256e interfaceC6256e) {
        if (z) {
            int billing = interfaceC6256e.billing(C12347e.purchase(c0398e.vip));
            String str = AbstractC15605e.ad;
            C0763e vip = billing < c12476e.ad.ad.f20850e.length() ? c12476e.vip(billing) : billing != 0 ? c12476e.vip(billing - 1) : new C0763e(0.0f, 0.0f, 1.0f, (int) (AbstractC15605e.vip(c1979e.vip, c1979e.billing, c1979e.yandex) & 4294967295L));
            float f = vip.vip;
            float f2 = vip.ad;
            long mo211this = interfaceC0043e.mo211this((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            C0763e billing2 = AbstractC18489e.billing((Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo211this & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo211this >> 32))) << 32), (Float.floatToRawIntBits(vip.metrica - f2) << 32) | (Float.floatToRawIntBits(vip.license - f) & 4294967295L));
            if (AbstractC7890e.billing((C11410e) c11410e.ad.vip.get(), c11410e)) {
                c11410e.vip.yandex(billing2);
            }
        }
    }

    public static final int subscription(EnumC10783e enumC10783e) {
        switch (enumC10783e == null ? -1 : AbstractC8016e.ad[enumC10783e.ordinal()]) {
            case 1:
                return R.drawable.ic_message_outline_28;
            case 2:
                return R.drawable.ic_smartphone_outline_28;
            case 3:
                return R.drawable.ic_mail_outline_28;
            case 4:
                return R.drawable.ic_pincode_lock_outline_28;
            case 5:
                return R.drawable.ic_phone_outline_28;
            case 6:
                return R.drawable.key_outline_28;
            default:
                return R.drawable.ic_article_outline_28;
        }
    }

    public abstract int getSize();

    public abstract void read(ByteBuffer byteBuffer);
}
