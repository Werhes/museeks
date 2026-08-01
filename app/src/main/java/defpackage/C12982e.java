package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12982e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C11590e c11590e = (C11590e) obj;
        String str = c11590e.f23284e;
        String str2 = c11590e.f23280e;
        c17790e.m4424case(c11590e.ad());
        String str3 = c11590e.f23281e;
        boolean billing = AbstractC7890e.billing(str3, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.adcel(c17790e, 8, str3);
        }
        int i = c11590e.f23279e;
        if (i != 0) {
            AbstractC11069e.yandex.adcel(c17790e, 7, Integer.valueOf(i));
        }
        Long l = c11590e.f23283e;
        C14808e c14808e2 = AbstractC11069e.mopub;
        c14808e2.adcel(c17790e, 6, l);
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 5, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 4, str);
        }
        long j = c11590e.f23285e;
        if (j != 0) {
            c14808e2.adcel(c17790e, 3, Long.valueOf(j));
        }
        EnumC4433e enumC4433e = c11590e.f23278e;
        if (enumC4433e != EnumC4433e.IN_PROGRESS) {
            EnumC4433e.f9613e.adcel(c17790e, 2, enumC4433e);
        }
        long j2 = c11590e.f23282e;
        if (j2 != 0) {
            c14808e2.adcel(c17790e, 1, Long.valueOf(j2));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long j;
        Object obj = EnumC4433e.IN_PROGRESS;
        long license = c17546e.license();
        long j2 = 0;
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        String str3 = str2;
        Long l = null;
        int i = 0;
        Object obj2 = obj;
        long j3 = 0;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C11590e(j3, (EnumC4433e) obj2, j2, str, str2, l, i, str3, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.mopub;
            C14808e c14808e2 = AbstractC11069e.Signature;
            switch (billing) {
                case 1:
                    c14808e.getClass();
                    j3 = c17546e.loadAd();
                    continue;
                case 2:
                    try {
                        obj2 = EnumC4433e.f9613e.metrica(c17546e);
                        continue;
                    } catch (C17420e e) {
                        j = j3;
                        c17546e.ad(billing, 1, Long.valueOf(e.f34135e));
                        break;
                    }
                case 3:
                    c14808e.getClass();
                    j2 = c17546e.loadAd();
                    continue;
                case 4:
                    c14808e2.getClass();
                    str = c17546e.advert();
                    continue;
                case 5:
                    c14808e2.getClass();
                    str2 = c17546e.advert();
                    continue;
                case 6:
                    c14808e.getClass();
                    l = Long.valueOf(c17546e.loadAd());
                    continue;
                case 7:
                    AbstractC11069e.yandex.getClass();
                    i = c17546e.amazon();
                    continue;
                case 8:
                    c14808e2.getClass();
                    str3 = c17546e.advert();
                    continue;
                default:
                    c17546e.smaato(billing);
                    j = j3;
                    break;
            }
            j3 = j;
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C11590e c11590e = (C11590e) obj;
        String str = c11590e.f23281e;
        String str2 = c11590e.f23280e;
        String str3 = c11590e.f23284e;
        int license = c11590e.ad().license();
        long j = c11590e.f23282e;
        C14808e c14808e = AbstractC11069e.mopub;
        if (j != 0) {
            license += c14808e.advert(1, Long.valueOf(j));
        }
        EnumC4433e enumC4433e = c11590e.f23278e;
        if (enumC4433e != EnumC4433e.IN_PROGRESS) {
            license += EnumC4433e.f9613e.advert(2, enumC4433e);
        }
        long j2 = c11590e.f23285e;
        if (j2 != 0) {
            license += c14808e.advert(3, Long.valueOf(j2));
        }
        boolean billing = AbstractC7890e.billing(str3, BuildConfig.FLAVOR);
        C14808e c14808e2 = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e2.advert(4, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            license += c14808e2.advert(5, str2);
        }
        int advert = c14808e.advert(6, c11590e.f23283e) + license;
        int i = c11590e.f23279e;
        if (i != 0) {
            advert += AbstractC11069e.yandex.advert(7, Integer.valueOf(i));
        }
        return !AbstractC7890e.billing(str, BuildConfig.FLAVOR) ? c14808e2.advert(8, str) + advert : advert;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C11590e c11590e = (C11590e) obj;
        String str = c11590e.f23281e;
        String str2 = c11590e.f23280e;
        String str3 = c11590e.f23284e;
        long j = c11590e.f23282e;
        C14808e c14808e = AbstractC11069e.mopub;
        if (j != 0) {
            c14808e.startapp(c0444e, 1, Long.valueOf(j));
        }
        EnumC4433e enumC4433e = c11590e.f23278e;
        if (enumC4433e != EnumC4433e.IN_PROGRESS) {
            EnumC4433e.f9613e.startapp(c0444e, 2, enumC4433e);
        }
        long j2 = c11590e.f23285e;
        if (j2 != 0) {
            c14808e.startapp(c0444e, 3, Long.valueOf(j2));
        }
        boolean billing = AbstractC7890e.billing(str3, BuildConfig.FLAVOR);
        C14808e c14808e2 = AbstractC11069e.Signature;
        if (!billing) {
            c14808e2.startapp(c0444e, 4, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e2.startapp(c0444e, 5, str2);
        }
        c14808e.startapp(c0444e, 6, c11590e.f23283e);
        int i = c11590e.f23279e;
        if (i != 0) {
            AbstractC11069e.yandex.startapp(c0444e, 7, Integer.valueOf(i));
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e2.startapp(c0444e, 8, str);
        }
        c0444e.m356try(c11590e.ad());
    }
}
