package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۦۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15852e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8320e f31280e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31281e;

    public /* synthetic */ RunnableC15852e(C8320e c8320e, int i) {
        this.f31281e = i;
        this.f31280e = c8320e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31281e) {
            case 0:
                this.f31280e.m2398e();
                return;
            case 1:
                C13951e c13951e = this.f31280e.f17005e;
                C6936e c6936e = (C6936e) c13951e.f27672e;
                C6915e c6915e = c6936e.f14226e;
                C8320e c8320e = c6936e.f14199e;
                C1195e c1195e = c6936e.f14198e;
                C6936e.yandex(c6915e);
                c6915e.mo2250e();
                if (c13951e.metrica()) {
                    if (c13951e.vip()) {
                        C6936e.purchase(c1195e);
                        c1195e.f3818e.isVip(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        C6936e.billing(c8320e);
                        c8320e.m2406e("auto", "_cmpx", bundle);
                    } else {
                        C6936e.purchase(c1195e);
                        C5609e c5609e = c1195e.f3818e;
                        String tapsense = c5609e.tapsense();
                        if (TextUtils.isEmpty(tapsense)) {
                            C13879e c13879e = c6936e.f14227e;
                            C6936e.yandex(c13879e);
                            c13879e.f27498e.ad("Cache still valid but referrer not found");
                        } else {
                            long metrica = c1195e.f3812e.metrica() / 3600000;
                            Uri parse = Uri.parse(tapsense);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str : parse.getQueryParameterNames()) {
                                bundle2.putString(str, parse.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (metrica - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            C6936e.billing(c8320e);
                            c8320e.m2406e(str2, "_cmp", (Bundle) pair.second);
                        }
                        c5609e.isVip(null);
                    }
                    C6936e.purchase(c1195e);
                    c1195e.f3812e.license(0L);
                    return;
                }
                return;
            case 2:
                C8320e c8320e2 = this.f31280e;
                c8320e2.mo2250e();
                C6936e c6936e2 = (C6936e) c8320e2.f36443e;
                C1195e c1195e2 = c6936e2.f14198e;
                C13879e c13879e2 = c6936e2.f14227e;
                C6936e.purchase(c1195e2);
                C10007e c10007e = c1195e2.f3803e;
                if (c10007e.ad()) {
                    C6936e.yandex(c13879e2);
                    c13879e2.f27496e.ad("Deferred Deep Link already retrieved. Not fetching again.");
                    return;
                }
                C5982e c5982e = c1195e2.f3813e;
                long metrica2 = c5982e.metrica();
                c5982e.license(1 + metrica2);
                if (metrica2 >= 5) {
                    C6936e.yandex(c13879e2);
                    c13879e2.f27495e.ad("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                    c10007e.vip(true);
                    return;
                } else {
                    if (c8320e2.f17018e == null) {
                        c8320e2.f17018e = new C2200e(c8320e2, c6936e2, 3);
                    }
                    c8320e2.f17018e.vip(0L);
                    return;
                }
            default:
                this.f31280e.m2398e();
                return;
        }
    }
}
