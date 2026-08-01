package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11011e extends AbstractC11130e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C8158e f21810e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f21811e = 0;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Object f21812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11011e(LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e, Context context) {
        super(layoutInflaterFactory2C8158e);
        this.f21810e = layoutInflaterFactory2C8158e;
        this.f21812e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11011e(LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e, C0912e c0912e) {
        super(layoutInflaterFactory2C8158e);
        this.f21810e = layoutInflaterFactory2C8158e;
        this.f21812e = c0912e;
    }

    @Override // defpackage.AbstractC11130e
    public final IntentFilter amazon() {
        switch (this.f21811e) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public final int mo2982e() {
        Location location;
        boolean z;
        long j;
        Location location2;
        switch (this.f21811e) {
            case 0:
                return AbstractC15092e.ad((PowerManager) this.f21812e) ? 2 : 1;
            default:
                C0912e c0912e = (C0912e) this.f21812e;
                C14033e c14033e = (C14033e) c0912e.f3333e;
                LocationManager locationManager = (LocationManager) c0912e.f3331e;
                if (c14033e.vip > System.currentTimeMillis()) {
                    z = c14033e.ad;
                } else {
                    Context context = (Context) c0912e.f3332e;
                    Location location3 = null;
                    if (AbstractC17202e.metrica(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (AbstractC17202e.metrica(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C18451e.purchase == null) {
                            C18451e.purchase = new C18451e();
                        }
                        C18451e c18451e = C18451e.purchase;
                        c18451e.ad(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        c18451e.ad(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z = c18451e.license == 1;
                        long j2 = c18451e.metrica;
                        long j3 = c18451e.vip;
                        c18451e.ad(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j4 = c18451e.metrica;
                        if (j2 == -1 || j3 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j3) {
                                j2 = j4;
                            } else if (currentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        c14033e.ad = z;
                        c14033e.vip = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: eؙۛ۠, reason: contains not printable characters */
    public final void mo2983e() {
        switch (this.f21811e) {
            case 0:
                this.f21810e.Signature(true, true);
                return;
            default:
                this.f21810e.Signature(true, true);
                return;
        }
    }
}
