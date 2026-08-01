package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٛ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11852e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C14902e c14902e = (C14902e) obj;
        String str = c14902e.f29533e;
        String str2 = c14902e.f29529e;
        c17790e.m4424case(c14902e.ad());
        int i = c14902e.f29532e;
        C14808e c14808e = AbstractC11069e.yandex;
        if (i != 0) {
            c14808e.adcel(c17790e, 8, Integer.valueOf(i));
        }
        int i2 = c14902e.f29530e;
        if (i2 != 0) {
            c14808e.adcel(c17790e, 7, Integer.valueOf(i2));
        }
        int i3 = c14902e.f29534e;
        if (i3 != 0) {
            c14808e.adcel(c17790e, 6, Integer.valueOf(i3));
        }
        int i4 = c14902e.f29531e;
        if (i4 != 0) {
            c14808e.adcel(c17790e, 5, Integer.valueOf(i4));
        }
        int i5 = c14902e.f29535e;
        if (i5 != 0) {
            c14808e.adcel(c17790e, 4, Integer.valueOf(i5));
        }
        int i6 = c14902e.f29536e;
        if (i6 != 0) {
            c14808e.adcel(c17790e, 3, Integer.valueOf(i6));
        }
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e2 = AbstractC11069e.Signature;
        if (!billing) {
            c14808e2.adcel(c17790e, 2, str2);
        }
        if (AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            return;
        }
        c14808e2.adcel(c17790e, 1, str);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C14902e(str, str2, i, i2, i3, i4, i5, i6, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.Signature;
            C14808e c14808e2 = AbstractC11069e.yandex;
            switch (billing) {
                case 1:
                    c14808e.getClass();
                    str = c17546e.advert();
                    break;
                case 2:
                    c14808e.getClass();
                    str2 = c17546e.advert();
                    break;
                case 3:
                    c14808e2.getClass();
                    i = c17546e.amazon();
                    break;
                case 4:
                    c14808e2.getClass();
                    i2 = c17546e.amazon();
                    break;
                case 5:
                    c14808e2.getClass();
                    i3 = c17546e.amazon();
                    break;
                case 6:
                    c14808e2.getClass();
                    i4 = c17546e.amazon();
                    break;
                case 7:
                    c14808e2.getClass();
                    i5 = c17546e.amazon();
                    break;
                case 8:
                    c14808e2.getClass();
                    i6 = c17546e.amazon();
                    break;
                default:
                    c17546e.smaato(billing);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C14902e c14902e = (C14902e) obj;
        String str = c14902e.f29529e;
        int license = c14902e.ad().license();
        String str2 = c14902e.f29533e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(1, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += c14808e.advert(2, str);
        }
        int i = c14902e.f29536e;
        C14808e c14808e2 = AbstractC11069e.yandex;
        if (i != 0) {
            license += c14808e2.advert(3, Integer.valueOf(i));
        }
        int i2 = c14902e.f29535e;
        if (i2 != 0) {
            license += c14808e2.advert(4, Integer.valueOf(i2));
        }
        int i3 = c14902e.f29531e;
        if (i3 != 0) {
            license += c14808e2.advert(5, Integer.valueOf(i3));
        }
        int i4 = c14902e.f29534e;
        if (i4 != 0) {
            license += c14808e2.advert(6, Integer.valueOf(i4));
        }
        int i5 = c14902e.f29530e;
        if (i5 != 0) {
            license += c14808e2.advert(7, Integer.valueOf(i5));
        }
        int i6 = c14902e.f29532e;
        return i6 != 0 ? c14808e2.advert(8, Integer.valueOf(i6)) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C14902e c14902e = (C14902e) obj;
        String str = c14902e.f29529e;
        String str2 = c14902e.f29533e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 1, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 2, str);
        }
        int i = c14902e.f29536e;
        C14808e c14808e2 = AbstractC11069e.yandex;
        if (i != 0) {
            c14808e2.startapp(c0444e, 3, Integer.valueOf(i));
        }
        int i2 = c14902e.f29535e;
        if (i2 != 0) {
            c14808e2.startapp(c0444e, 4, Integer.valueOf(i2));
        }
        int i3 = c14902e.f29531e;
        if (i3 != 0) {
            c14808e2.startapp(c0444e, 5, Integer.valueOf(i3));
        }
        int i4 = c14902e.f29534e;
        if (i4 != 0) {
            c14808e2.startapp(c0444e, 6, Integer.valueOf(i4));
        }
        int i5 = c14902e.f29530e;
        if (i5 != 0) {
            c14808e2.startapp(c0444e, 7, Integer.valueOf(i5));
        }
        int i6 = c14902e.f29532e;
        if (i6 != 0) {
            c14808e2.startapp(c0444e, 8, Integer.valueOf(i6));
        }
        c0444e.m356try(c14902e.ad());
    }
}
