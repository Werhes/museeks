package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒ۠ٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1374e extends AbstractC10347e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final InterfaceC3314e[] f4167e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final AbstractC11110e f4168e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final InterfaceC3314e[] f4169e;

    public C1374e() {
        super(0);
        List asList = Arrays.asList(Integer.valueOf(R.string.spark_history_tab_purchase), Integer.valueOf(R.string.spark_history_tab_codes));
        C10327e c10327e = C10327e.f20377e;
        this.f4168e = c10327e.mo2797class(asList);
        this.f4167e = new InterfaceC3314e[]{AbstractC14533e.startapp(c10327e), AbstractC14533e.startapp(c10327e)};
        Boolean bool = Boolean.TRUE;
        this.f4169e = new InterfaceC3314e[]{AbstractC14533e.startapp(bool), AbstractC14533e.startapp(bool)};
        AbstractC14533e.startapp(Boolean.FALSE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(6:22|23|(1:25)(1:30)|26|27|(1:29))|12|(1:14)|15|16|17))|33|6|7|(0)(0)|12|(0)|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        r10.printStackTrace();
        r0[r11].setValue(java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: transient, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m574transient(defpackage.C1374e r10, int r11, defpackage.AbstractC10731e r12) {
        /*
            eِؕۧ[] r0 = r10.f4169e
            eِؕۧ[] r1 = r10.f4167e
            boolean r2 = r12 instanceof defpackage.C4364e
            if (r2 == 0) goto L17
            r2 = r12
            eِؖۚ r2 = (defpackage.C4364e) r2
            int r3 = r2.f9496e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f9496e = r3
            goto L1c
        L17:
            eِؖۚ r2 = new eِؖۚ
            r2.<init>(r10, r12)
        L1c:
            java.lang.Object r10 = r2.f9494e
            int r12 = r2.f9496e
            r3 = 20
            r4 = 0
            r5 = 1
            if (r12 == 0) goto L39
            if (r12 != r5) goto L31
            int r11 = r2.f9495e
            defpackage.AbstractC2003e.purchase(r10)     // Catch: java.lang.Exception -> L2e
            goto L87
        L2e:
            r10 = move-exception
            goto Lab
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            defpackage.AbstractC2003e.purchase(r10)
            e٘۠ؒ r10 = defpackage.AbstractC1831e.ad()     // Catch: java.lang.Exception -> L2e
            eۣۡ r10 = r10.adcel     // Catch: java.lang.Exception -> L2e
            java.lang.Object r10 = r10.f36191e     // Catch: java.lang.Exception -> L2e
            eؙُْ r10 = (defpackage.C6325e) r10     // Catch: java.lang.Exception -> L2e
            java.lang.Object r10 = r10.f13170e     // Catch: java.lang.Exception -> L2e
            eّْ۟ r10 = (defpackage.C12454e) r10     // Catch: java.lang.Exception -> L2e
            eّۦٜ r12 = new eّۦٜ     // Catch: java.lang.Exception -> L2e
            java.lang.String r6 = "/AccountService/QueryBillingHistory"
            eًْۡ r7 = defpackage.C6838e.f14087e     // Catch: java.lang.Exception -> L2e
            eّؕٗ r8 = defpackage.C7203e.f14712e     // Catch: java.lang.Exception -> L2e
            r9 = 18
            r12.<init>(r9, r6, r7, r8)     // Catch: java.lang.Exception -> L2e
            eؘٟۚ r10 = r10.metrica(r12)     // Catch: java.lang.Exception -> L2e
            eؚٕؐ r12 = new eؚٕؐ     // Catch: java.lang.Exception -> L2e
            e۟ۥ r6 = new e۟ۥ     // Catch: java.lang.Exception -> L2e
            r7 = r1[r11]     // Catch: java.lang.Exception -> L2e
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L2e
            eُٛۜ r7 = (defpackage.AbstractC11110e) r7     // Catch: java.lang.Exception -> L2e
            eًًؓ r7 = (defpackage.AbstractC7674e) r7     // Catch: java.lang.Exception -> L2e
            int r7 = r7.subs()     // Catch: java.lang.Exception -> L2e
            r6.<init>(r3, r7)     // Catch: java.lang.Exception -> L2e
            if (r11 != r5) goto L74
            r7 = r5
            goto L75
        L74:
            r7 = r4
        L75:
            eًؑۤ r8 = defpackage.C0193e.f1409e     // Catch: java.lang.Exception -> L2e
            r12.<init>(r6, r7, r8)     // Catch: java.lang.Exception -> L2e
            r2.f9495e = r11     // Catch: java.lang.Exception -> L2e
            r2.f9496e = r5     // Catch: java.lang.Exception -> L2e
            java.lang.Object r10 = r10.firebase(r12, r2)     // Catch: java.lang.Exception -> L2e
            eٟؔۙ r12 = defpackage.EnumC2821e.f6782e
            if (r10 != r12) goto L87
            return r12
        L87:
            eؚٗ r10 = (defpackage.C7203e) r10     // Catch: java.lang.Exception -> L2e
            java.util.List r10 = r10.f14713e     // Catch: java.lang.Exception -> L2e
            r12 = r1[r11]     // Catch: java.lang.Exception -> L2e
            java.lang.Object r1 = r12.getValue()     // Catch: java.lang.Exception -> L2e
            eُٛۜ r1 = (defpackage.AbstractC11110e) r1     // Catch: java.lang.Exception -> L2e
            eُٛۜ r1 = r1.mo2797class(r10)     // Catch: java.lang.Exception -> L2e
            r12.setValue(r1)     // Catch: java.lang.Exception -> L2e
            r12 = r0[r11]     // Catch: java.lang.Exception -> L2e
            int r10 = r10.size()     // Catch: java.lang.Exception -> L2e
            if (r10 != r3) goto La3
            r4 = r5
        La3:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L2e
            r12.setValue(r10)     // Catch: java.lang.Exception -> L2e
            goto Lb5
        Lab:
            r10.printStackTrace()
            r10 = r0[r11]
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r10.setValue(r11)
        Lb5:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1374e.m574transient(eؒ۠ٙ, int, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(1027376298);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new C5671e(7, this);
                c13770e.m3682throws(m3681throw);
            }
            C16349e vip = AbstractC1742e.vip(0, (Function0) m3681throw, c13770e, 0, 3);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = AbstractC17680e.startapp(c13770e);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC13348e.ad(null, AbstractC16653e.license(-235994266, new C8288e(vip, this, (InterfaceC18435e) m3681throw2, 0), c13770e), null, null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(1573340219, new C8937e(vip, this, 18), c13770e), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11749e(this, i);
        }
    }

    /* renamed from: package, reason: not valid java name */
    public final void m575package(EnumC4433e enumC4433e, C13770e c13770e, int i) {
        int i2;
        long j;
        int i3;
        c13770e.m3671package(1020912866);
        int i4 = (c13770e.license(enumC4433e.ordinal()) ? 4 : 2) | i;
        if (c13770e.m3673protected(i4 & 1, (i4 & 3) != 2)) {
            int ordinal = enumC4433e.ordinal();
            if (ordinal == 0) {
                i2 = R.drawable.ic_clock_28;
            } else if (ordinal == 1) {
                i2 = R.drawable.ic_check_circle_outline_24;
            } else if (ordinal == 2) {
                i2 = R.drawable.ic_minus_circle_outline_16;
            } else {
                if (ordinal != 3) {
                    throw new C14803e(10);
                }
                i2 = R.drawable.history_backward_outline_28;
            }
            int ordinal2 = enumC4433e.ordinal();
            if (ordinal2 == 0) {
                c13770e.m3676strictfp(1844744395);
                j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.admob;
                c13770e.Signature(false);
            } else if (ordinal2 == 1) {
                c13770e.m3676strictfp(1844751273);
                j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.ad;
                c13770e.Signature(false);
            } else if (ordinal2 == 2) {
                c13770e.m3676strictfp(1844747847);
                j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.isVip;
                c13770e.Signature(false);
            } else {
                if (ordinal2 != 3) {
                    throw AbstractC1786e.loadAd(1844741046, c13770e, false);
                }
                c13770e.m3676strictfp(1844754738);
                j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.remoteconfig;
                c13770e.Signature(false);
            }
            int ordinal3 = enumC4433e.ordinal();
            if (ordinal3 == 0) {
                i3 = R.string.spark_status_created;
            } else if (ordinal3 == 1) {
                i3 = R.string.spark_status_complete;
            } else if (ordinal3 == 2) {
                i3 = R.string.spark_status_failed;
            } else {
                if (ordinal3 != 3) {
                    throw new C14803e(10);
                }
                i3 = R.string.spark_status_refund;
            }
            AbstractC14753e.ad(j, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).vip.startapp, AbstractC16653e.license(-1416981238, new C3572e(i2, i3, 2, (byte) 0), c13770e), c13770e, 384);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15709e(this, enumC4433e, i, 29);
        }
    }

    /* renamed from: private, reason: not valid java name */
    public final void m576private(C11590e c11590e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(-1340459787);
        int i2 = (c13770e.yandex(c11590e) ? 4 : 2) | i | (c13770e.purchase(interfaceC12864e) ? 32 : 16) | (c13770e.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            AbstractC0865e.ad(interfaceC12864e, new C3601e(24, 8), null, AbstractC12322e.license(), null, AbstractC16653e.license(1115259239, new C11828e(c11590e, this, 17), c13770e), c13770e, ((i2 >> 3) & 14) | 196608, 20);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C18522e(i, 5, this, c11590e, interfaceC12864e);
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m577strictfp(C16742e c16742e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(1118243431);
        int i2 = (c13770e.yandex(c16742e) ? 4 : 2) | i | (c13770e.purchase(interfaceC12864e) ? 32 : 16) | (c13770e.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            AbstractC0865e.ad(interfaceC12864e, new C3601e(24, 8), null, null, null, AbstractC16653e.license(-1167785383, new C11828e(c16742e, this, 16), c13770e), c13770e, ((i2 >> 3) & 14) | 196608, 28);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C18522e(i, 4, this, c16742e, interfaceC12864e);
        }
    }
}
