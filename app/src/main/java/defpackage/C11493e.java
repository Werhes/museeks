package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.AbstractCollection;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11493e {
    public static Boolean license;
    public final C13150e ad;
    public final String metrica;
    public final Uri vip;

    public C11493e(C13150e c13150e, String str) {
        this.ad = c13150e;
        this.metrica = str;
        Context context = c13150e.vip;
        Pattern pattern = AbstractC0481e.ad;
        C2532e c2532e = new C2532e(context);
        c2532e.m917e("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("/");
        sb.append(str);
        sb.append(".pb");
        c2532e.m901e(sb.toString());
        this.vip = c2532e.m902e();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C12344e ad() {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11493e.ad():eًّؗ");
    }

    public final boolean vip() {
        C10909e metrica = this.ad.billing.metrica();
        return metrica.isVip() && ((AbstractCollection) metrica.premium()).contains(EnumC16535e.FILE);
    }
}
