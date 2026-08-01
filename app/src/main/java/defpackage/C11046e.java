package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11046e extends AbstractC16997e implements InterfaceC18435e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C0576e f21896e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f21897e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f21898e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C5789e f21899e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f21900e;

    public C11046e(C5789e c5789e) {
        super(c5789e.billing, 2);
        this.f21897e = AbstractC9743e.vip();
        this.f21899e = c5789e;
        this.f21900e = AbstractC14533e.startapp(EnumC7426e.f15198e);
        this.f21896e = AbstractC14533e.startapp(new C0217e(0L, 0L, 0.0f));
        int i = 0;
        this.f21898e = AbstractC14533e.startapp(new C16101e(i, 7, (String) null));
    }

    public static final void inmobi(C11046e c11046e) {
        String str;
        InterfaceC5615e interfaceC5615e = c11046e.f21899e.appmetrica;
        if (interfaceC5615e instanceof C11244e) {
            str = ((C11244e) interfaceC5615e).ad;
        } else {
            if (!(interfaceC5615e instanceof C9946e)) {
                throw new C14803e(10);
            }
            str = ((C9946e) interfaceC5615e).ad;
        }
        c11046e.f10582e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:32|33))(6:34|35|(1:37)(1:42)|38|39|(1:41))|11|12|(2:14|(3:24|(1:26)|27)(3:20|(1:22)|23))|28|29))|45|6|7|(0)(0)|11|12|(0)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0028, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        r8 = new defpackage.C12763e(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object isVip(defpackage.C11046e r7, defpackage.AbstractC10731e r8) {
        /*
            eؑۜٝ r0 = r7.f21898e
            boolean r1 = r8 instanceof defpackage.C16570e
            if (r1 == 0) goto L15
            r1 = r8
            eٖۡۡ r1 = (defpackage.C16570e) r1
            int r2 = r1.f32516e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f32516e = r2
            goto L1a
        L15:
            eٖۡۡ r1 = new eٖۡۡ
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.f32515e
            int r2 = r1.f32516e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            defpackage.AbstractC2003e.purchase(r8)     // Catch: java.lang.Throwable -> L28
            goto L70
        L28:
            r7 = move-exception
            goto L73
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.AbstractC2003e.purchase(r8)
            r7.pro(r4)
            eؚۙۙ r8 = defpackage.EnumC7426e.f15197e
            r7.applovin(r8)
            android.app.Activity r7 = r7.f10582e     // Catch: java.lang.Throwable -> L28
            android.content.Context r7 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = defpackage.C10675e.f21023e     // Catch: java.lang.Throwable -> L28
            ua.itaysonlab.vkx.VKXApplication r8 = ua.itaysonlab.vkx.VKXApplication.f36528e     // Catch: java.lang.Throwable -> L28
            r2 = 0
            if (r8 == 0) goto L4b
            goto L4c
        L4b:
            r8 = r2
        L4c:
            java.lang.String r5 = "ota"
            java.io.File r8 = r8.getDir(r5, r3)     // Catch: java.lang.Throwable -> L28
            eَۦۦ r8 = defpackage.C10215e.purchase(r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = "vkx_ota_payload.apk"
            eَۦۦ r8 = r8.appmetrica(r5)     // Catch: java.lang.Throwable -> L28
            r1.f32516e = r4     // Catch: java.lang.Throwable -> L28
            eّٕٓ r5 = defpackage.AbstractC6731e.ad     // Catch: java.lang.Throwable -> L28
            eؕۙۜ r5 = defpackage.ExecutorC3603e.f8134e     // Catch: java.lang.Throwable -> L28
            eْؒۘ r6 = new eْؒۘ     // Catch: java.lang.Throwable -> L28
            r6.<init>(r8, r7, r2)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r8 = defpackage.AbstractC5336e.advert(r5, r6, r1)     // Catch: java.lang.Throwable -> L28
            eٟؔۙ r7 = defpackage.EnumC2821e.f6782e
            if (r8 != r7) goto L70
            return r7
        L70:
            kotlin.Unit r8 = (kotlin.Unit) r8     // Catch: java.lang.Throwable -> L28
            goto L78
        L73:
            eّۜۖ r8 = new eّۜۖ
            r8.<init>(r7)
        L78:
            java.lang.Throwable r7 = defpackage.C13523e.ad(r8)
            if (r7 == 0) goto Lb6
            boolean r8 = r7 instanceof java.io.IOException
            r1 = 2
            java.lang.String r2 = ""
            if (r8 == 0) goto La5
            java.lang.String r8 = r7.getMessage()
            if (r8 == 0) goto La5
            java.lang.String r5 = "Failed to allocate"
            boolean r8 = defpackage.AbstractC6507e.pro(r8, r5, r3)
            if (r8 != r4) goto La5
            eٍٖۤ r8 = new eٍٖۤ
            java.lang.String r7 = r7.getMessage()
            if (r7 != 0) goto L9c
            goto L9d
        L9c:
            r2 = r7
        L9d:
            r7 = 6
            r8.<init>(r7, r1, r2)
            r0.setValue(r8)
            goto Lb6
        La5:
            eٍٖۤ r8 = new eٍٖۤ
            java.lang.String r7 = r7.getMessage()
            if (r7 != 0) goto Lae
            goto Laf
        Lae:
            r2 = r7
        Laf:
            r7 = -1
            r8.<init>(r7, r1, r2)
            r0.setValue(r8)
        Lb6:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11046e.isVip(eُٗٝ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractC5004e
    public final void Signature(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            int i = extras.getInt("android.content.pm.extra.STATUS");
            Intent intent2 = null;
            intent2 = null;
            if (i == -1) {
                if (Build.VERSION.SDK_INT >= 33) {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        intent2 = (Intent) extras2.getParcelable("android.intent.extra.INTENT", Intent.class);
                    }
                } else {
                    Bundle extras3 = intent.getExtras();
                    if (extras3 != null) {
                        intent2 = (Intent) extras3.getParcelable("android.intent.extra.INTENT");
                    }
                }
                if (intent2 != null) {
                    this.f10582e.startActivity(intent2);
                    return;
                }
                return;
            }
            if (i != 0) {
                pro(this.f21899e.billing);
                Bundle extras4 = intent.getExtras();
                String string = extras4 != null ? extras4.getString("android.content.pm.extra.PACKAGE_NAME") : null;
                Bundle extras5 = intent.getExtras();
                String string2 = extras5 != null ? extras5.getString("android.content.pm.extra.STATUS_MESSAGE") : null;
                if (string2 == null) {
                    string2 = BuildConfig.FLAVOR;
                }
                this.f21898e.setValue(new C16101e(string, i, string2));
                applovin(EnumC7426e.f15194e);
            }
        }
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f21897e.f29359e;
    }

    @Override // defpackage.AbstractC5004e
    public final void amazon() {
        super.amazon();
        AbstractC9743e.license(this, null);
    }

    public final void applovin(EnumC7426e enumC7426e) {
        this.f21900e.setValue(enumC7426e);
    }

    public final void isPro() {
        if (AbstractC16055e.ad()) {
            AbstractC5336e.purchase(this, null, 0, new C17071e(this, null, 12), 3);
        } else {
            pro(this.f21899e.billing);
            applovin(EnumC7426e.f15195e);
        }
    }

    @Override // defpackage.AbstractC5004e
    public final void startapp(int i, int i2, Intent intent) {
        if (i == 39) {
            isPro();
        }
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(-1222347993);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(312146988, new C9295e(this, AbstractC4533e.startapp(0.0f, c13770e, 0, 1), !this.f21899e.billing, 3), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3450e(this, i, 28);
        }
    }
}
