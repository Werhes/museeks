package defpackage;

import java.io.IOException;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3257e implements InterfaceC11304e {
    public static C8650e vip(C11058e c11058e, String str) {
        C14052e c14052e;
        String appmetrica = c11058e.f21946e.appmetrica("Location");
        if (appmetrica == null) {
            appmetrica = null;
        }
        C8650e c8650e = c11058e.f21944e;
        if (appmetrica != null) {
            C15718e c15718e = c8650e.ad;
            c15718e.getClass();
            try {
                c14052e = new C14052e();
                c14052e.adcel(c15718e, appmetrica);
            } catch (IllegalArgumentException unused) {
                c14052e = null;
            }
            C15718e metrica = c14052e != null ? c14052e.metrica() : null;
            if (metrica != null) {
                C18464e ad = c8650e.ad();
                if (AbstractC13083e.license(str)) {
                    int i = c11058e.f21942e;
                    boolean z = str.equals("PROPFIND") || i == 308 || i == 307;
                    if (str.equals("PROPFIND") || i == 308 || i == 307) {
                        ad.m4494e(str, z ? c8650e.license : null);
                    } else {
                        ad.m4494e("GET", null);
                    }
                    if (!z) {
                        ad.m4512e("Transfer-Encoding");
                        ad.m4512e("Content-Length");
                        ad.m4512e("Content-Type");
                    }
                }
                C15718e c15718e2 = c8650e.ad;
                if (!AbstractC7890e.billing(c15718e2.license, metrica.license) || c15718e2.appmetrica != metrica.appmetrica || !AbstractC7890e.billing(c15718e2.ad, metrica.ad)) {
                    ad.m4512e("Authorization");
                }
                ad.f36191e = metrica;
                return new C8650e(ad);
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC11304e
    public C11058e ad(C9840e c9840e) {
        C11058e purchase = c9840e.purchase(metrica((C8650e) c9840e.startapp));
        int i = 0;
        while (!((C4602e) c9840e.billing).f9921e) {
            String str = purchase.f21944e.vip;
            int i2 = purchase.f21942e;
            C8650e c8650e = null;
            if (i2 != 307) {
                if (i2 != 308) {
                    if (300 <= i2 && i2 < 304) {
                        c8650e = vip(purchase, str);
                    }
                } else if (AbstractC7890e.billing(str, "GET") || AbstractC7890e.billing(str, "HEAD")) {
                    c8650e = vip(purchase, str);
                }
            } else if (AbstractC7890e.billing(str, "GET") || AbstractC7890e.billing(str, "HEAD") || AbstractC7890e.billing(str, "POST")) {
                c8650e = vip(purchase, str);
            }
            if (c8650e != null) {
                C8650e metrica = metrica(c8650e);
                purchase.close();
                purchase = c9840e.purchase(metrica);
                if (i != 20) {
                    i++;
                }
            }
            C7677e ad = purchase.ad();
            String str2 = purchase.f21944e.ad.yandex;
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            ad.purchase.purchase("X-Req-Hash", str2);
            return ad.ad();
        }
        throw new IOException("Call was canceled!");
    }

    public C8650e metrica(C8650e c8650e) {
        return c8650e;
    }
}
