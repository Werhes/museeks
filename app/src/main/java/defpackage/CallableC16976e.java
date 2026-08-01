package defpackage;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class CallableC16976e implements Callable {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ CallableC16976e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.ad) {
            case 0:
                C4594e c4594e = ((C8598e) this.vip).billing;
                c4594e.getClass();
                C12894e.smaato();
                C17424e c17424e = c4594e.metrica;
                C14461e c14461e = (C14461e) c17424e.f34141e;
                String str = (String) c17424e.f34142e;
                c14461e.getClass();
                boolean z = true;
                if (new File((File) c14461e.f28586e, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    C14461e c14461e2 = (C14461e) c17424e.f34141e;
                    c14461e2.getClass();
                    new File((File) c14461e2.f28586e, str).delete();
                } else {
                    String appmetrica = c4594e.appmetrica();
                    if (appmetrica == null || !c4594e.adcel.metrica(appmetrica)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                C4956e c4956e = (C4956e) ((C11883e) this.vip).f23814e;
                C7364e c7364e = (C7364e) c4956e.f10519e;
                C6708e c6708e = (C6708e) c4956e.f10513e;
                String str2 = c7364e.f15099e;
                C12894e.amazon();
                try {
                    HashMap metrica = C7364e.metrica(c6708e);
                    C18478e c18478e = new C18478e(str2, metrica);
                    c18478e.m4528break("User-Agent", "Crashlytics Android SDK/20.0.4");
                    c18478e.m4528break("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    C7364e.vip(c18478e, c6708e);
                    String str3 = "Requesting settings from " + str2;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, null);
                    }
                    String str4 = "Settings query params were: " + metrica;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str4, null);
                    }
                    return c7364e.license(c18478e.m4531class());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
            default:
                return (AssetFileDescriptor) this.vip;
        }
    }
}
