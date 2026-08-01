package defpackage;

import android.media.AudioTrack;
import android.media.audiofx.DynamicsProcessing;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17203e implements InterfaceC5387e {
    public DynamicsProcessing ad;

    public static int adcel(C6442e c6442e) {
        C16801e c16801e = c6442e.f13347e;
        if (c16801e == null) {
            C1158e c1158e = C1158e.f3743e;
            c16801e = C1158e.license();
        }
        return c16801e.f32939e.size();
    }

    public static DynamicsProcessing.MbcBand appmetrica(C14056e c14056e) {
        AbstractC13019e.license();
        return AbstractC13019e.metrica(c14056e.f27805e, c14056e.f27801e, c14056e.f27808e, c14056e.f27807e, c14056e.f27803e, c14056e.f27806e, c14056e.f27802e, c14056e.f27804e);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float billing(defpackage.C6442e r6, boolean r7) {
        /*
            eؗۥْ r0 = r6.f13349e
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L4f
            boolean r3 = r0.f11347e
            if (r3 == 0) goto L4f
            boolean r3 = r0.f11345e
            if (r3 == 0) goto L42
            java.util.List r0 = r0.f11346e
            java.util.Iterator r0 = r0.iterator()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L1c
            r0 = r1
            goto L3b
        L1c:
            java.lang.Object r3 = r0.next()
            eٓٙ r3 = (defpackage.C14056e) r3
            float r3 = r3.f27804e
        L24:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r0.next()
            eٓٙ r4 = (defpackage.C14056e) r4
            float r4 = r4.f27804e
            float r3 = java.lang.Math.max(r3, r4)
            goto L24
        L37:
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
        L3b:
            if (r0 == 0) goto L4f
            float r0 = r0.floatValue()
            goto L50
        L42:
            float r3 = yandex(r0)
            float r0 = startapp(r0)
            float r0 = java.lang.Math.max(r3, r0)
            goto L50
        L4f:
            r0 = r2
        L50:
            eؚِٖ r3 = r6.f13344e
            if (r3 == 0) goto L5c
            boolean r4 = r3.f14696e
            r5 = 1
            if (r4 != r5) goto L5c
            float r3 = r3.f14697e
            goto L5d
        L5c:
            r3 = r2
        L5d:
            eَٗؗ r6 = r6.f13347e
            if (r6 == 0) goto L96
            java.util.List r6 = r6.f32939e
            if (r6 == 0) goto L96
            java.util.Iterator r6 = r6.iterator()
            boolean r4 = r6.hasNext()
            if (r4 != 0) goto L70
            goto L8f
        L70:
            java.lang.Object r1 = r6.next()
            eؒٓٞ r1 = (defpackage.C1050e) r1
            float r1 = r1.f3536e
        L78:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L8b
            java.lang.Object r4 = r6.next()
            eؒٓٞ r4 = (defpackage.C1050e) r4
            float r4 = r4.f3536e
            float r1 = java.lang.Math.max(r1, r4)
            goto L78
        L8b:
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
        L8f:
            if (r1 == 0) goto L96
            float r6 = r1.floatValue()
            goto L97
        L96:
            r6 = r2
        L97:
            float r6 = java.lang.Math.max(r3, r6)
            float r6 = java.lang.Math.max(r0, r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto La4
            goto La5
        La4:
            r2 = r6
        La5:
            if (r7 == 0) goto Laa
            r6 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r6
        Laa:
            float r6 = -r2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17203e.billing(eؙٟٗ, boolean):float");
    }

    public static DynamicsProcessing.Limiter license(C6442e c6442e) {
        C7190e c7190e = c6442e.f13344e;
        if (c7190e == null) {
            C1158e c1158e = C1158e.f3743e;
            c7190e = C1158e.billing();
        }
        AbstractC13019e.purchase();
        return AbstractC13019e.vip(c7190e.f14696e, c7190e.f14694e, c7190e.f14699e, c7190e.f14698e, c7190e.f14695e, c7190e.f14697e);
    }

    public static DynamicsProcessing.Eq metrica(C6442e c6442e) {
        C16801e c16801e = c6442e.f13347e;
        if (c16801e == null) {
            C1158e c1158e = C1158e.f3743e;
            c16801e = C1158e.license();
        }
        List list = c16801e.f32939e;
        DynamicsProcessing.Eq eq = new DynamicsProcessing.Eq(true, true, list.size());
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            C1050e c1050e = (C1050e) obj;
            eq.setBand(i, new DynamicsProcessing.EqBand(true, c1050e.f3537e, c1050e.f3536e));
            i = i2;
        }
        return eq;
    }

    public static DynamicsProcessing.Mbc purchase(C6442e c6442e) {
        C5267e c5267e = c6442e.f13349e;
        if (c5267e == null) {
            C1158e c1158e = C1158e.f3743e;
            c5267e = C1158e.ad();
        }
        boolean z = c5267e.f11347e;
        List list = c5267e.f11346e;
        if (c5267e.f11345e) {
            DynamicsProcessing.Mbc mbc = new DynamicsProcessing.Mbc(true, z, list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                mbc.setBand(i, appmetrica((C14056e) list.get(i)));
            }
            return mbc;
        }
        DynamicsProcessing.Mbc mbc2 = new DynamicsProcessing.Mbc(true, z, 3);
        C1158e c1158e2 = C1158e.f3743e;
        mbc2.setBand(0, appmetrica(new C14056e(125.0f, 1.1f, 0.0f, yandex(c5267e))));
        mbc2.setBand(1, appmetrica(new C14056e(6000.0f, 1.1f, 0.0f, 0.0f)));
        mbc2.setBand(2, appmetrica(new C14056e(20000.0f, 1.1f, 0.0f, startapp(c5267e))));
        return mbc2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؑۡ, eُۙۨ] */
    public static float startapp(C5267e c5267e) {
        return ((Number) AbstractC3062e.purchase(Float.valueOf((AbstractC3062e.license(c5267e.f11348e, new C11241e(0, 100, 1)) / 100.0f) * 8.0f), new C3721e(0.0f, 8.0f))).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؑۡ, eُۙۨ] */
    public static float yandex(C5267e c5267e) {
        return ((Number) AbstractC3062e.purchase(Float.valueOf((AbstractC3062e.license(c5267e.f11349e, new C11241e(0, 100, 1)) / 100.0f) * 8.0f), new C3721e(0.0f, 8.0f))).floatValue();
    }

    @Override // defpackage.InterfaceC5387e
    public final void ad(int i, C6442e c6442e) {
        int adcel = adcel(c6442e);
        C5267e c5267e = c6442e.f13349e;
        if (c5267e == null) {
            c5267e = C1158e.ad();
        }
        DynamicsProcessing.Config.Builder preferredFrameDuration = new DynamicsProcessing.Config.Builder(0, 2, true, adcel, true, c5267e.f11345e ? c5267e.f11346e.size() : 3, true, adcel(c6442e), true).setPreferredFrameDuration(4096000.0f / AudioTrack.getNativeOutputSampleRate(3));
        DynamicsProcessing.Eq metrica = metrica(c6442e);
        preferredFrameDuration.setPreEqAllChannelsTo(metrica);
        preferredFrameDuration.setPostEqAllChannelsTo(metrica);
        preferredFrameDuration.setMbcAllChannelsTo(purchase(c6442e));
        preferredFrameDuration.setLimiterAllChannelsTo(license(c6442e));
        C16074e c16074e = c6442e.f13348e;
        if (c16074e != null) {
            if (!c16074e.f31668e) {
                preferredFrameDuration.setInputGainAllChannelsTo(0.0f);
            } else if (c16074e.f31666e) {
                preferredFrameDuration.setInputGainAllChannelsTo(billing(c6442e, c16074e.f31670e));
            } else {
                preferredFrameDuration.setInputGainByChannelIndex(0, c16074e.f31669e);
                preferredFrameDuration.setInputGainByChannelIndex(1, c16074e.f31667e);
            }
        }
        DynamicsProcessing dynamicsProcessing = new DynamicsProcessing(100, i, preferredFrameDuration.build());
        dynamicsProcessing.setEnabled(true);
        this.ad = dynamicsProcessing;
    }

    @Override // defpackage.InterfaceC5387e
    public final void release() {
        DynamicsProcessing dynamicsProcessing = this.ad;
        if (dynamicsProcessing != null) {
            dynamicsProcessing.release();
        }
        this.ad = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    @Override // defpackage.InterfaceC5387e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean vip(defpackage.C6442e r7) {
        /*
            r6 = this;
            android.media.audiofx.DynamicsProcessing r0 = r6.ad
            r1 = 0
            if (r0 == 0) goto L9e
            r2 = 1
            android.media.audiofx.DynamicsProcessing$Mbc r3 = r0.getMbcByChannelIndex(r1)     // Catch: java.lang.Throwable -> L43
            int r3 = r3.getBandCount()     // Catch: java.lang.Throwable -> L43
            eؗۥْ r4 = r7.f13349e     // Catch: java.lang.Throwable -> L43
            if (r4 != 0) goto L16
            eؗۥْ r4 = defpackage.C1158e.ad()     // Catch: java.lang.Throwable -> L43
        L16:
            boolean r5 = r4.f11345e     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L21
            java.util.List r4 = r4.f11346e     // Catch: java.lang.Throwable -> L43
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L43
            goto L22
        L21:
            r4 = 3
        L22:
            if (r3 != r4) goto L45
            android.media.audiofx.DynamicsProcessing$Eq r3 = r0.getPreEqByChannelIndex(r1)     // Catch: java.lang.Throwable -> L43
            int r3 = r3.getBandCount()     // Catch: java.lang.Throwable -> L43
            int r4 = adcel(r7)     // Catch: java.lang.Throwable -> L43
            if (r3 != r4) goto L45
            android.media.audiofx.DynamicsProcessing$Eq r3 = r0.getPostEqByChannelIndex(r1)     // Catch: java.lang.Throwable -> L43
            int r3 = r3.getBandCount()     // Catch: java.lang.Throwable -> L43
            int r4 = adcel(r7)     // Catch: java.lang.Throwable -> L43
            if (r3 == r4) goto L41
            goto L45
        L41:
            r3 = r1
            goto L46
        L43:
            r3 = move-exception
            goto L4b
        L45:
            r3 = r2
        L46:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L43
            goto L51
        L4b:
            eّۜۖ r4 = new eّۜۖ
            r4.<init>(r3)
            r3 = r4
        L51:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r5 = r3 instanceof defpackage.C12763e
            if (r5 == 0) goto L58
            r3 = r4
        L58:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L61
            return r2
        L61:
            android.media.audiofx.DynamicsProcessing$Eq r3 = metrica(r7)
            r0.setPreEqAllChannelsTo(r3)
            r0.setPostEqAllChannelsTo(r3)
            android.media.audiofx.DynamicsProcessing$Mbc r3 = purchase(r7)
            r0.setMbcAllChannelsTo(r3)
            android.media.audiofx.DynamicsProcessing$Limiter r3 = license(r7)
            r0.setLimiterAllChannelsTo(r3)
            eًٖۢ r3 = r7.f13348e
            if (r3 == 0) goto L9e
            boolean r4 = r3.f31668e
            if (r4 == 0) goto L9a
            boolean r4 = r3.f31666e
            if (r4 == 0) goto L8f
            boolean r2 = r3.f31670e
            float r7 = billing(r7, r2)
            r0.setInputGainAllChannelsTo(r7)
            goto L9e
        L8f:
            float r7 = r3.f31669e
            r0.setInputGainbyChannel(r1, r7)
            float r7 = r3.f31667e
            r0.setInputGainbyChannel(r2, r7)
            goto L9e
        L9a:
            r7 = 0
            r0.setInputGainAllChannelsTo(r7)
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17203e.vip(eؙٟٗ):boolean");
    }
}
