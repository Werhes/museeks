package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۧؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6803e implements InterfaceC4231e {
    public final C16089e ad;
    public final InterfaceC3832e appmetrica;
    public final int billing;
    public final URL license;
    public final Context metrica;
    public final InterfaceC3832e purchase;
    public final ConnectivityManager vip;

    public C6803e(Context context, InterfaceC3832e interfaceC3832e, InterfaceC3832e interfaceC3832e2) {
        C10610e c10610e = new C10610e();
        C2695e c2695e = C2695e.ad;
        c10610e.startapp(AbstractC2635e.class, c2695e);
        c10610e.startapp(C4481e.class, c2695e);
        C13527e c13527e = C13527e.ad;
        c10610e.startapp(AbstractC11369e.class, c13527e);
        c10610e.startapp(C4827e.class, c13527e);
        C5740e c5740e = C5740e.ad;
        c10610e.startapp(AbstractC10151e.class, c5740e);
        c10610e.startapp(C11928e.class, c5740e);
        C3853e c3853e = C3853e.ad;
        c10610e.startapp(AbstractC12790e.class, c3853e);
        c10610e.startapp(C5899e.class, c3853e);
        C11089e c11089e = C11089e.ad;
        c10610e.startapp(AbstractC6285e.class, c11089e);
        c10610e.startapp(C8925e.class, c11089e);
        C1942e c1942e = C1942e.ad;
        c10610e.startapp(AbstractC16287e.class, c1942e);
        c10610e.startapp(C2598e.class, c1942e);
        C18064e c18064e = C18064e.ad;
        c10610e.startapp(AbstractC4609e.class, c18064e);
        c10610e.startapp(C3937e.class, c18064e);
        C14231e c14231e = C14231e.ad;
        c10610e.startapp(AbstractC5217e.class, c14231e);
        c10610e.startapp(C8275e.class, c14231e);
        C8083e c8083e = C8083e.ad;
        c10610e.startapp(AbstractC16369e.class, c8083e);
        c10610e.startapp(C6245e.class, c8083e);
        C1327e c1327e = C1327e.ad;
        c10610e.startapp(AbstractC7197e.class, c1327e);
        c10610e.startapp(C14058e.class, c1327e);
        c10610e.f20918e = true;
        this.ad = new C16089e(c10610e);
        this.metrica = context;
        this.vip = (ConnectivityManager) context.getSystemService("connectivity");
        this.license = vip(C12664e.metrica);
        this.appmetrica = interfaceC3832e2;
        this.purchase = interfaceC3832e;
        this.billing = 130000;
    }

    public static URL vip(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AbstractC17861e.Signature("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (((defpackage.EnumC6633e) defpackage.EnumC6633e.f13697e.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C16611e ad(defpackage.C16611e r7) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6803e.ad(eٖۤٗ):eٖۤٗ");
    }
}
