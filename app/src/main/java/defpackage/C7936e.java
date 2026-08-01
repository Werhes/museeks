package defpackage;

import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Size;
import androidx.car.app.navigation.model.Maneuver;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import java.util.List;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C7936e implements InterfaceC4279e, InterfaceC7069e, InterfaceC5075e, InterfaceC1589e, InterfaceC3832e, InterfaceC13204e, InterfaceC5808e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static C7936e f16073e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16079e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C7936e f16071e = new C7936e(14);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C7936e f16075e = new C7936e(15);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C7936e f16070e = new C7936e(16);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C7936e f16078e = new C7936e(17);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C7936e f16077e = new C7936e(18);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C7936e f16074e = new C7936e(19);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ C7936e f16076e = new C7936e(20);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final /* synthetic */ C7936e f16072e = new C7936e(21);

    public /* synthetic */ C7936e(int i) {
        this.f16079e = i;
    }

    public static AbstractC17549e appmetrica(int i, int i2, C8487e c8487e, C17560e c17560e, C8469e c8469e, C4996e c4996e, Size size, String str, C15802e c15802e) {
        C15802e c15802e2 = C15802e.f31130e;
        if ((i2 & 8) != 0) {
            c15802e = c15802e2;
        }
        if ((i2 & 64) != 0) {
            c8487e = null;
        }
        if ((i2 & 128) != 0) {
            c8469e = null;
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            c4996e = null;
        }
        if (c15802e.equals(C15802e.f31122e) || c15802e.equals(C15802e.f31139e) || ((c15802e.equals(C15802e.f31120e) || c15802e.equals(C15802e.f31119e)) && Build.VERSION.SDK_INT >= 35)) {
            return new C5969e(size, i, str, c15802e, c17560e, c8487e, c8469e, c4996e);
        }
        if (!c15802e.equals(c15802e2)) {
            throw new IllegalStateException("Check failed.");
        }
        return new AbstractC17549e(size, i, str, c17560e, c8487e, c8469e, c4996e);
    }

    public static final String metrica(C0193e c0193e, C0193e[] c0193eArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        C0193e c0193e2 = C8015e.vip;
        int license = c0193e.license();
        int i5 = 0;
        while (i5 < license) {
            int i6 = (i5 + license) / 2;
            while (i6 > -1 && c0193e.startapp(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (c0193e.startapp(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte startapp = c0193eArr[i10].startapp(i11);
                    byte[] bArr = AbstractC10220e.ad;
                    int i13 = startapp & 255;
                    z = z2;
                    i3 = i13;
                }
                byte startapp2 = c0193e.startapp(i7 + i12);
                byte[] bArr2 = AbstractC10220e.ad;
                i4 = i3 - (startapp2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (c0193eArr[i10].license() != i11) {
                    z2 = z;
                } else {
                    if (i10 == c0193eArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int license2 = c0193eArr[i10].license() - i11;
                    int length = c0193eArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        license2 += c0193eArr[i15].license();
                    }
                    if (license2 >= i14) {
                        if (license2 <= i14) {
                            return c0193e.loadAd(i7, i9 + i7).amazon(AbstractC5508e.ad);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            license = i6;
        }
        return null;
    }

    public static final boolean yandex() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f16079e) {
            case 14:
                return new Boolean(((Boolean) C8813e.ad.get()).booleanValue());
            case 15:
                List list = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.sgtm.service_upload_apps_list", 44, BuildConfig.FLAVOR).get();
            case 16:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(3600000L, 79, "measurement.upload.window_interval").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list3 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(4L, 17, "measurement.lifetimevalue.max_currency_tracked").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list4 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(604800000L, 61, "measurement.sdk.attribution.cache.ttl").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(16L, 54, "measurement.rb.attribution.max_retry_delay_seconds").get()).longValue());
            case 20:
                List list6 = AbstractC17254e.ad;
                return (Boolean) C15395e.ad.get();
            default:
                List list7 = AbstractC17254e.ad;
                C4261e.f9346e.get();
                return (Boolean) C13302e.ad.license("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true, 4).get();
        }
    }

    public boolean billing(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.InterfaceC10941e
    /* renamed from: eٌۡٔ, reason: contains not printable characters */
    public int mo2359e(String str, String str2) {
        return (int) Math.round(AbstractC12900e.metrica(str, str2) * 100.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    @Override // defpackage.InterfaceC1589e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean license(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            eٌٓۡ r5 = (defpackage.C8679e) r5
            eٌٓۡ r6 = (defpackage.C8679e) r6
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L35
            if (r6 == 0) goto L35
            float r2 = r5.appmetrica
            float r3 = r6.appmetrica
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L43
            float r2 = r5.purchase
            float r3 = r6.purchase
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L43
            eًؚٙ r2 = r5.vip
            eًؚٙ r3 = r6.vip
            if (r2 != r3) goto L43
            eؓ۠٘ r2 = r5.metrica
            eؓ۠٘ r3 = r6.metrica
            boolean r2 = defpackage.AbstractC7890e.billing(r2, r3)
            if (r2 == 0) goto L43
            long r2 = r5.license
            long r5 = r6.license
            boolean r5 = defpackage.C5602e.vip(r2, r5)
            if (r5 == 0) goto L43
            goto L42
        L35:
            if (r5 != 0) goto L39
            r5 = r1
            goto L3a
        L39:
            r5 = r0
        L3a:
            if (r6 != 0) goto L3e
            r6 = r1
            goto L3f
        L3e:
            r6 = r0
        L3f:
            r5 = r5 ^ r6
            if (r5 != 0) goto L43
        L42:
            return r1
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7936e.license(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // defpackage.InterfaceC7069e
    public CharSequence purchase(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return listPreference.f545e.getString(R.string.not_set);
        }
        return null;
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        return new C12461e(c18464e.appmetrica(C9616e.class));
    }

    public String toString() {
        switch (this.f16079e) {
            case 9:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC3832e
    public long vip() {
        return System.currentTimeMillis();
    }
}
