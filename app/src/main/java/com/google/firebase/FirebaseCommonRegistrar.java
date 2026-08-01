package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC4511e;
import defpackage.C12582e;
import defpackage.C14679e;
import defpackage.C16786e;
import defpackage.C17647e;
import defpackage.C1779e;
import defpackage.C18162e;
import defpackage.C5275e;
import defpackage.C6869e;
import defpackage.C7259e;
import defpackage.C7934e;
import defpackage.C8625e;
import defpackage.C8662e;
import defpackage.C9237e;
import defpackage.InterfaceC13586e;
import defpackage.InterfaceC15973e;
import defpackage.InterfaceC7549e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String ad(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? BuildConfig.FLAVOR : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static String vip(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        C9237e vip = C7259e.vip(C1779e.class);
        vip.ad(new C8625e(2, 0, C7934e.class));
        vip.billing = new C5275e(0);
        arrayList.add(vip.vip());
        C16786e c16786e = new C16786e(InterfaceC7549e.class, Executor.class);
        C9237e c9237e = new C9237e(C18162e.class, new Class[]{InterfaceC15973e.class, InterfaceC13586e.class});
        c9237e.ad(C8625e.vip(Context.class));
        c9237e.ad(C8625e.vip(C14679e.class));
        c9237e.ad(new C8625e(2, 0, C17647e.class));
        c9237e.ad(new C8625e(1, 1, C1779e.class));
        c9237e.ad(new C8625e(c16786e, 1, 0));
        c9237e.billing = new C6869e(c16786e, 0);
        arrayList.add(c9237e.vip());
        arrayList.add(AbstractC4511e.vip("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC4511e.vip("fire-core", "22.0.1"));
        arrayList.add(AbstractC4511e.vip("device-name", vip(Build.PRODUCT)));
        arrayList.add(AbstractC4511e.vip("device-model", vip(Build.DEVICE)));
        arrayList.add(AbstractC4511e.vip("device-brand", vip(Build.BRAND)));
        arrayList.add(AbstractC4511e.metrica("android-target-sdk", new C12582e(12)));
        arrayList.add(AbstractC4511e.metrica("android-min-sdk", new C12582e(13)));
        arrayList.add(AbstractC4511e.metrica("android-platform", new C12582e(14)));
        arrayList.add(AbstractC4511e.metrica("android-installer", new C12582e(15)));
        try {
            str = C8662e.f17500e.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(AbstractC4511e.vip("kotlin", str));
        }
        return arrayList;
    }
}
