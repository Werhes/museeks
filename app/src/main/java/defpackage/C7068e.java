package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7068e extends C7460e implements Function1 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C7068e f14512e = new C7460e(1, AbstractC9180e.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && AbstractC10077e.appmetrica(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return Build.VERSION.SDK_INT > 23 ? new C11014e(connectivityManager, 1) : new C11014e(connectivityManager, 0);
            } catch (Exception unused) {
            }
        }
        return InterfaceC3330e.ad;
    }
}
