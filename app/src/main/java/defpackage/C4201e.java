package defpackage;

import android.os.Build;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٚٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4201e {
    public final InterfaceC1325e ad;
    public EnumC14627e appmetrica;
    public long license = -1;
    public final CameraUseInconsistentTimebaseQuirk metrica;
    public final EnumC14627e vip;

    public C4201e(C18540e c18540e, EnumC14627e enumC14627e, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.ad = c18540e;
        this.vip = enumC14627e;
        this.metrica = cameraUseInconsistentTimebaseQuirk;
    }

    public final long ad(long j) {
        boolean z;
        String str;
        String str2;
        EnumC14627e enumC14627e = this.appmetrica;
        InterfaceC1325e interfaceC1325e = this.ad;
        if (enumC14627e == null) {
            CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = this.metrica;
            EnumC14627e enumC14627e2 = this.vip;
            if (cameraUseInconsistentTimebaseQuirk != null) {
                AbstractC9464e.remoteconfig("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
            } else {
                z = interfaceC1325e.admob() - interfaceC1325e.startapp() > 3000000;
                this.appmetrica = enumC14627e2;
            }
            EnumC14627e enumC14627e3 = Math.abs(j - interfaceC1325e.admob()) < Math.abs(j - interfaceC1325e.startapp()) ? EnumC14627e.f28860e : EnumC14627e.f28861e;
            if (!z || enumC14627e3 == enumC14627e2) {
                AbstractC9464e.yandex("VideoTimebaseConverter", "Detect input timebase = " + enumC14627e3);
            } else {
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    StringBuilder sb = new StringBuilder(", SOC: ");
                    str2 = Build.SOC_MODEL;
                    sb.append(str2);
                    str = sb.toString();
                } else {
                    str = BuildConfig.FLAVOR;
                }
                AbstractC9464e.adcel("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i), str, enumC14627e2, enumC14627e3));
            }
            enumC14627e2 = enumC14627e3;
            this.appmetrica = enumC14627e2;
        }
        int ordinal = this.appmetrica.ordinal();
        if (ordinal == 0) {
            return j;
        }
        if (ordinal != 1) {
            throw new AssertionError("Unknown timebase: " + this.appmetrica);
        }
        if (this.license == -1) {
            long j2 = Long.MAX_VALUE;
            long j3 = 0;
            for (int i2 = 0; i2 < 3; i2++) {
                long startapp = interfaceC1325e.startapp();
                long admob = interfaceC1325e.admob();
                long startapp2 = interfaceC1325e.startapp();
                long j4 = startapp2 - startapp;
                if (i2 == 0 || j4 < j2) {
                    j3 = admob - ((startapp + startapp2) >> 1);
                    j2 = j4;
                }
            }
            this.license = Math.max(0L, j3);
            AbstractC9464e.yandex("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.license);
        }
        return j - this.license;
    }
}
