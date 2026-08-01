package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.Objects;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5081e implements InterfaceC18036e {
    public static final String adcel;
    public static final String billing;
    public static final String mopub;
    public static final String purchase;
    public static final String startapp;
    public static final String yandex;
    public final int ad;
    public final Bundle appmetrica;
    public final String license;
    public final ComponentName metrica;
    public final int vip;

    static {
        String str = AbstractC9413e.ad;
        purchase = Integer.toString(0, 36);
        billing = Integer.toString(1, 36);
        yandex = Integer.toString(2, 36);
        startapp = Integer.toString(3, 36);
        adcel = Integer.toString(4, 36);
        mopub = Integer.toString(5, 36);
    }

    public C5081e(ComponentName componentName, int i) {
        String packageName = componentName.getPackageName();
        Bundle bundle = Bundle.EMPTY;
        AbstractC2301e.billing((Build.MANUFACTURER.equals("samsung") && Build.VERSION.SDK_INT == 36) || !TextUtils.isEmpty(packageName));
        this.ad = i;
        this.vip = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        this.metrica = componentName;
        this.license = packageName;
        this.appmetrica = bundle;
    }

    @Override // defpackage.InterfaceC18036e
    public final int ad() {
        return this.vip != 101 ? 0 : 2;
    }

    @Override // defpackage.InterfaceC18036e
    public final String ads() {
        return this.license;
    }

    @Override // defpackage.InterfaceC18036e
    /* renamed from: class, reason: not valid java name */
    public final Bundle mo1736class() {
        Bundle bundle = new Bundle();
        bundle.putBundle(purchase, null);
        bundle.putInt(billing, this.ad);
        bundle.putInt(yandex, this.vip);
        bundle.putParcelable(startapp, this.metrica);
        bundle.putString(adcel, this.license);
        bundle.putBundle(mopub, this.appmetrica);
        return bundle;
    }

    @Override // defpackage.InterfaceC18036e
    public final boolean crashlytics() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5081e)) {
            return false;
        }
        C5081e c5081e = (C5081e) obj;
        int i = c5081e.vip;
        int i2 = this.vip;
        if (i2 != i) {
            return false;
        }
        if (i2 == 100) {
            return true;
        }
        if (i2 != 101) {
            return false;
        }
        return Objects.equals(this.metrica, c5081e.metrica);
    }

    @Override // defpackage.InterfaceC18036e
    public final int firebase() {
        return 0;
    }

    @Override // defpackage.InterfaceC18036e
    public final Bundle getExtras() {
        return new Bundle(this.appmetrica);
    }

    @Override // defpackage.InterfaceC18036e
    public final String getServiceName() {
        ComponentName componentName = this.metrica;
        return componentName == null ? BuildConfig.FLAVOR : componentName.getClassName();
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.vip), this.metrica, null);
    }

    @Override // defpackage.InterfaceC18036e
    /* renamed from: interface, reason: not valid java name */
    public final MediaSession.Token mo1737interface() {
        return null;
    }

    @Override // defpackage.InterfaceC18036e
    public final ComponentName premium() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC18036e
    public final Object subs() {
        return null;
    }

    public final String toString() {
        return AbstractC17861e.smaato(this.ad, "}", new StringBuilder("SessionToken {legacy, uid="));
    }

    @Override // defpackage.InterfaceC18036e
    public final int vip() {
        return this.ad;
    }
}
