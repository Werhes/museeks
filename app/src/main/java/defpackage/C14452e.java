package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import j$.util.Map;
import java.util.Map;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14452e extends AbstractC10347e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final String[] f28564e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C0576e f28565e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f28566e;

    public C14452e() {
        super(0);
        this.f28565e = AbstractC14533e.startapp(EnumC1143e.f3721e);
        int i = Build.VERSION.SDK_INT;
        this.f28564e = i >= 33 ? new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.NEARBY_WIFI_DEVICES", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : i >= 31 ? new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(124579381);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            byte b = 0;
            AbstractC13348e.ad(null, AbstractC16653e.license(110576377, new C7852e(this, 0, (byte) 0), c13770e), AbstractC16653e.license(1059066106, new C7852e(this, 1, b), c13770e), null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(186786244, new C12095e(this, b), c13770e), c13770e, 805306800, 249);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7852e(this, i);
        }
    }

    /* renamed from: package, reason: not valid java name */
    public final EnumC1143e m3801package() {
        return (EnumC1143e) this.f28565e.getValue();
    }

    @Override // defpackage.AbstractC13859e
    public final void premium() {
        super.premium();
        m3803strictfp();
    }

    /* renamed from: private, reason: not valid java name */
    public final Map m3802private() {
        int[] iArr;
        PackageInfo packageInfo = this.f27451e.getPackageManager().getPackageInfo("com.google.android.gms", 4096);
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null || (iArr = packageInfo.requestedPermissionsFlags) == null) {
            return C9139e.f18290e;
        }
        C1239e c1239e = new C1239e();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            c1239e.put(strArr[i], Boolean.valueOf((iArr[i] & 2) != 0));
        }
        return c1239e.vip();
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m3803strictfp() {
        Object c12763e;
        int metrica = C0002e.appmetrica.metrica(this.f27451e.getApplicationContext(), C17991e.ad);
        C0576e c0576e = this.f28565e;
        if (metrica != 0) {
            c0576e.setValue(EnumC1143e.f3719e);
            return;
        }
        try {
            c12763e = m3802private();
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        if (c12763e instanceof C12763e) {
            c12763e = C9139e.f18290e;
        }
        Map map = (Map) c12763e;
        for (String str : this.f28564e) {
            if (AbstractC10077e.appmetrica(this.f27451e, str) != 0) {
                c0576e.setValue(EnumC1143e.f3720e);
                return;
            } else {
                if (!((Boolean) Map.EL.getOrDefault(map, str, Boolean.FALSE)).booleanValue()) {
                    c0576e.setValue(EnumC1143e.f3718e);
                    return;
                }
            }
        }
        C7838e c7838e = VKXApplication.f36530e;
        if (c7838e == null) {
            c7838e = null;
        }
        c7838e.subscription();
        C2464e.appmetrica.ad(C9115e.ad, false);
        C8416e.appmetrica.ad(C5585e.ad, false);
        VKXApplication.f36529e.postDelayed(new RunnableC12991e(3, this), 750L);
    }

    @Override // defpackage.AbstractC13859e
    public final void subs(int i, String[] strArr, int[] iArr) {
        if (i == 1039) {
            m3803strictfp();
            this.f28566e = true;
        }
    }
}
