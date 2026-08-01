package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C12412e implements InterfaceC7970e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C12412e(Object obj, Object obj2, int i) {
        this.ad = i;
        this.vip = obj;
        this.metrica = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [eٜؑۗ, java.lang.Object] */
    @Override // defpackage.InterfaceC7970e
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.ad) {
            case 0:
                C5306e c5306e = (C5306e) this.vip;
                C7259e c7259e = (C7259e) this.metrica;
                return c7259e.purchase.smaato(new C18464e(c7259e, c5306e));
            case 1:
                return new C7551e((Context) this.vip, (String) this.metrica);
            default:
                C14679e c14679e = (C14679e) this.vip;
                Context context = (Context) this.metrica;
                String license = c14679e.license();
                ?? obj = new Object();
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    context = i >= 24 ? AbstractC12026e.yandex(context) : null;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + license, 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj.ad = z;
                return obj;
        }
    }
}
