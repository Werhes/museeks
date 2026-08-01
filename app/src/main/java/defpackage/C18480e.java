package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18480e extends AbstractC16997e {

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public static final /* synthetic */ int f36231e = 0;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C0576e f36232e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0505e f36233e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final C0576e f36234e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f36235e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final EnumC10982e f36236e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0576e f36237e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C1615e f36238e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f36239e;

    public C18480e(C0505e c0505e, EnumC10982e enumC10982e) {
        super(false, 3);
        List list;
        C2357e c2357e;
        this.f36233e = c0505e;
        this.f36236e = enumC10982e;
        this.f36239e = AbstractC14533e.startapp(Boolean.FALSE);
        C14027e.ad.getClass();
        long metrica = C14027e.metrica();
        String license = C14027e.license();
        C8221e c8221e = VKXApplication.f36536e;
        this.f36232e = AbstractC14533e.startapp(new C17561e(metrica, ((C18479e) (c8221e == null ? null : c8221e).billing).adcel, license));
        this.f36235e = AbstractC14533e.startapp(EnumC11831e.f23737e);
        this.f36237e = AbstractC14533e.startapp((c0505e == null || (list = c0505e.f2595e) == null || (c2357e = (C2357e) AbstractC13480e.m3604this(list)) == null) ? new C2357e(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, false, false, 0, C0193e.f1409e) : c2357e);
        this.f36238e = AbstractC9180e.metrica(BuildConfig.FLAVOR);
        this.f36234e = AbstractC14533e.startapp(C14849e.ad);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(4:11|12|13|(1:18)(2:15|16))(2:19|20))(2:21|22))(3:29|30|(2:32|27)(1:33))|23|(1:25)(3:28|13|(0)(0))))|36|6|7|(0)(0)|23|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (r10 == r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        r9 = new defpackage.C12763e(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:11:0x0026, B:12:0x0086, B:22:0x0034, B:23:0x0063, B:25:0x0075, B:28:0x0094, B:30:0x003b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #0 {all -> 0x0097, blocks: (B:11:0x0026, B:12:0x0086, B:22:0x0034, B:23:0x0063, B:25:0x0075, B:28:0x0094, B:30:0x003b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object isVip(defpackage.C18480e r8, java.lang.String r9, defpackage.AbstractC10731e r10) {
        /*
            boolean r0 = r10 instanceof defpackage.C8935e
            if (r0 == 0) goto L13
            r0 = r10
            eٌۘۜ r0 = (defpackage.C8935e) r0
            int r1 = r0.f17898e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17898e = r1
            goto L18
        L13:
            eٌۘۜ r0 = new eٌۘۜ
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f17896e
            int r1 = r0.f17898e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r10)     // Catch: java.lang.Throwable -> L97
            goto L86
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            int r8 = r0.f17897e
            defpackage.AbstractC2003e.purchase(r10)     // Catch: java.lang.Throwable -> L97
            goto L63
        L38:
            defpackage.AbstractC2003e.purchase(r10)
            eٌؚؗ r10 = defpackage.C4750e.ad     // Catch: java.lang.Throwable -> L97
            eؑۜٝ r8 = r8.f36234e     // Catch: java.lang.Throwable -> L97
            r8.setValue(r10)     // Catch: java.lang.Throwable -> L97
            eًۛ۠ r8 = defpackage.AbstractC1831e.vip()     // Catch: java.lang.Throwable -> L97
            r10 = 0
            r0.f17897e = r10     // Catch: java.lang.Throwable -> L97
            r0.f17898e = r3     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "utils.resolveScreenName"
            eؘُٛ r3 = new eؘُٛ     // Catch: java.lang.Throwable -> L97
            eُٟٗ r5 = defpackage.C11047e.f21912e     // Catch: java.lang.Throwable -> L97
            r3.<init>(r1, r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "screen_name"
            r3.ad(r1, r9)     // Catch: java.lang.Throwable -> L97
            java.lang.Object r8 = r8.license(r3, r0)     // Catch: java.lang.Throwable -> L97
            if (r8 != r4) goto L60
            goto L85
        L60:
            r7 = r10
            r10 = r8
            r8 = r7
        L63:
            eٍؒۢ r10 = (defpackage.AbstractC9200e) r10     // Catch: java.lang.Throwable -> L97
            java.lang.Object r9 = defpackage.AbstractC3425e.startapp(r10)     // Catch: java.lang.Throwable -> L97
            eؑؗۡ r9 = (defpackage.C0120e) r9     // Catch: java.lang.Throwable -> L97
            java.lang.String r10 = r9.vip     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "user"
            boolean r10 = defpackage.AbstractC7890e.billing(r10, r1)     // Catch: java.lang.Throwable -> L97
            if (r10 == 0) goto L94
            eًۛ۠ r10 = defpackage.AbstractC1831e.vip()     // Catch: java.lang.Throwable -> L97
            long r5 = r9.ad     // Catch: java.lang.Throwable -> L97
            r0.f17897e = r8     // Catch: java.lang.Throwable -> L97
            r0.f17898e = r2     // Catch: java.lang.Throwable -> L97
            java.lang.Object r10 = defpackage.AbstractC15297e.license(r10, r5, r0)     // Catch: java.lang.Throwable -> L97
            if (r10 != r4) goto L86
        L85:
            return r4
        L86:
            eٍؒۢ r10 = (defpackage.AbstractC9200e) r10     // Catch: java.lang.Throwable -> L97
            java.lang.Object r8 = defpackage.AbstractC3425e.startapp(r10)     // Catch: java.lang.Throwable -> L97
            e٘ؖۘ r8 = (defpackage.C17561e) r8     // Catch: java.lang.Throwable -> L97
            eٗ۟ۖ r9 = new eٗ۟ۖ     // Catch: java.lang.Throwable -> L97
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L97
            goto L9d
        L94:
            eُٓۡ r9 = defpackage.C13912e.ad     // Catch: java.lang.Throwable -> L97
            goto L9d
        L97:
            r8 = move-exception
            eّۜۖ r9 = new eّۜۖ
            r9.<init>(r8)
        L9d:
            java.lang.Throwable r8 = defpackage.C13523e.ad(r9)
            if (r8 != 0) goto La4
            goto La6
        La4:
            eٜؒۢ r9 = defpackage.C1406e.ad
        La6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18480e.isVip(eۥ, java.lang.String, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractC5004e
    public final void adcel() {
        C0576e c0576e = this.f36235e;
        if (((EnumC11831e) c0576e.getValue()) == EnumC11831e.f23734e || ((EnumC11831e) c0576e.getValue()) == EnumC11831e.f23735e) {
            inmobi(EnumC11831e.f23737e);
        } else {
            super.adcel();
        }
    }

    public final void inmobi(EnumC11831e enumC11831e) {
        this.f36235e.setValue(enumC11831e);
    }

    @Override // defpackage.AbstractC5004e
    public final void mopub() {
        super.mopub();
        AbstractC5336e.purchase(AbstractC4608e.metrica(this.f10590e), null, 0, new C15628e(this, null, 1), 3);
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(1475729400);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        boolean z = false;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            int startapp = AbstractC4533e.startapp(0.0f, c13770e, 0, 1);
            C0576e c0576e = this.f36239e;
            boolean booleanValue = ((Boolean) c0576e.getValue()).booleanValue();
            C0576e c0576e2 = this.f36232e;
            boolean billing = c13770e.billing(booleanValue) | c13770e.purchase((C17561e) c0576e2.getValue());
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (billing || m3681throw == c5170e) {
                long j = ((C17561e) c0576e2.getValue()).ad;
                C14027e.ad.getClass();
                if (j == C14027e.metrica() && ((Boolean) c0576e.getValue()).booleanValue()) {
                    z = true;
                }
                m3681throw = Boolean.valueOf(z);
                c13770e.m3682throws(m3681throw);
            }
            boolean booleanValue2 = ((Boolean) m3681throw).booleanValue();
            Unit unit = Unit.INSTANCE;
            boolean yandex = c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex || m3681throw2 == c5170e) {
                m3681throw2 = new C18474e(this, null, 17);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw2);
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(18925885, new C9295e(this, startapp, booleanValue2, 2), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3450e(this, i, 12);
        }
    }
}
