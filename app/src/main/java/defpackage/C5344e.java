package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؐ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5344e extends AbstractC10347e implements InterfaceC18435e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C0576e f11451e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C1169e f11452e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f11453e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f11454e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C0576e f11455e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f11456e;

    public C5344e() {
        super(0);
        this.f11453e = AbstractC9743e.vip();
        C1169e license = AbstractC6874e.license();
        license.add(new C6571e(EnumC12651e.f25369e, Integer.valueOf(R.string.privacy_all)));
        license.add(new C6571e(EnumC12651e.f25368e, Integer.valueOf(R.string.privacy_fof)));
        license.add(new C6571e(EnumC12651e.f25371e, Integer.valueOf(R.string.privacy_friends)));
        license.add(new C6571e(EnumC12651e.f25367e, Integer.valueOf(R.string.privacy_me)));
        this.f11452e = AbstractC6874e.metrica(license);
        this.f11455e = AbstractC14533e.startapp(Boolean.TRUE);
        this.f11456e = AbstractC14533e.startapp(Boolean.FALSE);
        EnumC12651e enumC12651e = EnumC12651e.f25373e;
        this.f11451e = AbstractC14533e.startapp(enumC12651e);
        this.f11454e = AbstractC14533e.startapp(enumC12651e);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(2:10|11)(2:30|31))(4:32|33|34|(1:36)(1:37))|12|(1:14)|15|(2:16|(2:18|(2:20|21)(1:27))(2:28|29))|22|23|24))|39|6|7|(0)(0)|12|(0)|15|(3:16|(0)(0)|27)|22|23|24) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:11:0x0025, B:12:0x004e, B:15:0x0058, B:16:0x005e, B:18:0x0064, B:22:0x0075, B:29:0x0073, B:33:0x0039), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: strictfp, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1890strictfp(defpackage.C5344e r5, defpackage.AbstractC10731e r6) {
        /*
            eؑۜٝ r0 = r5.f11455e
            boolean r1 = r6 instanceof defpackage.C4234e
            if (r1 == 0) goto L15
            r1 = r6
            eٜؖٗ r1 = (defpackage.C4234e) r1
            int r2 = r1.f9303e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f9303e = r2
            goto L1a
        L15:
            eٜؖٗ r1 = new eٜؖٗ
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r1.f9301e
            int r2 = r1.f9303e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            eؘؐ۟ r1 = r1.f9302e
            defpackage.AbstractC2003e.purchase(r6)     // Catch: java.lang.Throwable -> L81
            goto L4e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.AbstractC2003e.purchase(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r0.setValue(r6)
            eؗؓؖ r6 = new eؗؓؖ     // Catch: java.lang.Throwable -> L81
            r2 = 3
            r4 = 0
            r6.<init>(r4, r2)     // Catch: java.lang.Throwable -> L81
            r1.f9302e = r5     // Catch: java.lang.Throwable -> L81
            r1.f9303e = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r6 = defpackage.AbstractC18406e.yandex(r6, r1)     // Catch: java.lang.Throwable -> L81
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r1 = r5
        L4e:
            ua.itaysonlab.vkapi2.objects.privacy.PrivacySetting r6 = (ua.itaysonlab.vkapi2.objects.privacy.PrivacySetting) r6     // Catch: java.lang.Throwable -> L81
            ua.itaysonlab.vkapi2.objects.privacy.PrivacySettingValue r6 = r6.metrica     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = r6.ad     // Catch: java.lang.Throwable -> L81
            if (r6 != 0) goto L58
            java.lang.String r6 = "some"
        L58:
            eٖؒ۠ r2 = defpackage.EnumC12651e.f25372e     // Catch: java.lang.Throwable -> L81
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L81
        L5e:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L73
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L81
            eّٟٛ r3 = (defpackage.EnumC12651e) r3     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = r3.f25375e     // Catch: java.lang.Throwable -> L81
            boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto L5e
            goto L75
        L73:
            eّٟٛ r3 = defpackage.EnumC12651e.f25373e     // Catch: java.lang.Throwable -> L81
        L75:
            eؑۜٝ r5 = r5.f11454e     // Catch: java.lang.Throwable -> L81
            r5.setValue(r3)     // Catch: java.lang.Throwable -> L81
            eؑۜٝ r5 = r1.f11451e     // Catch: java.lang.Throwable -> L81
            r5.setValue(r3)     // Catch: java.lang.Throwable -> L81
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L81
        L81:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0.setValue(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5344e.m1890strictfp(eؘؐ۟, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f11453e.f29359e;
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(1518870015);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            int startapp = AbstractC4533e.startapp(0.0f, c13770e, 0, 1);
            C5958e ad = AbstractC9083e.ad(c13770e);
            Unit unit = Unit.INSTANCE;
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C2458e(this, null, 0);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw);
            AbstractC13348e.ad(null, AbstractC16653e.license(1084776891, new C17785e(ad, this, 21), c13770e), null, null, AbstractC16653e.license(-899991528, new C18054e(this, startapp, 0), c13770e), 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(-847684528, new C8937e(this, ad, 11), c13770e), c13770e, 805330992, 237);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7828e(this, i);
        }
    }

    /* renamed from: private, reason: not valid java name */
    public final EnumC12651e m1891private() {
        return (EnumC12651e) this.f11451e.getValue();
    }
}
