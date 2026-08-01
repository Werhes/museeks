package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2713e implements InterfaceC8223e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f6597e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6598e;

    public /* synthetic */ C2713e(int i, Object obj) {
        this.f6598e = i;
        this.f6597e = obj;
    }

    @Override // defpackage.InterfaceC8223e
    public final Object apply(Object obj) {
        int i;
        switch (this.f6598e) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC9892e interfaceC9892e = (InterfaceC9892e) this.f6597e;
                interfaceC9892e.getClass();
                entry.getClass();
                return new C17887e(entry, interfaceC9892e);
            case 1:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((C13400e) this.f6597e).metrica)), (Throwable) obj);
                return null;
            case 2:
                C4089e c4089e = (C4089e) obj;
                C11428e c11428e = AbstractC8329e.ad;
                String str = (String) this.f6597e;
                C10616e c10616e = (C10616e) c4089e.signatures(str, C7459e.tapsense()).advert();
                if (!DesugarCollections.unmodifiableList(((C7459e) c10616e.f12709e).signatures()).contains(BuildConfig.FLAVOR)) {
                    c10616e.vip();
                    ((C7459e) c10616e.f12709e).isVip(BuildConfig.FLAVOR);
                }
                C7261e c7261e = (C7261e) c4089e.advert();
                c10616e.vip();
                ((C7459e) c10616e.f12709e).inmobi(BuildConfig.FLAVOR);
                C7459e c7459e = (C7459e) c10616e.appmetrica();
                c7261e.vip();
                ((C4089e) c7261e.f12709e).isVip().put(str, c7459e);
                return (C4089e) c7261e.appmetrica();
            default:
                C10040e c10040e = (C10040e) this.f6597e;
                C6784e c6784e = (C6784e) obj;
                c10040e.getClass();
                C17659e c17659e = new C17659e();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (C10040e.adcel) {
                            C6843e c6843e = (C6843e) c10040e.license.get();
                            Uri uri = c10040e.billing;
                            i = 9;
                            C7302e c7302e = new C7302e(i, c6784e.signatures());
                            c7302e.f14915e = new C17659e[]{c17659e};
                            c6843e.ad(uri, c7302e);
                            c10040e.yandex = c6784e.signatures();
                        }
                        synchronized (C10040e.mopub) {
                            C6843e c6843e2 = (C6843e) c10040e.license.get();
                            Uri uri2 = c10040e.startapp;
                            C7302e c7302e2 = new C7302e(i, c6784e.tapsense());
                            c7302e2.f14915e = new C17659e[]{c17659e};
                            c6843e2.ad(uri2, c7302e2);
                            c6784e.tapsense();
                        }
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
        }
    }
}
