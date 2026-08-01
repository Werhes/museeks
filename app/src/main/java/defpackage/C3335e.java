package defpackage;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3335e {
    public static final String Signature;
    public static final String adcel;
    public static final String advert;
    public static final String amazon;
    public static final String loadAd;
    public static final String mopub;
    public static final String smaato;
    public static final C3335e startapp = new C3335e(0, 0, 1, 1, 0, false, true);
    public final int ad;
    public final int appmetrica;
    public final boolean billing;
    public final int license;
    public final int metrica;
    public final boolean purchase;
    public final int vip;
    public AudioAttributes yandex;

    static {
        String str = AbstractC9413e.ad;
        adcel = Integer.toString(0, 36);
        mopub = Integer.toString(1, 36);
        advert = Integer.toString(2, 36);
        smaato = Integer.toString(3, 36);
        amazon = Integer.toString(4, 36);
        loadAd = Integer.toString(5, 36);
        Signature = Integer.toString(6, 36);
    }

    public C3335e(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = i4;
        this.appmetrica = i5;
        this.purchase = z;
        this.billing = z2;
    }

    public static C3335e ad(Bundle bundle) {
        String str = adcel;
        int i = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = mopub;
        int i2 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = advert;
        int i3 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = smaato;
        int i4 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = amazon;
        int i5 = bundle.containsKey(str5) ? bundle.getInt(str5) : 0;
        String str6 = loadAd;
        boolean z = bundle.containsKey(str6) ? bundle.getBoolean(str6) : false;
        String str7 = Signature;
        return new C3335e(i, i2, i3, i4, i5, z, bundle.containsKey(str7) ? bundle.getBoolean(str7) : true);
    }

    public static C3335e vip(AudioAttributes audioAttributes) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int contentType = audioAttributes.getContentType();
        int flags = audioAttributes.getFlags();
        int usage = audioAttributes.getUsage();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            i = audioAttributes.getAllowedCapturePolicy();
            z = audioAttributes.areHapticChannelsMuted();
        } else {
            i = 1;
            z = true;
        }
        if (i3 >= 32) {
            int spatializationBehavior = audioAttributes.getSpatializationBehavior();
            z2 = audioAttributes.isContentSpatialized();
            i2 = spatializationBehavior;
        } else {
            i2 = 0;
            z2 = false;
        }
        return new C3335e(contentType, flags, usage, i, i2, z2, z);
    }

    public final Bundle appmetrica() {
        Bundle bundle = new Bundle();
        int i = this.ad;
        if (i != 0) {
            bundle.putInt(adcel, i);
        }
        int i2 = this.vip;
        if (i2 != 0) {
            bundle.putInt(mopub, i2);
        }
        int i3 = this.metrica;
        if (i3 != 1) {
            bundle.putInt(advert, i3);
        }
        int i4 = this.license;
        if (i4 != 1) {
            bundle.putInt(smaato, i4);
        }
        int i5 = this.appmetrica;
        if (i5 != 0) {
            bundle.putInt(amazon, i5);
        }
        boolean z = this.purchase;
        if (z) {
            bundle.putBoolean(loadAd, z);
        }
        boolean z2 = this.billing;
        if (!z2) {
            bundle.putBoolean(Signature, z2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3335e.class == obj.getClass()) {
            C3335e c3335e = (C3335e) obj;
            if (this.ad == c3335e.ad && this.vip == c3335e.vip && this.metrica == c3335e.metrica && this.license == c3335e.license && this.appmetrica == c3335e.appmetrica && this.purchase == c3335e.purchase && this.billing == c3335e.billing) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.ad) * 31) + this.vip) * 31) + this.metrica) * 31) + this.license) * 31) + this.appmetrica) * 31) + (this.purchase ? 1 : 0)) * 31) + (this.billing ? 1 : 0);
    }

    public final int license() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                int volumeControlStream = metrica().getVolumeControlStream();
                if (volumeControlStream == Integer.MIN_VALUE) {
                    return 3;
                }
                return volumeControlStream;
            } catch (RuntimeException unused) {
                return 3;
            }
        }
        if ((this.vip & 1) != 1) {
            switch (this.metrica) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 11:
                    return 10;
                case 12:
                default:
                    return 3;
                case 13:
                    break;
            }
        }
        return 1;
    }

    public final AudioAttributes metrica() {
        if (this.yandex == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.ad).setFlags(this.vip).setUsage(this.metrica);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                AbstractC14204e.m3777native(usage, this.license);
                AbstractC14204e.ad(usage, this.billing);
            }
            if (i >= 32) {
                AbstractC15271e.vip(usage, this.appmetrica);
                AbstractC15271e.ad(usage, this.purchase);
            }
            this.yandex = usage.build();
        }
        return this.yandex;
    }
}
