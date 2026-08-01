package defpackage;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import java.security.SecureRandom;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؑٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136e implements InterfaceC14454e, InterfaceC15558e, InterfaceC0619e, InterfaceC3054e, InterfaceC7854e, InterfaceC1589e, InterfaceC13204e, InterfaceC5808e, InterfaceC11232e, InterfaceC4871e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1359e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C0136e f1354e = new C0136e(14);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C0136e f1353e = new C0136e(15);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C0136e f1356e = new C0136e(16);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C0136e f1352e = new C0136e(17);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C0136e f1358e = new C0136e(18);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C0136e f1357e = new C0136e(19);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C0136e f1355e = new C0136e(21);

    public /* synthetic */ C0136e(int i) {
        this.f1359e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.crashlytics appmetrica(defpackage.AbstractC10226e r18, defpackage.C17874e r19, int r20, int r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0136e.appmetrica(eَْ, eًٜ٘, int, int, boolean, boolean):crashlytics");
    }

    public static final InterfaceC13229e billing(long j, Object obj) {
        InterfaceC13229e interfaceC13229e = (InterfaceC13229e) AbstractC1929e.startapp(j, obj);
        if (((AbstractC1229e) interfaceC13229e).f3884e) {
            return interfaceC13229e;
        }
        int size = interfaceC13229e.size();
        InterfaceC13229e applovin = interfaceC13229e.applovin(size == 0 ? 10 : size + size);
        AbstractC1929e.adcel(j, obj, applovin);
        return applovin;
    }

    public static /* synthetic */ void metrica(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [eَْ] */
    /* JADX WARN: Type inference failed for: r2v6, types: [eٜؒؒ] */
    /* JADX WARN: Type inference failed for: r2v7, types: [eَْ] */
    /* JADX WARN: Type inference failed for: r2v8, types: [eٕۛٙ] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static C13572e purchase(AbstractC15728e abstractC15728e, C17874e c17874e, int i, boolean z) {
        Object obj = null;
        if (AbstractC4520e.purchase(abstractC15728e)) {
            return new C13572e(obj, 1, 8);
        }
        if (!(abstractC15728e instanceof AbstractC14773e)) {
            if (!(abstractC15728e instanceof AbstractC10226e)) {
                throw new C14803e(10);
            }
            crashlytics appmetrica = appmetrica((AbstractC10226e) abstractC15728e, c17874e, i, 3, false, z);
            AbstractC1186e abstractC1186e = (AbstractC10226e) appmetrica.f1119e;
            if (appmetrica.f1118e) {
                abstractC1186e = AbstractC10653e.appmetrica(abstractC15728e, abstractC1186e);
            }
            return new C13572e(abstractC1186e, appmetrica.f1117e, 8);
        }
        boolean z2 = abstractC15728e instanceof C13902e;
        AbstractC14773e abstractC14773e = (AbstractC14773e) abstractC15728e;
        AbstractC10226e abstractC10226e = abstractC14773e.f29221e;
        AbstractC10226e abstractC10226e2 = abstractC14773e.f29222e;
        crashlytics appmetrica2 = appmetrica(abstractC10226e2, c17874e, i, 1, z2, z);
        crashlytics appmetrica3 = appmetrica(abstractC14773e.f29221e, c17874e, i, 2, z2, z);
        AbstractC10226e abstractC10226e3 = (AbstractC10226e) appmetrica3.f1119e;
        ?? r2 = (AbstractC10226e) appmetrica2.f1119e;
        if (r2 != 0 || abstractC10226e3 != null) {
            if (!appmetrica2.f1118e) {
                AbstractC10226e abstractC10226e4 = r2;
                if (!appmetrica3.f1118e) {
                    if (z2) {
                        AbstractC10226e abstractC10226e5 = r2;
                        if (r2 == 0) {
                            abstractC10226e5 = abstractC10226e2;
                        }
                        if (abstractC10226e3 != null) {
                            abstractC10226e = abstractC10226e3;
                        }
                        obj = new C13902e(abstractC10226e5, abstractC10226e, 0);
                    } else {
                        if (r2 == 0) {
                            abstractC10226e4 = abstractC10226e2;
                        }
                        if (abstractC10226e3 != null) {
                            abstractC10226e = abstractC10226e3;
                        }
                        obj = AbstractC1596e.ad(abstractC10226e4, abstractC10226e);
                    }
                }
            }
            if (abstractC10226e3 != null) {
                if (r2 == 0) {
                    r2 = abstractC10226e3;
                }
                r2 = AbstractC1596e.ad(r2, abstractC10226e3);
            }
            obj = AbstractC10653e.appmetrica(abstractC15728e, r2);
        }
        return new C13572e(obj, appmetrica2.f1117e, 8);
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f1359e) {
            case 14:
                List list = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(3600000L, 1, "measurement.app_uninstalled_additional_ad_id_cache_time").get();
            case 15:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.sgtm.upload.backoff_http_codes", 45, "404,429,503,504").get();
            case 16:
                List list3 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(3600000L, 65, "measurement.upload.interval").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list4 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(200L, 22, "measurement.audience.filter_result_max_count").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(7200000L, 62, "measurement.redaction.app_instance_id.ttl").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list6 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(90L, 55, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue());
            default:
                List list7 = AbstractC17254e.ad;
                return (Boolean) C7359e.ad.get();
        }
    }

    @Override // defpackage.InterfaceC14454e
    public int admob(byte[] bArr) {
        int length = bArr.length;
        int i = -1;
        int i2 = -1;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            i ^= ((((r4 ^ 128) - 1) >> 31) & i2) & (length ^ i);
            i2 &= ((bArr[length] & 255) - 1) >> 31;
        }
        if (i >= 0) {
            return bArr.length - i;
        }
        throw new Exception("pad block corrupted");
    }

    @Override // defpackage.InterfaceC4871e
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.InterfaceC0619e
    public C8208e getKey() {
        return C7000e.f14333e;
    }

    @Override // defpackage.InterfaceC7854e
    public int inmobi(C16975e c16975e) {
        return 1;
    }

    @Override // defpackage.InterfaceC14454e
    public void isPro(SecureRandom secureRandom) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    @Override // defpackage.InterfaceC1589e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean license(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            eؚِٙ r5 = (defpackage.C7086e) r5
            eؚِٙ r6 = (defpackage.C7086e) r6
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L2d
            if (r6 == 0) goto L2d
            eُۦؑ r2 = r5.ad
            eُۦؑ r3 = r6.ad
            if (r2 != r3) goto L3b
            eٕؓۧ r2 = r5.vip
            eٕؓۧ r3 = r6.vip
            boolean r2 = defpackage.AbstractC7890e.billing(r2, r3)
            if (r2 == 0) goto L3b
            boolean r2 = r5.metrica
            boolean r3 = r6.metrica
            if (r2 != r3) goto L3b
            boolean r2 = r5.license
            boolean r3 = r6.license
            if (r2 != r3) goto L3b
            boolean r5 = r5.appmetrica
            boolean r6 = r6.appmetrica
            if (r5 != r6) goto L3b
            goto L3a
        L2d:
            if (r5 != 0) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r0
        L32:
            if (r6 != 0) goto L36
            r6 = r1
            goto L37
        L36:
            r6 = r0
        L37:
            r5 = r5 ^ r6
            if (r5 != 0) goto L3b
        L3a:
            return r1
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0136e.license(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // defpackage.InterfaceC14454e
    public int loadAd(int i, byte[] bArr) {
        int length = bArr.length - i;
        bArr[i] = Byte.MIN_VALUE;
        while (true) {
            i++;
            if (i >= bArr.length) {
                return length;
            }
            bArr[i] = 0;
        }
    }

    @Override // defpackage.InterfaceC7854e
    public boolean mopub(C16975e c16975e) {
        return false;
    }

    @Override // defpackage.InterfaceC11232e
    public C3900e pro(Context context, String str, InterfaceC11716e interfaceC11716e) {
        C3900e c3900e = new C3900e();
        int yandex = interfaceC11716e.yandex(context, str);
        c3900e.vip = yandex;
        if (yandex != 0) {
            c3900e.license = -1;
            return c3900e;
        }
        int purchase = interfaceC11716e.purchase(context, str, true);
        c3900e.metrica = purchase;
        if (purchase != 0) {
            c3900e.license = 1;
        }
        return c3900e;
    }

    @Override // defpackage.InterfaceC7854e
    public InterfaceC10625e remoteconfig(C16975e c16975e) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        return new C6114e(0);
    }

    @Override // defpackage.InterfaceC15558e
    public boolean startapp(InterfaceC5021e interfaceC5021e, InterfaceC5021e interfaceC5021e2) {
        if (interfaceC5021e == null) {
            metrica(0);
            throw null;
        }
        if (interfaceC5021e2 != null) {
            return interfaceC5021e.equals(interfaceC5021e2);
        }
        metrica(1);
        throw null;
    }

    public String toString() {
        switch (this.f1359e) {
            case 8:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC0619e
    public Object vip(AbstractC4125e abstractC4125e, Function1 function1) {
        C5033e c5033e = (C5033e) abstractC4125e;
        C7000e c7000e = new C7000e(c5033e);
        function1.invoke(c7000e);
        c5033e.mopub(C13065e.f25990e, new C12358e(c7000e, false, null, 8));
        return c7000e;
    }
}
