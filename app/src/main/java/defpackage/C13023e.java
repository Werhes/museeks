package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13023e implements InterfaceC5282e, InterfaceC11124e, InterfaceC4732e, InterfaceC14454e, InterfaceC5808e, InterfaceC13204e, InterfaceC9307e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25945e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C13023e f25940e = new C13023e(14);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C13023e f25939e = new C13023e(16);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C13023e f25942e = new C13023e(17);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C13023e f25938e = new C13023e(18);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C13023e f25944e = new C13023e(19);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C13023e f25943e = new C13023e(20);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C13023e f25941e = new C13023e(22);

    public /* synthetic */ C13023e(int i) {
        this.f25945e = i;
    }

    public static C2362e appmetrica(C17469e c17469e, InterfaceC12424e interfaceC12424e) {
        InterfaceC11640e m4018goto;
        C15816e c15816e = new C15816e(8, interfaceC12424e);
        List list = c17469e.appmetrica;
        AbstractC9464e.yandex("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + c17469e + ", lensFacing = " + interfaceC12424e.admob());
        Set set = c17469e.license;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        List list2 = c17469e.purchase;
        if (set.isEmpty() && list.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one required or preferred feature");
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
                boolean z = abstractC16510e instanceof C9301e;
                EnumC8815e enumC8815e = EnumC8815e.f17730e;
                if ((z ? EnumC8815e.f17727e : abstractC16510e instanceof C3373e ? EnumC8815e.f17726e : abstractC16510e instanceof C12477e ? EnumC8815e.f17729e : AbstractC13350e.license(abstractC16510e) ? EnumC8815e.f17725e : abstractC16510e instanceof C14402e ? EnumC8815e.f17731e : enumC8815e) == enumC8815e) {
                    m4018goto = new C14932e(abstractC16510e);
                    break;
                }
            } else {
                Iterator it2 = set.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C7003e m4011this = C15816e.m4011this((AbstractC3677e) it2.next(), list2);
                        if (m4011this != null) {
                            m4018goto = m4011this;
                            break;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            C7003e m4011this2 = C15816e.m4011this((AbstractC3677e) obj, list2);
                            if (m4011this2 != null) {
                                AbstractC9464e.yandex("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + m4011this2);
                            } else {
                                m4011this2 = null;
                            }
                            if (m4011this2 == null) {
                                arrayList.add(obj);
                            }
                        }
                        AbstractC9464e.yandex("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
                        m4018goto = c15816e.m4018goto(c17469e, arrayList, 0, C13664e.f27089e);
                    }
                }
            }
        }
        if (m4018goto instanceof C0157e) {
            C2362e c2362e = ((C0157e) m4018goto).ad;
            AbstractC9464e.yandex("ResolvedFeatureGroup", "resolvedFeatureGroup = " + c2362e);
            return c2362e;
        }
        if (m4018goto instanceof C2274e) {
            throw new IllegalArgumentException("Feature group is not supported");
        }
        if (m4018goto instanceof C14932e) {
            throw new IllegalArgumentException(((C14932e) m4018goto).ad + " is not supported");
        }
        if (!(m4018goto instanceof C7003e)) {
            throw new C14803e(10);
        }
        StringBuilder sb = new StringBuilder();
        C7003e c7003e = (C7003e) m4018goto;
        sb.append(c7003e.ad);
        sb.append(" must be added for ");
        sb.append(c7003e.vip);
        throw new IllegalArgumentException(sb.toString());
    }

    public static C5471e metrica(long j, long j2) {
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            return j > 0 ? C5471e.f11745e : C5471e.f11744e;
        }
        if (j4 < -31557014167219200L) {
            return C5471e.f11744e;
        }
        if (j4 > 31556889864403199L) {
            return C5471e.f11745e;
        }
        long j5 = j2 % 1000000000;
        return new C5471e(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, e٘ؐٓ] */
    public static final C17456e pro(Object obj, Object obj2) {
        C17456e c17456e = (C17456e) obj;
        C17456e c17456e2 = (C17456e) obj2;
        if (!c17456e2.isEmpty()) {
            if (!c17456e.f34187e) {
                if (c17456e.isEmpty()) {
                    c17456e = new C17456e();
                } else {
                    ?? linkedHashMap = new LinkedHashMap(c17456e);
                    linkedHashMap.f34187e = true;
                    c17456e = linkedHashMap;
                }
            }
            c17456e.vip();
            if (!c17456e2.isEmpty()) {
                c17456e.putAll(c17456e2);
            }
        }
        return c17456e;
    }

    @Override // defpackage.InterfaceC5282e
    public boolean Signature(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f25945e) {
            case 14:
                return new Boolean(((Boolean) C4452e.ad.get()).booleanValue());
            case 15:
            default:
                return new Boolean(((Boolean) C7160e.ad.get()).booleanValue());
            case 16:
                List list = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(600000L, 48, "measurement.sgtm.upload.min_delay_after_background").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(1800000L, 77, "measurement.upload.retry_time").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list3 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(27L, 23, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list4 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.rb.attribution.event_params", 13, "value|currency").get();
            case 20:
                List list5 = AbstractC17254e.ad;
                return (Boolean) C0945e.metrica.get();
        }
    }

    @Override // defpackage.InterfaceC11124e
    public void adcel(C13915e c13915e, long j, C2106e c2106e, int i, boolean z) {
        C14742e c14742e = c13915e.f27592e;
        AbstractC17732e abstractC17732e = (AbstractC17732e) c14742e.appmetrica;
        C10122e c10122e = AbstractC17732e.f34770e;
        ((AbstractC17732e) c14742e.appmetrica).m4412e(AbstractC17732e.f34774e, abstractC17732e.m4405e(j, true), c2106e, 1, z);
    }

    @Override // defpackage.InterfaceC14454e
    public int admob(byte[] bArr) {
        int length = bArr.length - 1;
        int i = bArr[length] & 255;
        int i2 = -1;
        int i3 = 1;
        while (true) {
            length--;
            if (length < 0) {
                return i3;
            }
            i2 &= (((bArr[length] & 255) ^ i) - 1) >> 31;
            i3 -= i2;
        }
    }

    @Override // defpackage.InterfaceC11124e
    public boolean advert(C2106e c2106e, C13915e c13915e) {
        return false;
    }

    @Override // defpackage.InterfaceC11124e
    public boolean amazon(C13915e c13915e) {
        C0500e inmobi = c13915e.inmobi();
        boolean z = false;
        if (inmobi != null && inmobi.f2577e) {
            z = true;
        }
        return !z;
    }

    @Override // defpackage.InterfaceC11124e
    public boolean billing(AbstractC13616e abstractC13616e) {
        return AbstractC0421e.yandex(AbstractC0250e.metrica(AbstractC5851e.mopub(abstractC13616e), false));
    }

    @Override // defpackage.InterfaceC9307e
    /* renamed from: eؘؕۥ */
    public void mo268e(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // defpackage.InterfaceC14454e
    public void isPro(SecureRandom secureRandom) {
    }

    @Override // defpackage.InterfaceC11124e
    public boolean license(AbstractC13616e abstractC13616e) {
        return false;
    }

    @Override // defpackage.InterfaceC14454e
    public int loadAd(int i, byte[] bArr) {
        int length = bArr.length - i;
        int i2 = 0;
        if (i <= 0 ? (bArr[bArr.length - 1] & 1) == 0 : (bArr[i - 1] & 1) == 0) {
            i2 = 255;
        }
        byte b = (byte) i2;
        while (i < bArr.length) {
            bArr[i] = b;
            i++;
        }
        return length;
    }

    @Override // defpackage.InterfaceC4732e
    public void mopub(int i, Object obj) {
    }

    @Override // defpackage.InterfaceC11124e
    public int purchase() {
        return 8;
    }

    @Override // defpackage.InterfaceC5282e
    public boolean remoteconfig() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [eًؗؕ, java.lang.Object] */
    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        switch (this.f25945e) {
            case 13:
                return new C4590e(0);
            default:
                Set<C12461e> m4510e = c18464e.m4510e(C12461e.class);
                ?? obj = new Object();
                obj.ad = new HashMap();
                for (C12461e c12461e : m4510e) {
                    HashMap hashMap = obj.ad;
                    c12461e.getClass();
                    hashMap.put(AbstractC8217e.class, c12461e.ad);
                }
                return obj;
        }
    }

    @Override // defpackage.InterfaceC4732e
    public void startapp() {
    }

    @Override // defpackage.InterfaceC5282e
    public int subscription() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.InterfaceC5282e
    public MediaCodecInfo vip(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.InterfaceC5282e
    public boolean yandex(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }
}
