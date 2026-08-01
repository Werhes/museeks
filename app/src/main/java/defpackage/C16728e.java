package defpackage;

import android.content.Context;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.List;
import java.util.WeakHashMap;
import javax.crypto.Mac;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16728e implements InterfaceC8292e, InterfaceC1481e, InterfaceC14454e, InterfaceC12163e, InterfaceC9349e, InterfaceC13204e, InterfaceC11716e, InterfaceC4871e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32791e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C16728e f32786e = new C16728e(15);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C16728e f32785e = new C16728e(16);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C16728e f32788e = new C16728e(17);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C16728e f32784e = new C16728e(18);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C16728e f32790e = new C16728e(19);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C16728e f32789e = new C16728e(20);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C16728e f32787e = new C16728e(22);

    public C16728e() {
        this.f32791e = 8;
        String str = C6272e.license;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public /* synthetic */ C16728e(int i) {
        this.f32791e = i;
    }

    public static final C15752e adcel(int i, String str) {
        WeakHashMap weakHashMap = C8845e.isVip;
        return new C15752e(i, str);
    }

    public static C4637e amazon(EnumC14212e enumC14212e, EnumC15386e enumC15386e) {
        EnumC2392e enumC2392e = C4637e.appmetrica;
        return new C4637e(enumC14212e, enumC15386e, C4637e.appmetrica);
    }

    public static final C0675e mopub(int i, String str) {
        WeakHashMap weakHashMap = C8845e.isVip;
        return new C0675e(new C11303e(0, 0, 0, 0), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
    
        if (r3 <= (r5.getHeight() * r5.getWidth())) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C4637e pro(int r4, android.util.Size r5, defpackage.C6331e r6, int r7, int r8, defpackage.EnumC2392e r9) {
        /*
            java.util.LinkedHashMap r0 = defpackage.C4637e.yandex
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.get(r1)
            eٓۙۦ r0 = (defpackage.EnumC14212e) r0
            if (r0 != 0) goto L10
            eٓۙۦ r0 = defpackage.EnumC14212e.f28078e
        L10:
            eُٕٗ r1 = defpackage.EnumC15386e.NOT_SUPPORT
            android.util.Size r2 = defpackage.AbstractC2084e.ad
            int r2 = r5.getWidth()
            int r3 = r5.getHeight()
            int r3 = r3 * r2
            r2 = 1
            if (r7 != r2) goto L4c
            java.util.LinkedHashMap r5 = r6.vip
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.get(r7)
            android.util.Size r5 = (android.util.Size) r5
            int r5 = defpackage.AbstractC2084e.ad(r5)
            if (r3 > r5) goto L36
            eُٕٗ r1 = defpackage.EnumC15386e.S720P_16_9
            goto Ldc
        L36:
            java.util.LinkedHashMap r5 = r6.license
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r5.get(r4)
            android.util.Size r4 = (android.util.Size) r4
            int r4 = defpackage.AbstractC2084e.ad(r4)
            if (r3 > r4) goto Ldc
            eُٕٗ r1 = defpackage.EnumC15386e.S1440P_4_3
            goto Ldc
        L4c:
            if (r8 != r2) goto L7c
            java.util.LinkedHashMap r6 = r6.purchase
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r6.get(r4)
            android.util.Size r4 = (android.util.Size) r4
            eُٕٗ[] r6 = defpackage.C4637e.purchase
            int r7 = r6.length
            r8 = 0
        L5e:
            if (r8 >= r7) goto L6f
            r2 = r6[r8]
            android.util.Size r3 = r2.f30338e
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L6c
            r1 = r2
            goto L6f
        L6c:
            int r8 = r8 + 1
            goto L5e
        L6f:
            eُٕٗ r6 = defpackage.EnumC15386e.NOT_SUPPORT
            if (r1 != r6) goto Ldc
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Ldc
            eُٕٗ r1 = defpackage.EnumC15386e.MAXIMUM
            goto Ldc
        L7c:
            android.util.Size r5 = r6.ad
            int r5 = defpackage.AbstractC2084e.ad(r5)
            if (r3 > r5) goto L87
            eُٕٗ r1 = defpackage.EnumC15386e.VGA
            goto Ldc
        L87:
            android.util.Size r5 = r6.metrica
            int r5 = defpackage.AbstractC2084e.ad(r5)
            if (r3 > r5) goto L92
            eُٕٗ r1 = defpackage.EnumC15386e.PREVIEW
            goto Ldc
        L92:
            android.util.Size r5 = r6.appmetrica
            int r8 = r5.getWidth()
            int r5 = r5.getHeight()
            int r5 = r5 * r8
            if (r3 > r5) goto La2
            eُٕٗ r1 = defpackage.EnumC15386e.RECORD
            goto Ldc
        La2:
            java.util.LinkedHashMap r5 = r6.purchase
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.get(r8)
            android.util.Size r5 = (android.util.Size) r5
            java.util.LinkedHashMap r6 = r6.startapp
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r6.get(r4)
            android.util.Size r4 = (android.util.Size) r4
            if (r5 == 0) goto Lc7
            int r6 = r5.getWidth()
            int r5 = r5.getHeight()
            int r5 = r5 * r6
            if (r3 > r5) goto Lcd
        Lc7:
            r5 = 2
            if (r7 == r5) goto Lcd
            eُٕٗ r1 = defpackage.EnumC15386e.MAXIMUM
            goto Ldc
        Lcd:
            if (r4 == 0) goto Ldc
            int r5 = r4.getWidth()
            int r4 = r4.getHeight()
            int r4 = r4 * r5
            if (r3 > r4) goto Ldc
            eُٕٗ r1 = defpackage.EnumC15386e.ULTRA_MAXIMUM
        Ldc:
            eؗؕٗ r4 = new eؗؕٗ
            r4.<init>(r0, r1, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16728e.pro(int, android.util.Size, eؙُ۟, int, int, eؔؗۚ):eؗؕٗ");
    }

    public static C8845e remoteconfig(View view) {
        C8845e c8845e;
        WeakHashMap weakHashMap = C8845e.isVip;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new C8845e(view);
                    weakHashMap.put(view, obj);
                }
                c8845e = (C8845e) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8845e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r14[r12] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r14[r12] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r14[r12] <= (-65)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int signatures(int r11, int r12, int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16728e.signatures(int, int, int, byte[]):int");
    }

    public static AbstractC16232e smaato(InterfaceC16046e interfaceC16046e, C9265e c9265e, AbstractC1186e abstractC1186e) {
        if (!c9265e.metrica) {
            c9265e = c9265e.vip(1);
        }
        int m2467class = AbstractC8703e.m2467class(c9265e.vip);
        if (m2467class != 0 && m2467class != 1) {
            if (m2467class == 2) {
                return new C7878e(1, abstractC1186e);
            }
            throw new C14803e(10);
        }
        int mo2738e = interfaceC16046e.mo2738e();
        boolean z = true;
        if (mo2738e != 1) {
            if (mo2738e == 2) {
                z = false;
            } else if (mo2738e != 3) {
                throw null;
            }
        }
        return !z ? new C7878e(1, AbstractC2876e.appmetrica(interfaceC16046e).amazon()) : !abstractC1186e.loadAd().getParameters().isEmpty() ? new C7878e(3, abstractC1186e) : AbstractC11957e.mopub(interfaceC16046e, c9265e);
    }

    public static C8845e subscription(C13770e c13770e) {
        View view = (View) c13770e.adcel(AbstractC2676e.purchase);
        C8845e remoteconfig = remoteconfig(view);
        boolean yandex = c13770e.yandex(remoteconfig) | c13770e.yandex(view);
        Object m3681throw = c13770e.m3681throw();
        if (yandex || m3681throw == C2987e.ad) {
            m3681throw = new C13942e(remoteconfig, view, 15);
            c13770e.m3682throws(m3681throw);
        }
        AbstractC17680e.vip(remoteconfig, (Function1) m3681throw, c13770e);
        return remoteconfig;
    }

    @Override // defpackage.InterfaceC12163e
    public Object Signature(C13840e c13840e, Object obj) {
        C11993e c11993e;
        C16675e c16675e = (C16675e) obj;
        C1169e license = AbstractC6874e.license();
        license.add(Integer.valueOf(c16675e.ad));
        C12742e c12742e = c16675e.vip;
        license.add(Integer.valueOf(c12742e.size()));
        C12742e c12742e2 = c16675e.metrica;
        license.add(Integer.valueOf(c12742e2.size()));
        int size = c12742e.size();
        int i = 0;
        while (true) {
            c11993e = C12569e.startapp;
            if (i >= size) {
                break;
            }
            license.add(c11993e.Signature(c13840e, c12742e.get(i)));
            i++;
        }
        int size2 = c12742e2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            license.add(c11993e.Signature(c13840e, c12742e2.get(i2)));
        }
        return AbstractC6874e.metrica(license);
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f32791e) {
            case 15:
                List list = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.gbraid_campaign.campaign_params_triggering_info_update", 4, "gclid,gbraid,gad_campaignid").get();
            case 16:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(600000L, 51, "measurement.sgtm.upload.retry_interval").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list3 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(10000L, 33, "measurement.upload.realtime_upload_interval").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list4 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(5000L, 36, "measurement.service_client.idle_disconnect_millis").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(100L, 67, "measurement.upload.max_bundles").get()).longValue());
            case 20:
                List list6 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(0L, 25, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue());
            default:
                List list7 = AbstractC17254e.ad;
                C4261e.f9346e.get();
                return (Boolean) C13302e.ad.license("measurement.rb.attribution.service.trigger_uris_high_priority", true, 2).get();
        }
    }

    @Override // defpackage.InterfaceC14454e
    public int admob(byte[] bArr) {
        byte b = bArr[bArr.length - 1];
        int i = b & 255;
        int length = bArr.length - i;
        int i2 = ((i - 1) | length) >> 31;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i2 |= (bArr[i3] ^ b) & (~((i3 - length) >> 31));
        }
        if (i2 == 0) {
            return i;
        }
        throw new Exception("pad block corrupted");
    }

    @Override // defpackage.InterfaceC1481e
    public AbstractC13960e advert(InterfaceC7227e interfaceC7227e, C8229e c8229e) {
        return billing(((InterfaceC18155e) interfaceC7227e).subs(), c8229e);
    }

    @Override // defpackage.InterfaceC4871e
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.InterfaceC8292e
    public Object appmetrica(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // defpackage.InterfaceC1481e
    public AbstractC13960e billing(Class cls, C8229e c8229e) {
        return new C12905e();
    }

    @Override // defpackage.InterfaceC14454e
    public void isPro(SecureRandom secureRandom) {
    }

    @Override // defpackage.InterfaceC1481e
    public AbstractC13960e license(Class cls) {
        return new C12905e();
    }

    @Override // defpackage.InterfaceC14454e
    public int loadAd(int i, byte[] bArr) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length) {
            bArr[i] = length;
            i++;
        }
        return length;
    }

    @Override // defpackage.InterfaceC9349e
    public C0537e metrica(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.InterfaceC11716e
    public int purchase(Context context, String str, boolean z) {
        return C0781e.license(context, str, z);
    }

    @Override // defpackage.InterfaceC12163e
    public Object startapp(Object obj) {
        C11993e c11993e;
        List list = (List) obj;
        int intValue = ((Number) list.get(0)).intValue();
        int intValue2 = ((Number) list.get(1)).intValue();
        int intValue3 = ((Number) list.get(2)).intValue();
        C1169e license = AbstractC6874e.license();
        int i = 3;
        while (true) {
            int i2 = intValue2 + 3;
            c11993e = C12569e.startapp;
            if (i >= i2) {
                break;
            }
            license.add(c11993e.startapp(list.get(i)));
            i++;
        }
        C1169e metrica = AbstractC6874e.metrica(license);
        C1169e license2 = AbstractC6874e.license();
        while (i < intValue2 + intValue3 + 3) {
            license2.add(c11993e.startapp(list.get(i)));
            i++;
        }
        return new C16675e(intValue, metrica, AbstractC6874e.metrica(license2));
    }

    public String toString() {
        switch (this.f32791e) {
            case 9:
                return AbstractC6507e.mopub(new byte[]{(byte) 1862195, (byte) 304, (byte) 108194357, (byte) 569, (byte) 154675, (byte) 1223984, (byte) 80433, (byte) 21043, (byte) 415536, (byte) 2333494, (byte) 304, (byte) 29239, (byte) 50, (byte) 65, (byte) 1971256, (byte) 2965814, (byte) 57908, (byte) 2242104, (byte) 10904899, (byte) 205893, (byte) 29337907, (byte) 8772, (byte) 48, (byte) 140877618, (byte) 48, (byte) 45997105, (byte) 192560, (byte) 6710, (byte) 26092848, (byte) 503608, (byte) 128857906, (byte) 65, (byte) 12344, (byte) 322102, (byte) 308, (byte) 583480, (byte) 48310339, (byte) 325, (byte) 119091, (byte) 324, (byte) 11312, (byte) 829747, (byte) 52528, (byte) 90860081, (byte) 14128, (byte) 100973111, (byte) 183247664, (byte) 1331, (byte) 6196, (byte) 3378, (byte) 1328, (byte) 6192, (byte) 1328, (byte) 56655412, (byte) 1959868983, (byte) 56193335, (byte) 52, (byte) 150487345, (byte) 12825139, (byte) 209729, (byte) 1979205, (byte) 162424882, (byte) 3640, (byte) 385416514, (byte) 214340, (byte) 2818353, (byte) 3211332, (byte) 127831363, (byte) 33857, (byte) 27331640, (byte) 65497155, (byte) 5414721, (byte) 87413060, (byte) 35040816, (byte) 1430083, (byte) 75841, (byte) 30807621, (byte) 1849, (byte) 84018243, (byte) 304, (byte) 48, (byte) 58437, (byte) 4790596, (byte) 228658, (byte) 6709, (byte) 482882, (byte) 12943920, (byte) 54, (byte) 453545538, (byte) 54, (byte) 1411639, (byte) 237899826, (byte) 1800244, (byte) 7477, (byte) 54341, (byte) 158823491, (byte) 555569, (byte) 1589, (byte) 12726073, (byte) 13535285, (byte) 125510, (byte) 141879, (byte) 312, (byte) 205876, (byte) 7224, (byte) 3916080, (byte) 10553, (byte) 842310, (byte) 23096, (byte) 568, (byte) 966094901, (byte) 55, (byte) 348700980, (byte) 1856582, (byte) 100408, (byte) 581, (byte) 664370, (byte) 16710, (byte) 152375, (byte) 53, (byte) 57, (byte) 3594809, (byte) 580, (byte) 138746168, (byte) 201264, (byte) 24350533, (byte) 2116, (byte) 152434228, (byte) 988721, (byte) 12551493, (byte) 143137094, (byte) 128077382, (byte) 6106936, (byte) 11982649, (byte) 46406, (byte) 277556, (byte) 943599927, (byte) 2353, (byte) 320560950, (byte) 345176898, (byte) 233541, (byte) 52279, (byte) 23208244, (byte) 354359, (byte) 324, (byte) 833, (byte) 108976440, (byte) 193603, (byte) 200939843, (byte) 48, (byte) 62534, (byte) 5650227, (byte) 55657028, (byte) 3379, (byte) 66394418, (byte) 23597633, (byte) 695012656, (byte) 562, (byte) 68, (byte) 97955381, (byte) 1586, (byte) 65, (byte) 66, (byte) 50429765, (byte) 54, (byte) 2141766, (byte) 3167025, (byte) 569410, (byte) 526934337, (byte) 1726230832, (byte) 76088, (byte) 122975281, (byte) 327733, (byte) 6299969, (byte) 45304374, (byte) 32818, (byte) 11585, (byte) 122794033, (byte) 225583685, (byte) 193845, (byte) 26013250, (byte) 7474});
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9349e
    public boolean vip(Class cls) {
        return false;
    }

    @Override // defpackage.InterfaceC11716e
    public int yandex(Context context, String str) {
        return C0781e.ad(context, str);
    }
}
